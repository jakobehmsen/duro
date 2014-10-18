package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTTrue implements AST {
	public static final ASTTrue INSTANCE = new ASTTrue();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitTrue(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("true");
	}
}
