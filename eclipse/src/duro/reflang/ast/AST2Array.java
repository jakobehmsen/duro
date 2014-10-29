package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Array implements AST2 {
	public final AST[] items;
	
	public AST2Array(AST[] items) {
		this.items = items;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitArray(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("#(");
		for(int i = 0; i < items.length; i++) {
			if(i > 0)
				writer.write(" ");
			items[i].writeTo(writer);
		}
		writer.write(")");
	}
}
