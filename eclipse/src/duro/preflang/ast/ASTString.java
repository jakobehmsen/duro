package duro.preflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class ASTString implements AST {
	public final String string;
	
	public ASTString(String string) {
		this.string = string;
	}

	public void accept(ASTVisitor visitor) {
		visitor.visitString(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("\"");
		writer.write(string);
		writer.write("\"");
	}
}
