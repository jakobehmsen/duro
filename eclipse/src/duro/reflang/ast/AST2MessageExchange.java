package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2MessageExchange implements AST2 {
	public final AST2 receiver;
	public final AST2Message message;
	
	public AST2MessageExchange(AST2 receiver, AST2Message message) {
		this.receiver = receiver;
		this.message = message;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitMessageExchange(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("(");
		receiver.writeTo(writer);
		writer.write(")");
		writer.write(".");
		message.writeTo(writer);
	}
}
