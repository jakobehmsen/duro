package duro.reflang;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;

public class ConditionalTreeWalker extends ParseTreeWalker {
	private boolean suspendWalk;
	private RuleNode ruleSuspendedAt;
	
	@Override
	protected void enterRule(ParseTreeListener listener, RuleNode r) {
		if(!suspendWalk)
			super.enterRule(listener, r);
	}
	
	@Override
	protected void exitRule(ParseTreeListener listener, RuleNode r) {
		if(ruleSuspendedAt == r)
			suspendWalk = false;
		
		if(!suspendWalk)
			super.exitRule(listener, r);
	}
	
	public void suspendWalkWithin(RuleNode r) {
		suspendWalk = true;
		ruleSuspendedAt = r;
	}
}