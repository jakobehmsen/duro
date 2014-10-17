// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DuroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DuroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DuroParser#pseudoVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoVar(@NotNull DuroParser.PseudoVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(@NotNull DuroParser.AccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessageArgChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessageArgChain(@NotNull DuroParser.BinaryMessageArgChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull DuroParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selfSingleKeyMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfSingleKeyMessage(@NotNull DuroParser.SelfSingleKeyMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DuroParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageTail(@NotNull DuroParser.MultiKeyMessageTailContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull DuroParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageArgs(@NotNull DuroParser.MultiKeyMessageArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMessage(@NotNull DuroParser.UnaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(@NotNull DuroParser.DictEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageArgChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageArgChain(@NotNull DuroParser.MultiKeyMessageArgChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageArgEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageArgEnd(@NotNull DuroParser.MultiKeyMessageArgEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull DuroParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessageArgEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessageArgEnd(@NotNull DuroParser.BinaryMessageArgEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(@NotNull DuroParser.DictContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull DuroParser.SelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#singleKeyMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleKeyMessage(@NotNull DuroParser.SingleKeyMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull DuroParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageArg(@NotNull DuroParser.MultiKeyMessageArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#slotAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotAccess(@NotNull DuroParser.SlotAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure(@NotNull DuroParser.ClosureContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#parArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParArg(@NotNull DuroParser.ParArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(@NotNull DuroParser.ReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull DuroParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#slotAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotAssignment(@NotNull DuroParser.SlotAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorParams(@NotNull DuroParser.BehaviorParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expressionEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEnd(@NotNull DuroParser.ExpressionEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOperator(@NotNull DuroParser.IndexOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageEnd(@NotNull DuroParser.MessageEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(@NotNull DuroParser.GroupingContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessage(@NotNull DuroParser.BinaryMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#selfMultiKeyMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfMultiKeyMessage(@NotNull DuroParser.SelfMultiKeyMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(@NotNull DuroParser.IndexAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessage(@NotNull DuroParser.MultiKeyMessageContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageHead(@NotNull DuroParser.MultiKeyMessageHeadContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#multiKeyMessageArgReceiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiKeyMessageArgReceiver(@NotNull DuroParser.MultiKeyMessageArgReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryMessageArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMessageArg(@NotNull DuroParser.BinaryMessageArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(@NotNull DuroParser.BinaryOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expressionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionChain(@NotNull DuroParser.ExpressionChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#interfaceId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceId(@NotNull DuroParser.InterfaceIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull DuroParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageChain(@NotNull DuroParser.MessageChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignment(@NotNull DuroParser.IndexAssignmentContext ctx);
}