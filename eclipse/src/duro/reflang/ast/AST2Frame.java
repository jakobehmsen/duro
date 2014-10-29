package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Frame implements AST2 {
	public static final AST2Frame INSTANCE = new AST2Frame();
	
	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitFrame(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("true");
	}
}
