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
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageChain}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageChain(@NotNull DuroParser.BinaryMessageChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageChain}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageChain(@NotNull DuroParser.BinaryMessageChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull DuroParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull DuroParser.AssignmentOperatorContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageModifier}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageModifier(@NotNull DuroParser.MultiKeyMessageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageModifier}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageModifier(@NotNull DuroParser.MultiKeyMessageModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageArgChain}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageArgChain(@NotNull DuroParser.MultiKeyMessageArgChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageArgChain}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageArgChain(@NotNull DuroParser.MultiKeyMessageArgChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageArgEnd}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageArgEnd(@NotNull DuroParser.MultiKeyMessageArgEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageArgEnd}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageArgEnd(@NotNull DuroParser.MultiKeyMessageArgEndContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageArg}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageArg(@NotNull DuroParser.MultiKeyMessageArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageArg}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageArg(@NotNull DuroParser.MultiKeyMessageArgContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#selfMultiKeyMessage}.
	 * @param ctx the parse tree
	 */
	void enterSelfMultiKeyMessage(@NotNull DuroParser.SelfMultiKeyMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selfMultiKeyMessage}.
	 * @param ctx the parse tree
	 */
	void exitSelfMultiKeyMessage(@NotNull DuroParser.SelfMultiKeyMessageContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessage}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessage(@NotNull DuroParser.MultiKeyMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessage}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessage(@NotNull DuroParser.MultiKeyMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageHead}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageHead(@NotNull DuroParser.MultiKeyMessageHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageHead}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageHead(@NotNull DuroParser.MultiKeyMessageHeadContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#expressionReceiver}.
	 * @param ctx the parse tree
	 */
	void enterExpressionReceiver(@NotNull DuroParser.ExpressionReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#expressionReceiver}.
	 * @param ctx the parse tree
	 */
	void exitExpressionReceiver(@NotNull DuroParser.ExpressionReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageArg}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageArg(@NotNull DuroParser.BinaryMessageArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageArg}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageArg(@NotNull DuroParser.BinaryMessageArgContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageArgChain}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageArgChain(@NotNull DuroParser.BinaryMessageArgChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageArgChain}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageArgChain(@NotNull DuroParser.BinaryMessageArgChainContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#selfSingleKeyMessage}.
	 * @param ctx the parse tree
	 */
	void enterSelfSingleKeyMessage(@NotNull DuroParser.SelfSingleKeyMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#selfSingleKeyMessage}.
	 * @param ctx the parse tree
	 */
	void exitSelfSingleKeyMessage(@NotNull DuroParser.SelfSingleKeyMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageTail}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageTail(@NotNull DuroParser.MultiKeyMessageTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageTail}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageTail(@NotNull DuroParser.MultiKeyMessageTailContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageArgs}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageArgs(@NotNull DuroParser.MultiKeyMessageArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageArgs}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageArgs(@NotNull DuroParser.MultiKeyMessageArgsContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#binaryMessageArgEnd}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessageArgEnd(@NotNull DuroParser.BinaryMessageArgEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#binaryMessageArgEnd}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessageArgEnd(@NotNull DuroParser.BinaryMessageArgEndContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#singleKeyMessage}.
	 * @param ctx the parse tree
	 */
	void enterSingleKeyMessage(@NotNull DuroParser.SingleKeyMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#singleKeyMessage}.
	 * @param ctx the parse tree
	 */
	void exitSingleKeyMessage(@NotNull DuroParser.SingleKeyMessageContext ctx);

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
	 * Enter a parse tree produced by {@link DuroParser#spawn}.
	 * @param ctx the parse tree
	 */
	void enterSpawn(@NotNull DuroParser.SpawnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#spawn}.
	 * @param ctx the parse tree
	 */
	void exitSpawn(@NotNull DuroParser.SpawnContext ctx);

	/**
	 * Enter a parse tree produced by {@link DuroParser#multiKeyMessageArgReceiver}.
	 * @param ctx the parse tree
	 */
	void enterMultiKeyMessageArgReceiver(@NotNull DuroParser.MultiKeyMessageArgReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuroParser#multiKeyMessageArgReceiver}.
	 * @param ctx the parse tree
	 */
	void exitMultiKeyMessageArgReceiver(@NotNull DuroParser.MultiKeyMessageArgReceiverContext ctx);

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