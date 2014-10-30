package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Integer implements AST2 {
	public final int integer;
	
	public AST2Integer(int integer) {
		this.integer = integer;
	}

	public void accept(ASTVisitor2 visitor) {
		visitor.visitInteger(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write(integer);
	}
}
