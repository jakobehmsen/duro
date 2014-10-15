package duro.reflang;

public class ASTSlotAccess implements AST {
	public final AST receiver;
	public final String id;
	public final int arity;

	public ASTSlotAccess(AST receiver, String id, int arity) {
		this.receiver = receiver;
		this.id = id;
		this.arity = arity;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitSlotAccess(this);
	}
}
