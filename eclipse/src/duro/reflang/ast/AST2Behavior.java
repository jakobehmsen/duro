package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Behavior implements AST2 {
	public final int localCount;
	public final AST body;
	
	public AST2Behavior(int localCount, AST body) {
		this.localCount = localCount;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitBehavior(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("(");
		writer.write(localCount);
		writer.write("|");
		writer.indentnl();
		body.writeTo(writer);
		writer.dedentnl();
		writer.write(")");
	}
}
