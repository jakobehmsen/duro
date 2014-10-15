package duro.reflang;

public class ASTTrue implements AST {
	public static final ASTTrue INSTANCE = new ASTTrue();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitTrue(this);
	}
}
