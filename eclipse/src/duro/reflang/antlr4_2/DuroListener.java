// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4_2\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4_2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DuroParser}.
 */
public interface DuroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DuroParser#pseudoVar}.
	 * @param ctx the parse tree
	 */
	void enterPseudoVar(@NotNull DuroParser.PseudoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#pseudoVar}.
	 * @param ctx the parse tree
	 */
	void exitPseudoVar(@NotNull DuroParser.PseudoVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(@NotNull DuroParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(@NotNull DuroParser.AccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageOperand}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageOperand(@NotNull DuroParser.BinaryMessageOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageOperand}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageOperand(@NotNull DuroParser.BinaryMessageOperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull DuroParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull DuroParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DuroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DuroParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull DuroParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull DuroParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 */
	void enterTopExpression(@NotNull DuroParser.TopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 */
	void exitTopExpression(@NotNull DuroParser.TopExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(@NotNull DuroParser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(@NotNull DuroParser.DictEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DuroParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArg}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArg(@NotNull DuroParser.MultiArgMessageArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArg}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArg(@NotNull DuroParser.MultiArgMessageArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#rootExpression}.
	 * @param ctx the parse tree
	 */
	void enterRootExpression(@NotNull DuroParser.RootExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#rootExpression}.
	 * @param ctx the parse tree
	 */
	void exitRootExpression(@NotNull DuroParser.RootExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessage}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessage(@NotNull DuroParser.MultiArgMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessage}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessage(@NotNull DuroParser.MultiArgMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArgs}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArgs(@NotNull DuroParser.MultiArgMessageArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArgs}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArgs(@NotNull DuroParser.MultiArgMessageArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(@NotNull DuroParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(@NotNull DuroParser.DictContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull DuroParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull DuroParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DuroParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DuroParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#nonBinaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterNonBinaryMessage(@NotNull DuroParser.NonBinaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#nonBinaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitNonBinaryMessage(@NotNull DuroParser.NonBinaryMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#slotAccess}.
	 * @param ctx the parse tree
	 */
	void enterSlotAccess(@NotNull DuroParser.SlotAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#slotAccess}.
	 * @param ctx the parse tree
	 */
	void exitSlotAccess(@NotNull DuroParser.SlotAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#closure}.
	 * @param ctx the parse tree
	 */
	void enterClosure(@NotNull DuroParser.ClosureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#closure}.
	 * @param ctx the parse tree
	 */
	void exitClosure(@NotNull DuroParser.ClosureContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#parArg}.
	 * @param ctx the parse tree
	 */
	void enterParArg(@NotNull DuroParser.ParArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#parArg}.
	 * @param ctx the parse tree
	 */
	void exitParArg(@NotNull DuroParser.ParArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#topExpressions}.
	 * @param ctx the parse tree
	 */
	void enterTopExpressions(@NotNull DuroParser.TopExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#topExpressions}.
	 * @param ctx the parse tree
	 */
	void exitTopExpressions(@NotNull DuroParser.TopExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DuroParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull DuroParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull DuroParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#slotAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSlotAssignment(@NotNull DuroParser.SlotAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#slotAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSlotAssignment(@NotNull DuroParser.SlotAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#behaviorParams}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorParams(@NotNull DuroParser.BehaviorParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#behaviorParams}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorParams(@NotNull DuroParser.BehaviorParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull DuroParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull DuroParser.MessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#indexOperator}.
	 * @param ctx the parse tree
	 */
	void enterIndexOperator(@NotNull DuroParser.IndexOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#indexOperator}.
	 * @param ctx the parse tree
	 */
	void exitIndexOperator(@NotNull DuroParser.IndexOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(@NotNull DuroParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(@NotNull DuroParser.GroupingContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#selfMessageExchange}.
	 * @param ctx the parse tree
	 */
	void enterSelfMessageExchange(@NotNull DuroParser.SelfMessageExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selfMessageExchange}.
	 * @param ctx the parse tree
	 */
	void exitSelfMessageExchange(@NotNull DuroParser.SelfMessageExchangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#indexAssign}.
	 * @param ctx the parse tree
	 */
	void enterIndexAssign(@NotNull DuroParser.IndexAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#indexAssign}.
	 * @param ctx the parse tree
	 */
	void exitIndexAssign(@NotNull DuroParser.IndexAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessage(@NotNull DuroParser.BinaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessage(@NotNull DuroParser.BinaryMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(@NotNull DuroParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(@NotNull DuroParser.IndexAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(@NotNull DuroParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(@NotNull DuroParser.BinaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 */
	void enterMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 */
	void exitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull DuroParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull DuroParser.AtomContext ctx);
}