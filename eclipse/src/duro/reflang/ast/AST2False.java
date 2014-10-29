package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2False implements AST2 {
	public static final AST2False INSTANCE = new AST2False();
	
	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitFalse(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("false");
	}
}
