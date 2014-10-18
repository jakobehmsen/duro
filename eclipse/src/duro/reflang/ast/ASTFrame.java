package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTFrame implements AST {
	public static final ASTFrame INSTANCE = new ASTFrame();
	
	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitFrame(this);
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("true");
	}
}
