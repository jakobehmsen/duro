package duro.reflang;

public class ASTDict implements AST {
	public static class Entry {
		public final String id;
		public final AST value;
		
		public Entry(String id, AST value) {
			this.id = id;
			this.value = value;
		}
	}
	
	public final Entry[] entries;

	public ASTDict(Entry[] entries) {
		this.entries = entries;
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitDict(this);
	}
}
