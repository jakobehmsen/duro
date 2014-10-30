package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2True implements AST2 {
	public static final AST2True INSTANCE = new AST2True();
	
	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitTrue(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("true");
	}
}
