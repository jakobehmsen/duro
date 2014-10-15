package duro.reflang;

public class ASTSlotAssignment implements AST {
	public static final int TYPE_REGULAR = 0;
	public static final int TYPE_PROTO = 1;
	
	public final int type;
	public final AST receiver;
	public final String id;
	public final AST value;

	public ASTSlotAssignment(int type, AST receiver, String id, AST value) {
		this.type = type;
		this.receiver = receiver;
		this.id = id;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitSlotAssignment(this);
	}
}
