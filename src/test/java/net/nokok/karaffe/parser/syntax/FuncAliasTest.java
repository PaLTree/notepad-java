/**
 * Karaffe Programming Language
 */
package net.nokok.karaffe.parser.syntax;

import static net.nokok.karaffe.parser.syntax.KaraffeParserSyntaxTest.testCode;
import org.junit.Test;

public class FuncAliasTest {

    @Test
    public void testFuncAliasWithoutArguments() {
        testCode("type T{"
                + "def this() = {\n"
                + "funcalias after() : before()\n"
                + "}\n"
                + "}");
    }

    @Test
    public void testFuncAliasWithoutArguments1() {
        testCode("type T{\n"
                + "def this() = {\n"
                + "funcalias after() : pa.name.Class.function()\n"
                + "}\n"
                + "}");
    }

    @Test
    public void testOverloadedFunctionAlias() {
        testCode("type T{\n"
                + "def this() = {\n"
                + "funcalias after(x:Int y:Int) : before(x y)\n"
                + "}\n"
                + "}");
    }
}
