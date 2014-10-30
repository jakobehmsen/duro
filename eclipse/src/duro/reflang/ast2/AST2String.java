package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2String implements AST2 {
	public final String string;
	
	public AST2String(String string) {
		this.string = string;
	}

	public void accept(ASTVisitor2 visitor) {
		visitor.visitString(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("\"");
		writer.write(string);
		writer.write("\"");
	}
}
