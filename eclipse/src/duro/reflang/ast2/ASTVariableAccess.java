package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTVariableAccess implements AST {
	public final String id;
	
	public ASTVariableAccess(String id) {
		this.id = id;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitVariableAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(id);
	}
}
