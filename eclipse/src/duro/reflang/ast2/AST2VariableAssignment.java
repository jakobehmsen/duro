package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2VariableAssignment implements AST2 {
	public final int ordinal;
	public final AST2 value;
	
	public AST2VariableAssignment(int ordinal, AST2 value) {
		this.ordinal = ordinal;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
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
