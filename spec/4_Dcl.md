#宣言

##変数と関数の宣言
seffect<sub>opt</sub> VariableName : *ExistingTypeName*<sub>opt</sub> = Initializer  
seffect<sub>opt</sub> VariableName : *ExistingTypeName(Argument)* to *ExistingTypeName(Return)* = FunctionBody  
seffect<sub>opt</sub> VariableName : *ExistingTypeName(Argument)* to *ExistingTypeExpression(Return)* = FunctionBody  

`Any`や`Int`、`Type[Int Int to Int]`などで宣言されたものは変数扱い、  
`Any to Void`や`Int to Float`、`Int Int to Num`などで宣言されたものは関数扱いになります。  

例

    a       = 0
    b : Num = 0
    
    a : Float = 0 //コンパイルエラー
    
    seffect v = 0
    println v //0
    v = v + 1
    println v //1
    
    
引数がある場合、先頭から順番に`$0`、`$1`...`$n`としてアクセス出来ます。  

    global add : Int Int to Int = $0 + $1
    global div : Int Int to Int = $0 / $1
    
    global sum5   : Int Int Int Int Int to Int = $0 + $1 + $2 + $3 + $4 + $5
    global sum5_1 : Int Int Int Int Int to Int = [a b c d e] to a + b + c + d + e
    
    add 1 2  //3
    div 10 5 //2

* 大文字から始まる変数宣言はできません。
* 初期化を省略した場合コンパイルエラーとなります
* `seffect`修飾子を付与した場合、再代入可能な変数として宣言されます。デフォルトで再代入できません。  
* 外側のスコープで宣言されている変数名と同じ名前で再宣言することはできません。
* 使用しない変数宣言はできません。
* 型が合致しない初期化はできません。

##構造体宣言
構造体とは、複数の変数をまとめて一つのオブジェクトとして扱うことが可能です。  
構造体は型として利用可能です。  
`type`宣言直後に変数宣言を続けると構造体宣言になります。  
小文字で始まる構造体名は宣言できません。  

```
type Point = Any
x : Int = 0
y : Int = 0
translate : Int Int to Point = [dx,dy] to Point x:x + dx y:y + dy
```
このコードは以下のScalaコードほぼ同じ動作をします。

```
class Point(val x:Int = 0, val y:Int = 0) {
  def translate(dx:Int, dy:Int) :Point = new Point(x + dx, y + dy)
}
```

##Type Alias
type NewTypeName = *ExistingTypeName*<sub>opt</sub>

既存の型から新しい型を宣言します。  
Type Aliasは単に既存の型に別名を付与するためだけではなく、  
新しい振る舞いを付与することが可能です。  
新しい型は既存の型で利用可能な関数を引き継ぎます。  
既存の型を省略した場合、`Any`型が指定されます。  
継承と異なり、Type Aliasを使用すると**Any型を除く全ての既存の型と代入互換性が失われます。**  
Type Aliasを使用することで既存の型の振る舞いを変更することが容易であるからです。  
小文字で始まる型名は宣言できません。

既存の型に別名を付ける例
```
type URL = String
```

check文を用いることで、(コンパイル時に利用可能な場合)静的な検査が実行されます。  
```
type URL = String
check startsWith "http" or "https"

valid :URL = "http://google.com"
invalid : URL = "hoge" //コンパイルエラー
```

##ジェネリクス[未確定]
型宣言時に小文字から始まる型指定を行うと型パラメータとして利用できます。  

```
type : a = Any
value : a = initializer
```

#アクセス

##名前空間の概念について
参照を容易にし、識別子が衝突しないようにするために導入されます。  
具体的には、名前空間はファイル名で分割されます。ファイル内で名前空間を分割することは出来ません。  
外部のファイルからアクセス出来るものは`global`識別子が付与された変数のみです。  

名前空間を検索するディレクトリは以下の2つです。

* 標準API定義ファイルのディレクトリ
* 外部にアクセスしようとするファイルと同じディレクトリ


コード例
以下のファイル構成の場合

```
{ProjectRoot}/Main.krf
{ProjectRoot}/Collections.krf
{ProjectRoot}/A/B.krf
```

Collections.krf
```
...
type SimpleDictionary = Any
global put   : Any Any to Any = [key,value] ...
global get   : Any to Any     = [key] ...
global delete: Any to Any     = [key] ... 
...
```

Main.krf
```
import Collections

dic :SimpleDictionary = ...
dic put key value

```

##スコープ
`newline`によってスコープが区切られます。  
インデントや`{}``()`は区切り文字として使用できません。

```
a = 1
b = 2
println a + b //3

a = 2 //コンパイルエラーにはなりません。1行目のaは既に破棄されています。

b = 2
println a + b //コンパイルエラーになります。コンパイラはaを見つけられません。

```

##アクセス制御
###`global`修飾子
`global`修飾子は、付与した変数を宣言した行以降で参照可能にする修飾子です。  

###詳細なアクセス制御
ソースコード中の変数などのアクセス制御は、アクセス制御を行いたいソースファイルと  
同じディレクトリに`_AC_.krf`という名前のファイルを作成します。  
※`_AC_.krf`ファイルを今後アクセス制御ファイルと呼びます。  
このファイルにアクセス制御情報を記述します。  
アクセス制御ファイルは無くてもコンパイル可能です。  
このファイルの有無に問わずglobal演算子は定義通り正しく動作します。  
ソースファイルのコンパイル前にアクセス制御ファイル自体がコンパイルされます。  
(記述ミスなどで)見つからないファイルに対してアクセス制御を行おうとするとコンパイルエラーが発生します。  
アクセス制御ファイルについては[アクセス制御ファイル(記述中)](AccessControl.md)に詳しく記述しています。  