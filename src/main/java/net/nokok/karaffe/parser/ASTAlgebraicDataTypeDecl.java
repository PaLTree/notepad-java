/* Generated By:JJTree: Do not edit this line. ASTAlgebraicDataTypeDecl.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTAlgebraicDataTypeDecl extends SimpleNode {

    public ASTAlgebraicDataTypeDecl(int id) {
        super(id);
    }

    public ASTAlgebraicDataTypeDecl(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=4b492d27356a496132542c44c6a9415a (do not edit this line) */