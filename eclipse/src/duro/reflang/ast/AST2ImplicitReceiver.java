package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2ImplicitReceiver implements AST2 {
	public static final AST2ImplicitReceiver INSTANCE = new AST2ImplicitReceiver();
	
	private AST2ImplicitReceiver() { }

	@Override
	public void writeTo(TreeWriter writer) throws IOException { }

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitImplicitReceiver(this);
	}
}
