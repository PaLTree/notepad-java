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

public class TypeDeclSyntaxTest {

    @Test
    public void testSimpleTypeDeclaration() {
        testCode("type Identifier\n");
    }

    @Test
    public void testSimpleTypeDeclarationWithModifier_Private() {
        testCode("private type Identifier\n");
    }

    @Test
    public void testSimpleTypeDeclarationWithModifier_Sealed() {
        testCode("sealed type Identifier\n");
    }

    @Test
    public void testExtendsType() {
        testCode("type Type : Super\n");
    }

    @Test
    public void testImplementsInterface() {
        testCode("type Type <- Interface1\n");
    }

    @Test
    public void testImplementsInterfaces() {
        testCode("type Type <- IF1 IF2\n");
    }

    @Test
    public void testTypeDeclarationWithTypeParameter() {
        testCode("type Identifier[A] : Super[B] <- Interface[C]\n");
    }
}