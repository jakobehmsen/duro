package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTEmpty implements AST {
	public static final ASTEmpty INSTANCE = new ASTEmpty();

	@Override
	public void accept(ASTVisitor visitor) { }

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("¤");
	}
}
