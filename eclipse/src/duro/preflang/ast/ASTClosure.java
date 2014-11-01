package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTClosure implements AST {
	public final AST body;
	
	public ASTClosure(AST body) {
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitClosure(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("{");
		writer.indentnl();
		body.writeTo(writer);
		writer.dedentnl();
		writer.write("}");
	}
}
