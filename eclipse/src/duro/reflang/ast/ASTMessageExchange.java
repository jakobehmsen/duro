package duro.reflang.ast;

public class ASTMessageExchange implements AST {
	public final AST receiver;
	public final ASTMessage message;
	
	public ASTMessageExchange(AST receiver, ASTMessage message) {
		this.receiver = receiver;
		this.message = message;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitMessageExchange(this);
	}
}
