package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Message implements AST2 {
	public final String id;
	public final AST2[] arguments;
	
	public AST2Message(String id, AST2[] arguments) {
		this.id = id;
		this.arguments = arguments;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitMessage(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("(");
		writer.write(id);
		for(int i = 0; i < arguments.length; i++) {
			writer.write(" ");
			arguments[i].writeTo(writer);
		}
		writer.write(")");
	}
}
