package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2VariableAccess implements AST2 {
	public final String id;
	
	public AST2VariableAccess(String id) {
		this.id = id;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitLocalAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(id);
	}
}
