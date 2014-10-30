package duro.reflang.ast2;

import java.io.IOException;

import duro.io.TreeWriter;

public class AST2Spawn implements AST2 {
	public final AST2 environment;
	public final AST2Behavior behavior;
	
	public AST2Spawn(AST2 environment, AST2Behavior behavior) {
		this.environment = environment;
		this.behavior = behavior;
	}

	@Override
	public void writeTo(TreeWriter writer) throws IOException {
		writer.write("#(");
		behavior.writeTo(writer);
		writer.write(")");
	}

	@Override
	public void accept(ASTVisitor2 visitor) {
		visitor.visitSpawn(this);
	}
}
