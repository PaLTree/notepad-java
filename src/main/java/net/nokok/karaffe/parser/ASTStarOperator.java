/* Generated By:JJTree: Do not edit this line. ASTStarOperator.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTStarOperator extends SimpleNode {

    public ASTStarOperator(int id) {
        super(id);
    }

    public ASTStarOperator(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d7768061417e5a0b3e32935be27494e4 (do not edit this line) */
