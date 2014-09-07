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
		BIN_OP1=1, BIN_OP2=2, HASH=3, OPEN_BRA=4, CLOSE_BRA=5, OPEN_PAR=6, CLOSE_PAR=7, 
		EQUALS=8, INT=9, SEMICOLON=10, COMMA=11, COLON=12, KW_VAR=13, KW_PAUSE=14, 
		KW_FUNCTION=15, KW_RETURN=16, KW_TRUE=17, KW_FALSE=18, KW_IF=19, KW_ELSE=20, 
		ID=21, WS=22, SINGLELINE_COMMENT=23, MULTI_LINE_COMMENT=24;
	public static final String[] tokenNames = {
		"<INVALID>", "BIN_OP1", "BIN_OP2", "'#'", "'{'", "'}'", "'('", "')'", 
		"'='", "INT", "';'", "','", "':'", "'var'", "'pause'", "'function'", "'return'", 
		"'true'", "'false'", "'if'", "'else'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programElements = 1, RULE_programElement = 2, RULE_topExpression = 3, 
		RULE_expression = 4, RULE_binaryExpression1 = 5, RULE_binaryExpression1Application = 6, 
		RULE_binaryExpression2 = 7, RULE_binaryExpression2Application = 8, RULE_binaryExpression2Operand = 9, 
		RULE_variableAssignment = 10, RULE_lookup = 11, RULE_thisMessageExchange = 12, 
		RULE_messageExchange = 13, RULE_literal = 14, RULE_bool = 15, RULE_integer = 16, 
		RULE_delimitedStatement = 17, RULE_pause = 18, RULE_variableStatement = 19, 
		RULE_variableDeclarationAndAssignment = 20, RULE_variableDeclaration = 21, 
		RULE_returnStatement = 22, RULE_undelimitedStatement = 23, RULE_functionDefinition = 24, 
		RULE_functionParameters = 25, RULE_functionBody = 26, RULE_primitiveBody = 27, 
		RULE_primitiveCall = 28, RULE_primitiveOperand = 29, RULE_ifStatement = 30, 
		RULE_ifStatementCondition = 31, RULE_ifStatementOnTrue = 32, RULE_elseStatement = 33, 
		RULE_ifStatementOnFalse = 34;
	public static final String[] ruleNames = {
		"program", "programElements", "programElement", "topExpression", "expression", 
		"binaryExpression1", "binaryExpression1Application", "binaryExpression2", 
		"binaryExpression2Application", "binaryExpression2Operand", "variableAssignment", 
		"lookup", "thisMessageExchange", "messageExchange", "literal", "bool", 
		"integer", "delimitedStatement", "pause", "variableStatement", "variableDeclarationAndAssignment", 
		"variableDeclaration", "returnStatement", "undelimitedStatement", "functionDefinition", 
		"functionParameters", "functionBody", "primitiveBody", "primitiveCall", 
		"primitiveOperand", "ifStatement", "ifStatementCondition", "ifStatementOnTrue", 
		"elseStatement", "ifStatementOnFalse"
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
			setState(70); programElements();
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASH) | (1L << INT) | (1L << KW_VAR) | (1L << KW_PAUSE) | (1L << KW_FUNCTION) | (1L << KW_RETURN) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_IF) | (1L << ID))) != 0)) {
				{
				{
				setState(72); programElement();
				}
				}
				setState(77);
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
			setState(85);
			switch (_input.LA(1)) {
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				switch (_input.LA(1)) {
				case INT:
				case KW_TRUE:
				case KW_FALSE:
				case ID:
					{
					setState(78); topExpression();
					}
					break;
				case KW_VAR:
				case KW_PAUSE:
				case KW_RETURN:
					{
					setState(79); delimitedStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); match(SEMICOLON);
				}
				break;
			case HASH:
			case KW_FUNCTION:
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); undelimitedStatement();
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
			setState(87); expression();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(89); binaryExpression1();
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
			setState(91); binaryExpression2();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(92); binaryExpression1Application();
					}
					} 
				}
				setState(97);
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
			setState(98); match(BIN_OP1);
			setState(99); binaryExpression2();
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
			setState(101); binaryExpression2Operand();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(102); binaryExpression2Application();
					}
					} 
				}
				setState(107);
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
			setState(108); match(BIN_OP2);
			setState(109); binaryExpression2Operand();
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); lookup();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); thisMessageExchange();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); literal();
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
			setState(117); match(ID);
			setState(118); match(EQUALS);
			setState(119); expression();
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
			setState(121); match(ID);
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
			setState(123); messageExchange();
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
			setState(125); match(ID);
			setState(126); match(OPEN_PAR);
			setState(127); expression();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128); match(COMMA);
				setState(129); expression();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(CLOSE_PAR);
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
			setState(139);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); integer();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); bool();
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
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 32, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(INT);
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
		enterRule(_localctx, 34, RULE_delimitedStatement);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case KW_PAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); pause();
				}
				break;
			case KW_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); variableStatement();
				}
				break;
			case KW_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(147); returnStatement();
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
		enterRule(_localctx, 36, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(KW_PAUSE);
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
		enterRule(_localctx, 38, RULE_variableStatement);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); variableDeclarationAndAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); variableDeclaration();
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
		enterRule(_localctx, 40, RULE_variableDeclarationAndAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(KW_VAR);
			setState(157); match(ID);
			setState(158); match(EQUALS);
			setState(159); expression();
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
		enterRule(_localctx, 42, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(KW_VAR);
			setState(162); match(ID);
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
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(KW_RETURN);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID))) != 0)) {
				{
				setState(165); expression();
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
		enterRule(_localctx, 46, RULE_undelimitedStatement);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case KW_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); functionDefinition();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); primitiveBody();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); ifStatement();
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
		enterRule(_localctx, 48, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(KW_FUNCTION);
			setState(174); match(ID);
			setState(175); match(OPEN_PAR);
			setState(176); functionParameters();
			setState(177); match(CLOSE_PAR);
			setState(178); match(OPEN_BRA);
			setState(179); functionBody();
			setState(180); match(CLOSE_BRA);
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
		enterRule(_localctx, 50, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(182); match(ID);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183); match(COMMA);
					setState(184); match(ID);
					}
					}
					setState(189);
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
		enterRule(_localctx, 52, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); programElements();
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
		enterRule(_localctx, 54, RULE_primitiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(HASH);
			setState(195); match(OPEN_BRA);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(196); primitiveCall();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202); match(CLOSE_BRA);
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
		enterRule(_localctx, 56, RULE_primitiveCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(205); primitiveOperand();
				}
				}
				setState(210);
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
		enterRule(_localctx, 58, RULE_primitiveOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211); match(COLON);
			setState(212); literal();
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
		enterRule(_localctx, 60, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(KW_IF);
			setState(215); match(OPEN_PAR);
			setState(216); ifStatementCondition();
			setState(217); match(CLOSE_PAR);
			setState(218); ifStatementOnTrue();
			setState(219); elseStatement();
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
		enterRule(_localctx, 62, RULE_ifStatementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); expression();
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
		enterRule(_localctx, 64, RULE_ifStatementOnTrue);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(OPEN_BRA);
				setState(224); programElements();
				setState(225); match(CLOSE_BRA);
				}
				break;
			case HASH:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); programElement();
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
		enterRule(_localctx, 66, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(230); match(KW_ELSE);
				setState(231); ifStatementOnFalse();
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
		enterRule(_localctx, 68, RULE_ifStatementOnFalse);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(234); match(OPEN_BRA);
				setState(235); programElements();
				setState(236); match(CLOSE_BRA);
				}
				}
				break;
			case HASH:
			case INT:
			case KW_VAR:
			case KW_PAUSE:
			case KW_FUNCTION:
			case KW_RETURN:
			case KW_TRUE:
			case KW_FALSE:
			case KW_IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); programElement();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00f4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3\4\5"+
		"\4S\n\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\6\3\6\3\7\3\7\7\7`\n\7\f\7\16\7"+
		"c\13\7\3\b\3\b\3\b\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\17\3\17\3\20\3"+
		"\20\5\20\u008e\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u0097\n\23"+
		"\3\24\3\24\3\25\3\25\5\25\u009d\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00a9\n\30\3\31\3\31\3\31\5\31\u00ae\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00bc\n\33"+
		"\f\33\16\33\u00bf\13\33\5\33\u00c1\n\33\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u00c8\n\35\f\35\16\35\u00cb\13\35\3\35\3\35\3\36\3\36\7\36\u00d1\n\36"+
		"\f\36\16\36\u00d4\13\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u00e7\n\"\3#\3#\5#\u00eb\n#\3$\3$\3$\3$\3$\5$\u00f2"+
		"\n$\3$\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\3\3\2\23\24\u00e7\2H\3\2\2\2\4M\3\2\2\2\6W\3\2\2\2\bY\3\2\2"+
		"\2\n[\3\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20g\3\2\2\2\22n\3\2\2\2\24u\3\2\2"+
		"\2\26w\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\177\3\2\2\2\36\u008d\3\2\2\2"+
		" \u008f\3\2\2\2\"\u0091\3\2\2\2$\u0096\3\2\2\2&\u0098\3\2\2\2(\u009c\3"+
		"\2\2\2*\u009e\3\2\2\2,\u00a3\3\2\2\2.\u00a6\3\2\2\2\60\u00ad\3\2\2\2\62"+
		"\u00af\3\2\2\2\64\u00c0\3\2\2\2\66\u00c2\3\2\2\28\u00c4\3\2\2\2:\u00ce"+
		"\3\2\2\2<\u00d5\3\2\2\2>\u00d8\3\2\2\2@\u00df\3\2\2\2B\u00e6\3\2\2\2D"+
		"\u00ea\3\2\2\2F\u00f1\3\2\2\2HI\5\4\3\2I\3\3\2\2\2JL\5\6\4\2KJ\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2\2\2PS\5\b\5\2QS\5$\23"+
		"\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TU\7\f\2\2UX\3\2\2\2VX\5\60\31\2WR\3\2"+
		"\2\2WV\3\2\2\2X\7\3\2\2\2YZ\5\n\6\2Z\t\3\2\2\2[\\\5\f\7\2\\\13\3\2\2\2"+
		"]a\5\20\t\2^`\5\16\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2"+
		"\2\2ca\3\2\2\2de\7\3\2\2ef\5\20\t\2f\17\3\2\2\2gk\5\24\13\2hj\5\22\n\2"+
		"ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mk\3\2\2\2no\7\4\2"+
		"\2op\5\24\13\2p\23\3\2\2\2qv\5\26\f\2rv\5\30\r\2sv\5\32\16\2tv\5\36\20"+
		"\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\25\3\2\2\2wx\7\27\2\2xy\7"+
		"\n\2\2yz\5\n\6\2z\27\3\2\2\2{|\7\27\2\2|\31\3\2\2\2}~\5\34\17\2~\33\3"+
		"\2\2\2\177\u0080\7\27\2\2\u0080\u0081\7\b\2\2\u0081\u0086\5\n\6\2\u0082"+
		"\u0083\7\r\2\2\u0083\u0085\5\n\6\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\t\2\2\u008a\35\3\2\2\2\u008b\u008e\5\"\22"+
		"\2\u008c\u008e\5 \21\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\37"+
		"\3\2\2\2\u008f\u0090\t\2\2\2\u0090!\3\2\2\2\u0091\u0092\7\13\2\2\u0092"+
		"#\3\2\2\2\u0093\u0097\5&\24\2\u0094\u0097\5(\25\2\u0095\u0097\5.\30\2"+
		"\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097%\3"+
		"\2\2\2\u0098\u0099\7\20\2\2\u0099\'\3\2\2\2\u009a\u009d\5*\26\2\u009b"+
		"\u009d\5,\27\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d)\3\2\2\2"+
		"\u009e\u009f\7\17\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2"+
		"\5\n\6\2\u00a2+\3\2\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\7\27\2\2\u00a5"+
		"-\3\2\2\2\u00a6\u00a8\7\22\2\2\u00a7\u00a9\5\n\6\2\u00a8\u00a7\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9/\3\2\2\2\u00aa\u00ae\5\62\32\2\u00ab\u00ae"+
		"\58\35\2\u00ac\u00ae\5> \2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\61\3\2\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7\27"+
		"\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\5\64\33\2\u00b3\u00b4\7\t\2\2\u00b4"+
		"\u00b5\7\6\2\2\u00b5\u00b6\5\66\34\2\u00b6\u00b7\7\7\2\2\u00b7\63\3\2"+
		"\2\2\u00b8\u00bd\7\27\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bc\7\27\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\65\3\2\2\2\u00c2\u00c3\5\4\3\2\u00c3\67\3\2\2\2\u00c4"+
		"\u00c5\7\5\2\2\u00c5\u00c9\7\6\2\2\u00c6\u00c8\5:\36\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd9\3\2\2\2"+
		"\u00ce\u00d2\7\27\2\2\u00cf\u00d1\5<\37\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3;\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\5\36\20\2\u00d7=\3\2\2"+
		"\2\u00d8\u00d9\7\25\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\5@!\2\u00db\u00dc"+
		"\7\t\2\2\u00dc\u00dd\5B\"\2\u00dd\u00de\5D#\2\u00de?\3\2\2\2\u00df\u00e0"+
		"\5\n\6\2\u00e0A\3\2\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\4\3\2\u00e3"+
		"\u00e4\7\7\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\6\4\2\u00e6\u00e1\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7C\3\2\2\2\u00e8\u00e9\7\26\2\2\u00e9\u00eb"+
		"\5F$\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebE\3\2\2\2\u00ec\u00ed"+
		"\7\6\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00ef\7\7\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00f2\5\6\4\2\u00f1\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2G\3\2\2\2"+
		"\25MRWaku\u0086\u008d\u0096\u009c\u00a8\u00ad\u00bd\u00c0\u00c9\u00d2"+
		"\u00e6\u00ea\u00f1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}