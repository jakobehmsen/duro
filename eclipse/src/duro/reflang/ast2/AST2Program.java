package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Program implements AST2 {
	public final AST2 body;
	
	public AST2Program(AST2 body) {
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitProgram(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		body.writeTo(writer);
	}
}
