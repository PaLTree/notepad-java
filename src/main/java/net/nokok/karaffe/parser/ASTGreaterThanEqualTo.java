/* Generated By:JJTree: Do not edit this line. ASTGreaterThanEqualTo.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTGreaterThanEqualTo extends SimpleNode {

    public ASTGreaterThanEqualTo(int id) {
        super(id);
    }

    public ASTGreaterThanEqualTo(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7d82743768d6113d42f6f5750b9057b2 (do not edit this line) */