package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2SlotAccess implements AST2 {
	public final AST2 receiver;
	public final String id;
	public final int arity;

	public AST2SlotAccess(AST2 receiver, String id, int arity) {
		this.receiver = receiver;
		this.id = id;
		this.arity = arity;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitSlotAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		receiver.writeTo(writer);
		writer.write("@");
		writer.write(id);
		writer.write("/");
		writer.write(arity);
	}
}
