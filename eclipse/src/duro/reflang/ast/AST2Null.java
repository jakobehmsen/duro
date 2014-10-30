package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Null implements AST2 {
	public static final AST2Null INSTANCE = new AST2Null();
	
	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitNull(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("null");
	}
}
