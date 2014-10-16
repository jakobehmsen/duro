package duro.reflang.ast;

public class ASTMessage implements AST {
	public final String id;
	public final AST[] arguments;
	
	public ASTMessage(String id, AST[] arguments) {
		this.id = id;
		this.arguments = arguments;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitMessage(this);
	}
}
