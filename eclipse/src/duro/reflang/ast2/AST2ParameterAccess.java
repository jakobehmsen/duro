package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2ParameterAccess implements AST2 {
	public final String id;
	
	public AST2ParameterAccess(String id) {
		this.id = id;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitParameterAccess(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("&");
		writer.write(id);
	}
}
