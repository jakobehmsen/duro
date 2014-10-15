package duro.reflang;

public class ASTSlotAssignment implements AST {
	public static final int TYPE_REGULAR = 0;
	public static final int TYPE_PROTO = 1;
	public static final int TYPE_QUOTED = 2;
	
	public final int type;
	public final AST receiver;
	public final String id;
	public final int arity;
	public final AST value;

	public ASTSlotAssignment(int type, AST receiver, String id, int arity, AST value) {
		this.type = type;
		this.receiver = receiver;
		this.id = id;
		this.arity = arity;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitSlotAssignment(this);
	}
}
