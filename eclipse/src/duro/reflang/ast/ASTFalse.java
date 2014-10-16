package duro.reflang.ast;

public class ASTFalse implements AST {
	public static final ASTFalse INSTANCE = new ASTFalse();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitFalse(this);
	}
}
