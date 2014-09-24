// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DuroParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, NOT=5, 
		DOUBLE_PLUS=6, DOUBLE_MINUS=7, SINGLE_PIPE=8, HASH=9, DOLLAR=10, OPEN_SQ=11, 
		CLOSE_SQ=12, OPEN_BRA=13, CLOSE_BRA=14, OPEN_PAR=15, CLOSE_PAR=16, ASSIGN=17, 
		PROTO_ASSIGN=18, ASSIGN_ADD=19, ASSIGN_SUB=20, ASSIGN_MULT=21, ASSIGN_DIV=22, 
		ASSIGN_REM=23, EQUALS=24, NOT_EQUALS=25, LESS_THAN=26, LESS_THAN_OR_EQUALS=27, 
		GREATER_THAN=28, GREATER_THAN_OR_EQUALS=29, BIN_OP1=30, BIN_OP2=31, INT=32, 
		SEMICOLON=33, COMMA=34, COLON=35, QUESTION_MARK=36, DOT=37, KW_VAR=38, 
		KW_PAUSE=39, KW_FUNCTION=40, KW_RETURN=41, KW_BREAK=42, KW_YIELD=43, KW_TRUE=44, 
		KW_FALSE=45, KW_IF=46, KW_ELSE=47, KW_THIS=48, KW_NULL=49, KW_FRAME=50, 
		KW_WHILE=51, KW_FOR=52, KW_IN=53, ID=54, WS=55, SINGLELINE_COMMENT=56, 
		MULTI_LINE_COMMENT=57;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'!'", 
		"'++'", "'--'", "'|'", "'#'", "'$'", "'['", "']'", "'{'", "'}'", "'('", 
		"')'", "'='", "'^='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "BIN_OP1", "BIN_OP2", "INT", "';'", 
		"','", "':'", "'?'", "'.'", "'var'", "'pause'", "'function'", "'return'", 
		"'break'", "'yield'", "'true'", "'false'", "'if'", "'else'", "'this'", 
		"'null'", "'frame'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElementsPart = 2, 
		RULE_programElement = 3, RULE_delimitedProgramElement = 4, RULE_topExpression = 5, 
		RULE_expression = 6, RULE_conditionalExpression = 7, RULE_conditionalExpressionCondition = 8, 
		RULE_conditionalExpressionTrue = 9, RULE_conditionalExpressionFalse = 10, 
		RULE_binaryExpressionLogicalOr = 11, RULE_binaryExpressionLogicalOrApplication = 12, 
		RULE_binaryExpressionLogicalAnd = 13, RULE_binaryExpressionLogicalAndApplication = 14, 
		RULE_binaryExpressionEquality = 15, RULE_binaryExpressionEqualityApplication = 16, 
		RULE_binaryExpressionGreaterLess = 17, RULE_binaryExpressionGreaterLessApplication = 18, 
		RULE_binaryExpressionArithmetic1 = 19, RULE_binaryExpressionArithmetic1Application = 20, 
		RULE_binaryExpressionArithmetic2 = 21, RULE_binaryExpressionArithmetic2Application = 22, 
		RULE_unaryExpressionNot = 23, RULE_unaryExpressionNotApplication = 24, 
		RULE_unaryExpressionPostIncDec = 25, RULE_unaryExpressionPostIncDecApplication = 26, 
		RULE_unaryExpressionPostIncDecApplicationVariable = 27, RULE_unaryExpressionPostIncDecApplicationMemberAccess = 28, 
		RULE_unaryExpressionPostIncDecApplicationIndexAccess = 29, RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver = 30, 
		RULE_unaryExpressionPostIncDecOperand = 31, RULE_grouping = 32, RULE_variableAssignment = 33, 
		RULE_lookup = 34, RULE_argumentParameter = 35, RULE_thisMessageExchange = 36, 
		RULE_messageExchange = 37, RULE_messageId = 38, RULE_operator = 39, RULE_literal = 40, 
		RULE_integer = 41, RULE_bool = 42, RULE_string = 43, RULE_dictProcess = 44, 
		RULE_dictProcessEntry = 45, RULE_functionLiteral = 46, RULE_closureLiteral = 47, 
		RULE_closureParameters = 48, RULE_closureBody = 49, RULE_array = 50, RULE_arrayOperand = 51, 
		RULE_self = 52, RULE_nil = 53, RULE_frame = 54, RULE_operationChain = 55, 
		RULE_explicitMessageExchange = 56, RULE_memberAccess = 57, RULE_indexAccess = 58, 
		RULE_operationEnd = 59, RULE_memberAssignment = 60, RULE_memberAssignmentValue = 61, 
		RULE_indexAssignment = 62, RULE_indexAssignmentKey = 63, RULE_indexAssignmentValue = 64, 
		RULE_delimitedStatement = 65, RULE_pause = 66, RULE_variableStatement = 67, 
		RULE_variableDeclarationAndAssignment = 68, RULE_variableDeclaration = 69, 
		RULE_returnStatement = 70, RULE_breakStatement = 71, RULE_yieldStatement = 72, 
		RULE_yieldStatementExpression = 73, RULE_undelimitedStatement = 74, RULE_functionDefinition = 75, 
		RULE_functionParameters = 76, RULE_functionBody = 77, RULE_primitiveBody = 78, 
		RULE_primitiveBodyPart = 79, RULE_primitiveCall = 80, RULE_primitiveOperand = 81, 
		RULE_primitiveLabel = 82, RULE_ifStatement = 83, RULE_ifStatementCondition = 84, 
		RULE_ifStatementOnTrue = 85, RULE_elseStatement = 86, RULE_ifStatementOnFalse = 87, 
		RULE_whileStatement = 88, RULE_whileStatementCondition = 89, RULE_whileStatementBody = 90, 
		RULE_forStatement = 91, RULE_forStatementInitialization = 92, RULE_forStatementCondition = 93, 
		RULE_forStatementUpdate = 94, RULE_forStatementBody = 95, RULE_forInStatement = 96, 
		RULE_forInStatementVar = 97, RULE_forInStatementBody = 98, RULE_interfaceId = 99, 
		RULE_interfaceIdBody = 100;
	public static final String[] ruleNames = {
		"program", "programElements", "programElementsPart", "programElement", 
		"delimitedProgramElement", "topExpression", "expression", "conditionalExpression", 
		"conditionalExpressionCondition", "conditionalExpressionTrue", "conditionalExpressionFalse", 
		"binaryExpressionLogicalOr", "binaryExpressionLogicalOrApplication", "binaryExpressionLogicalAnd", 
		"binaryExpressionLogicalAndApplication", "binaryExpressionEquality", "binaryExpressionEqualityApplication", 
		"binaryExpressionGreaterLess", "binaryExpressionGreaterLessApplication", 
		"binaryExpressionArithmetic1", "binaryExpressionArithmetic1Application", 
		"binaryExpressionArithmetic2", "binaryExpressionArithmetic2Application", 
		"unaryExpressionNot", "unaryExpressionNotApplication", "unaryExpressionPostIncDec", 
		"unaryExpressionPostIncDecApplication", "unaryExpressionPostIncDecApplicationVariable", 
		"unaryExpressionPostIncDecApplicationMemberAccess", "unaryExpressionPostIncDecApplicationIndexAccess", 
		"unaryExpressionPostIncDecApplicationIndexAccessReceiver", "unaryExpressionPostIncDecOperand", 
		"grouping", "variableAssignment", "lookup", "argumentParameter", "thisMessageExchange", 
		"messageExchange", "messageId", "operator", "literal", "integer", "bool", 
		"string", "dictProcess", "dictProcessEntry", "functionLiteral", "closureLiteral", 
		"closureParameters", "closureBody", "array", "arrayOperand", "self", "nil", 
		"frame", "operationChain", "explicitMessageExchange", "memberAccess", 
		"indexAccess", "operationEnd", "memberAssignment", "memberAssignmentValue", 
		"indexAssignment", "indexAssignmentKey", "indexAssignmentValue", "delimitedStatement", 
		"pause", "variableStatement", "variableDeclarationAndAssignment", "variableDeclaration", 
		"returnStatement", "breakStatement", "yieldStatement", "yieldStatementExpression", 
		"undelimitedStatement", "functionDefinition", "functionParameters", "functionBody", 
		"primitiveBody", "primitiveBodyPart", "primitiveCall", "primitiveOperand", 
		"primitiveLabel", "ifStatement", "ifStatementCondition", "ifStatementOnTrue", 
		"elseStatement", "ifStatementOnFalse", "whileStatement", "whileStatementCondition", 
		"whileStatementBody", "forStatement", "forStatementInitialization", "forStatementCondition", 
		"forStatementUpdate", "forStatementBody", "forInStatement", "forInStatementVar", 
		"forInStatementBody", "interfaceId", "interfaceIdBody"
	};

	@Override
	public String getGrammarFileName() { return "Duro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DuroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementsContext extends ParserRuleContext {
		public List<ProgramElementsPartContext> programElementsPart() {
			return getRuleContexts(ProgramElementsPartContext.class);
		}
		public ProgramElementsPartContext programElementsPart(int i) {
			return getRuleContext(ProgramElementsPartContext.class,i);
		}
		public ProgramElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementsContext programElements() throws RecognitionException {
		ProgramElementsContext _localctx = new ProgramElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << HASH) | (1L << DOLLAR) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << KW_WHILE) | (1L << KW_FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(204); programElementsPart();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementsPartContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(DuroParser.SEMICOLON); }
		public List<DelimitedProgramElementContext> delimitedProgramElement() {
			return getRuleContexts(DelimitedProgramElementContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(DuroParser.SEMICOLON, i);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public DelimitedProgramElementContext delimitedProgramElement(int i) {
			return getRuleContext(DelimitedProgramElementContext.class,i);
		}
		public ProgramElementsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElementsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElementsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElementsPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElementsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementsPartContext programElementsPart() throws RecognitionException {
		ProgramElementsPartContext _localctx = new ProgramElementsPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programElementsPart);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); delimitedProgramElement();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(211); match(SEMICOLON);
					setState(213);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(212); delimitedProgramElement();
						}
						break;
					}
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); undelimitedStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramElementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DuroParser.SEMICOLON, 0); }
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public ProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementContext programElement() throws RecognitionException {
		ProgramElementContext _localctx = new ProgramElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programElement);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); delimitedProgramElement();
				setState(224); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); undelimitedStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimitedProgramElementContext extends ParserRuleContext {
		public TopExpressionContext topExpression() {
			return getRuleContext(TopExpressionContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
		}
		public DelimitedProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitedProgramElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDelimitedProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDelimitedProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDelimitedProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedProgramElementContext delimitedProgramElement() throws RecognitionException {
		DelimitedProgramElementContext _localctx = new DelimitedProgramElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delimitedProgramElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NOT:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				{
				setState(229); topExpression();
				}
				break;
			case KW_VAR:
			case KW_PAUSE:
			case KW_RETURN:
			case KW_BREAK:
			case KW_YIELD:
				{
				setState(230); delimitedStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterTopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitTopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitTopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExpressionContext topExpression() throws RecognitionException {
		TopExpressionContext _localctx = new TopExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionFalseContext conditionalExpressionFalse() {
			return getRuleContext(ConditionalExpressionFalseContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(DuroParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ConditionalExpressionConditionContext conditionalExpressionCondition() {
			return getRuleContext(ConditionalExpressionConditionContext.class,0);
		}
		public ConditionalExpressionTrueContext conditionalExpressionTrue() {
			return getRuleContext(ConditionalExpressionTrueContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalExpression);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); conditionalExpressionCondition();
				setState(240); match(QUESTION_MARK);
				setState(241); conditionalExpressionTrue();
				setState(242); match(COLON);
				setState(243); conditionalExpressionFalse();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); binaryExpressionLogicalOr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionConditionContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionConditionContext conditionalExpressionCondition() throws RecognitionException {
		ConditionalExpressionConditionContext _localctx = new ConditionalExpressionConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalExpressionCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionTrueContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionTrueContext conditionalExpressionTrue() throws RecognitionException {
		ConditionalExpressionTrueContext _localctx = new ConditionalExpressionTrueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalExpressionTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionFalseContext extends ParserRuleContext {
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
		}
		public ConditionalExpressionFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterConditionalExpressionFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitConditionalExpressionFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitConditionalExpressionFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionFalseContext conditionalExpressionFalse() throws RecognitionException {
		ConditionalExpressionFalseContext _localctx = new ConditionalExpressionFalseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionalExpressionFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); binaryExpressionLogicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalOrContext extends ParserRuleContext {
		public List<BinaryExpressionLogicalOrApplicationContext> binaryExpressionLogicalOrApplication() {
			return getRuleContexts(BinaryExpressionLogicalOrApplicationContext.class);
		}
		public BinaryExpressionLogicalOrApplicationContext binaryExpressionLogicalOrApplication(int i) {
			return getRuleContext(BinaryExpressionLogicalOrApplicationContext.class,i);
		}
		public BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() {
			return getRuleContext(BinaryExpressionLogicalAndContext.class,0);
		}
		public BinaryExpressionLogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() throws RecognitionException {
		BinaryExpressionLogicalOrContext _localctx = new BinaryExpressionLogicalOrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binaryExpressionLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254); binaryExpressionLogicalAnd();
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(255); binaryExpressionLogicalOrApplication();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalOrApplicationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_PIPE() { return getToken(DuroParser.DOUBLE_PIPE, 0); }
		public BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() {
			return getRuleContext(BinaryExpressionLogicalAndContext.class,0);
		}
		public BinaryExpressionLogicalOrApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalOrApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalOrApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalOrApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalOrApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalOrApplicationContext binaryExpressionLogicalOrApplication() throws RecognitionException {
		BinaryExpressionLogicalOrApplicationContext _localctx = new BinaryExpressionLogicalOrApplicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binaryExpressionLogicalOrApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(DOUBLE_PIPE);
			setState(262); binaryExpressionLogicalAnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalAndContext extends ParserRuleContext {
		public BinaryExpressionEqualityContext binaryExpressionEquality() {
			return getRuleContext(BinaryExpressionEqualityContext.class,0);
		}
		public BinaryExpressionLogicalAndApplicationContext binaryExpressionLogicalAndApplication(int i) {
			return getRuleContext(BinaryExpressionLogicalAndApplicationContext.class,i);
		}
		public List<BinaryExpressionLogicalAndApplicationContext> binaryExpressionLogicalAndApplication() {
			return getRuleContexts(BinaryExpressionLogicalAndApplicationContext.class);
		}
		public BinaryExpressionLogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalAndContext binaryExpressionLogicalAnd() throws RecognitionException {
		BinaryExpressionLogicalAndContext _localctx = new BinaryExpressionLogicalAndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryExpressionLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264); binaryExpressionEquality();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(265); binaryExpressionLogicalAndApplication();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionLogicalAndApplicationContext extends ParserRuleContext {
		public TerminalNode DOUBLE_AMP() { return getToken(DuroParser.DOUBLE_AMP, 0); }
		public BinaryExpressionEqualityContext binaryExpressionEquality() {
			return getRuleContext(BinaryExpressionEqualityContext.class,0);
		}
		public BinaryExpressionLogicalAndApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionLogicalAndApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionLogicalAndApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionLogicalAndApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionLogicalAndApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionLogicalAndApplicationContext binaryExpressionLogicalAndApplication() throws RecognitionException {
		BinaryExpressionLogicalAndApplicationContext _localctx = new BinaryExpressionLogicalAndApplicationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryExpressionLogicalAndApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(DOUBLE_AMP);
			setState(272); binaryExpressionEquality();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionEqualityContext extends ParserRuleContext {
		public BinaryExpressionEqualityApplicationContext binaryExpressionEqualityApplication(int i) {
			return getRuleContext(BinaryExpressionEqualityApplicationContext.class,i);
		}
		public List<BinaryExpressionEqualityApplicationContext> binaryExpressionEqualityApplication() {
			return getRuleContexts(BinaryExpressionEqualityApplicationContext.class);
		}
		public BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() {
			return getRuleContext(BinaryExpressionGreaterLessContext.class,0);
		}
		public BinaryExpressionEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionEqualityContext binaryExpressionEquality() throws RecognitionException {
		BinaryExpressionEqualityContext _localctx = new BinaryExpressionEqualityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryExpressionEquality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274); binaryExpressionGreaterLess();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(275); binaryExpressionEqualityApplication();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionEqualityApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(DuroParser.NOT_EQUALS, 0); }
		public BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() {
			return getRuleContext(BinaryExpressionGreaterLessContext.class,0);
		}
		public BinaryExpressionEqualityApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionEqualityApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionEqualityApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionEqualityApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionEqualityApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionEqualityApplicationContext binaryExpressionEqualityApplication() throws RecognitionException {
		BinaryExpressionEqualityApplicationContext _localctx = new BinaryExpressionEqualityApplicationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryExpressionEqualityApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((BinaryExpressionEqualityApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				((BinaryExpressionEqualityApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(282); binaryExpressionGreaterLess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionGreaterLessContext extends ParserRuleContext {
		public BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() {
			return getRuleContext(BinaryExpressionArithmetic1Context.class,0);
		}
		public BinaryExpressionGreaterLessApplicationContext binaryExpressionGreaterLessApplication(int i) {
			return getRuleContext(BinaryExpressionGreaterLessApplicationContext.class,i);
		}
		public List<BinaryExpressionGreaterLessApplicationContext> binaryExpressionGreaterLessApplication() {
			return getRuleContexts(BinaryExpressionGreaterLessApplicationContext.class);
		}
		public BinaryExpressionGreaterLessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionGreaterLess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionGreaterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionGreaterLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionGreaterLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionGreaterLessContext binaryExpressionGreaterLess() throws RecognitionException {
		BinaryExpressionGreaterLessContext _localctx = new BinaryExpressionGreaterLessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binaryExpressionGreaterLess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284); binaryExpressionArithmetic1();
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(285); binaryExpressionGreaterLessApplication();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionGreaterLessApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(DuroParser.LESS_THAN_OR_EQUALS, 0); }
		public BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() {
			return getRuleContext(BinaryExpressionArithmetic1Context.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(DuroParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DuroParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(DuroParser.GREATER_THAN_OR_EQUALS, 0); }
		public BinaryExpressionGreaterLessApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionGreaterLessApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionGreaterLessApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionGreaterLessApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionGreaterLessApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionGreaterLessApplicationContext binaryExpressionGreaterLessApplication() throws RecognitionException {
		BinaryExpressionGreaterLessApplicationContext _localctx = new BinaryExpressionGreaterLessApplicationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binaryExpressionGreaterLessApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((BinaryExpressionGreaterLessApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS))) != 0)) ) {
				((BinaryExpressionGreaterLessApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(292); binaryExpressionArithmetic1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic1Context extends ParserRuleContext {
		public List<BinaryExpressionArithmetic1ApplicationContext> binaryExpressionArithmetic1Application() {
			return getRuleContexts(BinaryExpressionArithmetic1ApplicationContext.class);
		}
		public BinaryExpressionArithmetic1ApplicationContext binaryExpressionArithmetic1Application(int i) {
			return getRuleContext(BinaryExpressionArithmetic1ApplicationContext.class,i);
		}
		public BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() {
			return getRuleContext(BinaryExpressionArithmetic2Context.class,0);
		}
		public BinaryExpressionArithmetic1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic1Context binaryExpressionArithmetic1() throws RecognitionException {
		BinaryExpressionArithmetic1Context _localctx = new BinaryExpressionArithmetic1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryExpressionArithmetic1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294); binaryExpressionArithmetic2();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); binaryExpressionArithmetic1Application();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic1ApplicationContext extends ParserRuleContext {
		public TerminalNode BIN_OP1() { return getToken(DuroParser.BIN_OP1, 0); }
		public BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() {
			return getRuleContext(BinaryExpressionArithmetic2Context.class,0);
		}
		public BinaryExpressionArithmetic1ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic1Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic1Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic1Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic1Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic1ApplicationContext binaryExpressionArithmetic1Application() throws RecognitionException {
		BinaryExpressionArithmetic1ApplicationContext _localctx = new BinaryExpressionArithmetic1ApplicationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryExpressionArithmetic1Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(BIN_OP1);
			setState(302); binaryExpressionArithmetic2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic2Context extends ParserRuleContext {
		public BinaryExpressionArithmetic2ApplicationContext binaryExpressionArithmetic2Application(int i) {
			return getRuleContext(BinaryExpressionArithmetic2ApplicationContext.class,i);
		}
		public UnaryExpressionNotContext unaryExpressionNot() {
			return getRuleContext(UnaryExpressionNotContext.class,0);
		}
		public List<BinaryExpressionArithmetic2ApplicationContext> binaryExpressionArithmetic2Application() {
			return getRuleContexts(BinaryExpressionArithmetic2ApplicationContext.class);
		}
		public BinaryExpressionArithmetic2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic2Context binaryExpressionArithmetic2() throws RecognitionException {
		BinaryExpressionArithmetic2Context _localctx = new BinaryExpressionArithmetic2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_binaryExpressionArithmetic2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304); unaryExpressionNot();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(305); binaryExpressionArithmetic2Application();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionArithmetic2ApplicationContext extends ParserRuleContext {
		public UnaryExpressionNotContext unaryExpressionNot() {
			return getRuleContext(UnaryExpressionNotContext.class,0);
		}
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public BinaryExpressionArithmetic2ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpressionArithmetic2Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpressionArithmetic2Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpressionArithmetic2Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpressionArithmetic2Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionArithmetic2ApplicationContext binaryExpressionArithmetic2Application() throws RecognitionException {
		BinaryExpressionArithmetic2ApplicationContext _localctx = new BinaryExpressionArithmetic2ApplicationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binaryExpressionArithmetic2Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(BIN_OP2);
			setState(312); unaryExpressionNot();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotContext extends ParserRuleContext {
		public UnaryExpressionNotApplicationContext unaryExpressionNotApplication() {
			return getRuleContext(UnaryExpressionNotApplicationContext.class,0);
		}
		public UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() {
			return getRuleContext(UnaryExpressionPostIncDecContext.class,0);
		}
		public UnaryExpressionNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotContext unaryExpressionNot() throws RecognitionException {
		UnaryExpressionNotContext _localctx = new UnaryExpressionNotContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpressionNot);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); unaryExpressionNotApplication();
				}
				break;
			case STRING_LITERAL:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
			case INT:
			case COLON:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case KW_FRAME:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); unaryExpressionPostIncDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotApplicationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(DuroParser.NOT, 0); }
		public UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() {
			return getRuleContext(UnaryExpressionPostIncDecContext.class,0);
		}
		public UnaryExpressionNotApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionNotApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionNotApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionNotApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotApplicationContext unaryExpressionNotApplication() throws RecognitionException {
		UnaryExpressionNotApplicationContext _localctx = new UnaryExpressionNotApplicationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExpressionNotApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(NOT);
			setState(319); unaryExpressionPostIncDec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecContext extends ParserRuleContext {
		public UnaryExpressionPostIncDecApplicationContext unaryExpressionPostIncDecApplication() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationContext.class,0);
		}
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecContext unaryExpressionPostIncDec() throws RecognitionException {
		UnaryExpressionPostIncDecContext _localctx = new UnaryExpressionPostIncDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpressionPostIncDec);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); unaryExpressionPostIncDecApplication();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); unaryExpressionPostIncDecOperand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode DOUBLE_PLUS() { return getToken(DuroParser.DOUBLE_PLUS, 0); }
		public UnaryExpressionPostIncDecApplicationMemberAccessContext unaryExpressionPostIncDecApplicationMemberAccess() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationMemberAccessContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessContext unaryExpressionPostIncDecApplicationIndexAccess() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationIndexAccessContext.class,0);
		}
		public TerminalNode DOUBLE_MINUS() { return getToken(DuroParser.DOUBLE_MINUS, 0); }
		public UnaryExpressionPostIncDecApplicationVariableContext unaryExpressionPostIncDecApplicationVariable() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationVariableContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationContext unaryExpressionPostIncDecApplication() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationContext _localctx = new UnaryExpressionPostIncDecApplicationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpressionPostIncDecApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(325); unaryExpressionPostIncDecApplicationVariable();
				}
				break;

			case 2:
				{
				setState(326); unaryExpressionPostIncDecApplicationMemberAccess();
				}
				break;

			case 3:
				{
				setState(327); unaryExpressionPostIncDecApplicationIndexAccess();
				}
				break;
			}
			setState(330);
			((UnaryExpressionPostIncDecApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
				((UnaryExpressionPostIncDecApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public UnaryExpressionPostIncDecApplicationVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationVariableContext unaryExpressionPostIncDecApplicationVariable() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationVariableContext _localctx = new UnaryExpressionPostIncDecApplicationVariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExpressionPostIncDecApplicationVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationMemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationMemberAccessContext unaryExpressionPostIncDecApplicationMemberAccess() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationMemberAccessContext _localctx = new UnaryExpressionPostIncDecApplicationMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryExpressionPostIncDecApplicationMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); unaryExpressionPostIncDecOperand();
			setState(335); match(DOT);
			setState(336); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationIndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext unaryExpressionPostIncDecApplicationIndexAccessReceiver() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationIndexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationIndexAccessContext unaryExpressionPostIncDecApplicationIndexAccess() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationIndexAccessContext _localctx = new UnaryExpressionPostIncDecApplicationIndexAccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryExpressionPostIncDecApplicationIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); unaryExpressionPostIncDecApplicationIndexAccessReceiver();
			setState(339); match(OPEN_SQ);
			setState(340); expression();
			setState(341); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext extends ParserRuleContext {
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationIndexAccessReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext unaryExpressionPostIncDecApplicationIndexAccessReceiver() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext _localctx = new UnaryExpressionPostIncDecApplicationIndexAccessReceiverContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExpressionPostIncDecApplicationIndexAccessReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); unaryExpressionPostIncDecOperand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionPostIncDecOperandContext extends ParserRuleContext {
		public OperationEndContext operationEnd() {
			return getRuleContext(OperationEndContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ThisMessageExchangeContext thisMessageExchange() {
			return getRuleContext(ThisMessageExchangeContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public ArgumentParameterContext argumentParameter() {
			return getRuleContext(ArgumentParameterContext.class,0);
		}
		public List<OperationChainContext> operationChain() {
			return getRuleContexts(OperationChainContext.class);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperationChainContext operationChain(int i) {
			return getRuleContext(OperationChainContext.class,i);
		}
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public UnaryExpressionPostIncDecOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() throws RecognitionException {
		UnaryExpressionPostIncDecOperandContext _localctx = new UnaryExpressionPostIncDecOperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryExpressionPostIncDecOperand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(345); grouping();
				}
				break;

			case 2:
				{
				setState(346); thisMessageExchange();
				}
				break;

			case 3:
				{
				setState(347); lookup();
				}
				break;

			case 4:
				{
				setState(348); argumentParameter();
				}
				break;

			case 5:
				{
				setState(349); literal();
				}
				break;

			case 6:
				{
				setState(350); self();
				}
				break;

			case 7:
				{
				setState(351); nil();
				}
				break;

			case 8:
				{
				setState(352); frame();
				}
				break;
			}
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(355); operationChain();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(361); operationEnd();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(OPEN_PAR);
			setState(365); expression();
			setState(366); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(ID);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(369); match(COMMA);
				setState(370); match(ID);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			((VariableAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((VariableAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(377); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ArgumentParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArgumentParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArgumentParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArgumentParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentParameterContext argumentParameter() throws RecognitionException {
		ArgumentParameterContext _localctx = new ArgumentParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(COLON);
			setState(382); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisMessageExchangeContext extends ParserRuleContext {
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public ThisMessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisMessageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterThisMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitThisMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitThisMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisMessageExchangeContext thisMessageExchange() throws RecognitionException {
		ThisMessageExchangeContext _localctx = new ThisMessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); messageExchange();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageExchangeContext extends ParserRuleContext {
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExchangeContext messageExchange() throws RecognitionException {
		MessageExchangeContext _localctx = new MessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); messageId();
			setState(387); match(OPEN_PAR);
			setState(396);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(388); expression();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(389); match(COMMA);
					setState(390); expression();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(398); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public MessageIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageIdContext messageId() throws RecognitionException {
		MessageIdContext _localctx = new MessageIdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_messageId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(400); match(ID);
				}
				break;
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_THAN_OR_EQUALS:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUALS:
			case BIN_OP1:
			case BIN_OP2:
				{
				setState(401); operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(DuroParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode BIN_OP1() { return getToken(DuroParser.BIN_OP1, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(DuroParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(DuroParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DuroParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(DuroParser.GREATER_THAN_OR_EQUALS, 0); }
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DictProcessContext dictProcess() {
			return getRuleContext(DictProcessContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ClosureLiteralContext closureLiteral() {
			return getRuleContext(ClosureLiteralContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		try {
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); bool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408); string();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409); dictProcess();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410); functionLiteral();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411); closureLiteral();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(412); array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DuroParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(DuroParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(DuroParser.KW_FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DuroParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictProcessContext extends ParserRuleContext {
		public List<DictProcessEntryContext> dictProcessEntry() {
			return getRuleContexts(DictProcessEntryContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public DictProcessEntryContext dictProcessEntry(int i) {
			return getRuleContext(DictProcessEntryContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public DictProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictProcess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictProcessContext dictProcess() throws RecognitionException {
		DictProcessContext _localctx = new DictProcessContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictProcess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(OPEN_BRA);
			setState(430);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << ID))) != 0)) {
				{
				setState(422); dictProcessEntry();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423); match(COMMA);
					setState(424); dictProcessEntry();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(432); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictProcessEntryContext extends ParserRuleContext {
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictProcessEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictProcessEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictProcessEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictProcessEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictProcessEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictProcessEntryContext dictProcessEntry() throws RecognitionException {
		DictProcessEntryContext _localctx = new DictProcessEntryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictProcessEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); messageId();
			setState(435); match(COLON);
			setState(436); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(DuroParser.KW_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); match(KW_FUNCTION);
			setState(439); match(OPEN_PAR);
			setState(440); functionParameters();
			setState(441); match(CLOSE_PAR);
			setState(442); match(OPEN_BRA);
			setState(443); functionBody();
			setState(444); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureLiteralContext extends ParserRuleContext {
		public ClosureBodyContext closureBody() {
			return getRuleContext(ClosureBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ClosureParametersContext closureParameters() {
			return getRuleContext(ClosureParametersContext.class,0);
		}
		public ClosureLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureLiteralContext closureLiteral() throws RecognitionException {
		ClosureLiteralContext _localctx = new ClosureLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_closureLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(OPEN_BRA);
			setState(447); closureParameters();
			setState(448); closureBody();
			setState(449); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public List<TerminalNode> SINGLE_PIPE() { return getTokens(DuroParser.SINGLE_PIPE); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode SINGLE_PIPE(int i) {
			return getToken(DuroParser.SINGLE_PIPE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ClosureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParametersContext closureParameters() throws RecognitionException {
		ClosureParametersContext _localctx = new ClosureParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_closureParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if (_la==SINGLE_PIPE) {
				{
				setState(451); match(SINGLE_PIPE);
				setState(460);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(452); match(ID);
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(453); match(COMMA);
						setState(454); match(ID);
						}
						}
						setState(459);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(462); match(SINGLE_PIPE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureBodyContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public ClosureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureBodyContext closureBody() throws RecognitionException {
		ClosureBodyContext _localctx = new ClosureBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_closureBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public ArrayOperandContext arrayOperand(int i) {
			return getRuleContext(ArrayOperandContext.class,i);
		}
		public List<ArrayOperandContext> arrayOperand() {
			return getRuleContexts(ArrayOperandContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(OPEN_SQ);
			setState(476);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(468); arrayOperand();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(469); match(COMMA);
					setState(470); arrayOperand();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(478); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayOperandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterArrayOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitArrayOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitArrayOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperandContext arrayOperand() throws RecognitionException {
		ArrayOperandContext _localctx = new ArrayOperandContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfContext extends ParserRuleContext {
		public TerminalNode KW_THIS() { return getToken(DuroParser.KW_THIS, 0); }
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); match(KW_THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NilContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(DuroParser.KW_NULL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(KW_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameContext extends ParserRuleContext {
		public TerminalNode KW_FRAME() { return getToken(DuroParser.KW_FRAME, 0); }
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_frame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(KW_FRAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationChainContext extends ParserRuleContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public ExplicitMessageExchangeContext explicitMessageExchange() {
			return getRuleContext(ExplicitMessageExchangeContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public OperationChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperationChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperationChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperationChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationChainContext operationChain() throws RecognitionException {
		OperationChainContext _localctx = new OperationChainContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operationChain);
		try {
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488); explicitMessageExchange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); memberAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490); indexAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitMessageExchangeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public ExplicitMessageExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitMessageExchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExplicitMessageExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExplicitMessageExchange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExplicitMessageExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitMessageExchangeContext explicitMessageExchange() throws RecognitionException {
		ExplicitMessageExchangeContext _localctx = new ExplicitMessageExchangeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_explicitMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(DOT);
			setState(494); messageExchange();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); match(DOT);
			setState(497); messageId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(OPEN_SQ);
			setState(500); expression();
			setState(501); match(CLOSE_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationEndContext extends ParserRuleContext {
		public MemberAssignmentContext memberAssignment() {
			return getRuleContext(MemberAssignmentContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public OperationEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterOperationEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitOperationEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitOperationEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationEndContext operationEnd() throws RecognitionException {
		OperationEndContext _localctx = new OperationEndContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_operationEnd);
		try {
			setState(505);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(503); memberAssignment();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(504); indexAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public MemberAssignmentValueContext memberAssignmentValue() {
			return getRuleContext(MemberAssignmentValueContext.class,0);
		}
		public TerminalNode PROTO_ASSIGN() { return getToken(DuroParser.PROTO_ASSIGN, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public MemberAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAssignmentContext memberAssignment() throws RecognitionException {
		MemberAssignmentContext _localctx = new MemberAssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_memberAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(DOT);
			setState(508); messageId();
			setState(509);
			((MemberAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PROTO_ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((MemberAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(510); memberAssignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAssignmentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAssignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMemberAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMemberAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMemberAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAssignmentValueContext memberAssignmentValue() throws RecognitionException {
		MemberAssignmentValueContext _localctx = new MemberAssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_memberAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_REM() { return getToken(DuroParser.ASSIGN_REM, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public IndexAssignmentKeyContext indexAssignmentKey() {
			return getRuleContext(IndexAssignmentKeyContext.class,0);
		}
		public IndexAssignmentValueContext indexAssignmentValue() {
			return getRuleContext(IndexAssignmentValueContext.class,0);
		}
		public TerminalNode PROTO_ASSIGN() { return getToken(DuroParser.PROTO_ASSIGN, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public IndexAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentContext indexAssignment() throws RecognitionException {
		IndexAssignmentContext _localctx = new IndexAssignmentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(OPEN_SQ);
			setState(515); indexAssignmentKey();
			setState(516); match(CLOSE_SQ);
			setState(517);
			((IndexAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PROTO_ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN_REM))) != 0)) ) {
				((IndexAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(518); indexAssignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentKeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAssignmentKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignmentKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignmentKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignmentKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignmentKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentKeyContext indexAssignmentKey() throws RecognitionException {
		IndexAssignmentKeyContext _localctx = new IndexAssignmentKeyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_indexAssignmentKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAssignmentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAssignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAssignmentValueContext indexAssignmentValue() throws RecognitionException {
		IndexAssignmentValueContext _localctx = new IndexAssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_indexAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimitedStatementContext extends ParserRuleContext {
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public DelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDelimitedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDelimitedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedStatementContext delimitedStatement() throws RecognitionException {
		DelimitedStatementContext _localctx = new DelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_delimitedStatement);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(526); returnStatement();
				}
				break;
			case KW_BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(527); breakStatement();
				}
				break;
			case KW_YIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(528); yieldStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PauseContext extends ParserRuleContext {
		public TerminalNode KW_PAUSE() { return getToken(DuroParser.KW_PAUSE, 0); }
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(KW_PAUSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment() {
			return getRuleContext(VariableDeclarationAndAssignmentContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_variableStatement);
		try {
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationAndAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public VariableDeclarationAndAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAndAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableDeclarationAndAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableDeclarationAndAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment() throws RecognitionException {
		VariableDeclarationAndAssignmentContext _localctx = new VariableDeclarationAndAssignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_variableDeclarationAndAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(KW_VAR);
			setState(538); match(ID);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(539); match(COMMA);
				setState(540); match(ID);
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546); match(ASSIGN);
			setState(547); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549); match(KW_VAR);
			setState(550); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode KW_RETURN() { return getToken(DuroParser.KW_RETURN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); match(KW_RETURN);
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(553); expression();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(554); match(COMMA);
					setState(555); expression();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode KW_BREAK() { return getToken(DuroParser.KW_BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(KW_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementContext extends ParserRuleContext {
		public YieldStatementExpressionContext yieldStatementExpression(int i) {
			return getRuleContext(YieldStatementExpressionContext.class,i);
		}
		public TerminalNode KW_YIELD() { return getToken(DuroParser.KW_YIELD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<YieldStatementExpressionContext> yieldStatementExpression() {
			return getRuleContexts(YieldStatementExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_yieldStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(KW_YIELD);
			setState(566); yieldStatementExpression();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567); match(COMMA);
				setState(568); yieldStatementExpression();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterYieldStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitYieldStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitYieldStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementExpressionContext yieldStatementExpression() throws RecognitionException {
		YieldStatementExpressionContext _localctx = new YieldStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_yieldStatementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndelimitedStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrimitiveBodyContext primitiveBody() {
			return getRuleContext(PrimitiveBodyContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public UndelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undelimitedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUndelimitedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUndelimitedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUndelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndelimitedStatementContext undelimitedStatement() throws RecognitionException {
		UndelimitedStatementContext _localctx = new UndelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_undelimitedStatement);
		try {
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577); primitiveBody();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578); ifStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579); whileStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(580); forStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(581); forInStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(582); interfaceId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(DuroParser.KW_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(KW_FUNCTION);
			setState(586); messageId();
			setState(587); match(OPEN_PAR);
			setState(588); functionParameters();
			setState(589); match(CLOSE_PAR);
			setState(590); match(OPEN_BRA);
			setState(591); functionBody();
			setState(592); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DuroParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DuroParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(594); match(ID);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(595); match(COMMA);
					setState(596); match(ID);
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); programElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveBodyContext extends ParserRuleContext {
		public PrimitiveBodyPartContext primitiveBodyPart(int i) {
			return getRuleContext(PrimitiveBodyPartContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public List<PrimitiveBodyPartContext> primitiveBodyPart() {
			return getRuleContexts(PrimitiveBodyPartContext.class);
		}
		public PrimitiveBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveBodyContext primitiveBody() throws RecognitionException {
		PrimitiveBodyContext _localctx = new PrimitiveBodyContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_primitiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(HASH);
			setState(607); match(OPEN_BRA);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(608); primitiveBodyPart();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveBodyPartContext extends ParserRuleContext {
		public PrimitiveCallContext primitiveCall() {
			return getRuleContext(PrimitiveCallContext.class,0);
		}
		public PrimitiveLabelContext primitiveLabel() {
			return getRuleContext(PrimitiveLabelContext.class,0);
		}
		public PrimitiveBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveBodyPartContext primitiveBodyPart() throws RecognitionException {
		PrimitiveBodyPartContext _localctx = new PrimitiveBodyPartContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_primitiveBodyPart);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616); primitiveCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617); primitiveLabel();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DuroParser.SEMICOLON, 0); }
		public List<PrimitiveOperandContext> primitiveOperand() {
			return getRuleContexts(PrimitiveOperandContext.class);
		}
		public PrimitiveOperandContext primitiveOperand(int i) {
			return getRuleContext(PrimitiveOperandContext.class,i);
		}
		public PrimitiveCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveCallContext primitiveCall() throws RecognitionException {
		PrimitiveCallContext _localctx = new PrimitiveCallContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_primitiveCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(ID);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID))) != 0)) {
				{
				{
				setState(621); primitiveOperand();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveOperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveOperandContext primitiveOperand() throws RecognitionException {
		PrimitiveOperandContext _localctx = new PrimitiveOperandContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_primitiveOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case OPEN_SQ:
			case OPEN_BRA:
			case INT:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
				{
				setState(629); literal();
				}
				break;
			case ID:
				{
				setState(630); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveLabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public PrimitiveLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPrimitiveLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPrimitiveLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPrimitiveLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveLabelContext primitiveLabel() throws RecognitionException {
		PrimitiveLabelContext _localctx = new PrimitiveLabelContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_primitiveLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(ID);
			setState(634); match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementOnTrueContext ifStatementOnTrue() {
			return getRuleContext(IfStatementOnTrueContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public IfStatementConditionContext ifStatementCondition() {
			return getRuleContext(IfStatementConditionContext.class,0);
		}
		public TerminalNode KW_IF() { return getToken(DuroParser.KW_IF, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(KW_IF);
			setState(637); match(OPEN_PAR);
			setState(638); ifStatementCondition();
			setState(639); match(CLOSE_PAR);
			setState(640); ifStatementOnTrue();
			setState(641); elseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementConditionContext ifStatementCondition() throws RecognitionException {
		IfStatementConditionContext _localctx = new IfStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementOnTrueContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public IfStatementOnTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementOnTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementOnTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementOnTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementOnTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementOnTrueContext ifStatementOnTrue() throws RecognitionException {
		IfStatementOnTrueContext _localctx = new IfStatementOnTrueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifStatementOnTrue);
		try {
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); match(OPEN_BRA);
				setState(646); programElements();
				setState(647); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public IfStatementOnFalseContext ifStatementOnFalse() {
			return getRuleContext(IfStatementOnFalseContext.class,0);
		}
		public TerminalNode KW_ELSE() { return getToken(DuroParser.KW_ELSE, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(652); match(KW_ELSE);
				setState(653); ifStatementOnFalse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementOnFalseContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public IfStatementOnFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementOnFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIfStatementOnFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIfStatementOnFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIfStatementOnFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementOnFalseContext ifStatementOnFalse() throws RecognitionException {
		IfStatementOnFalseContext _localctx = new IfStatementOnFalseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ifStatementOnFalse);
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(656); match(OPEN_BRA);
				setState(657); programElements();
				setState(658); match(CLOSE_BRA);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(DuroParser.KW_WHILE, 0); }
		public WhileStatementConditionContext whileStatementCondition() {
			return getRuleContext(WhileStatementConditionContext.class,0);
		}
		public WhileStatementBodyContext whileStatementBody() {
			return getRuleContext(WhileStatementBodyContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); match(KW_WHILE);
			setState(664); match(OPEN_PAR);
			setState(665); whileStatementCondition();
			setState(666); match(CLOSE_PAR);
			setState(667); whileStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementConditionContext whileStatementCondition() throws RecognitionException {
		WhileStatementConditionContext _localctx = new WhileStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whileStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public WhileStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterWhileStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitWhileStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitWhileStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementBodyContext whileStatementBody() throws RecognitionException {
		WhileStatementBodyContext _localctx = new WhileStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whileStatementBody);
		try {
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); match(OPEN_BRA);
				setState(672); programElements();
				setState(673); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementConditionContext forStatementCondition() {
			return getRuleContext(ForStatementConditionContext.class,0);
		}
		public ForStatementBodyContext forStatementBody() {
			return getRuleContext(ForStatementBodyContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DuroParser.SEMICOLON); }
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public ForStatementInitializationContext forStatementInitialization() {
			return getRuleContext(ForStatementInitializationContext.class,0);
		}
		public ForStatementUpdateContext forStatementUpdate() {
			return getRuleContext(ForStatementUpdateContext.class,0);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(DuroParser.SEMICOLON, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(KW_FOR);
			setState(679); match(OPEN_PAR);
			setState(680); forStatementInitialization();
			setState(681); match(SEMICOLON);
			setState(682); forStatementCondition();
			setState(683); match(SEMICOLON);
			setState(684); forStatementUpdate();
			setState(685); match(CLOSE_PAR);
			setState(686); forStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementInitializationContext extends ParserRuleContext {
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public ForStatementInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementInitializationContext forStatementInitialization() throws RecognitionException {
		ForStatementInitializationContext _localctx = new ForStatementInitializationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forStatementInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(688); delimitedProgramElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementConditionContext forStatementCondition() throws RecognitionException {
		ForStatementConditionContext _localctx = new ForStatementConditionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_forStatementCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(691); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementUpdateContext extends ParserRuleContext {
		public DelimitedProgramElementContext delimitedProgramElement() {
			return getRuleContext(DelimitedProgramElementContext.class,0);
		}
		public ForStatementUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementUpdateContext forStatementUpdate() throws RecognitionException {
		ForStatementUpdateContext _localctx = new ForStatementUpdateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_forStatementUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << NOT) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS) | (1L << BIN_OP1) | (1L << BIN_OP2) | (1L << INT) | (1L << COLON) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_BREAK) | (1L << KW_YIELD) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_FRAME) | (1L << ID))) != 0)) {
				{
				setState(694); delimitedProgramElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ForStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementBodyContext forStatementBody() throws RecognitionException {
		ForStatementBodyContext _localctx = new ForStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_forStatementBody);
		try {
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); match(OPEN_BRA);
				setState(698); programElements();
				setState(699); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public TerminalNode KW_IN() { return getToken(DuroParser.KW_IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public List<ForInStatementVarContext> forInStatementVar() {
			return getRuleContexts(ForInStatementVarContext.class);
		}
		public ForInStatementBodyContext forInStatementBody() {
			return getRuleContext(ForInStatementBodyContext.class,0);
		}
		public ForInStatementVarContext forInStatementVar(int i) {
			return getRuleContext(ForInStatementVarContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); match(KW_FOR);
			setState(705); match(OPEN_PAR);
			setState(706); forInStatementVar();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707); match(COMMA);
				setState(708); forInStatementVar();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714); match(KW_IN);
			setState(715); expression();
			setState(716); match(CLOSE_PAR);
			setState(717); forInStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ForInStatementVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatementVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatementVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementVarContext forInStatementVar() throws RecognitionException {
		ForInStatementVarContext _localctx = new ForInStatementVarContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forInStatementVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_la = _input.LA(1);
			if (_la==KW_VAR) {
				{
				setState(719); match(KW_VAR);
				}
			}

			setState(722); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public ForInStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterForInStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitForInStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitForInStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementBodyContext forInStatementBody() throws RecognitionException {
		ForInStatementBodyContext _localctx = new ForInStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forInStatementBody);
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724); match(OPEN_BRA);
				setState(725); programElements();
				setState(726); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode DOLLAR() { return getToken(DuroParser.DOLLAR, 0); }
		public InterfaceIdBodyContext interfaceIdBody() {
			return getRuleContext(InterfaceIdBodyContext.class,0);
		}
		public InterfaceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInterfaceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInterfaceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInterfaceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceIdContext interfaceId() throws RecognitionException {
		InterfaceIdContext _localctx = new InterfaceIdContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(DOLLAR);
			setState(732); match(ID);
			setState(733); interfaceIdBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceIdBodyContext extends ParserRuleContext {
		public ProgramElementContext programElement() {
			return getRuleContext(ProgramElementContext.class,0);
		}
		public ProgramElementsContext programElements() {
			return getRuleContext(ProgramElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
		public InterfaceIdBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceIdBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterInterfaceIdBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitInterfaceIdBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitInterfaceIdBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceIdBodyContext interfaceIdBody() throws RecognitionException {
		InterfaceIdBodyContext _localctx = new InterfaceIdBodyContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_interfaceIdBody);
		try {
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); match(OPEN_BRA);
				setState(736); programElements();
				setState(737); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739); programElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u02e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\3\7\3\u00d0\n\3\f\3"+
		"\16\3\u00d3\13\3\3\4\3\4\3\4\5\4\u00d8\n\4\7\4\u00da\n\4\f\4\16\4\u00dd"+
		"\13\4\3\4\5\4\u00e0\n\4\3\5\3\5\3\5\3\5\5\5\u00e6\n\5\3\6\3\6\5\6\u00ea"+
		"\n\6\3\7\3\7\3\b\3\b\5\b\u00f0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f9"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u0103\n\r\f\r\16\r\u0106\13"+
		"\r\3\16\3\16\3\16\3\17\3\17\7\17\u010d\n\17\f\17\16\17\u0110\13\17\3\20"+
		"\3\20\3\20\3\21\3\21\7\21\u0117\n\21\f\21\16\21\u011a\13\21\3\22\3\22"+
		"\3\22\3\23\3\23\7\23\u0121\n\23\f\23\16\23\u0124\13\23\3\24\3\24\3\24"+
		"\3\25\3\25\7\25\u012b\n\25\f\25\16\25\u012e\13\25\3\26\3\26\3\26\3\27"+
		"\3\27\7\27\u0135\n\27\f\27\16\27\u0138\13\27\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u013f\n\31\3\32\3\32\3\32\3\33\3\33\5\33\u0146\n\33\3\34\3\34\3"+
		"\34\5\34\u014b\n\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0164\n!\3!\7!\u0167"+
		"\n!\f!\16!\u016a\13!\3!\5!\u016d\n!\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u0176"+
		"\n#\f#\16#\u0179\13#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u018a\n\'\f\'\16\'\u018d\13\'\5\'\u018f\n\'\3\'\3\'\3(\3(\5(\u0195"+
		"\n(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u01a0\n*\3+\3+\3,\3,\3-\3-\3.\3.\3."+
		"\3.\7.\u01ac\n.\f.\16.\u01af\13.\5.\u01b1\n.\3.\3.\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\7\62\u01ca\n\62\f\62\16\62\u01cd\13\62\5\62\u01cf\n\62\3\62\5"+
		"\62\u01d2\n\62\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u01da\n\64\f\64\16\64"+
		"\u01dd\13\64\5\64\u01df\n\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\39\59\u01ee\n9\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\5=\u01fc"+
		"\n=\3>\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C"+
		"\5C\u0214\nC\3D\3D\3E\3E\5E\u021a\nE\3F\3F\3F\3F\7F\u0220\nF\fF\16F\u0223"+
		"\13F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\7H\u022f\nH\fH\16H\u0232\13H\5H\u0234"+
		"\nH\3I\3I\3J\3J\3J\3J\7J\u023c\nJ\fJ\16J\u023f\13J\3K\3K\3L\3L\3L\3L\3"+
		"L\3L\3L\5L\u024a\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\7N\u0258\nN\f"+
		"N\16N\u025b\13N\5N\u025d\nN\3O\3O\3P\3P\3P\7P\u0264\nP\fP\16P\u0267\13"+
		"P\3P\3P\3Q\3Q\5Q\u026d\nQ\3R\3R\7R\u0271\nR\fR\16R\u0274\13R\3R\3R\3S"+
		"\3S\5S\u027a\nS\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3W\3W\3W\3W\3W\5W"+
		"\u028d\nW\3X\3X\5X\u0291\nX\3Y\3Y\3Y\3Y\3Y\5Y\u0298\nY\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\5\\\u02a7\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3^\5^\u02b4\n^\3_\5_\u02b7\n_\3`\5`\u02ba\n`\3a\3a\3a\3a\3a\5a\u02c1"+
		"\na\3b\3b\3b\3b\3b\7b\u02c8\nb\fb\16b\u02cb\13b\3b\3b\3b\3b\3b\3c\5c\u02d3"+
		"\nc\3c\3c\3d\3d\3d\3d\3d\5d\u02dc\nd\3e\3e\3e\3e\3f\3f\3f\3f\3f\5f\u02e7"+
		"\nf\3f\2g\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\2\t\3\2\32\33\3\2\34"+
		"\37\3\2\b\t\4\2\23\23\25\31\3\2\32!\3\2./\3\2\23\31\u02d3\2\u00cc\3\2"+
		"\2\2\4\u00d1\3\2\2\2\6\u00df\3\2\2\2\b\u00e5\3\2\2\2\n\u00e9\3\2\2\2\f"+
		"\u00eb\3\2\2\2\16\u00ef\3\2\2\2\20\u00f8\3\2\2\2\22\u00fa\3\2\2\2\24\u00fc"+
		"\3\2\2\2\26\u00fe\3\2\2\2\30\u0100\3\2\2\2\32\u0107\3\2\2\2\34\u010a\3"+
		"\2\2\2\36\u0111\3\2\2\2 \u0114\3\2\2\2\"\u011b\3\2\2\2$\u011e\3\2\2\2"+
		"&\u0125\3\2\2\2(\u0128\3\2\2\2*\u012f\3\2\2\2,\u0132\3\2\2\2.\u0139\3"+
		"\2\2\2\60\u013e\3\2\2\2\62\u0140\3\2\2\2\64\u0145\3\2\2\2\66\u014a\3\2"+
		"\2\28\u014e\3\2\2\2:\u0150\3\2\2\2<\u0154\3\2\2\2>\u0159\3\2\2\2@\u0163"+
		"\3\2\2\2B\u016e\3\2\2\2D\u0172\3\2\2\2F\u017d\3\2\2\2H\u017f\3\2\2\2J"+
		"\u0182\3\2\2\2L\u0184\3\2\2\2N\u0194\3\2\2\2P\u0196\3\2\2\2R\u019f\3\2"+
		"\2\2T\u01a1\3\2\2\2V\u01a3\3\2\2\2X\u01a5\3\2\2\2Z\u01a7\3\2\2\2\\\u01b4"+
		"\3\2\2\2^\u01b8\3\2\2\2`\u01c0\3\2\2\2b\u01d1\3\2\2\2d\u01d3\3\2\2\2f"+
		"\u01d5\3\2\2\2h\u01e2\3\2\2\2j\u01e4\3\2\2\2l\u01e6\3\2\2\2n\u01e8\3\2"+
		"\2\2p\u01ed\3\2\2\2r\u01ef\3\2\2\2t\u01f2\3\2\2\2v\u01f5\3\2\2\2x\u01fb"+
		"\3\2\2\2z\u01fd\3\2\2\2|\u0202\3\2\2\2~\u0204\3\2\2\2\u0080\u020a\3\2"+
		"\2\2\u0082\u020c\3\2\2\2\u0084\u0213\3\2\2\2\u0086\u0215\3\2\2\2\u0088"+
		"\u0219\3\2\2\2\u008a\u021b\3\2\2\2\u008c\u0227\3\2\2\2\u008e\u022a\3\2"+
		"\2\2\u0090\u0235\3\2\2\2\u0092\u0237\3\2\2\2\u0094\u0240\3\2\2\2\u0096"+
		"\u0249\3\2\2\2\u0098\u024b\3\2\2\2\u009a\u025c\3\2\2\2\u009c\u025e\3\2"+
		"\2\2\u009e\u0260\3\2\2\2\u00a0\u026c\3\2\2\2\u00a2\u026e\3\2\2\2\u00a4"+
		"\u0279\3\2\2\2\u00a6\u027b\3\2\2\2\u00a8\u027e\3\2\2\2\u00aa\u0285\3\2"+
		"\2\2\u00ac\u028c\3\2\2\2\u00ae\u0290\3\2\2\2\u00b0\u0297\3\2\2\2\u00b2"+
		"\u0299\3\2\2\2\u00b4\u029f\3\2\2\2\u00b6\u02a6\3\2\2\2\u00b8\u02a8\3\2"+
		"\2\2\u00ba\u02b3\3\2\2\2\u00bc\u02b6\3\2\2\2\u00be\u02b9\3\2\2\2\u00c0"+
		"\u02c0\3\2\2\2\u00c2\u02c2\3\2\2\2\u00c4\u02d2\3\2\2\2\u00c6\u02db\3\2"+
		"\2\2\u00c8\u02dd\3\2\2\2\u00ca\u02e6\3\2\2\2\u00cc\u00cd\5\4\3\2\u00cd"+
		"\3\3\2\2\2\u00ce\u00d0\5\6\4\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\5\3\2\2\2\u00d3\u00d1\3"+
		"\2\2\2\u00d4\u00db\5\n\6\2\u00d5\u00d7\7#\2\2\u00d6\u00d8\5\n\6\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e0\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\u0096L\2\u00df\u00d4"+
		"\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\7\3\2\2\2\u00e1\u00e2\5\n\6\2\u00e2"+
		"\u00e3\7#\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6\5\u0096L\2\u00e5\u00e1\3"+
		"\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\t\3\2\2\2\u00e7\u00ea\5\f\7\2\u00e8\u00ea"+
		"\5\u0084C\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\13\3\2\2\2\u00eb"+
		"\u00ec\5\16\b\2\u00ec\r\3\2\2\2\u00ed\u00f0\5D#\2\u00ee\u00f0\5\20\t\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\17\3\2\2\2\u00f1\u00f2"+
		"\5\22\n\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\7%\2\2"+
		"\u00f5\u00f6\5\26\f\2\u00f6\u00f9\3\2\2\2\u00f7\u00f9\5\30\r\2\u00f8\u00f1"+
		"\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\21\3\2\2\2\u00fa\u00fb\5\30\r\2\u00fb"+
		"\23\3\2\2\2\u00fc\u00fd\5\30\r\2\u00fd\25\3\2\2\2\u00fe\u00ff\5\30\r\2"+
		"\u00ff\27\3\2\2\2\u0100\u0104\5\34\17\2\u0101\u0103\5\32\16\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\31\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\6\2\2\u0108\u0109\5\34\17"+
		"\2\u0109\33\3\2\2\2\u010a\u010e\5 \21\2\u010b\u010d\5\36\20\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\35\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\5\2\2\u0112\u0113\5 \21"+
		"\2\u0113\37\3\2\2\2\u0114\u0118\5$\23\2\u0115\u0117\5\"\22\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"!\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\2\2\2\u011c\u011d\5$\23\2"+
		"\u011d#\3\2\2\2\u011e\u0122\5(\25\2\u011f\u0121\5&\24\2\u0120\u011f\3"+
		"\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"%\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\t\3\2\2\u0126\u0127\5(\25\2"+
		"\u0127\'\3\2\2\2\u0128\u012c\5,\27\2\u0129\u012b\5*\26\2\u012a\u0129\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		")\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7 \2\2\u0130\u0131\5,\27\2\u0131"+
		"+\3\2\2\2\u0132\u0136\5\60\31\2\u0133\u0135\5.\30\2\u0134\u0133\3\2\2"+
		"\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137-"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7!\2\2\u013a\u013b\5\60\31\2"+
		"\u013b/\3\2\2\2\u013c\u013f\5\62\32\2\u013d\u013f\5\64\33\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\61\3\2\2\2\u0140\u0141\7\7\2\2\u0141"+
		"\u0142\5\64\33\2\u0142\63\3\2\2\2\u0143\u0146\5\66\34\2\u0144\u0146\5"+
		"@!\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\65\3\2\2\2\u0147\u014b"+
		"\58\35\2\u0148\u014b\5:\36\2\u0149\u014b\5<\37\2\u014a\u0147\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\t\4"+
		"\2\2\u014d\67\3\2\2\2\u014e\u014f\78\2\2\u014f9\3\2\2\2\u0150\u0151\5"+
		"@!\2\u0151\u0152\7\'\2\2\u0152\u0153\78\2\2\u0153;\3\2\2\2\u0154\u0155"+
		"\5> \2\u0155\u0156\7\r\2\2\u0156\u0157\5\16\b\2\u0157\u0158\7\16\2\2\u0158"+
		"=\3\2\2\2\u0159\u015a\5@!\2\u015a?\3\2\2\2\u015b\u0164\5B\"\2\u015c\u0164"+
		"\5J&\2\u015d\u0164\5F$\2\u015e\u0164\5H%\2\u015f\u0164\5R*\2\u0160\u0164"+
		"\5j\66\2\u0161\u0164\5l\67\2\u0162\u0164\5n8\2\u0163\u015b\3\2\2\2\u0163"+
		"\u015c\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2"+
		"\2\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0168\3\2\2\2\u0165\u0167\5p9\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016d\5x=\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"A\3\2\2\2\u016e\u016f\7\21\2\2\u016f\u0170\5\16\b\2\u0170\u0171\7\22\2"+
		"\2\u0171C\3\2\2\2\u0172\u0177\78\2\2\u0173\u0174\7$\2\2\u0174\u0176\7"+
		"8\2\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\t\5"+
		"\2\2\u017b\u017c\5\16\b\2\u017cE\3\2\2\2\u017d\u017e\78\2\2\u017eG\3\2"+
		"\2\2\u017f\u0180\7%\2\2\u0180\u0181\78\2\2\u0181I\3\2\2\2\u0182\u0183"+
		"\5L\'\2\u0183K\3\2\2\2\u0184\u0185\5N(\2\u0185\u018e\7\21\2\2\u0186\u018b"+
		"\5\16\b\2\u0187\u0188\7$\2\2\u0188\u018a\5\16\b\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\7\22\2\2\u0191M\3\2\2\2\u0192\u0195\78\2\2"+
		"\u0193\u0195\5P)\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195O\3\2"+
		"\2\2\u0196\u0197\t\6\2\2\u0197Q\3\2\2\2\u0198\u01a0\5T+\2\u0199\u01a0"+
		"\5V,\2\u019a\u01a0\5X-\2\u019b\u01a0\5Z.\2\u019c\u01a0\5^\60\2\u019d\u01a0"+
		"\5`\61\2\u019e\u01a0\5f\64\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f"+
		"\u019a\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u019e\3\2\2\2\u01a0S\3\2\2\2\u01a1\u01a2\7\"\2\2\u01a2U\3\2"+
		"\2\2\u01a3\u01a4\t\7\2\2\u01a4W\3\2\2\2\u01a5\u01a6\7\3\2\2\u01a6Y\3\2"+
		"\2\2\u01a7\u01b0\7\17\2\2\u01a8\u01ad\5\\/\2\u01a9\u01aa\7$\2\2\u01aa"+
		"\u01ac\5\\/\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01a8\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\20"+
		"\2\2\u01b3[\3\2\2\2\u01b4\u01b5\5N(\2\u01b5\u01b6\7%\2\2\u01b6\u01b7\5"+
		"\16\b\2\u01b7]\3\2\2\2\u01b8\u01b9\7*\2\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb"+
		"\5\u009aN\2\u01bb\u01bc\7\22\2\2\u01bc\u01bd\7\17\2\2\u01bd\u01be\5\u009c"+
		"O\2\u01be\u01bf\7\20\2\2\u01bf_\3\2\2\2\u01c0\u01c1\7\17\2\2\u01c1\u01c2"+
		"\5b\62\2\u01c2\u01c3\5d\63\2\u01c3\u01c4\7\20\2\2\u01c4a\3\2\2\2\u01c5"+
		"\u01ce\7\n\2\2\u01c6\u01cb\78\2\2\u01c7\u01c8\7$\2\2\u01c8\u01ca\78\2"+
		"\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\7\n\2\2\u01d1\u01c5\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2c\3\2\2\2\u01d3\u01d4\5\4\3\2\u01d4e\3\2"+
		"\2\2\u01d5\u01de\7\r\2\2\u01d6\u01db\5h\65\2\u01d7\u01d8\7$\2\2\u01d8"+
		"\u01da\5h\65\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01d6\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\16"+
		"\2\2\u01e1g\3\2\2\2\u01e2\u01e3\5\16\b\2\u01e3i\3\2\2\2\u01e4\u01e5\7"+
		"\62\2\2\u01e5k\3\2\2\2\u01e6\u01e7\7\63\2\2\u01e7m\3\2\2\2\u01e8\u01e9"+
		"\7\64\2\2\u01e9o\3\2\2\2\u01ea\u01ee\5r:\2\u01eb\u01ee\5t;\2\u01ec\u01ee"+
		"\5v<\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"q\3\2\2\2\u01ef\u01f0\7\'\2\2\u01f0\u01f1\5L\'\2\u01f1s\3\2\2\2\u01f2"+
		"\u01f3\7\'\2\2\u01f3\u01f4\5N(\2\u01f4u\3\2\2\2\u01f5\u01f6\7\r\2\2\u01f6"+
		"\u01f7\5\16\b\2\u01f7\u01f8\7\16\2\2\u01f8w\3\2\2\2\u01f9\u01fc\5z>\2"+
		"\u01fa\u01fc\5~@\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcy\3\2"+
		"\2\2\u01fd\u01fe\7\'\2\2\u01fe\u01ff\5N(\2\u01ff\u0200\t\b\2\2\u0200\u0201"+
		"\5|?\2\u0201{\3\2\2\2\u0202\u0203\5\16\b\2\u0203}\3\2\2\2\u0204\u0205"+
		"\7\r\2\2\u0205\u0206\5\u0080A\2\u0206\u0207\7\16\2\2\u0207\u0208\t\b\2"+
		"\2\u0208\u0209\5\u0082B\2\u0209\177\3\2\2\2\u020a\u020b\5\16\b\2\u020b"+
		"\u0081\3\2\2\2\u020c\u020d\5\16\b\2\u020d\u0083\3\2\2\2\u020e\u0214\5"+
		"\u0086D\2\u020f\u0214\5\u0088E\2\u0210\u0214\5\u008eH\2\u0211\u0214\5"+
		"\u0090I\2\u0212\u0214\5\u0092J\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2\2"+
		"\2\u0213\u0210\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0085"+
		"\3\2\2\2\u0215\u0216\7)\2\2\u0216\u0087\3\2\2\2\u0217\u021a\5\u008aF\2"+
		"\u0218\u021a\5\u008cG\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a"+
		"\u0089\3\2\2\2\u021b\u021c\7(\2\2\u021c\u0221\78\2\2\u021d\u021e\7$\2"+
		"\2\u021e\u0220\78\2\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0225\7\23\2\2\u0225\u0226\5\16\b\2\u0226\u008b\3\2\2\2\u0227\u0228\7"+
		"(\2\2\u0228\u0229\78\2\2\u0229\u008d\3\2\2\2\u022a\u0233\7+\2\2\u022b"+
		"\u0230\5\16\b\2\u022c\u022d\7$\2\2\u022d\u022f\5\16\b\2\u022e\u022c\3"+
		"\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u022b\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u008f\3\2\2\2\u0235\u0236\7,\2\2\u0236\u0091\3\2\2\2\u0237"+
		"\u0238\7-\2\2\u0238\u023d\5\u0094K\2\u0239\u023a\7$\2\2\u023a\u023c\5"+
		"\u0094K\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u0093\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241"+
		"\5\16\b\2\u0241\u0095\3\2\2\2\u0242\u024a\5\u0098M\2\u0243\u024a\5\u009e"+
		"P\2\u0244\u024a\5\u00a8U\2\u0245\u024a\5\u00b2Z\2\u0246\u024a\5\u00b8"+
		"]\2\u0247\u024a\5\u00c2b\2\u0248\u024a\5\u00c8e\2\u0249\u0242\3\2\2\2"+
		"\u0249\u0243\3\2\2\2\u0249\u0244\3\2\2\2\u0249\u0245\3\2\2\2\u0249\u0246"+
		"\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a\u0097\3\2\2\2\u024b"+
		"\u024c\7*\2\2\u024c\u024d\5N(\2\u024d\u024e\7\21\2\2\u024e\u024f\5\u009a"+
		"N\2\u024f\u0250\7\22\2\2\u0250\u0251\7\17\2\2\u0251\u0252\5\u009cO\2\u0252"+
		"\u0253\7\20\2\2\u0253\u0099\3\2\2\2\u0254\u0259\78\2\2\u0255\u0256\7$"+
		"\2\2\u0256\u0258\78\2\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u0254\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u009b\3\2\2\2\u025e"+
		"\u025f\5\4\3\2\u025f\u009d\3\2\2\2\u0260\u0261\7\13\2\2\u0261\u0265\7"+
		"\17\2\2\u0262\u0264\5\u00a0Q\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2"+
		"\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0268\u0269\7\20\2\2\u0269\u009f\3\2\2\2\u026a\u026d\5\u00a2"+
		"R\2\u026b\u026d\5\u00a6T\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"\u00a1\3\2\2\2\u026e\u0272\78\2\2\u026f\u0271\5\u00a4S\2\u0270\u026f\3"+
		"\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7#\2\2\u0276\u00a3\3\2"+
		"\2\2\u0277\u027a\5R*\2\u0278\u027a\78\2\2\u0279\u0277\3\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a\u00a5\3\2\2\2\u027b\u027c\78\2\2\u027c\u027d\7%\2\2\u027d"+
		"\u00a7\3\2\2\2\u027e\u027f\7\60\2\2\u027f\u0280\7\21\2\2\u0280\u0281\5"+
		"\u00aaV\2\u0281\u0282\7\22\2\2\u0282\u0283\5\u00acW\2\u0283\u0284\5\u00ae"+
		"X\2\u0284\u00a9\3\2\2\2\u0285\u0286\5\16\b\2\u0286\u00ab\3\2\2\2\u0287"+
		"\u0288\7\17\2\2\u0288\u0289\5\4\3\2\u0289\u028a\7\20\2\2\u028a\u028d\3"+
		"\2\2\2\u028b\u028d\5\b\5\2\u028c\u0287\3\2\2\2\u028c\u028b\3\2\2\2\u028d"+
		"\u00ad\3\2\2\2\u028e\u028f\7\61\2\2\u028f\u0291\5\u00b0Y\2\u0290\u028e"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u00af\3\2\2\2\u0292\u0293\7\17\2\2"+
		"\u0293\u0294\5\4\3\2\u0294\u0295\7\20\2\2\u0295\u0298\3\2\2\2\u0296\u0298"+
		"\5\b\5\2\u0297\u0292\3\2\2\2\u0297\u0296\3\2\2\2\u0298\u00b1\3\2\2\2\u0299"+
		"\u029a\7\65\2\2\u029a\u029b\7\21\2\2\u029b\u029c\5\u00b4[\2\u029c\u029d"+
		"\7\22\2\2\u029d\u029e\5\u00b6\\\2\u029e\u00b3\3\2\2\2\u029f\u02a0\5\16"+
		"\b\2\u02a0\u00b5\3\2\2\2\u02a1\u02a2\7\17\2\2\u02a2\u02a3\5\4\3\2\u02a3"+
		"\u02a4\7\20\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a7\5\b\5\2\u02a6\u02a1\3"+
		"\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u00b7\3\2\2\2\u02a8\u02a9\7\66\2\2\u02a9"+
		"\u02aa\7\21\2\2\u02aa\u02ab\5\u00ba^\2\u02ab\u02ac\7#\2\2\u02ac\u02ad"+
		"\5\u00bc_\2\u02ad\u02ae\7#\2\2\u02ae\u02af\5\u00be`\2\u02af\u02b0\7\22"+
		"\2\2\u02b0\u02b1\5\u00c0a\2\u02b1\u00b9\3\2\2\2\u02b2\u02b4\5\n\6\2\u02b3"+
		"\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u00bb\3\2\2\2\u02b5\u02b7\5\16"+
		"\b\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u00bd\3\2\2\2\u02b8"+
		"\u02ba\5\n\6\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u00bf\3\2"+
		"\2\2\u02bb\u02bc\7\17\2\2\u02bc\u02bd\5\4\3\2\u02bd\u02be\7\20\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02c1\5\b\5\2\u02c0\u02bb\3\2\2\2\u02c0\u02bf\3\2"+
		"\2\2\u02c1\u00c1\3\2\2\2\u02c2\u02c3\7\66\2\2\u02c3\u02c4\7\21\2\2\u02c4"+
		"\u02c9\5\u00c4c\2\u02c5\u02c6\7$\2\2\u02c6\u02c8\5\u00c4c\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7\67\2\2\u02cd\u02ce\5"+
		"\16\b\2\u02ce\u02cf\7\22\2\2\u02cf\u02d0\5\u00c6d\2\u02d0\u00c3\3\2\2"+
		"\2\u02d1\u02d3\7(\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\78\2\2\u02d5\u00c5\3\2\2\2\u02d6\u02d7\7\17\2\2\u02d7"+
		"\u02d8\5\4\3\2\u02d8\u02d9\7\20\2\2\u02d9\u02dc\3\2\2\2\u02da\u02dc\5"+
		"\b\5\2\u02db\u02d6\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u00c7\3\2\2\2\u02dd"+
		"\u02de\7\f\2\2\u02de\u02df\78\2\2\u02df\u02e0\5\u00caf\2\u02e0\u00c9\3"+
		"\2\2\2\u02e1\u02e2\7\17\2\2\u02e2\u02e3\5\4\3\2\u02e3\u02e4\7\20\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e7\5\b\5\2\u02e6\u02e1\3\2\2\2\u02e6\u02e5\3\2"+
		"\2\2\u02e7\u00cb\3\2\2\2=\u00d1\u00d7\u00db\u00df\u00e5\u00e9\u00ef\u00f8"+
		"\u0104\u010e\u0118\u0122\u012c\u0136\u013e\u0145\u014a\u0163\u0168\u016c"+
		"\u0177\u018b\u018e\u0194\u019f\u01ad\u01b0\u01cb\u01ce\u01d1\u01db\u01de"+
		"\u01ed\u01fb\u0213\u0219\u0221\u0230\u0233\u023d\u0249\u0259\u025c\u0265"+
		"\u026c\u0272\u0279\u028c\u0290\u0297\u02a6\u02b3\u02b6\u02b9\u02c0\u02c9"+
		"\u02d2\u02db\u02e6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}