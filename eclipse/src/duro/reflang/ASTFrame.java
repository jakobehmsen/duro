package duro.reflang;

public class ASTFrame implements AST {
	public static final ASTFrame INSTANCE = new ASTFrame();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitFrame(this);
	}
}
