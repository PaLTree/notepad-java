/* Generated By:JJTree: Do not edit this line. ASTExtendsType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTExtendsType extends SimpleNode {

    public ASTExtendsType(int id) {
        super(id);
    }

    public ASTExtendsType(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7f35bb1f3815e3838eebbf71d19c1a92 (do not edit this line) */