package duro.reflang;

public class ASTEmpty implements AST {
	public static final ASTEmpty INSTANCE = new ASTEmpty();

	@Override
	public void accept(ASTVisitor visitor) { }
}
