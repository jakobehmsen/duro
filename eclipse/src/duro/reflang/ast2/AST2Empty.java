package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Empty implements AST2 {
	public static final AST2Empty INSTANCE = new AST2Empty();

	@Override
	public void accept(ASTVisitor2 visitor) { }

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("¤");
	}
}
