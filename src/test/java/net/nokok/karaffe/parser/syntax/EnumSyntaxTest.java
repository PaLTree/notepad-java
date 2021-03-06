/**
 * Karaffe Programming Language
 */
package net.nokok.karaffe.parser.syntax;

import static net.nokok.karaffe.parser.syntax.KaraffeParserSyntaxTest.testCode;
import org.junit.Test;

public class EnumSyntaxTest {

    @Test
    public void testEnumSyntax() {
        testCode("enum EnumType : [Hoge,Fuga,Piyo]\n");
    }

    @Test(expected = AssertionError.class)
    public void testEmptyArray() {
        testCode("enum EnumType : []\n");
    }

    @Test(expected = AssertionError.class)
    public void testInvalidEnumDecl() {
        testCode("enum Hoge\n");
    }

}
