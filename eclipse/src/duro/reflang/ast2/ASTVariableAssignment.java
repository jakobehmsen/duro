package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTVariableAssignment implements AST {
	public final String id;
	public final AST value;
	
	public ASTVariableAssignment(String id, AST value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitVariableAssignment(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(id);
		writer.write(" = ");
		value.writeTo(writer);
	}
}
