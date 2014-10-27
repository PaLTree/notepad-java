package net.nokok.karaffe.javacc.stmt;

import net.nokok.karaffe.javacc.CompileErrorMessage;
import net.nokok.karaffe.javacc.identifier.TypeId;

/**
 * このクラスはType Aliasの構文を表現する。
 * このステートメントは、seffect演算子を許可する。
 * seffect演算子を付けなかった場合、既存の関数のオーバーライドが不可能となり、あれば可能となる。
 * 型名に重複は許されない。重複を検出した時点でコンパイルエラーが発生する。
 * Type AliasはbaseTypeの関数を引き継ぐ。
 * Type Aliasを用いると継承のように動作するが、seffect修飾子を付与した場合、
 * 元の型とは完全に別の型として扱われ、代入互換性を失う。関数のオーバーライドが可能であるため。
 * seffect修飾子が付与されたステートメントは{@link MutableTypeAliasStatement}クラスが扱う。
 *
 * 実際のソースコードの構文例
 * {@code type newType = baseType}
 *
 * baseType : ベースタイプ。関数を引き継ぐ元の型
 *
 * @see MutableTypeAliasStatement
 */
public class TypeAliasStatement implements Statement {

    private final TypeId baseType;
    private final TypeId newType;

    public TypeAliasStatement(TypeId newType) {
        this(TypeId.Any, newType);
    }

    /**
     * Type Aliasステートメントを生成する。
     *
     * @param baseType
     * @param newType
     */
    public TypeAliasStatement(TypeId baseType, TypeId newType) {
        if ( baseType.isTypeParameter() || newType.isTypeParameter() ) {
            throw new IllegalArgumentException(CompileErrorMessage.TYPE_ALIAS_TYPE_PARAMETER.toString());
        }
        this.baseType = baseType;
        this.newType = newType;
    }

    @Override
    public Object accept(StatementListener listener) {
        return listener.onTypeAliasStatement(this);
    }

    @Override
    public StatementType getType() {
        return StatementType.TYPE_ALIAS;
    }

    /**
     * Type Aliasステートメントでは、seffect修飾子を許可する。
     * 付与した場合:関数のオーバーライドを許可する
     * 付与しなかった場合:関数のオーバーライドを許可しない(同名の関数を定義できない)
     *
     * @return True
     */
    @Override
    public boolean isAllowingSideEffectModifier() {
        return false;
    }

    /**
     * @return 元の型
     */
    public TypeId baseType() {
        return baseType;
    }

    /**
     * @return 新しい型
     */
    public TypeId newType() {
        return newType;
    }

}
