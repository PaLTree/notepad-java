/* Generated By:JJTree: Do not edit this line. ASTExpressionBinding.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTExpressionBinding extends SimpleNode {

    public ASTExpressionBinding(int id) {
        super(id);
    }

    public ASTExpressionBinding(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=e2e603a16275a7581d9bdff208f3769c (do not edit this line) */
