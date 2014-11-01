package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTFalse implements AST {
	public static final ASTFalse INSTANCE = new ASTFalse();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitFalse(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("false");
	}
}
