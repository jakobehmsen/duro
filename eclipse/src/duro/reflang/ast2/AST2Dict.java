package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;
import duro.reflang.ast.ASTSlotAssignment;

public class AST2Dict implements AST2 {
	public static class Entry {
		public final String id;
		public final int type;
		public final int arity;
		public final AST2 value;
		
		public Entry(String id, int type, int arity, AST2 value) {
			this.id = id;
			this.type = type;
			this.arity = arity;
			this.value = value;
		}
	}
	
	public final AST2 prototype;
	public final Entry[] entries;

	public AST2Dict(AST2 prototype, Entry[] entries) {
		this.prototype = prototype;
		this.entries = entries;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitDict(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("#[");
		for(int i = 0; i < entries.length; i++) {
			if(i > 0)
				writer.writeln();
			writer.write(entries[i].id);
			writer.write("/");
			writer.write(entries[i].arity);
			switch(entries[i].type) {
			case ASTSlotAssignment.TYPE_REGULAR:
				writer.write(" = ");
				break;
			case ASTSlotAssignment.TYPE_PROTO:
				writer.write(" ^= ");
				break;
			case ASTSlotAssignment.TYPE_QUOTED:
				writer.write(" => ");
				break;
			}
			entries[i].value.writeTo(writer);
		}
		writer.write("]");
	}
}
