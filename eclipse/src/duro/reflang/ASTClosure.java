package duro.reflang;

public class ASTClosure implements AST {
	public final String[] parameters;
	public final AST body;
	
	public ASTClosure(String[] parameters, AST body) {
		this.parameters = parameters;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitClosure(this);
	}
}
