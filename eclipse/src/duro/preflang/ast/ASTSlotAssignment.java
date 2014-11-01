package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTSlotAssignment implements AST {
	public static final int TYPE_REGULAR = 0;
	public static final int TYPE_PROTO = 1;
	public static final int TYPE_QUOTED = 2;
	
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
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		receiver.writeTo(writer);
		writer.write("@");
		writer.write(id);
		switch(type) {
		case ASTSlotAssignment.TYPE_REGULAR:
			writer.write(" = ");
			break;
		case ASTSlotAssignment.TYPE_PROTO:
			writer.write(" ^= ");
			break;
		case ASTSlotAssignment.TYPE_QUOTED:
			writer.write(" => ");
			break;
		}
		value.writeTo(writer);
	}
}
