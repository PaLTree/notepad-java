/* Generated By:JJTree: Do not edit this line. ASTSP.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTSP extends SimpleNode {

    public ASTSP(int id) {
        super(id);
    }

    public ASTSP(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. * */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=8f0edca288b6e9cb7d3a4fd3bffa0dae (do not edit this line) */
