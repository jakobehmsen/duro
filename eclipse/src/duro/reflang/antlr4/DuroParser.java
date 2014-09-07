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
		STRING_LITERAL=1, LINE_TERMINATOR=2, BIN_OP1=3, BIN_OP2=4, HASH=5, OPEN_SQ=6, 
		CLOSE_SQ=7, OPEN_BRA=8, CLOSE_BRA=9, OPEN_PAR=10, CLOSE_PAR=11, EQUALS=12, 
		INT=13, SEMICOLON=14, COMMA=15, COLON=16, KW_VAR=17, KW_PAUSE=18, KW_FUNCTION=19, 
		KW_RETURN=20, KW_TRUE=21, KW_FALSE=22, KW_IF=23, KW_ELSE=24, KW_THIS=25, 
		KW_WHILE=26, ID=27, WS=28, SINGLELINE_COMMENT=29, MULTI_LINE_COMMENT=30;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_LITERAL", "LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", 
		"','", "':'", "'var'", "'pause'", "'function'", "'return'", "'true'", 
		"'false'", "'if'", "'else'", "'this'", "'while'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElement = 2, RULE_topExpression = 3, 
		RULE_expression = 4, RULE_binaryExpression1 = 5, RULE_binaryExpression1Application = 6, 
		RULE_binaryExpression2 = 7, RULE_binaryExpression2Application = 8, RULE_binaryExpression2Operand = 9, 
		RULE_variableAssignment = 10, RULE_lookup = 11, RULE_thisMessageExchange = 12, 
		RULE_messageExchange = 13, RULE_literal = 14, RULE_integer = 15, RULE_bool = 16, 
		RULE_string = 17, RULE_self = 18, RULE_delimitedStatement = 19, RULE_pause = 20, 
		RULE_variableStatement = 21, RULE_variableDeclarationAndAssignment = 22, 
		RULE_variableDeclaration = 23, RULE_returnStatement = 24, RULE_undelimitedStatement = 25, 
		RULE_functionDefinition = 26, RULE_functionParameters = 27, RULE_functionBody = 28, 
		RULE_primitiveBody = 29, RULE_primitiveCall = 30, RULE_primitiveOperand = 31, 
		RULE_ifStatement = 32, RULE_ifStatementCondition = 33, RULE_ifStatementOnTrue = 34, 
		RULE_elseStatement = 35, RULE_ifStatementOnFalse = 36, RULE_whileStatement = 37, 
		RULE_whileStatementCondition = 38, RULE_whileStatementBody = 39, RULE_operationChain = 40, 
		RULE_propertySet = 41, RULE_propertyGet = 42;
	public static final String[] ruleNames = {
		"program", "programElements", "programElement", "topExpression", "expression", 
		"binaryExpression1", "binaryExpression1Application", "binaryExpression2", 
		"binaryExpression2Application", "binaryExpression2Operand", "variableAssignment", 
		"lookup", "thisMessageExchange", "messageExchange", "literal", "integer", 
		"bool", "string", "self", "delimitedStatement", "pause", "variableStatement", 
		"variableDeclarationAndAssignment", "variableDeclaration", "returnStatement", 
		"undelimitedStatement", "functionDefinition", "functionParameters", "functionBody", 
		"primitiveBody", "primitiveCall", "primitiveOperand", "ifStatement", "ifStatementCondition", 
		"ifStatementOnTrue", "elseStatement", "ifStatementOnFalse", "whileStatement", 
		"whileStatementCondition", "whileStatementBody", "operationChain", "propertySet", 
		"propertyGet"
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
			setState(86); programElements();
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << HASH) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << KW_THIS) | (1L << KW_WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(88); programElement();
				}
				}
				setState(93);
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
		public TopExpressionContext topExpression() {
			return getRuleContext(TopExpressionContext.class,0);
		}
		public UndelimitedStatementContext undelimitedStatement() {
			return getRuleContext(UndelimitedStatementContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
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
			setState(101);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_THIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case INT:
				case KW_TRUE:
				case KW_FALSE:
				case KW_THIS:
				case ID:
					{
					setState(94); topExpression();
					}
					break;
				case KW_VAR:
				case KW_PAUSE:
				case KW_RETURN:
					{
					setState(95); delimitedStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); match(SEMICOLON);
				}
				break;
			case HASH:
			case KW_FUNCTION:
			case KW_IF:
			case KW_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); undelimitedStatement();
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
		enterRule(_localctx, 6, RULE_topExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); expression();
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
		public BinaryExpression1Context binaryExpression1() {
			return getRuleContext(BinaryExpression1Context.class,0);
		}
		public List<OperationChainContext> operationChain() {
			return getRuleContexts(OperationChainContext.class);
		}
		public OperationChainContext operationChain(int i) {
			return getRuleContext(OperationChainContext.class,i);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); binaryExpression1();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(106); operationChain();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class BinaryExpression1Context extends ParserRuleContext {
		public List<BinaryExpression1ApplicationContext> binaryExpression1Application() {
			return getRuleContexts(BinaryExpression1ApplicationContext.class);
		}
		public BinaryExpression1ApplicationContext binaryExpression1Application(int i) {
			return getRuleContext(BinaryExpression1ApplicationContext.class,i);
		}
		public BinaryExpression2Context binaryExpression2() {
			return getRuleContext(BinaryExpression2Context.class,0);
		}
		public BinaryExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpression1Context binaryExpression1() throws RecognitionException {
		BinaryExpression1Context _localctx = new BinaryExpression1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryExpression1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); binaryExpression2();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(113); binaryExpression1Application();
					}
					} 
				}
				setState(118);
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

	public static class BinaryExpression1ApplicationContext extends ParserRuleContext {
		public TerminalNode BIN_OP1() { return getToken(DuroParser.BIN_OP1, 0); }
		public BinaryExpression2Context binaryExpression2() {
			return getRuleContext(BinaryExpression2Context.class,0);
		}
		public BinaryExpression1ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression1Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression1Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression1Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression1Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpression1ApplicationContext binaryExpression1Application() throws RecognitionException {
		BinaryExpression1ApplicationContext _localctx = new BinaryExpression1ApplicationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binaryExpression1Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(BIN_OP1);
			setState(120); binaryExpression2();
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

	public static class BinaryExpression2Context extends ParserRuleContext {
		public BinaryExpression2ApplicationContext binaryExpression2Application(int i) {
			return getRuleContext(BinaryExpression2ApplicationContext.class,i);
		}
		public List<BinaryExpression2ApplicationContext> binaryExpression2Application() {
			return getRuleContexts(BinaryExpression2ApplicationContext.class);
		}
		public BinaryExpression2OperandContext binaryExpression2Operand() {
			return getRuleContext(BinaryExpression2OperandContext.class,0);
		}
		public BinaryExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpression2Context binaryExpression2() throws RecognitionException {
		BinaryExpression2Context _localctx = new BinaryExpression2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_binaryExpression2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122); binaryExpression2Operand();
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); binaryExpression2Application();
					}
					} 
				}
				setState(128);
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

	public static class BinaryExpression2ApplicationContext extends ParserRuleContext {
		public TerminalNode BIN_OP2() { return getToken(DuroParser.BIN_OP2, 0); }
		public BinaryExpression2OperandContext binaryExpression2Operand() {
			return getRuleContext(BinaryExpression2OperandContext.class,0);
		}
		public BinaryExpression2ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression2Application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression2Application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression2Application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression2Application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpression2ApplicationContext binaryExpression2Application() throws RecognitionException {
		BinaryExpression2ApplicationContext _localctx = new BinaryExpression2ApplicationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binaryExpression2Application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(BIN_OP2);
			setState(130); binaryExpression2Operand();
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

	public static class BinaryExpression2OperandContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ThisMessageExchangeContext thisMessageExchange() {
			return getRuleContext(ThisMessageExchangeContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public BinaryExpression2OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression2Operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryExpression2Operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryExpression2Operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryExpression2Operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpression2OperandContext binaryExpression2Operand() throws RecognitionException {
		BinaryExpression2OperandContext _localctx = new BinaryExpression2OperandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binaryExpression2Operand);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); lookup();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); thisMessageExchange();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); self();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DuroParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(ID);
			setState(140); match(EQUALS);
			setState(141); expression();
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
		enterRule(_localctx, 22, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(ID);
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
		enterRule(_localctx, 24, RULE_thisMessageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); messageExchange();
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
		enterRule(_localctx, 26, RULE_messageExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(ID);
			setState(148); match(OPEN_PAR);
			setState(149); expression();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150); match(COMMA);
				setState(151); expression();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); match(CLOSE_PAR);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
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
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); integer();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); bool();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(161); string();
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
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(INT);
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
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(STRING_LITERAL);
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
		enterRule(_localctx, 36, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(KW_THIS);
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
		enterRule(_localctx, 38, RULE_delimitedStatement);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); returnStatement();
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
		enterRule(_localctx, 40, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(KW_PAUSE);
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
		enterRule(_localctx, 42, RULE_variableStatement);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); variableDeclaration();
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
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
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
		enterRule(_localctx, 44, RULE_variableDeclarationAndAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(KW_VAR);
			setState(184); match(ID);
			setState(185); match(EQUALS);
			setState(186); expression();
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
		enterRule(_localctx, 46, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(KW_VAR);
			setState(189); match(ID);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(KW_RETURN);
			setState(193);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << INT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_THIS) | (1L << ID))) != 0)) {
				{
				setState(192); expression();
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
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
		enterRule(_localctx, 50, RULE_undelimitedStatement);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); functionDefinition();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); primitiveBody();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); ifStatement();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(198); whileStatement();
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
		enterRule(_localctx, 52, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(KW_FUNCTION);
			setState(202); match(ID);
			setState(203); match(OPEN_PAR);
			setState(204); functionParameters();
			setState(205); match(CLOSE_PAR);
			setState(206); match(OPEN_BRA);
			setState(207); functionBody();
			setState(208); match(CLOSE_BRA);
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
		enterRule(_localctx, 54, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(210); match(ID);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211); match(COMMA);
					setState(212); match(ID);
					}
					}
					setState(217);
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
		enterRule(_localctx, 56, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); programElements();
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
		enterRule(_localctx, 58, RULE_primitiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(HASH);
			setState(223); match(OPEN_BRA);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(224); primitiveCall();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230); match(CLOSE_BRA);
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
		enterRule(_localctx, 60, RULE_primitiveCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(ID);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(233); primitiveOperand();
				}
				}
				setState(238);
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
		enterRule(_localctx, 62, RULE_primitiveOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239); match(COLON);
			setState(240); literal();
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
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(KW_IF);
			setState(243); match(OPEN_PAR);
			setState(244); ifStatementCondition();
			setState(245); match(CLOSE_PAR);
			setState(246); ifStatementOnTrue();
			setState(247); elseStatement();
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
		enterRule(_localctx, 66, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); expression();
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
		enterRule(_localctx, 68, RULE_ifStatementOnTrue);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(OPEN_BRA);
				setState(252); programElements();
				setState(253); match(CLOSE_BRA);
				}
				break;
			case STRING_LITERAL:
			case HASH:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_IF:
			case KW_THIS:
			case KW_WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); programElement();
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
		enterRule(_localctx, 70, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(258); match(KW_ELSE);
				setState(259); ifStatementOnFalse();
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
		enterRule(_localctx, 72, RULE_ifStatementOnFalse);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(262); match(OPEN_BRA);
				setState(263); programElements();
				setState(264); match(CLOSE_BRA);
				}
				}
				break;
			case STRING_LITERAL:
			case HASH:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_IF:
			case KW_THIS:
			case KW_WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); programElement();
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
		enterRule(_localctx, 74, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(KW_WHILE);
			setState(270); match(OPEN_PAR);
			setState(271); whileStatementCondition();
			setState(272); match(CLOSE_PAR);
			setState(273); whileStatementBody();
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
		enterRule(_localctx, 76, RULE_whileStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); expression();
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
		enterRule(_localctx, 78, RULE_whileStatementBody);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(OPEN_BRA);
				setState(278); programElements();
				setState(279); match(CLOSE_BRA);
				}
				break;
			case STRING_LITERAL:
			case HASH:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_IF:
			case KW_THIS:
			case KW_WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); programElement();
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

	public static class OperationChainContext extends ParserRuleContext {
		public PropertyGetContext propertyGet() {
			return getRuleContext(PropertyGetContext.class,0);
		}
		public PropertySetContext propertySet() {
			return getRuleContext(PropertySetContext.class,0);
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
		enterRule(_localctx, 80, RULE_operationChain);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); propertySet();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); propertyGet();
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

	public static class PropertySetContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DuroParser.EQUALS, 0); }
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PropertySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPropertySet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPropertySet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPropertySet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySetContext propertySet() throws RecognitionException {
		PropertySetContext _localctx = new PropertySetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_propertySet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(OPEN_SQ);
			setState(289); expression();
			setState(290); match(CLOSE_SQ);
			setState(291); match(EQUALS);
			setState(292); expression();
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

	public static class PropertyGetContext extends ParserRuleContext {
		public TerminalNode OPEN_SQ() { return getToken(DuroParser.OPEN_SQ, 0); }
		public TerminalNode CLOSE_SQ() { return getToken(DuroParser.CLOSE_SQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPropertyGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPropertyGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPropertyGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyGetContext propertyGet() throws RecognitionException {
		PropertyGetContext _localctx = new PropertyGetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(OPEN_SQ);
			setState(295); expression();
			setState(296); match(CLOSE_SQ);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\4\3\4\5\4c\n\4\3\4\3\4\3\4"+
		"\5\4h\n\4\3\5\3\5\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7\7\7u\n\7\f\7"+
		"\16\7x\13\7\3\b\3\b\3\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u009b\n\17\f\17\16\17\u009e"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26\3\27\3\27"+
		"\5\27\u00b8\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\5\32"+
		"\u00c4\n\32\3\33\3\33\3\33\3\33\5\33\u00ca\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u00d8\n\35\f\35\16\35\u00db"+
		"\13\35\5\35\u00dd\n\35\3\36\3\36\3\37\3\37\3\37\7\37\u00e4\n\37\f\37\16"+
		"\37\u00e7\13\37\3\37\3\37\3 \3 \7 \u00ed\n \f \16 \u00f0\13 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\5$\u0103\n$\3%\3%\5"+
		"%\u0107\n%\3&\3&\3&\3&\3&\5&\u010e\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\5)\u011d\n)\3*\3*\5*\u0121\n*\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTV\2\3\3\2\27\30\u011e\2X\3\2\2\2\4]\3\2\2\2\6g\3\2\2\2"+
		"\bi\3\2\2\2\nk\3\2\2\2\fr\3\2\2\2\16y\3\2\2\2\20|\3\2\2\2\22\u0083\3\2"+
		"\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u0091\3\2\2\2\32\u0093\3\2\2"+
		"\2\34\u0095\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00a8\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00ac\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00b7\3\2\2\2."+
		"\u00b9\3\2\2\2\60\u00be\3\2\2\2\62\u00c1\3\2\2\2\64\u00c9\3\2\2\2\66\u00cb"+
		"\3\2\2\28\u00dc\3\2\2\2:\u00de\3\2\2\2<\u00e0\3\2\2\2>\u00ea\3\2\2\2@"+
		"\u00f1\3\2\2\2B\u00f4\3\2\2\2D\u00fb\3\2\2\2F\u0102\3\2\2\2H\u0106\3\2"+
		"\2\2J\u010d\3\2\2\2L\u010f\3\2\2\2N\u0115\3\2\2\2P\u011c\3\2\2\2R\u0120"+
		"\3\2\2\2T\u0122\3\2\2\2V\u0128\3\2\2\2XY\5\4\3\2Y\3\3\2\2\2Z\\\5\6\4\2"+
		"[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\5\3\2\2\2_]\3\2\2\2`c\5\b\5"+
		"\2ac\5(\25\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2de\7\20\2\2eh\3\2\2\2fh\5\64"+
		"\33\2gb\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\5\n\6\2j\t\3\2\2\2ko\5\f\7\2ln"+
		"\5R*\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2r"+
		"v\5\20\t\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2"+
		"\2xv\3\2\2\2yz\7\5\2\2z{\5\20\t\2{\17\3\2\2\2|\u0080\5\24\13\2}\177\5"+
		"\22\n\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\6\2\2\u0084\u0085"+
		"\5\24\13\2\u0085\23\3\2\2\2\u0086\u008c\5\26\f\2\u0087\u008c\5\30\r\2"+
		"\u0088\u008c\5\32\16\2\u0089\u008c\5\36\20\2\u008a\u008c\5&\24\2\u008b"+
		"\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\25\3\2\2\2\u008d\u008e\7\35\2\2\u008e\u008f"+
		"\7\16\2\2\u008f\u0090\5\n\6\2\u0090\27\3\2\2\2\u0091\u0092\7\35\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0094\5\34\17\2\u0094\33\3\2\2\2\u0095\u0096\7\35\2"+
		"\2\u0096\u0097\7\f\2\2\u0097\u009c\5\n\6\2\u0098\u0099\7\21\2\2\u0099"+
		"\u009b\5\n\6\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\r\2\2\u00a0\35\3\2\2\2\u00a1\u00a5\5 \21\2\u00a2\u00a5\5\"\22"+
		"\2\u00a3\u00a5\5$\23\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\17\2\2\u00a7!\3\2\2\2\u00a8\u00a9"+
		"\t\2\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\3\2\2\u00ab%\3\2\2\2\u00ac\u00ad"+
		"\7\33\2\2\u00ad\'\3\2\2\2\u00ae\u00b2\5*\26\2\u00af\u00b2\5,\27\2\u00b0"+
		"\u00b2\5\62\32\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4+\3\2\2\2\u00b5\u00b8"+
		"\5.\30\2\u00b6\u00b8\5\60\31\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8-\3\2\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc"+
		"\7\16\2\2\u00bc\u00bd\5\n\6\2\u00bd/\3\2\2\2\u00be\u00bf\7\23\2\2\u00bf"+
		"\u00c0\7\35\2\2\u00c0\61\3\2\2\2\u00c1\u00c3\7\26\2\2\u00c2\u00c4\5\n"+
		"\6\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\63\3\2\2\2\u00c5\u00ca"+
		"\5\66\34\2\u00c6\u00ca\5<\37\2\u00c7\u00ca\5B\"\2\u00c8\u00ca\5L\'\2\u00c9"+
		"\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\65\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00cd\7\35\2\2\u00cd"+
		"\u00ce\7\f\2\2\u00ce\u00cf\58\35\2\u00cf\u00d0\7\r\2\2\u00d0\u00d1\7\n"+
		"\2\2\u00d1\u00d2\5:\36\2\u00d2\u00d3\7\13\2\2\u00d3\67\3\2\2\2\u00d4\u00d9"+
		"\7\35\2\2\u00d5\u00d6\7\21\2\2\u00d6\u00d8\7\35\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"9\3\2\2\2\u00de\u00df\5\4\3\2\u00df;\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1"+
		"\u00e5\7\n\2\2\u00e2\u00e4\5> \2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9=\3\2\2\2\u00ea\u00ee\7\35\2\2\u00eb"+
		"\u00ed\5@!\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00ef?\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2"+
		"\7\22\2\2\u00f2\u00f3\5\36\20\2\u00f3A\3\2\2\2\u00f4\u00f5\7\31\2\2\u00f5"+
		"\u00f6\7\f\2\2\u00f6\u00f7\5D#\2\u00f7\u00f8\7\r\2\2\u00f8\u00f9\5F$\2"+
		"\u00f9\u00fa\5H%\2\u00faC\3\2\2\2\u00fb\u00fc\5\n\6\2\u00fcE\3\2\2\2\u00fd"+
		"\u00fe\7\n\2\2\u00fe\u00ff\5\4\3\2\u00ff\u0100\7\13\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u0103\5\6\4\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"G\3\2\2\2\u0104\u0105\7\32\2\2\u0105\u0107\5J&\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107I\3\2\2\2\u0108\u0109\7\n\2\2\u0109\u010a\5\4\3\2"+
		"\u010a\u010b\7\13\2\2\u010b\u010e\3\2\2\2\u010c\u010e\5\6\4\2\u010d\u0108"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010eK\3\2\2\2\u010f\u0110\7\34\2\2\u0110"+
		"\u0111\7\f\2\2\u0111\u0112\5N(\2\u0112\u0113\7\r\2\2\u0113\u0114\5P)\2"+
		"\u0114M\3\2\2\2\u0115\u0116\5\n\6\2\u0116O\3\2\2\2\u0117\u0118\7\n\2\2"+
		"\u0118\u0119\5\4\3\2\u0119\u011a\7\13\2\2\u011a\u011d\3\2\2\2\u011b\u011d"+
		"\5\6\4\2\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2\u011dQ\3\2\2\2\u011e"+
		"\u0121\5T+\2\u011f\u0121\5V,\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2"+
		"\u0121S\3\2\2\2\u0122\u0123\7\b\2\2\u0123\u0124\5\n\6\2\u0124\u0125\7"+
		"\t\2\2\u0125\u0126\7\16\2\2\u0126\u0127\5\n\6\2\u0127U\3\2\2\2\u0128\u0129"+
		"\7\b\2\2\u0129\u012a\5\n\6\2\u012a\u012b\7\t\2\2\u012bW\3\2\2\2\30]bg"+
		"ov\u0080\u008b\u009c\u00a4\u00b1\u00b7\u00c3\u00c9\u00d9\u00dc\u00e5\u00ee"+
		"\u0102\u0106\u010d\u011c\u0120";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}