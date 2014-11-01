package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTBehavior implements AST {
	public final AST body;
	
	public ASTBehavior(AST body) {
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitBehavior(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("(");
		writer.indentnl();
		body.writeTo(writer);
		writer.dedentnl();
		writer.write(")");
	}
}
