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
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionGreaterLessApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionGreaterLessApplication(@NotNull DuroParser.BinaryExpressionGreaterLessApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionLogicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionLogicalOr(@NotNull DuroParser.BinaryExpressionLogicalOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionLogicalAndApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionLogicalAndApplication(@NotNull DuroParser.BinaryExpressionLogicalAndApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forStatementInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementInitialization(@NotNull DuroParser.ForStatementInitializationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchangeExpressionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchangeExpressionArguments(@NotNull DuroParser.MessageExchangeExpressionArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DuroParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitiveOperand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveOperand2(@NotNull DuroParser.PrimitiveOperand2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(@NotNull DuroParser.NilContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#interfaceIdBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceIdBody(@NotNull DuroParser.InterfaceIdBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#arrayOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOperand(@NotNull DuroParser.ArrayOperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#memberAssignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAssignmentValue(@NotNull DuroParser.MemberAssignmentValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(@NotNull DuroParser.FunctionParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementOnFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementOnFalse(@NotNull DuroParser.IfStatementOnFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElementsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElementsPart(@NotNull DuroParser.ProgramElementsPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#explicitMessageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitMessageExchange(@NotNull DuroParser.ExplicitMessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#memberAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAssignment(@NotNull DuroParser.MemberAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementCondition(@NotNull DuroParser.IfStatementConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(@NotNull DuroParser.GroupingContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignmentValue(@NotNull DuroParser.IndexAssignmentValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#closureLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureLiteral(@NotNull DuroParser.ClosureLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#argumentParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentParameter(@NotNull DuroParser.ArgumentParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionLogicalOrApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionLogicalOrApplication(@NotNull DuroParser.BinaryExpressionLogicalOrApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElementContent(@NotNull DuroParser.ProgramElementContentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionArithmetic2(@NotNull DuroParser.BinaryExpressionArithmetic2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#yieldStatementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatementExpression(@NotNull DuroParser.YieldStatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionArithmetic1(@NotNull DuroParser.BinaryExpressionArithmetic1Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic2Application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionArithmetic2Application(@NotNull DuroParser.BinaryExpressionArithmetic2ApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(@NotNull DuroParser.PrimitiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecApplication(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull DuroParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DuroParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionGreaterLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionGreaterLess(@NotNull DuroParser.BinaryExpressionGreaterLessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntry(@NotNull DuroParser.DictProcessEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionEqualityApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionEqualityApplication(@NotNull DuroParser.BinaryExpressionEqualityApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatementOnTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementOnTrue(@NotNull DuroParser.IfStatementOnTrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationIndexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecApplicationIndexAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationIndexAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#operationEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationEnd(@NotNull DuroParser.OperationEndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionLogicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionLogicalAnd(@NotNull DuroParser.BinaryExpressionLogicalAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DuroParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcess(@NotNull DuroParser.DictProcessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull DuroParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull DuroParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull DuroParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forStatementUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementUpdate(@NotNull DuroParser.ForStatementUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#primitiveArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveArgument(@NotNull DuroParser.PrimitiveArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#conditionalExpressionFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionFalse(@NotNull DuroParser.ConditionalExpressionFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchange(@NotNull DuroParser.MessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(@NotNull DuroParser.SelfContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(@NotNull DuroParser.ForInStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecOperand(@NotNull DuroParser.UnaryExpressionPostIncDecOperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntryPrototypeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntryPrototypeAssignment(@NotNull DuroParser.DictProcessEntryPrototypeAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#interfaceId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceId(@NotNull DuroParser.InterfaceIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull DuroParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionNotApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotApplication(@NotNull DuroParser.UnaryExpressionNotApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntry2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntry2(@NotNull DuroParser.DictProcessEntry2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull DuroParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#topExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpression(@NotNull DuroParser.TopExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageExchangeLiteralArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExchangeLiteralArguments(@NotNull DuroParser.MessageExchangeLiteralArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDec(@NotNull DuroParser.UnaryExpressionPostIncDecContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#whileStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementBody(@NotNull DuroParser.WhileStatementBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull DuroParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssignmentKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignmentKey(@NotNull DuroParser.IndexAssignmentKeyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#operationChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationChain(@NotNull DuroParser.OperationChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecApplicationVariable(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(@NotNull DuroParser.YieldStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forInStatementVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatementVar(@NotNull DuroParser.ForInStatementVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(@NotNull DuroParser.MemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#messageId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageId(@NotNull DuroParser.MessageIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAndAssignment(@NotNull DuroParser.VariableDeclarationAndAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationIndexAccessReceiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElements(@NotNull DuroParser.ProgramElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#pause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPause(@NotNull DuroParser.PauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(@NotNull DuroParser.IndexAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionArithmetic1Application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionArithmetic1Application(@NotNull DuroParser.BinaryExpressionArithmetic1ApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementBody(@NotNull DuroParser.ForStatementBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionPostIncDecApplicationMemberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostIncDecApplicationMemberAccess(@NotNull DuroParser.UnaryExpressionPostIncDecApplicationMemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntryQuotedAssignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntryQuotedAssignmentValue(@NotNull DuroParser.DictProcessEntryQuotedAssignmentValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(@NotNull DuroParser.ElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#binaryExpressionEquality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionEquality(@NotNull DuroParser.BinaryExpressionEqualityContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#thisMessageExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisMessageExchange(@NotNull DuroParser.ThisMessageExchangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(@NotNull DuroParser.FunctionLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntryQuotedAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntryQuotedAssignment(@NotNull DuroParser.DictProcessEntryQuotedAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorElementsSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorElementsSingle(@NotNull DuroParser.BehaviorElementsSingleContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame(@NotNull DuroParser.FrameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull DuroParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull DuroParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#unaryExpressionNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNot(@NotNull DuroParser.UnaryExpressionNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#closureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureBody(@NotNull DuroParser.ClosureBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull DuroParser.VariableStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#programElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElement(@NotNull DuroParser.ProgramElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull DuroParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(@NotNull DuroParser.LookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#whileStatementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementCondition(@NotNull DuroParser.WhileStatementConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#memberQuotedAssignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberQuotedAssignmentValue(@NotNull DuroParser.MemberQuotedAssignmentValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#closureParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureParameters(@NotNull DuroParser.ClosureParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull DuroParser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull DuroParser.BreakStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorElements(@NotNull DuroParser.BehaviorElementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#behaviorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorElement(@NotNull DuroParser.BehaviorElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#conditionalExpressionCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionCondition(@NotNull DuroParser.ConditionalExpressionConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull DuroParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forInStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatementBody(@NotNull DuroParser.ForInStatementBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#forStatementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementCondition(@NotNull DuroParser.ForStatementConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#memberQuotedAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberQuotedAssignment(@NotNull DuroParser.MemberQuotedAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull DuroParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#conditionalExpressionTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionTrue(@NotNull DuroParser.ConditionalExpressionTrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcess2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcess2(@NotNull DuroParser.DictProcess2Context ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull DuroParser.FunctionBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#dictProcessEntryRegularAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictProcessEntryRegularAssignment(@NotNull DuroParser.DictProcessEntryRegularAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DuroParser#indexAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignment(@NotNull DuroParser.IndexAssignmentContext ctx);
}