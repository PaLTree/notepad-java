/* KaraffeParser.java */
/* Generated By:JavaCC: Do not edit this line. KaraffeParser.java */
package net.nokok.karaffe.javacc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.nokok.karaffe.javacc.expr.*;
import net.nokok.karaffe.javacc.identifier.TypeId;
import net.nokok.karaffe.javacc.identifier.VariableId;
import net.nokok.karaffe.javacc.literal.IntLiteral;
import net.nokok.karaffe.javacc.literal.UndefinedLiteral;
import net.nokok.karaffe.javacc.stmt.*;

public class KaraffeParser implements KaraffeParserConstants {

    public final Statements statements = new Statements();
    public static final List codeList = new ArrayList(); //List<String>

    public static KaraffeParser createParser(String sourceCode) {
        KaraffeParser parser = new KaraffeParser(new java.io.StringReader(sourceCode));
        codeList.clear();
        codeList.addAll(Arrays.asList(sourceCode.split("\u005cn")));
        return parser;
    }

    final public Statements start() throws ParseException {
        Statement s;
        label_1:
        while ( true ) {
            switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
                case Type:
                case SideEffect:
                case NewLine: {
                    ;
                    break;
                }
                default:
                    jj_la1[0] = jj_gen;
                    break label_1;
            }
            s = statement();
            statements.addStatement(s);
        }
        jj_consume_token(0);
        {
            if ( "" != null ) {
                return statements;
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public Statement statement() throws ParseException {
        Statement t;
        switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
            case Type:
            case SideEffect: {
                t = typeAlias();
                jj_consume_token(NewLine);
                {
                    if ( "" != null ) {
                        return t;
                    }
                }
                break;
            }
            case NewLine: {
                jj_consume_token(NewLine);
                {
                    if ( "" != null ) {
                        return new NewLineStatement();
                    }
                }
                break;
            }
            default:
                jj_la1[1] = jj_gen;
                jj_consume_token(-1);
                throw new ParseException();
        }
        throw new Error("Missing return statement in function");
    }

    /**
     * TypeAliasの宣言
     */
    final public Statement typeAlias() throws ParseException {
        Token seffect = null;
        TypeId newType;
        TypeId existingTypeName = net.nokok.karaffe.javacc.identifier.TypeId.Any;
        switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
            case SideEffect: {
                seffect = jj_consume_token(SideEffect);
                break;
            }
            default:
                jj_la1[2] = jj_gen;
                ;
        }
        jj_consume_token(Type);
        newType = typeId();
        switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
            case Assign: {
                jj_consume_token(Assign);
                existingTypeName = typeId();
                break;
            }
            default:
                jj_la1[3] = jj_gen;
                ;
        }
        if ( seffect == null ) {
            {
                if ( "" != null ) {
                    return new TypeAliasStatement(existingTypeName, newType);
                }
            }
        } else {
            {
                if ( "" != null ) {
                    return new MutableTypeAliasStatement(existingTypeName, newType);
                }
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public Expression expr() throws ParseException {
        Expression body;
        body = literals();
        {
            if ( "" != null ) {
                return body;
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public TypeId typeId() throws ParseException {
        Token token;
        token = jj_consume_token(TypeId);
        {
            if ( "" != null ) {
                return new TypeId(token.image);
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public VariableId variableId() throws ParseException {
        Token token;
        token = jj_consume_token(VariableId);
        {
            if ( "" != null ) {
                return new VariableId(token.image);
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public Expression literals() throws ParseException {
        Expression expr;
        switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
            case Undefined: {
                expr = undefined();
                {
                    if ( "" != null ) {
                        return expr;
                    }
                }
                break;
            }
            case SubOp:
            case Zero:
            case NonZero: {
                expr = intLiteral();
                {
                    if ( "" != null ) {
                        return expr;
                    }
                }
                break;
            }
            default:
                jj_la1[4] = jj_gen;
                jj_consume_token(-1);
                throw new ParseException();
        }
        throw new Error("Missing return statement in function");
    }

    final public Expression undefined() throws ParseException {
        jj_consume_token(Undefined);
        {
            if ( "" != null ) {
                return new UndefinedLiteral();
            }
        }
        throw new Error("Missing return statement in function");
    }

    final public Expression intLiteral() throws ParseException {
        Token nonZero;
        Token digit;
        Token minus = null;
        List tokenList = new ArrayList();
        switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
            case SubOp:
            case NonZero: {
                switch ( (jj_ntk == -1) ? jj_ntk_f() : jj_ntk ) {
                    case SubOp: {
                        minus = jj_consume_token(SubOp);
                        break;
                    }
                    default:
                        jj_la1[5] = jj_gen;
                        ;
                }
                nonZero = jj_consume_token(NonZero);
                digit = jj_consume_token(Digit);
                tokenList.add(digit);
                StringBuilder sb = new StringBuilder();
                if ( minus != null ) {
                    sb.append(minus.image);
                }
                sb.append(nonZero.image);
                for ( Object obj : tokenList ) {
                    Token t = (Token) obj;
                    sb.append(t.image);
                }
                {
                    if ( "" != null ) {
                        return new IntLiteral(Integer.parseInt(sb.toString()));
                    }
                }
                break;
            }
            case Zero: {
                digit = jj_consume_token(Zero);
                {
                    if ( "" != null ) {
                        return new IntLiteral(Integer.parseInt(digit.image));
                    }
                }
                break;
            }
            default:
                jj_la1[6] = jj_gen;
                jj_consume_token(-1);
                throw new ParseException();
        }
        throw new Error("Missing return statement in function");
    }

    /**
     * Generated Token Manager.
     */
    public KaraffeParserTokenManager token_source;
    SimpleCharStream jj_input_stream;
    /**
     * Current token.
     */
    public Token token;
    /**
     * Next token.
     */
    public Token jj_nt;
    private int jj_ntk;
    private int jj_gen;
    final private int[] jj_la1 = new int[7];
    static private int[] jj_la1_0;
    static private int[] jj_la1_1;

    static {
        jj_la1_init_0();
        jj_la1_init_1();
    }

    private static void jj_la1_init_0() {
        jj_la1_0 = new int[]{ 0xa00, 0xa00, 0x800, 0x400000, 0x10100000, 0x10000000, 0x10000000, };
    }

    private static void jj_la1_init_1() {
        jj_la1_1 = new int[]{ 0x100, 0x100, 0x0, 0x0, 0xc, 0x0, 0xc, };
    }

    /**
     * Constructor with InputStream.
     */
    public KaraffeParser(java.io.InputStream stream) {
        this(stream, null);
    }

    /**
     * Constructor with InputStream and supplied encoding
     */
    public KaraffeParser(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source = new KaraffeParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.InputStream stream) {
        ReInit(stream, null);
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream.ReInit(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    /**
     * Constructor.
     */
    public KaraffeParser(java.io.Reader stream) {
        jj_input_stream = new SimpleCharStream(stream, 1, 1);
        token_source = new KaraffeParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.Reader stream) {
        jj_input_stream.ReInit(stream, 1, 1);
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    /**
     * Constructor with generated Token Manager.
     */
    public KaraffeParser(KaraffeParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    /**
     * Reinitialise.
     */
    public void ReInit(KaraffeParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for ( int i = 0; i < 7; i++ ) {
            jj_la1[i] = -1;
        }
    }

    private Token jj_consume_token(int kind) throws ParseException {
        Token oldToken;
        if ( (oldToken = token).next != null ) {
            token = token.next;
        } else {
            token = token.next = token_source.getNextToken();
        }
        jj_ntk = -1;
        if ( token.kind == kind ) {
            jj_gen++;
            return token;
        }
        token = oldToken;
        jj_kind = kind;
        throw generateParseException();
    }

    /**
     * Get the next Token.
     */
    final public Token getNextToken() {
        if ( token.next != null ) {
            token = token.next;
        } else {
            token = token.next = token_source.getNextToken();
        }
        jj_ntk = -1;
        jj_gen++;
        return token;
    }

    /**
     * Get the specific Token.
     */
    final public Token getToken(int index) {
        Token t = token;
        for ( int i = 0; i < index; i++ ) {
            if ( t.next != null ) {
                t = t.next;
            } else {
                t = t.next = token_source.getNextToken();
            }
        }
        return t;
    }

    private int jj_ntk_f() {
        if ( (jj_nt = token.next) == null ) {
            return (jj_ntk = (token.next = token_source.getNextToken()).kind);
        } else {
            return (jj_ntk = jj_nt.kind);
        }
    }

    private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
    private int[] jj_expentry;
    private int jj_kind = -1;

    /**
     * Generate ParseException.
     */
    public ParseException generateParseException() {
        jj_expentries.clear();
        boolean[] la1tokens = new boolean[41];
        if ( jj_kind >= 0 ) {
            la1tokens[jj_kind] = true;
            jj_kind = -1;
        }
        for ( int i = 0; i < 7; i++ ) {
            if ( jj_la1[i] == jj_gen ) {
                for ( int j = 0; j < 32; j++ ) {
                    if ( (jj_la1_0[i] & (1 << j)) != 0 ) {
                        la1tokens[j] = true;
                    }
                    if ( (jj_la1_1[i] & (1 << j)) != 0 ) {
                        la1tokens[32 + j] = true;
                    }
                }
            }
        }
        for ( int i = 0; i < 41; i++ ) {
            if ( la1tokens[i] ) {
                jj_expentry = new int[1];
                jj_expentry[0] = i;
                jj_expentries.add(jj_expentry);
            }
        }
        int[][] exptokseq = new int[jj_expentries.size()][];
        for ( int i = 0; i < jj_expentries.size(); i++ ) {
            exptokseq[i] = jj_expentries.get(i);
        }
        return new ParseException(token, exptokseq, tokenImage);
    }

    /**
     * Enable tracing.
     */
    final public void enable_tracing() {
    }

    /**
     * Disable tracing.
     */
    final public void disable_tracing() {
    }

}
