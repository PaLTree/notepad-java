/* Generated By:JJTree: Do not edit this line. ASTAmbiguousName.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTAmbiguousName extends SimpleNode {

    public ASTAmbiguousName(int id) {
        super(id);
    }

    public ASTAmbiguousName(Parser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=dd9c5679aeee3d69766e3247f3cafca2 (do not edit this line) */