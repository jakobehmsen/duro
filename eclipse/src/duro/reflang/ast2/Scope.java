package duro.reflang.ast2;

import java.util.HashSet;

public class Scope {
	private Scope outer;
	private HashSet<String> ids = new HashSet<String>();
	
	public Scope newInner() {
		Scope innerScope = new Scope();
		innerScope.outer = this;
		return innerScope;
	}
	
	public void declare(String id) {
		ids.add(id);
	}
	
	public boolean isDeclared(String id) {
		return isDeclaredLocally(id) || outer != null ? outer.isDeclared(id) : false;
	}

	public boolean isDeclaredLocally(String id) {
		return ids.contains(id);
	}

	public Scope getOuter() {
		return outer;
	}
}
