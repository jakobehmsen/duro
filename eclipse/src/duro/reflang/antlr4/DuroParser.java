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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, DOUBLE_PLUS=5, 
		DOUBLE_MINUS=6, BIN_OP1=7, BIN_OP2=8, HASH=9, OPEN_SQ=10, CLOSE_SQ=11, 
		OPEN_BRA=12, CLOSE_BRA=13, OPEN_PAR=14, CLOSE_PAR=15, ASSIGN_ADD=16, ASSIGN_SUB=17, 
		ASSIGN_MULT=18, ASSIGN_DIV=19, EQUALS=20, NOT_EQUALS=21, ASSIGN=22, NOT=23, 
		LESS_THAN=24, LESS_THAN_OR_EQUALS=25, GREATER_THAN=26, GREATER_THAN_OR_EQUALS=27, 
		INT=28, SEMICOLON=29, COMMA=30, COLON=31, DOT=32, KW_VAR=33, KW_PAUSE=34, 
		KW_FUNCTION=35, KW_RETURN=36, KW_TRUE=37, KW_FALSE=38, KW_IF=39, KW_ELSE=40, 
		KW_THIS=41, KW_NULL=42, KW_WHILE=43, KW_FOR=44, KW_IN=45, ID=46, WS=47, 
		SINGLELINE_COMMENT=48, MULTI_LINE_COMMENT=49;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "'++'", 
		"'--'", "BIN_OP1", "BIN_OP2", "'#'", "'['", "']'", "'{'", "'}'", "'('", 
		"')'", "'+='", "'-='", "'*='", "'/='", "'=='", "'!='", "'='", "'!'", "'<'", 
		"'<='", "'>'", "'>='", "INT", "';'", "','", "':'", "'.'", "'var'", "'pause'", 
		"'function'", "'return'", "'true'", "'false'", "'if'", "'else'", "'this'", 
		"'null'", "'while'", "'for'", "'in'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElement = 2, RULE_delimitedProgramElement = 3, 
		RULE_topExpression = 4, RULE_expression = 5, RULE_binaryExpressionLogicalOr = 6, 
		RULE_binaryExpressionLogicalOrApplication = 7, RULE_binaryExpressionLogicalAnd = 8, 
		RULE_binaryExpressionLogicalAndApplication = 9, RULE_binaryExpressionEquality = 10, 
		RULE_binaryExpressionEqualityApplication = 11, RULE_binaryExpressionGreaterLess = 12, 
		RULE_binaryExpressionGreaterLessApplication = 13, RULE_binaryExpressionArithmetic1 = 14, 
		RULE_binaryExpressionArithmetic1Application = 15, RULE_binaryExpressionArithmetic2 = 16, 
		RULE_binaryExpressionArithmetic2Application = 17, RULE_unaryExpressionNot = 18, 
		RULE_unaryExpressionNotApplication = 19, RULE_unaryExpressionPostIncDec = 20, 
		RULE_unaryExpressionPostIncDecApplication = 21, RULE_unaryExpressionPostIncDecApplicationVariable = 22, 
		RULE_unaryExpressionPostIncDecApplicationMemberAccess = 23, RULE_unaryExpressionPostIncDecApplicationComputedMemberAccess = 24, 
		RULE_unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver = 25, 
		RULE_unaryExpressionPostIncDecOperand = 26, RULE_grouping = 27, RULE_variableAssignment = 28, 
		RULE_lookup = 29, RULE_thisMessageExchange = 30, RULE_messageExchange = 31, 
		RULE_literal = 32, RULE_integer = 33, RULE_bool = 34, RULE_string = 35, 
		RULE_dictProcess = 36, RULE_dictProcessEntry = 37, RULE_functionLiteral = 38, 
		RULE_array = 39, RULE_arrayOperand = 40, RULE_self = 41, RULE_nil = 42, 
		RULE_operationChain = 43, RULE_explicitMessageExchange = 44, RULE_memberAccess = 45, 
		RULE_computedMemberAccess = 46, RULE_operationEnd = 47, RULE_memberAssignment = 48, 
		RULE_memberAssignmentValue = 49, RULE_computedMemberAssignment = 50, RULE_computedMemberAssignmentKey = 51, 
		RULE_computedMemberAssignmentValue = 52, RULE_delimitedStatement = 53, 
		RULE_pause = 54, RULE_variableStatement = 55, RULE_variableDeclarationAndAssignment = 56, 
		RULE_variableDeclaration = 57, RULE_returnStatement = 58, RULE_undelimitedStatement = 59, 
		RULE_functionDefinition = 60, RULE_functionParameters = 61, RULE_functionBody = 62, 
		RULE_primitiveBody = 63, RULE_primitiveCall = 64, RULE_primitiveOperand = 65, 
		RULE_ifStatement = 66, RULE_ifStatementCondition = 67, RULE_ifStatementOnTrue = 68, 
		RULE_elseStatement = 69, RULE_ifStatementOnFalse = 70, RULE_whileStatement = 71, 
		RULE_whileStatementCondition = 72, RULE_whileStatementBody = 73, RULE_forStatement = 74, 
		RULE_forStatementInitialization = 75, RULE_forStatementCondition = 76, 
		RULE_forStatementUpdate = 77, RULE_forStatementBody = 78, RULE_forInStatement = 79, 
		RULE_forInStatementBody = 80;
	public static final String[] ruleNames = {
		"program", "programElements", "programElement", "delimitedProgramElement", 
		"topExpression", "expression", "binaryExpressionLogicalOr", "binaryExpressionLogicalOrApplication", 
		"binaryExpressionLogicalAnd", "binaryExpressionLogicalAndApplication", 
		"binaryExpressionEquality", "binaryExpressionEqualityApplication", "binaryExpressionGreaterLess", 
		"binaryExpressionGreaterLessApplication", "binaryExpressionArithmetic1", 
		"binaryExpressionArithmetic1Application", "binaryExpressionArithmetic2", 
		"binaryExpressionArithmetic2Application", "unaryExpressionNot", "unaryExpressionNotApplication", 
		"unaryExpressionPostIncDec", "unaryExpressionPostIncDecApplication", "unaryExpressionPostIncDecApplicationVariable", 
		"unaryExpressionPostIncDecApplicationMemberAccess", "unaryExpressionPostIncDecApplicationComputedMemberAccess", 
		"unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver", "unaryExpressionPostIncDecOperand", 
		"grouping", "variableAssignment", "lookup", "thisMessageExchange", "messageExchange", 
		"literal", "integer", "bool", "string", "dictProcess", "dictProcessEntry", 
		"functionLiteral", "array", "arrayOperand", "self", "nil", "operationChain", 
		"explicitMessageExchange", "memberAccess", "computedMemberAccess", "operationEnd", 
		"memberAssignment", "memberAssignmentValue", "computedMemberAssignment", 
		"computedMemberAssignmentKey", "computedMemberAssignmentValue", "delimitedStatement", 
		"pause", "variableStatement", "variableDeclarationAndAssignment", "variableDeclaration", 
		"returnStatement", "undelimitedStatement", "functionDefinition", "functionParameters", 
		"functionBody", "primitiveBody", "primitiveCall", "primitiveOperand", 
		"ifStatement", "ifStatementCondition", "ifStatementOnTrue", "elseStatement", 
		"ifStatementOnFalse", "whileStatement", "whileStatementCondition", "whileStatementBody", 
		"forStatement", "forStatementInitialization", "forStatementCondition", 
		"forStatementUpdate", "forStatementBody", "forInStatement", "forInStatementBody"
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
			setState(162); programElements();
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
		public List<ProgramElementContext> programElement() {
			return getRuleContexts(ProgramElementContext.class);
		}
		public ProgramElementContext programElement(int i) {
			return getRuleContext(ProgramElementContext.class,i);
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << HASH) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << KW_WHILE) | (1L << KW_FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(164); programElement();
				}
				}
				setState(169);
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
		enterRule(_localctx, 4, RULE_programElement);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); delimitedProgramElement();
				setState(171); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); undelimitedStatement();
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
		enterRule(_localctx, 6, RULE_delimitedProgramElement);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case NOT:
			case INT:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); topExpression();
				}
				break;
			case KW_VAR:
			case KW_PAUSE:
			case KW_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); delimitedStatement();
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
		enterRule(_localctx, 8, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); expression();
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
		public BinaryExpressionLogicalOrContext binaryExpressionLogicalOr() {
			return getRuleContext(BinaryExpressionLogicalOrContext.class,0);
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); binaryExpressionLogicalOr();
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
		enterRule(_localctx, 12, RULE_binaryExpressionLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); binaryExpressionLogicalAnd();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(187); binaryExpressionLogicalOrApplication();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 14, RULE_binaryExpressionLogicalOrApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(DOUBLE_PIPE);
			setState(194); binaryExpressionLogicalAnd();
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
		enterRule(_localctx, 16, RULE_binaryExpressionLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); binaryExpressionEquality();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); binaryExpressionLogicalAndApplication();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 18, RULE_binaryExpressionLogicalAndApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(DOUBLE_AMP);
			setState(204); binaryExpressionEquality();
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
		enterRule(_localctx, 20, RULE_binaryExpressionEquality);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206); binaryExpressionGreaterLess();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(207); binaryExpressionEqualityApplication();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 22, RULE_binaryExpressionEqualityApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			((BinaryExpressionEqualityApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				((BinaryExpressionEqualityApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(214); binaryExpressionGreaterLess();
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
		enterRule(_localctx, 24, RULE_binaryExpressionGreaterLess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216); binaryExpressionArithmetic1();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(217); binaryExpressionGreaterLessApplication();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 26, RULE_binaryExpressionGreaterLessApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((BinaryExpressionGreaterLessApplicationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUALS))) != 0)) ) {
				((BinaryExpressionGreaterLessApplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(224); binaryExpressionArithmetic1();
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
		enterRule(_localctx, 28, RULE_binaryExpressionArithmetic1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226); binaryExpressionArithmetic2();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(227); binaryExpressionArithmetic1Application();
					}
					} 
				}
				setState(232);
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
		enterRule(_localctx, 30, RULE_binaryExpressionArithmetic1Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(BIN_OP1);
			setState(234); binaryExpressionArithmetic2();
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
		enterRule(_localctx, 32, RULE_binaryExpressionArithmetic2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); unaryExpressionNot();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(237); binaryExpressionArithmetic2Application();
					}
					} 
				}
				setState(242);
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
		enterRule(_localctx, 34, RULE_binaryExpressionArithmetic2Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(BIN_OP2);
			setState(244); unaryExpressionNot();
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
		enterRule(_localctx, 36, RULE_unaryExpressionNot);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); unaryExpressionNotApplication();
				}
				break;
			case STRING_LITERAL:
			case OPEN_SQ:
			case OPEN_BRA:
			case OPEN_PAR:
			case INT:
			case KW_FUNCTION:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case KW_NULL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); unaryExpressionPostIncDec();
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
		enterRule(_localctx, 38, RULE_unaryExpressionNotApplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(NOT);
			setState(251); unaryExpressionPostIncDec();
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
		enterRule(_localctx, 40, RULE_unaryExpressionPostIncDec);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); unaryExpressionPostIncDecApplication();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); unaryExpressionPostIncDecOperand();
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
		public UnaryExpressionPostIncDecApplicationComputedMemberAccessContext unaryExpressionPostIncDecApplicationComputedMemberAccess() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationComputedMemberAccessContext.class,0);
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
		enterRule(_localctx, 42, RULE_unaryExpressionPostIncDecApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(257); unaryExpressionPostIncDecApplicationVariable();
				}
				break;

			case 2:
				{
				setState(258); unaryExpressionPostIncDecApplicationMemberAccess();
				}
				break;

			case 3:
				{
				setState(259); unaryExpressionPostIncDecApplicationComputedMemberAccess();
				}
				break;
			}
			setState(262);
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
		enterRule(_localctx, 44, RULE_unaryExpressionPostIncDecApplicationVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(ID);
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
		enterRule(_localctx, 46, RULE_unaryExpressionPostIncDecApplicationMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); unaryExpressionPostIncDecOperand();
			setState(267); match(DOT);
			setState(268); match(ID);
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

	public static class UnaryExpressionPostIncDecApplicationComputedMemberAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver() {
			return getRuleContext(UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationComputedMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationComputedMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationComputedMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationComputedMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationComputedMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationComputedMemberAccessContext unaryExpressionPostIncDecApplicationComputedMemberAccess() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationComputedMemberAccessContext _localctx = new UnaryExpressionPostIncDecApplicationComputedMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExpressionPostIncDecApplicationComputedMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver();
			setState(271); match(OPEN_SQ);
			setState(272); expression();
			setState(273); match(CLOSE_SQ);
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

	public static class UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext extends ParserRuleContext {
		public UnaryExpressionPostIncDecOperandContext unaryExpressionPostIncDecOperand() {
			return getRuleContext(UnaryExpressionPostIncDecOperandContext.class,0);
		}
		public UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryExpressionPostIncDecApplicationComputedMemberAccessReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver() throws RecognitionException {
		UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext _localctx = new UnaryExpressionPostIncDecApplicationComputedMemberAccessReceiverContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); unaryExpressionPostIncDecOperand();
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
		public List<OperationChainContext> operationChain() {
			return getRuleContexts(OperationChainContext.class);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperationChainContext operationChain(int i) {
			return getRuleContext(OperationChainContext.class,i);
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
		enterRule(_localctx, 52, RULE_unaryExpressionPostIncDecOperand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(277); grouping();
				}
				break;

			case 2:
				{
				setState(278); lookup();
				}
				break;

			case 3:
				{
				setState(279); thisMessageExchange();
				}
				break;

			case 4:
				{
				setState(280); literal();
				}
				break;

			case 5:
				{
				setState(281); self();
				}
				break;

			case 6:
				{
				setState(282); nil();
				}
				break;
			}
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(285); operationChain();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(291); operationEnd();
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
		enterRule(_localctx, 54, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(OPEN_PAR);
			setState(295); expression();
			setState(296); match(CLOSE_PAR);
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
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
		enterRule(_localctx, 56, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(ID);
			setState(299);
			((VariableAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN))) != 0)) ) {
				((VariableAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(300); expression();
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
		enterRule(_localctx, 58, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(ID);
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
		enterRule(_localctx, 60, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); messageExchange();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 62, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(ID);
			setState(307); match(OPEN_PAR);
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(308); expression();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(309); match(COMMA);
					setState(310); expression();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(318); match(CLOSE_PAR);
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
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); integer();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); bool();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(322); string();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(323); dictProcess();
				}
				break;
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(324); functionLiteral();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(325); array();
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
		enterRule(_localctx, 66, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(INT);
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
		enterRule(_localctx, 68, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 70, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(STRING_LITERAL);
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
		enterRule(_localctx, 72, RULE_dictProcess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(OPEN_BRA);
			setState(343);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(335); dictProcessEntry();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(336); match(COMMA);
					setState(337); dictProcessEntry();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(345); match(CLOSE_BRA);
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 74, RULE_dictProcessEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(ID);
			setState(348); match(COLON);
			setState(349); expression();
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
		enterRule(_localctx, 76, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(KW_FUNCTION);
			setState(352); match(OPEN_PAR);
			setState(353); functionParameters();
			setState(354); match(CLOSE_PAR);
			setState(355); match(OPEN_BRA);
			setState(356); functionBody();
			setState(357); match(CLOSE_BRA);
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
		enterRule(_localctx, 78, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(OPEN_SQ);
			setState(368);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(360); arrayOperand();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(361); match(COMMA);
					setState(362); arrayOperand();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(370); match(CLOSE_SQ);
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
		enterRule(_localctx, 80, RULE_arrayOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); expression();
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
		enterRule(_localctx, 82, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(KW_THIS);
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
		enterRule(_localctx, 84, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(KW_NULL);
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
		public ComputedMemberAccessContext computedMemberAccess() {
			return getRuleContext(ComputedMemberAccessContext.class,0);
		}
		public ExplicitMessageExchangeContext explicitMessageExchange() {
			return getRuleContext(ExplicitMessageExchangeContext.class,0);
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
		enterRule(_localctx, 86, RULE_operationChain);
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); explicitMessageExchange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); memberAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); computedMemberAccess();
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
		enterRule(_localctx, 88, RULE_explicitMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(DOT);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 90, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(DOT);
			setState(387); match(ID);
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

	public static class ComputedMemberAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComputedMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAccessContext computedMemberAccess() throws RecognitionException {
		ComputedMemberAccessContext _localctx = new ComputedMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_computedMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(OPEN_SQ);
			setState(390); expression();
			setState(391); match(CLOSE_SQ);
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
		public ComputedMemberAssignmentContext computedMemberAssignment() {
			return getRuleContext(ComputedMemberAssignmentContext.class,0);
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
		enterRule(_localctx, 94, RULE_operationEnd);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(393); memberAssignment();
				}
				break;
			case OPEN_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); computedMemberAssignment();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public MemberAssignmentValueContext memberAssignmentValue() {
			return getRuleContext(MemberAssignmentValueContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_memberAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(DOT);
			setState(398); match(ID);
			setState(399);
			((MemberAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN))) != 0)) ) {
				((MemberAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(400); memberAssignmentValue();
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
		enterRule(_localctx, 98, RULE_memberAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); expression();
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

	public static class ComputedMemberAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ASSIGN_MULT() { return getToken(DuroParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(DuroParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(DuroParser.ASSIGN_ADD, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ComputedMemberAssignmentKeyContext computedMemberAssignmentKey() {
			return getRuleContext(ComputedMemberAssignmentKeyContext.class,0);
		}
		public ComputedMemberAssignmentValueContext computedMemberAssignmentValue() {
			return getRuleContext(ComputedMemberAssignmentValueContext.class,0);
		}
		public TerminalNode ASSIGN_SUB() { return getToken(DuroParser.ASSIGN_SUB, 0); }
		public ComputedMemberAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAssignmentContext computedMemberAssignment() throws RecognitionException {
		ComputedMemberAssignmentContext _localctx = new ComputedMemberAssignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_computedMemberAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(OPEN_SQ);
			setState(405); computedMemberAssignmentKey();
			setState(406); match(CLOSE_SQ);
			setState(407);
			((ComputedMemberAssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV) | (1L << ASSIGN))) != 0)) ) {
				((ComputedMemberAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(408); computedMemberAssignmentValue();
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

	public static class ComputedMemberAssignmentKeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComputedMemberAssignmentKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAssignmentKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAssignmentKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAssignmentKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAssignmentKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAssignmentKeyContext computedMemberAssignmentKey() throws RecognitionException {
		ComputedMemberAssignmentKeyContext _localctx = new ComputedMemberAssignmentKeyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_computedMemberAssignmentKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); expression();
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

	public static class ComputedMemberAssignmentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComputedMemberAssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedMemberAssignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterComputedMemberAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitComputedMemberAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitComputedMemberAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedMemberAssignmentValueContext computedMemberAssignmentValue() throws RecognitionException {
		ComputedMemberAssignmentValueContext _localctx = new ComputedMemberAssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_computedMemberAssignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); expression();
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
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 106, RULE_delimitedStatement);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(416); returnStatement();
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
		enterRule(_localctx, 108, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(KW_PAUSE);
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
		enterRule(_localctx, 110, RULE_variableStatement);
		try {
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); variableDeclaration();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 112, RULE_variableDeclarationAndAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(KW_VAR);
			setState(426); match(ID);
			setState(427); match(ASSIGN);
			setState(428); expression();
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
		enterRule(_localctx, 114, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(KW_VAR);
			setState(431); match(ID);
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
		public TerminalNode KW_RETURN() { return getToken(DuroParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 116, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(KW_RETURN);
			setState(435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(434); expression();
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
		enterRule(_localctx, 118, RULE_undelimitedStatement);
		try {
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); primitiveBody();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439); ifStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440); whileStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441); forStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442); forInStatement();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
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
		enterRule(_localctx, 120, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(KW_FUNCTION);
			setState(446); match(ID);
			setState(447); match(OPEN_PAR);
			setState(448); functionParameters();
			setState(449); match(CLOSE_PAR);
			setState(450); match(OPEN_BRA);
			setState(451); functionBody();
			setState(452); match(CLOSE_BRA);
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
		enterRule(_localctx, 122, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(454); match(ID);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(455); match(COMMA);
					setState(456); match(ID);
					}
					}
					setState(461);
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
		enterRule(_localctx, 124, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); programElements();
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
		public PrimitiveCallContext primitiveCall(int i) {
			return getRuleContext(PrimitiveCallContext.class,i);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public List<PrimitiveCallContext> primitiveCall() {
			return getRuleContexts(PrimitiveCallContext.class);
		}
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
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
		enterRule(_localctx, 126, RULE_primitiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(HASH);
			setState(467); match(OPEN_BRA);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(468); primitiveCall();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474); match(CLOSE_BRA);
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
		enterRule(_localctx, 128, RULE_primitiveCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); match(ID);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(477); primitiveOperand();
				}
				}
				setState(482);
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

	public static class PrimitiveOperandContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
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
		enterRule(_localctx, 130, RULE_primitiveOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483); match(COLON);
			setState(484); literal();
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
		enterRule(_localctx, 132, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(KW_IF);
			setState(487); match(OPEN_PAR);
			setState(488); ifStatementCondition();
			setState(489); match(CLOSE_PAR);
			setState(490); ifStatementOnTrue();
			setState(491); elseStatement();
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
		enterRule(_localctx, 134, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); expression();
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
		enterRule(_localctx, 136, RULE_ifStatementOnTrue);
		try {
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495); match(OPEN_BRA);
				setState(496); programElements();
				setState(497); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499); programElement();
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
		enterRule(_localctx, 138, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(502); match(KW_ELSE);
				setState(503); ifStatementOnFalse();
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
		enterRule(_localctx, 140, RULE_ifStatementOnFalse);
		try {
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(506); match(OPEN_BRA);
				setState(507); programElements();
				setState(508); match(CLOSE_BRA);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510); programElement();
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
		enterRule(_localctx, 142, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(KW_WHILE);
			setState(514); match(OPEN_PAR);
			setState(515); whileStatementCondition();
			setState(516); match(CLOSE_PAR);
			setState(517); whileStatementBody();
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
		enterRule(_localctx, 144, RULE_whileStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); expression();
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
		enterRule(_localctx, 146, RULE_whileStatementBody);
		try {
			setState(526);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); match(OPEN_BRA);
				setState(522); programElements();
				setState(523); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); programElement();
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
		public TerminalNode CLOSE_BRA() { return getToken(DuroParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DuroParser.OPEN_BRA, 0); }
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
		enterRule(_localctx, 148, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(KW_FOR);
			setState(529); match(OPEN_PAR);
			setState(530); forStatementInitialization();
			setState(531); match(SEMICOLON);
			setState(532); forStatementCondition();
			setState(533); match(SEMICOLON);
			setState(534); forStatementUpdate();
			setState(535); match(CLOSE_PAR);
			setState(536); match(OPEN_BRA);
			setState(537); forStatementBody();
			setState(538); match(CLOSE_BRA);
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
		enterRule(_localctx, 150, RULE_forStatementInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(540); delimitedProgramElement();
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
		enterRule(_localctx, 152, RULE_forStatementCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_FUNCTION) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(543); expression();
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
		enterRule(_localctx, 154, RULE_forStatementUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << OPEN_SQ) | (1L << OPEN_BRA) | (1L << OPEN_PAR) | (1L << NOT) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << KW_NULL) | (1L << ID))) != 0)) {
				{
				setState(546); delimitedProgramElement();
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
		enterRule(_localctx, 156, RULE_forStatementBody);
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549); match(OPEN_BRA);
				setState(550); programElements();
				setState(551); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); programElement();
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
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode KW_FOR() { return getToken(DuroParser.KW_FOR, 0); }
		public TerminalNode KW_IN() { return getToken(DuroParser.KW_IN, 0); }
		public ForInStatementBodyContext forInStatementBody() {
			return getRuleContext(ForInStatementBodyContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DuroParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_VAR() { return getToken(DuroParser.KW_VAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DuroParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 158, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(KW_FOR);
			setState(557); match(OPEN_PAR);
			setState(559);
			_la = _input.LA(1);
			if (_la==KW_VAR) {
				{
				setState(558); match(KW_VAR);
				}
			}

			setState(561); match(ID);
			setState(562); match(KW_IN);
			setState(563); expression();
			setState(564); match(CLOSE_PAR);
			setState(565); forInStatementBody();
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
		enterRule(_localctx, 160, RULE_forInStatementBody);
		try {
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567); match(OPEN_BRA);
				setState(568); programElements();
				setState(569); match(CLOSE_BRA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571); programElement();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\63\u0241\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\7\3\u00a8\n\3\f\3\16\3\u00ab\13\3\3\4\3\4\3\4\3\4\5\4\u00b1\n\4\3\5\3"+
		"\5\5\5\u00b5\n\5\3\6\3\6\3\7\3\7\5\7\u00bb\n\7\3\b\3\b\7\b\u00bf\n\b\f"+
		"\b\16\b\u00c2\13\b\3\t\3\t\3\t\3\n\3\n\7\n\u00c9\n\n\f\n\16\n\u00cc\13"+
		"\n\3\13\3\13\3\13\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\r\3\r\3"+
		"\r\3\16\3\16\7\16\u00dd\n\16\f\16\16\16\u00e0\13\16\3\17\3\17\3\17\3\20"+
		"\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea\13\20\3\21\3\21\3\21\3\22\3\22"+
		"\7\22\u00f1\n\22\f\22\16\22\u00f4\13\22\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u00fb\n\24\3\25\3\25\3\25\3\26\3\26\5\26\u0102\n\26\3\27\3\27\3\27\5"+
		"\27\u0107\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011e\n\34\3\34"+
		"\7\34\u0121\n\34\f\34\16\34\u0124\13\34\3\34\5\34\u0127\n\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\7!\u013a"+
		"\n!\f!\16!\u013d\13!\5!\u013f\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0149"+
		"\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\7&\u0155\n&\f&\16&\u0158\13&\5&\u015a"+
		"\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u016e"+
		"\n)\f)\16)\u0171\13)\5)\u0173\n)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\5-\u0180"+
		"\n-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u018e\n\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\3\67\5\67\u01a4\n\67\38\38\39\39\59\u01aa\n9\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3<\3<\5<\u01b6\n<\3=\3=\3=\3=\3=\3=\5=\u01be\n"+
		"=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\7?\u01cc\n?\f?\16?\u01cf\13?\5?"+
		"\u01d1\n?\3@\3@\3A\3A\3A\7A\u01d8\nA\fA\16A\u01db\13A\3A\3A\3B\3B\7B\u01e1"+
		"\nB\fB\16B\u01e4\13B\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3"+
		"F\5F\u01f7\nF\3G\3G\5G\u01fb\nG\3H\3H\3H\3H\3H\5H\u0202\nH\3I\3I\3I\3"+
		"I\3I\3I\3J\3J\3K\3K\3K\3K\3K\5K\u0211\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3M\5M\u0220\nM\3N\5N\u0223\nN\3O\5O\u0226\nO\3P\3P\3P\3P\3P\5"+
		"P\u022d\nP\3Q\3Q\3Q\5Q\u0232\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\5R\u023f"+
		"\nR\3R\2S\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\2\7\3\2\26\27\3\2\32\35\3\2\7\b\4\2\22\25\30\30\3\2\'(\u0229\2\u00a4"+
		"\3\2\2\2\4\u00a9\3\2\2\2\6\u00b0\3\2\2\2\b\u00b4\3\2\2\2\n\u00b6\3\2\2"+
		"\2\f\u00ba\3\2\2\2\16\u00bc\3\2\2\2\20\u00c3\3\2\2\2\22\u00c6\3\2\2\2"+
		"\24\u00cd\3\2\2\2\26\u00d0\3\2\2\2\30\u00d7\3\2\2\2\32\u00da\3\2\2\2\34"+
		"\u00e1\3\2\2\2\36\u00e4\3\2\2\2 \u00eb\3\2\2\2\"\u00ee\3\2\2\2$\u00f5"+
		"\3\2\2\2&\u00fa\3\2\2\2(\u00fc\3\2\2\2*\u0101\3\2\2\2,\u0106\3\2\2\2."+
		"\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u0110\3\2\2\2\64\u0115\3\2\2\2\66\u011d"+
		"\3\2\2\28\u0128\3\2\2\2:\u012c\3\2\2\2<\u0130\3\2\2\2>\u0132\3\2\2\2@"+
		"\u0134\3\2\2\2B\u0148\3\2\2\2D\u014a\3\2\2\2F\u014c\3\2\2\2H\u014e\3\2"+
		"\2\2J\u0150\3\2\2\2L\u015d\3\2\2\2N\u0161\3\2\2\2P\u0169\3\2\2\2R\u0176"+
		"\3\2\2\2T\u0178\3\2\2\2V\u017a\3\2\2\2X\u017f\3\2\2\2Z\u0181\3\2\2\2\\"+
		"\u0184\3\2\2\2^\u0187\3\2\2\2`\u018d\3\2\2\2b\u018f\3\2\2\2d\u0194\3\2"+
		"\2\2f\u0196\3\2\2\2h\u019c\3\2\2\2j\u019e\3\2\2\2l\u01a3\3\2\2\2n\u01a5"+
		"\3\2\2\2p\u01a9\3\2\2\2r\u01ab\3\2\2\2t\u01b0\3\2\2\2v\u01b3\3\2\2\2x"+
		"\u01bd\3\2\2\2z\u01bf\3\2\2\2|\u01d0\3\2\2\2~\u01d2\3\2\2\2\u0080\u01d4"+
		"\3\2\2\2\u0082\u01de\3\2\2\2\u0084\u01e5\3\2\2\2\u0086\u01e8\3\2\2\2\u0088"+
		"\u01ef\3\2\2\2\u008a\u01f6\3\2\2\2\u008c\u01fa\3\2\2\2\u008e\u0201\3\2"+
		"\2\2\u0090\u0203\3\2\2\2\u0092\u0209\3\2\2\2\u0094\u0210\3\2\2\2\u0096"+
		"\u0212\3\2\2\2\u0098\u021f\3\2\2\2\u009a\u0222\3\2\2\2\u009c\u0225\3\2"+
		"\2\2\u009e\u022c\3\2\2\2\u00a0\u022e\3\2\2\2\u00a2\u023e\3\2\2\2\u00a4"+
		"\u00a5\5\4\3\2\u00a5\3\3\2\2\2\u00a6\u00a8\5\6\4\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\5\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7\37\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00b1\5x=\2\u00b0\u00ac\3\2\2\2\u00b0\u00af\3\2\2"+
		"\2\u00b1\7\3\2\2\2\u00b2\u00b5\5\n\6\2\u00b3\u00b5\5l\67\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\t\3\2\2\2\u00b6\u00b7\5\f\7\2\u00b7"+
		"\13\3\2\2\2\u00b8\u00bb\5:\36\2\u00b9\u00bb\5\16\b\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\r\3\2\2\2\u00bc\u00c0\5\22\n\2\u00bd\u00bf"+
		"\5\20\t\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4"+
		"\7\6\2\2\u00c4\u00c5\5\22\n\2\u00c5\21\3\2\2\2\u00c6\u00ca\5\26\f\2\u00c7"+
		"\u00c9\5\24\13\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\5\2\2\u00ce\u00cf\5\26\f\2\u00cf\25\3\2\2\2\u00d0\u00d4\5\32"+
		"\16\2\u00d1\u00d3\5\30\r\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\t\2\2\2\u00d8\u00d9\5\32\16\2\u00d9\31\3\2\2\2\u00da\u00de"+
		"\5\36\20\2\u00db\u00dd\5\34\17\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00e3\5\36\20\2\u00e3\35\3\2\2\2\u00e4"+
		"\u00e8\5\"\22\2\u00e5\u00e7\5 \21\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\37\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00ed\5\"\22\2\u00ed!\3\2\2\2"+
		"\u00ee\u00f2\5&\24\2\u00ef\u00f1\5$\23\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f7\5&\24\2\u00f7%\3\2\2\2"+
		"\u00f8\u00fb\5(\25\2\u00f9\u00fb\5*\26\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe\5*\26\2\u00fe"+
		")\3\2\2\2\u00ff\u0102\5,\27\2\u0100\u0102\5\66\34\2\u0101\u00ff\3\2\2"+
		"\2\u0101\u0100\3\2\2\2\u0102+\3\2\2\2\u0103\u0107\5.\30\2\u0104\u0107"+
		"\5\60\31\2\u0105\u0107\5\62\32\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2"+
		"\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\t\4\2\2\u0109-"+
		"\3\2\2\2\u010a\u010b\7\60\2\2\u010b/\3\2\2\2\u010c\u010d\5\66\34\2\u010d"+
		"\u010e\7\"\2\2\u010e\u010f\7\60\2\2\u010f\61\3\2\2\2\u0110\u0111\5\64"+
		"\33\2\u0111\u0112\7\f\2\2\u0112\u0113\5\f\7\2\u0113\u0114\7\r\2\2\u0114"+
		"\63\3\2\2\2\u0115\u0116\5\66\34\2\u0116\65\3\2\2\2\u0117\u011e\58\35\2"+
		"\u0118\u011e\5<\37\2\u0119\u011e\5> \2\u011a\u011e\5B\"\2\u011b\u011e"+
		"\5T+\2\u011c\u011e\5V,\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2"+
		"\2\2\u011e\u0122\3\2\2\2\u011f\u0121\5X-\2\u0120\u011f\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\5`\61\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\67\3\2\2\2\u0128\u0129\7\20\2\2\u0129\u012a\5\f\7\2\u012a\u012b"+
		"\7\21\2\2\u012b9\3\2\2\2\u012c\u012d\7\60\2\2\u012d\u012e\t\5\2\2\u012e"+
		"\u012f\5\f\7\2\u012f;\3\2\2\2\u0130\u0131\7\60\2\2\u0131=\3\2\2\2\u0132"+
		"\u0133\5@!\2\u0133?\3\2\2\2\u0134\u0135\7\60\2\2\u0135\u013e\7\20\2\2"+
		"\u0136\u013b\5\f\7\2\u0137\u0138\7 \2\2\u0138\u013a\5\f\7\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\21\2\2\u0141A\3\2\2\2\u0142\u0149"+
		"\5D#\2\u0143\u0149\5F$\2\u0144\u0149\5H%\2\u0145\u0149\5J&\2\u0146\u0149"+
		"\5N(\2\u0147\u0149\5P)\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149C\3\2\2\2\u014a\u014b\7\36\2\2\u014bE\3\2\2\2\u014c\u014d\t"+
		"\6\2\2\u014dG\3\2\2\2\u014e\u014f\7\3\2\2\u014fI\3\2\2\2\u0150\u0159\7"+
		"\16\2\2\u0151\u0156\5L\'\2\u0152\u0153\7 \2\2\u0153\u0155\5L\'\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0151\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\17\2\2\u015cK\3\2\2\2"+
		"\u015d\u015e\7\60\2\2\u015e\u015f\7!\2\2\u015f\u0160\5\f\7\2\u0160M\3"+
		"\2\2\2\u0161\u0162\7%\2\2\u0162\u0163\7\20\2\2\u0163\u0164\5|?\2\u0164"+
		"\u0165\7\21\2\2\u0165\u0166\7\16\2\2\u0166\u0167\5~@\2\u0167\u0168\7\17"+
		"\2\2\u0168O\3\2\2\2\u0169\u0172\7\f\2\2\u016a\u016f\5R*\2\u016b\u016c"+
		"\7 \2\2\u016c\u016e\5R*\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0172\u016a\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\7\r\2\2\u0175Q\3\2\2\2\u0176\u0177\5\f\7\2\u0177S\3\2\2\2\u0178"+
		"\u0179\7+\2\2\u0179U\3\2\2\2\u017a\u017b\7,\2\2\u017bW\3\2\2\2\u017c\u0180"+
		"\5Z.\2\u017d\u0180\5\\/\2\u017e\u0180\5^\60\2\u017f\u017c\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180Y\3\2\2\2\u0181\u0182\7\"\2\2"+
		"\u0182\u0183\5@!\2\u0183[\3\2\2\2\u0184\u0185\7\"\2\2\u0185\u0186\7\60"+
		"\2\2\u0186]\3\2\2\2\u0187\u0188\7\f\2\2\u0188\u0189\5\f\7\2\u0189\u018a"+
		"\7\r\2\2\u018a_\3\2\2\2\u018b\u018e\5b\62\2\u018c\u018e\5f\64\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018ea\3\2\2\2\u018f\u0190\7\"\2\2"+
		"\u0190\u0191\7\60\2\2\u0191\u0192\t\5\2\2\u0192\u0193\5d\63\2\u0193c\3"+
		"\2\2\2\u0194\u0195\5\f\7\2\u0195e\3\2\2\2\u0196\u0197\7\f\2\2\u0197\u0198"+
		"\5h\65\2\u0198\u0199\7\r\2\2\u0199\u019a\t\5\2\2\u019a\u019b\5j\66\2\u019b"+
		"g\3\2\2\2\u019c\u019d\5\f\7\2\u019di\3\2\2\2\u019e\u019f\5\f\7\2\u019f"+
		"k\3\2\2\2\u01a0\u01a4\5n8\2\u01a1\u01a4\5p9\2\u01a2\u01a4\5v<\2\u01a3"+
		"\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4m\3\2\2\2"+
		"\u01a5\u01a6\7$\2\2\u01a6o\3\2\2\2\u01a7\u01aa\5r:\2\u01a8\u01aa\5t;\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaq\3\2\2\2\u01ab\u01ac\7"+
		"#\2\2\u01ac\u01ad\7\60\2\2\u01ad\u01ae\7\30\2\2\u01ae\u01af\5\f\7\2\u01af"+
		"s\3\2\2\2\u01b0\u01b1\7#\2\2\u01b1\u01b2\7\60\2\2\u01b2u\3\2\2\2\u01b3"+
		"\u01b5\7&\2\2\u01b4\u01b6\5\f\7\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6w\3\2\2\2\u01b7\u01be\5z>\2\u01b8\u01be\5\u0080A\2\u01b9\u01be"+
		"\5\u0086D\2\u01ba\u01be\5\u0090I\2\u01bb\u01be\5\u0096L\2\u01bc\u01be"+
		"\5\u00a0Q\2\u01bd\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2\2"+
		"\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01bey"+
		"\3\2\2\2\u01bf\u01c0\7%\2\2\u01c0\u01c1\7\60\2\2\u01c1\u01c2\7\20\2\2"+
		"\u01c2\u01c3\5|?\2\u01c3\u01c4\7\21\2\2\u01c4\u01c5\7\16\2\2\u01c5\u01c6"+
		"\5~@\2\u01c6\u01c7\7\17\2\2\u01c7{\3\2\2\2\u01c8\u01cd\7\60\2\2\u01c9"+
		"\u01ca\7 \2\2\u01ca\u01cc\7\60\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1}\3\2\2\2"+
		"\u01d2\u01d3\5\4\3\2\u01d3\177\3\2\2\2\u01d4\u01d5\7\13\2\2\u01d5\u01d9"+
		"\7\16\2\2\u01d6\u01d8\5\u0082B\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2"+
		"\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01dd\7\17\2\2\u01dd\u0081\3\2\2\2\u01de\u01e2\7\60\2\2"+
		"\u01df\u01e1\5\u0084C\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u0083\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01e6\7!\2\2\u01e6\u01e7\5B\"\2\u01e7\u0085\3\2\2\2\u01e8\u01e9"+
		"\7)\2\2\u01e9\u01ea\7\20\2\2\u01ea\u01eb\5\u0088E\2\u01eb\u01ec\7\21\2"+
		"\2\u01ec\u01ed\5\u008aF\2\u01ed\u01ee\5\u008cG\2\u01ee\u0087\3\2\2\2\u01ef"+
		"\u01f0\5\f\7\2\u01f0\u0089\3\2\2\2\u01f1\u01f2\7\16\2\2\u01f2\u01f3\5"+
		"\4\3\2\u01f3\u01f4\7\17\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f7\5\6\4\2\u01f6"+
		"\u01f1\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u008b\3\2\2\2\u01f8\u01f9\7*"+
		"\2\2\u01f9\u01fb\5\u008eH\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u008d\3\2\2\2\u01fc\u01fd\7\16\2\2\u01fd\u01fe\5\4\3\2\u01fe\u01ff\7"+
		"\17\2\2\u01ff\u0202\3\2\2\2\u0200\u0202\5\6\4\2\u0201\u01fc\3\2\2\2\u0201"+
		"\u0200\3\2\2\2\u0202\u008f\3\2\2\2\u0203\u0204\7-\2\2\u0204\u0205\7\20"+
		"\2\2\u0205\u0206\5\u0092J\2\u0206\u0207\7\21\2\2\u0207\u0208\5\u0094K"+
		"\2\u0208\u0091\3\2\2\2\u0209\u020a\5\f\7\2\u020a\u0093\3\2\2\2\u020b\u020c"+
		"\7\16\2\2\u020c\u020d\5\4\3\2\u020d\u020e\7\17\2\2\u020e\u0211\3\2\2\2"+
		"\u020f\u0211\5\6\4\2\u0210\u020b\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0095"+
		"\3\2\2\2\u0212\u0213\7.\2\2\u0213\u0214\7\20\2\2\u0214\u0215\5\u0098M"+
		"\2\u0215\u0216\7\37\2\2\u0216\u0217\5\u009aN\2\u0217\u0218\7\37\2\2\u0218"+
		"\u0219\5\u009cO\2\u0219\u021a\7\21\2\2\u021a\u021b\7\16\2\2\u021b\u021c"+
		"\5\u009eP\2\u021c\u021d\7\17\2\2\u021d\u0097\3\2\2\2\u021e\u0220\5\b\5"+
		"\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0099\3\2\2\2\u0221\u0223"+
		"\5\f\7\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u009b\3\2\2\2\u0224"+
		"\u0226\5\b\5\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u009d\3\2"+
		"\2\2\u0227\u0228\7\16\2\2\u0228\u0229\5\4\3\2\u0229\u022a\7\17\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u022d\5\6\4\2\u022c\u0227\3\2\2\2\u022c\u022b\3\2"+
		"\2\2\u022d\u009f\3\2\2\2\u022e\u022f\7.\2\2\u022f\u0231\7\20\2\2\u0230"+
		"\u0232\7#\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\7\60\2\2\u0234\u0235\7/\2\2\u0235\u0236\5\f\7\2\u0236"+
		"\u0237\7\21\2\2\u0237\u0238\5\u00a2R\2\u0238\u00a1\3\2\2\2\u0239\u023a"+
		"\7\16\2\2\u023a\u023b\5\4\3\2\u023b\u023c\7\17\2\2\u023c\u023f\3\2\2\2"+
		"\u023d\u023f\5\6\4\2\u023e\u0239\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u00a3"+
		"\3\2\2\2-\u00a9\u00b0\u00b4\u00ba\u00c0\u00ca\u00d4\u00de\u00e8\u00f2"+
		"\u00fa\u0101\u0106\u011d\u0122\u0126\u013b\u013e\u0148\u0156\u0159\u016f"+
		"\u0172\u017f\u018d\u01a3\u01a9\u01b5\u01bd\u01cd\u01d0\u01d9\u01e2\u01f6"+
		"\u01fa\u0201\u0210\u021f\u0222\u0225\u022c\u0231\u023e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}