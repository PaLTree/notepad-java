/* Generated By:JJTree: Do not edit this line. ASTIfExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTIfExpr extends SimpleNode {

    public ASTIfExpr(int id) {
        super(id);
    }

    public ASTIfExpr(Parser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=75ba1d2def9e9a4ca8d4f5abde2cf6ae (do not edit this line) */