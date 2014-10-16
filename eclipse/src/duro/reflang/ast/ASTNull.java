package duro.reflang.ast;

public class ASTNull implements AST {
	public static final ASTNull INSTANCE = new ASTNull();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitNull(this);
	}
}
