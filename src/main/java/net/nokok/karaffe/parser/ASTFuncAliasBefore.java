/* Generated By:JJTree: Do not edit this line. ASTFuncAliasBefore.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTFuncAliasBefore extends SimpleNode {

    public ASTFuncAliasBefore(int id) {
        super(id);
    }

    public ASTFuncAliasBefore(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=8971502964defe6c02f56ab2e4e4cb47 (do not edit this line) */
