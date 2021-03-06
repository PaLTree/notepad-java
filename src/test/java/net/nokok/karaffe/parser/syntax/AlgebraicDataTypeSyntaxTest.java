/**
 * Karaffe Programming Language
 */
package net.nokok.karaffe.parser.syntax;

import static net.nokok.karaffe.parser.syntax.KaraffeParserSyntaxTest.testCode;
import org.junit.Test;

public class AlgebraicDataTypeSyntaxTest {

    @Test
    public void testSimpleAlgebraicDataTypeSyntax() {
        testCode("case type Bool = True | False");
    }

    @Test
    public void testAlgebraicDataType() {
        testCode("case type Tree = Leaf leaf:String | Branch left:Tree right:Tree");
    }

    @Test(expected = AssertionError.class)
    public void testAlgebraicDataTypeWithoutFieldName() {
        testCode("case type Tree[T] = Leaf[T] | Branch Tree[T] Tree[T]");
    }

    @Test
    public void testAlgebraicDataTypeDecl1() {
        testCode("case type Tree[T] = Leaf[T] leaf:T | Branch left:Tree[T] right:Tree[T]");
    }

    @Test
    public void testAlgebraicDataTypeDecl2() {
        testCode("case type Hoge <- Interface = Fuga | Piyo");
    }
}
