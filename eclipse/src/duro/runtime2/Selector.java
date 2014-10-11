package duro.runtime2;

public class Selector {
	public final String name;
	public final int arity;
	
	public Selector(String name, int arity) {
		this.name = name;
		this.arity = arity;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() * arity;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Selector)obj).name) && this.arity == ((Selector)obj).arity;
	}
}
