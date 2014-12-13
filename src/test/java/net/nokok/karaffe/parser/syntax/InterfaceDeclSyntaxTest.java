/**
 *
 * Karaffe Programming Language
 *   __ _____   ___  ___   ____________
 *   / //_/ _ | / _ \/ _ | / __/ __/ __/
 *  / , \/ __ |/ , _/ __ |/ _// _// _/
 * /_/|_/_/ |_/_/|_/_/ |_/_/ /_/ /___/
 *
 */
package net.nokok.karaffe.parser.syntax;

import static net.nokok.karaffe.parser.syntax.KaraffeParserSyntaxTest.testCode;
import org.junit.Test;

public class InterfaceDeclSyntaxTest {

    @Test
    public void testSimpleInterfaceDeclaration() {
        testCode("interface name\n");
    }

    @Test
    public void testInterfaceDeclarationExtendsInterface() {
        testCode("interface name <- SuperInterface\n");
    }

    @Test
    public void testInterfaceDeclarationExtendsInterfaces() {
        testCode("interface name <- Interface1 Interface2\n");
    }

    @Test(expected = AssertionError.class)
    public void testInvalidInterfaceDecl1() {
        testCode("interface name <-");
    }

}