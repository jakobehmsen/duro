package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTProgram implements AST {
	public final AST body;
	
	public ASTProgram(AST body) {
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitProgram(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		body.writeTo(writer);
	}
}
