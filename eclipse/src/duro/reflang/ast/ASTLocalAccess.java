package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTLocalAccess implements AST {
	public final int ordinal;
	
	public ASTLocalAccess(int ordinal) {
		this.ordinal = ordinal;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitLocalAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(ordinal);
	}
}
