package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTParameterAccess implements AST {
	public final String id;
	
	public ASTParameterAccess(String id) {
		this.id = id;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitParameterAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(id);
	}
}
