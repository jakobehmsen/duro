package duro.reflang.ast;

public class ASTInterfaceId implements AST {
	public final String id;
	public final AST body;
	
	public ASTInterfaceId(String id, AST body) {
		this.id = id;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitInterfaceId(this);
	}
}
