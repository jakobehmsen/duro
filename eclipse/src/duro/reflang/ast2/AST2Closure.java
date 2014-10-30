package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Closure implements AST2 {
	public final int parameterOffset;
	public final int parameterCount;
	public final AST2 body;
	
	public AST2Closure(int parameterOffset, int parameterCount, AST2 body) {
		this.parameterOffset = parameterOffset;
		this.parameterCount = parameterCount;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitClosure(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("{");
		writer.write(parameterOffset);
		writer.write(",");
		writer.write(parameterCount);
		writer.write("|");
		writer.indentnl();
		body.writeTo(writer);
		writer.dedentnl();
		writer.write("}");
	}
}
