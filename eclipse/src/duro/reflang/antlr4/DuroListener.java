// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
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
	 * Enter a parse tree produced by {@link DuroParser#selfSingleArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void enterSelfSingleArgMessageNoPar(@NotNull DuroParser.SelfSingleArgMessageNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selfSingleArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void exitSelfSingleArgMessageNoPar(@NotNull DuroParser.SelfSingleArgMessageNoParContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageNoParHead}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageNoParHead(@NotNull DuroParser.MultiArgMessageNoParHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageNoParHead}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageNoParHead(@NotNull DuroParser.MultiArgMessageNoParHeadContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMessage(@NotNull DuroParser.UnaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMessage(@NotNull DuroParser.UnaryMessageContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull DuroParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull DuroParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageNoPar(@NotNull DuroParser.MultiArgMessageNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageNoPar(@NotNull DuroParser.MultiArgMessageNoParContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArgNoPar}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArgNoPar(@NotNull DuroParser.MultiArgMessageArgNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArgNoPar}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArgNoPar(@NotNull DuroParser.MultiArgMessageArgNoParContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageNoParTail}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageNoParTail(@NotNull DuroParser.MultiArgMessageNoParTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageNoParTail}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageNoParTail(@NotNull DuroParser.MultiArgMessageNoParTailContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageOperandChain}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageOperandChain(@NotNull DuroParser.BinaryMessageOperandChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageOperandChain}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageOperandChain(@NotNull DuroParser.BinaryMessageOperandChainContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArgNoParChain}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArgNoParChain(@NotNull DuroParser.MultiArgMessageArgNoParChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArgNoParChain}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArgNoParChain(@NotNull DuroParser.MultiArgMessageArgNoParChainContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(@NotNull DuroParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(@NotNull DuroParser.ReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#selfMultiArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void enterSelfMultiArgMessageNoPar(@NotNull DuroParser.SelfMultiArgMessageNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selfMultiArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void exitSelfMultiArgMessageNoPar(@NotNull DuroParser.SelfMultiArgMessageNoParContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#messageEnd}.
	 * @param ctx the parse tree
	 */
	void enterMessageEnd(@NotNull DuroParser.MessageEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#messageEnd}.
	 * @param ctx the parse tree
	 */
	void exitMessageEnd(@NotNull DuroParser.MessageEndContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#singleArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgMessageNoPar(@NotNull DuroParser.SingleArgMessageNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#singleArgMessageNoPar}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgMessageNoPar(@NotNull DuroParser.SingleArgMessageNoParContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#expressionChain}.
	 * @param ctx the parse tree
	 */
	void enterExpressionChain(@NotNull DuroParser.ExpressionChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#expressionChain}.
	 * @param ctx the parse tree
	 */
	void exitExpressionChain(@NotNull DuroParser.ExpressionChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArgsNoPar}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArgsNoPar(@NotNull DuroParser.MultiArgMessageArgsNoParContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArgsNoPar}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArgsNoPar(@NotNull DuroParser.MultiArgMessageArgsNoParContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiArgMessageArgNoParReceiver}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgMessageArgNoParReceiver(@NotNull DuroParser.MultiArgMessageArgNoParReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiArgMessageArgNoParReceiver}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgMessageArgNoParReceiver(@NotNull DuroParser.MultiArgMessageArgNoParReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#interfaceId}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceId(@NotNull DuroParser.InterfaceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#interfaceId}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceId(@NotNull DuroParser.InterfaceIdContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link DuroParser#messageChain}.
	 * @param ctx the parse tree
	 */
	void enterMessageChain(@NotNull DuroParser.MessageChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#messageChain}.
	 * @param ctx the parse tree
	 */
	void exitMessageChain(@NotNull DuroParser.MessageChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#indexAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIndexAssignment(@NotNull DuroParser.IndexAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#indexAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIndexAssignment(@NotNull DuroParser.IndexAssignmentContext ctx);
}