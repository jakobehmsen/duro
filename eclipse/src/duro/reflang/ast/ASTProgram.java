package duro.reflang.ast;

public class ASTProgram implements AST {
	public final AST body;
	
	public ASTProgram(AST body) {
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitProgram(this);
	}
}
