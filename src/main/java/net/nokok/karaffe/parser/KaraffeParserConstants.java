/* Generated By:JJTree&JavaCC: Do not edit this line. KaraffeParserConstants.java */
package net.nokok.karaffe.parser;

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface KaraffeParserConstants {

    /** End of File. */
    int EOF = 0;
    /** RegularExpression Id. */
    int LeftBracket = 5;
    /** RegularExpression Id. */
    int RightBracket = 6;
    /** RegularExpression Id. */
    int LeftBrace = 7;
    /** RegularExpression Id. */
    int RightBrace = 8;
    /** RegularExpression Id. */
    int LeftParen = 9;
    /** RegularExpression Id. */
    int RightParen = 10;
    /** RegularExpression Id. */
    int Colon = 11;
    /** RegularExpression Id. */
    int SemiColon = 12;
    /** RegularExpression Id. */
    int DoubleColon = 13;
    /** RegularExpression Id. */
    int Dot = 14;
    /** RegularExpression Id. */
    int SP = 15;
    /** RegularExpression Id. */
    int EqualSign = 16;
    /** RegularExpression Id. */
    int AA = 17;
    /** RegularExpression Id. */
    int SA = 18;
    /** RegularExpression Id. */
    int MA = 19;
    /** RegularExpression Id. */
    int DA = 20;
    /** RegularExpression Id. */
    int RA = 21;
    /** RegularExpression Id. */
    int Lt = 22;
    /** RegularExpression Id. */
    int LtE = 23;
    /** RegularExpression Id. */
    int Gt = 24;
    /** RegularExpression Id. */
    int GtE = 25;
    /** RegularExpression Id. */
    int Plus = 26;
    /** RegularExpression Id. */
    int Minus = 27;
    /** RegularExpression Id. */
    int Star = 28;
    /** RegularExpression Id. */
    int Slash = 29;
    /** RegularExpression Id. */
    int SafeDiv = 30;
    /** RegularExpression Id. */
    int Percent = 31;
    /** RegularExpression Id. */
    int SafeRem = 32;
    /** RegularExpression Id. */
    int Tilde = 33;
    /** RegularExpression Id. */
    int Bang = 34;
    /** RegularExpression Id. */
    int And = 35;
    /** RegularExpression Id. */
    int Or = 36;
    /** RegularExpression Id. */
    int Hat = 37;
    /** RegularExpression Id. */
    int Question = 38;
    /** RegularExpression Id. */
    int ReverseArrow = 39;
    /** RegularExpression Id. */
    int SingleArrow = 40;
    /** RegularExpression Id. */
    int CastArrow = 41;
    /** RegularExpression Id. */
    int TypeCheckArrow = 42;
    /** RegularExpression Id. */
    int DoubleArrow = 43;
    /** RegularExpression Id. */
    int EqualTo = 44;
    /** RegularExpression Id. */
    int NotEqualTo = 45;
    /** RegularExpression Id. */
    int NonComparable = 46;
    /** RegularExpression Id. */
    int Comparable = 47;
    /** RegularExpression Id. */
    int ClosedRange = 48;
    /** RegularExpression Id. */
    int HalfOpenRange = 49;
    /** RegularExpression Id. */
    int BeginDoc = 50;
    /** RegularExpression Id. */
    int EndDoc = 51;
    /** RegularExpression Id. */
    int Atmark = 52;
    /** RegularExpression Id. */
    int NewLine = 53;
    /** RegularExpression Id. */
    int EndOfLine = 61;
    /** RegularExpression Id. */
    int Abstract = 63;
    /** RegularExpression Id. */
    int Case = 64;
    /** RegularExpression Id. */
    int Check = 65;
    /** RegularExpression Id. */
    int Enum = 66;
    /** RegularExpression Id. */
    int FuncAlias = 67;
    /** RegularExpression Id. */
    int Import = 68;
    /** RegularExpression Id. */
    int Interface = 69;
    /** RegularExpression Id. */
    int Lazy = 70;
    /** RegularExpression Id. */
    int Module = 71;
    /** RegularExpression Id. */
    int Override = 72;
    /** RegularExpression Id. */
    int Private = 73;
    /** RegularExpression Id. */
    int Public = 74;
    /** RegularExpression Id. */
    int Sealed = 75;
    /** RegularExpression Id. */
    int Switch = 76;
    /** RegularExpression Id. */
    int Type = 77;
    /** RegularExpression Id. */
    int TypeAlias = 78;
    /** RegularExpression Id. */
    int Undefined = 79;
    /** RegularExpression Id. */
    int Variable = 80;
    /** RegularExpression Id. */
    int BoolLiteral = 81;
    /** RegularExpression Id. */
    int IntLiteral = 82;
    /** RegularExpression Id. */
    int Hexadecimal = 83;
    /** RegularExpression Id. */
    int HexDigit = 84;
    /** RegularExpression Id. */
    int FloatLiteral = 85;
    /** RegularExpression Id. */
    int Zero = 86;
    /** RegularExpression Id. */
    int NonZero = 87;
    /** RegularExpression Id. */
    int Exp = 88;
    /** RegularExpression Id. */
    int StringLiteral = 89;
    /** RegularExpression Id. */
    int StringCharacter = 90;
    /** RegularExpression Id. */
    int StringEscapeSeq = 91;
    /** RegularExpression Id. */
    int UnicodeEscape = 92;
    /** RegularExpression Id. */
    int TypeIdentifier = 93;
    /** RegularExpression Id. */
    int VarIdentifier = 94;
    /** RegularExpression Id. */
    int WildCard = 95;

    /** Lexical state. */
    int DEFAULT = 0;
    /** Lexical state. */
    int InComment = 1;

    /** Literal token values. */
    String[] tokenImage = {
        "<EOF>",
        "\"def\"",
        "\"extends\"",
        "\",\"",
        "\"#\"",
        "\"[\"",
        "\"]\"",
        "\"{\"",
        "\"}\"",
        "\"(\"",
        "\")\"",
        "\":\"",
        "\";\"",
        "\"::\"",
        "\".\"",
        "<SP>",
        "\"=\"",
        "\"+=\"",
        "\"-=\"",
        "\"*=\"",
        "\"/=\"",
        "\"%=\"",
        "\"<\"",
        "\"<=\"",
        "\">\"",
        "\">=\"",
        "\"+\"",
        "\"-\"",
        "\"*\"",
        "\"/\"",
        "\"/?\"",
        "\"%\"",
        "\"%?\"",
        "\"~\"",
        "\"!\"",
        "\"&\"",
        "\"|\"",
        "\"^\"",
        "\"?\"",
        "\"<-\"",
        "\"->\"",
        "\"~>\"",
        "\"~>?\"",
        "\"=>\"",
        "\"==\"",
        "\"!=\"",
        "\"!<>=\"",
        "\"<>=\"",
        "\"..\"",
        "\".<\"",
        "\"{:\"",
        "\":}\"",
        "\"@\"",
        "<NewLine>",
        "\" \"",
        "\"\\t\"",
        "<token of kind 56>",
        "\"/*\"",
        "<token of kind 58>",
        "\"/*\"",
        "<token of kind 60>",
        "<EndOfLine>",
        "\"*/\"",
        "\"abstract\"",
        "\"case\"",
        "\"check\"",
        "\"enum\"",
        "\"funcalias\"",
        "\"import\"",
        "\"interface\"",
        "\"lazy\"",
        "\"module\"",
        "\"override\"",
        "\"private\"",
        "\"public\"",
        "\"sealed\"",
        "\"switch\"",
        "\"type\"",
        "\"typealias\"",
        "\"undefined\"",
        "\"var\"",
        "<BoolLiteral>",
        "<IntLiteral>",
        "<Hexadecimal>",
        "<HexDigit>",
        "<FloatLiteral>",
        "\"0\"",
        "<NonZero>",
        "<Exp>",
        "<StringLiteral>",
        "<StringCharacter>",
        "<StringEscapeSeq>",
        "<UnicodeEscape>",
        "<TypeIdentifier>",
        "<VarIdentifier>",
        "\"_\"",
        "\"#(\"",};

}
