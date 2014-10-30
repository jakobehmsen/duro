package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTVariableAssignment implements AST {
	public final int ordinal;
	public final AST value;
	
	public ASTVariableAssignment(int ordinal, AST value) {
		this.ordinal = ordinal;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitVariableAssignment(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(ordinal);
		writer.write(" = ");
		value.writeTo(writer);
	}
}
