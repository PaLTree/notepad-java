#はじめに
---
Karaffe(カラフェ)は、「メモ帳で書けるとにかくシンプルで現代的な機能を持つ言語」を目指して設計されるプログラミング言語です。シンタックスハイライトやオートインデントが存在しない環境下でも比較的スムーズにコーディングが可能です。関数が変数に代入可能という意味で、Karaffeは関数型言語の一面も持ち合わせていますが、純粋ではありません。I/Oに代表される副作用を許す文法もあります。シンプルな記法のまま、高階関数やパターンマッチもサポートする予定です。   

##言語仕様を制定する上で必要な定義
Karaffeの言語仕様では、各文法の定義にEBNFを用います。  

| 式 | 意味 |
|---|---|
| &#124; | いずれか|
| () | グループ化
| [] | 任意
| {} | 1回以上の繰り返し
|... | 省略

文字コードを表現する際は、ユニコードエスケープシーケンスを使用します。  
ユニコードエスケープシーケンスは識別子として使用できません。  
文字列リテラル中にユニコードエスケープシーケンスを用いた場合、Unicodeの文字コードに対応する文字へ置き換えられます。  

```
unicodeEscapeSequence ::= \u hexDigit hexDigit hexDigit hexDigit
hexDigit              ::= digit | 'A' | ... | 'F' | 'a' | ... | 'f'
```

Karaffeで使用する空白文字whitespaceと改行文字newlineの定義です。  

```
whitespace    ::= \u0020
newline       ::= \u000A | \u000D
```

##ソースファイルについて
ソースコードを記述する際の文字コードはUTF-8です。  
拡張子は`*.krf`を強く推奨します。この拡張子以外でもコンパイル可能です。  
コンパイル後のファイルは`コンパイルしたファイル名.okrf`となります。

##型変換について
Karaffeは演算の結果によって返り値の**型自体が**変更される場合があります。  
一番簡単な例だと`/`演算子です。  

```
value = 10 / 3
```

この例の場合、valueには0.33333...が格納されます。よってvalueは`Float`型に推論されます。  
一方、
```
value = 10 / 5
```
このvalueには2が格納されます。よってvalueは`Int`型に推論されます。  
このように`\`演算子は引数によって`Int`型または`Float`型が返る可能性があります。  
`\`演算子はトップレベル関数として宣言されています。  
宣言はこのようになっています。  

```
\ : Num Num to Int or Float = ...
```
返り値の宣言部分(`to`から`=`の間)で型演算子が用いられています。  
この関数は、2つの`Num`型から`Int`型**または**`Float`型が返ることを意味しています。

この仕様のため、以下のコードはコンパイルエラーになります。  

```
printInt : Int to Void = println $0
printInt 5 / 3   //コンパイルエラー
```

解決策として以下のようにコードを修正します。  

```
printInt : Int to Void = println $0
printFloat : Float to Void = println $0
print : Num to Void = sw
Int = printInt $0
Float = printFloat $0
_ = println $0
print 5 / 3 //printFloatが呼ばれ、1.66666667が表示される
print 4 / 2 //printIntが呼ばれ、2が表示される
```