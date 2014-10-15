package duro.reflang;

public class ASTString implements AST {
	public final String string;
	
	public ASTString(String string) {
		this.string = string;
	}

	public void accept(ASTVisitor visitor) {
		visitor.visitString(this);
	}
}
