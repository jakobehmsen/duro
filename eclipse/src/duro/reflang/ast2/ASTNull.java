package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTNull implements AST {
	public static final ASTNull INSTANCE = new ASTNull();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitNull(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("null");
	}
}
