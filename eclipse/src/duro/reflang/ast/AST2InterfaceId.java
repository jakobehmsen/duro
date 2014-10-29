package duro.reflang.ast;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2InterfaceId implements AST2 {
	public final String id;
	public final AST2 body;
	
	public AST2InterfaceId(String id, AST2 body) {
		this.id = id;
		this.body = body;
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitInterfaceId(this);
	}
	
	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("$");
		writer.write(id);
		writer.indentnl();
		body.writeTo(writer);
		writer.dedentnl();
	}
}
