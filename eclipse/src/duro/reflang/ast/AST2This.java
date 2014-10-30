package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2This implements AST2 {
	public static final AST2This INSTANCE = new AST2This();
	
	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitThis(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("this");
	}
}
