package duro.reflang;

public class ASTSlotAccess implements AST {
	public final AST receiver;
	public final String id;

	public ASTSlotAccess(AST receiver, String id) {
		this.receiver = receiver;
		this.id = id;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitSlotAccess(this);
	}
}
