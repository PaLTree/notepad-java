/**
 * Karaffe Programming Language
 */
package net.nokok.karaffe.parser.syntax;

import static net.nokok.karaffe.parser.syntax.KaraffeParserSyntaxTest.testCode;
import org.junit.Test;

public class InterfaceDeclSyntaxTest {

    @Test
    public void testSimpleInterfaceDeclaration() {
        testCode("interface Name{}\n");
    }

    @Test
    public void testInterfaceDeclarationExtendsInterface() {
        testCode("interface Name <- SuperInterface{}\n");
    }

    @Test
    public void testInterfaceDeclarationExtendsInterfaces() {
        testCode("interface Name <- Interface1 Interface2{}\n");
    }

    @Test(expected = AssertionError.class)
    public void testInvalidInterfaceDecl1() {
        testCode("interface Name <-");
    }

}
