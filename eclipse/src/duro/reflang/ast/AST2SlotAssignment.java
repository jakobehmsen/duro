package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2SlotAssignment implements AST2 {
	public static final int TYPE_REGULAR = 0;
	public static final int TYPE_PROTO = 1;
	public static final int TYPE_QUOTED = 2;
	
	public final int type;
	public final AST2 receiver;
	public final String id;
	public final int arity;
	public final AST2 value;

	public AST2SlotAssignment(int type, AST2 receiver, String id, int arity, AST2 value) {
		this.type = type;
		this.receiver = receiver;
		this.id = id;
		this.arity = arity;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitSlotAssignment(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		receiver.writeTo(writer);
		writer.write("@");
		writer.write(id);
		writer.write("/");
		writer.write(arity);
		switch(type) {
		case AST2SlotAssignment.TYPE_REGULAR:
			writer.write(" = ");
			break;
		case AST2SlotAssignment.TYPE_PROTO:
			writer.write(" ^= ");
			break;
		case AST2SlotAssignment.TYPE_QUOTED:
			writer.write(" => ");
			break;
		}
		value.writeTo(writer);
	}
}
