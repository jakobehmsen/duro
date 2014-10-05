package duro.reflang;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public interface PrimitiveVisitor {
	void visitPrimitive(String id, List<ParserRuleContext> args);
}
