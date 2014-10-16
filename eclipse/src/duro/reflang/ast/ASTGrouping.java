package duro.reflang.ast;

public class ASTGrouping implements AST {
	public final AST[] items;
	
	public ASTGrouping(AST[] items) {
		this.items = items;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitGrouping(this);
	}
}
