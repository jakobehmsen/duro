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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PIPE=6, HASH=7, AT=8, 
		DOT=9, SINGLE_QUOTE=10, COMMA=11, COLON=12, SEMI_COLON=13, BACK_SLASH=14, 
		DOLLAR=15, PAR_OP=16, PAR_CL=17, SQ_OP=18, SQ_CL=19, BRA_OP=20, BRA_CL=21, 
		BIN_OP=22, ASSIGN=23, ASSIGN_PROTO=24, ASSIGN_QUOTED=25, WS=26, SINGLELINE_COMMENT=27, 
		MULTI_LINE_COMMENT=28, STRING=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'|'", 
		"'#'", "'@'", "'.'", "'''", "','", "':'", "';'", "'\\'", "'$'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expressionReceiver = 2, RULE_assignment = 3, 
		RULE_assignmentOperator = 4, RULE_interfaceId = 5, RULE_messageExchange = 6, 
		RULE_messageChain = 7, RULE_messageEnd = 8, RULE_binaryMessageChain = 9, 
		RULE_expressionChain = 10, RULE_receiver = 11, RULE_selfMultiKeyMessage = 12, 
		RULE_variableDeclaration = 13, RULE_access = 14, RULE_grouping = 15, RULE_multiKeyMessage = 16, 
		RULE_multiKeyMessageHead = 17, RULE_multiKeyMessageTail = 18, RULE_multiKeyMessageModifier = 19, 
		RULE_multiKeyMessageArgs = 20, RULE_multiKeyMessageArg = 21, RULE_multiKeyMessageArgReceiver = 22, 
		RULE_multiKeyMessageArgChain = 23, RULE_multiKeyMessageArgEnd = 24, RULE_atom = 25, 
		RULE_selfSingleKeyMessage = 26, RULE_singleKeyMessage = 27, RULE_unaryMessage = 28, 
		RULE_slotAccess = 29, RULE_indexAccess = 30, RULE_binaryMessage = 31, 
		RULE_binaryMessageArg = 32, RULE_binaryMessageArgChain = 33, RULE_binaryMessageArgEnd = 34, 
		RULE_indexAssignment = 35, RULE_slotAssignment = 36, RULE_literal = 37, 
		RULE_integer = 38, RULE_string = 39, RULE_dict = 40, RULE_dictEntry = 41, 
		RULE_closure = 42, RULE_behaviorParams = 43, RULE_array = 44, RULE_pseudoVar = 45, 
		RULE_parArg = 46, RULE_id = 47, RULE_selector = 48, RULE_binaryOperator = 49, 
		RULE_indexOperator = 50;
	public static final String[] ruleNames = {
		"program", "expression", "expressionReceiver", "assignment", "assignmentOperator", 
		"interfaceId", "messageExchange", "messageChain", "messageEnd", "binaryMessageChain", 
		"expressionChain", "receiver", "selfMultiKeyMessage", "variableDeclaration", 
		"access", "grouping", "multiKeyMessage", "multiKeyMessageHead", "multiKeyMessageTail", 
		"multiKeyMessageModifier", "multiKeyMessageArgs", "multiKeyMessageArg", 
		"multiKeyMessageArgReceiver", "multiKeyMessageArgChain", "multiKeyMessageArgEnd", 
		"atom", "selfSingleKeyMessage", "singleKeyMessage", "unaryMessage", "slotAccess", 
		"indexAccess", "binaryMessage", "binaryMessageArg", "binaryMessageArgChain", 
		"binaryMessageArgEnd", "indexAssignment", "slotAssignment", "literal", 
		"integer", "string", "dict", "dictEntry", "closure", "behaviorParams", 
		"array", "pseudoVar", "parArg", "id", "selector", "binaryOperator", "indexOperator"
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(102); expression();
				}
				}
				setState(107);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionReceiverContext expressionReceiver() {
			return getRuleContext(ExpressionReceiverContext.class,0);
		}
		public List<ExpressionChainContext> expressionChain() {
			return getRuleContexts(ExpressionChainContext.class);
		}
		public ExpressionChainContext expressionChain(int i) {
			return getRuleContext(ExpressionChainContext.class,i);
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
		enterRule(_localctx, 2, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); expressionReceiver();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(109); expressionChain();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionReceiverContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SelfMultiKeyMessageContext selfMultiKeyMessage() {
			return getRuleContext(SelfMultiKeyMessageContext.class,0);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
		}
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
		}
		public ExpressionReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpressionReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpressionReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpressionReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionReceiverContext expressionReceiver() throws RecognitionException {
		ExpressionReceiverContext _localctx = new ExpressionReceiverContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionReceiver);
		try {
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); selfMultiKeyMessage();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118); interfaceId();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119); messageExchange();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); id();
			setState(123); assignmentOperator();
			setState(124); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((AssignmentOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_PROTO) | (1L << ASSIGN_QUOTED))) != 0)) ) {
				((AssignmentOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(127); behaviorParams();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DOLLAR() { return getToken(DuroParser.DOLLAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_interfaceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(DOLLAR);
			setState(130); id();
			setState(131); expression();
			}
		}
		catch (RecognitionException re) {
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
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public List<MessageChainContext> messageChain() {
			return getRuleContexts(MessageChainContext.class);
		}
		public MessageChainContext messageChain(int i) {
			return getRuleContext(MessageChainContext.class,i);
		}
		public MessageEndContext messageEnd() {
			return getRuleContext(MessageEndContext.class,0);
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
		enterRule(_localctx, 12, RULE_messageExchange);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133); receiver();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(134); messageChain();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(140); messageEnd();
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

	public static class MessageChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public MessageChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageChainContext messageChain() throws RecognitionException {
		MessageChainContext _localctx = new MessageChainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_messageChain);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(DOT);
				setState(144); unaryMessage();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); indexAccess();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); slotAccess();
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

	public static class MessageEndContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public MultiKeyMessageContext multiKeyMessage() {
			return getRuleContext(MultiKeyMessageContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public BinaryMessageChainContext binaryMessageChain() {
			return getRuleContext(BinaryMessageChainContext.class,0);
		}
		public MessageEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMessageEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMessageEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMessageEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageEndContext messageEnd() throws RecognitionException {
		MessageEndContext _localctx = new MessageEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_messageEnd);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); match(DOT);
				setState(150); multiKeyMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); indexAssignment();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(153); binaryMessageChain();
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

	public static class BinaryMessageChainContext extends ParserRuleContext {
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public BinaryMessageChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageChainContext binaryMessageChain() throws RecognitionException {
		BinaryMessageChainContext _localctx = new BinaryMessageChainContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binaryMessageChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156); binaryMessage();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public MultiKeyMessageContext multiKeyMessage() {
			return getRuleContext(MultiKeyMessageContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DuroParser.SEMI_COLON, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public BinaryMessageChainContext binaryMessageChain() {
			return getRuleContext(BinaryMessageChainContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public ExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionChainContext expressionChain() throws RecognitionException {
		ExpressionChainContext _localctx = new ExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(SEMI_COLON);
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(162); multiKeyMessage();
				}
				break;

			case 2:
				{
				setState(163); unaryMessage();
				}
				break;

			case 3:
				{
				setState(164); indexAssignment();
				}
				break;

			case 4:
				{
				setState(165); indexAccess();
				}
				break;

			case 5:
				{
				setState(166); slotAssignment();
				}
				break;

			case 6:
				{
				setState(167); slotAccess();
				}
				break;

			case 7:
				{
				setState(168); binaryMessageChain();
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

	public static class ReceiverContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfMultiKeyMessageContext extends ParserRuleContext {
		public MultiKeyMessageContext multiKeyMessage() {
			return getRuleContext(MultiKeyMessageContext.class,0);
		}
		public SelfMultiKeyMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfMultiKeyMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfMultiKeyMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfMultiKeyMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfMultiKeyMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfMultiKeyMessageContext selfMultiKeyMessage() throws RecognitionException {
		SelfMultiKeyMessageContext _localctx = new SelfMultiKeyMessageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selfMultiKeyMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); multiKeyMessage();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(DuroParser.VAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(VAR);
			setState(176); id();
			setState(179);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(177); match(ASSIGN);
				setState(178); expression();
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

	public static class AccessContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); id();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
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
		enterRule(_localctx, 30, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(PAR_OP);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184); expression();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(189); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiKeyMessageContext extends ParserRuleContext {
		public MultiKeyMessageTailContext multiKeyMessageTail(int i) {
			return getRuleContext(MultiKeyMessageTailContext.class,i);
		}
		public List<MultiKeyMessageTailContext> multiKeyMessageTail() {
			return getRuleContexts(MultiKeyMessageTailContext.class);
		}
		public MultiKeyMessageHeadContext multiKeyMessageHead() {
			return getRuleContext(MultiKeyMessageHeadContext.class,0);
		}
		public MultiKeyMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageContext multiKeyMessage() throws RecognitionException {
		MultiKeyMessageContext _localctx = new MultiKeyMessageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiKeyMessage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); multiKeyMessageHead();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(192); multiKeyMessageTail();
					}
					} 
				}
				setState(197);
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

	public static class MultiKeyMessageHeadContext extends ParserRuleContext {
		public MultiKeyMessageArgsContext multiKeyMessageArgs() {
			return getRuleContext(MultiKeyMessageArgsContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public MultiKeyMessageModifierContext multiKeyMessageModifier() {
			return getRuleContext(MultiKeyMessageModifierContext.class,0);
		}
		public MultiKeyMessageHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageHeadContext multiKeyMessageHead() throws RecognitionException {
		MultiKeyMessageHeadContext _localctx = new MultiKeyMessageHeadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiKeyMessageHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(ID_UNCAP);
			setState(199); multiKeyMessageModifier();
			setState(200); multiKeyMessageArgs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiKeyMessageTailContext extends ParserRuleContext {
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public MultiKeyMessageArgsContext multiKeyMessageArgs() {
			return getRuleContext(MultiKeyMessageArgsContext.class,0);
		}
		public MultiKeyMessageModifierContext multiKeyMessageModifier() {
			return getRuleContext(MultiKeyMessageModifierContext.class,0);
		}
		public MultiKeyMessageTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageTailContext multiKeyMessageTail() throws RecognitionException {
		MultiKeyMessageTailContext _localctx = new MultiKeyMessageTailContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiKeyMessageTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(ID_CAP);
			setState(203); multiKeyMessageModifier();
			setState(204); multiKeyMessageArgs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiKeyMessageModifierContext extends ParserRuleContext {
		public Token modifier;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public MultiKeyMessageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageModifierContext multiKeyMessageModifier() throws RecognitionException {
		MultiKeyMessageModifierContext _localctx = new MultiKeyMessageModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiKeyMessageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(206); ((MultiKeyMessageModifierContext)_localctx).modifier = match(COLON);
				}
				break;
			case SINGLE_QUOTE:
				{
				setState(207); ((MultiKeyMessageModifierContext)_localctx).modifier = match(SINGLE_QUOTE);
				setState(208); behaviorParams();
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

	public static class MultiKeyMessageArgsContext extends ParserRuleContext {
		public List<MultiKeyMessageArgContext> multiKeyMessageArg() {
			return getRuleContexts(MultiKeyMessageArgContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public MultiKeyMessageArgContext multiKeyMessageArg(int i) {
			return getRuleContext(MultiKeyMessageArgContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiKeyMessageArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageArgsContext multiKeyMessageArgs() throws RecognitionException {
		MultiKeyMessageArgsContext _localctx = new MultiKeyMessageArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiKeyMessageArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(211); multiKeyMessageArg();
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(212); match(COMMA);
						setState(213); multiKeyMessageArg();
						}
						} 
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MultiKeyMessageArgContext extends ParserRuleContext {
		public MultiKeyMessageArgChainContext multiKeyMessageArgChain(int i) {
			return getRuleContext(MultiKeyMessageArgChainContext.class,i);
		}
		public SelfSingleKeyMessageContext selfSingleKeyMessage() {
			return getRuleContext(SelfSingleKeyMessageContext.class,0);
		}
		public List<MultiKeyMessageArgChainContext> multiKeyMessageArgChain() {
			return getRuleContexts(MultiKeyMessageArgChainContext.class);
		}
		public MultiKeyMessageArgReceiverContext multiKeyMessageArgReceiver() {
			return getRuleContext(MultiKeyMessageArgReceiverContext.class,0);
		}
		public MultiKeyMessageArgEndContext multiKeyMessageArgEnd() {
			return getRuleContext(MultiKeyMessageArgEndContext.class,0);
		}
		public MultiKeyMessageArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageArgContext multiKeyMessageArg() throws RecognitionException {
		MultiKeyMessageArgContext _localctx = new MultiKeyMessageArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiKeyMessageArg);
		try {
			int _alt;
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); selfSingleKeyMessage();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); multiKeyMessageArgReceiver();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(223); multiKeyMessageArgChain();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(230);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(229); multiKeyMessageArgEnd();
					}
					break;
				}
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

	public static class MultiKeyMessageArgReceiverContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public MultiKeyMessageArgReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageArgReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageArgReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageArgReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageArgReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageArgReceiverContext multiKeyMessageArgReceiver() throws RecognitionException {
		MultiKeyMessageArgReceiverContext _localctx = new MultiKeyMessageArgReceiverContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiKeyMessageArgReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiKeyMessageArgChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public MultiKeyMessageArgChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageArgChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageArgChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageArgChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageArgChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageArgChainContext multiKeyMessageArgChain() throws RecognitionException {
		MultiKeyMessageArgChainContext _localctx = new MultiKeyMessageArgChainContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiKeyMessageArgChain);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); match(DOT);
				setState(237); unaryMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); slotAccess();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); indexAccess();
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

	public static class MultiKeyMessageArgEndContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public SingleKeyMessageContext singleKeyMessage() {
			return getRuleContext(SingleKeyMessageContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public BinaryMessageChainContext binaryMessageChain() {
			return getRuleContext(BinaryMessageChainContext.class,0);
		}
		public MultiKeyMessageArgEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiKeyMessageArgEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiKeyMessageArgEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiKeyMessageArgEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiKeyMessageArgEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiKeyMessageArgEndContext multiKeyMessageArgEnd() throws RecognitionException {
		MultiKeyMessageArgEndContext _localctx = new MultiKeyMessageArgEndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiKeyMessageArgEnd);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(DOT);
				setState(243); singleKeyMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); indexAssignment();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); binaryMessageChain();
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

	public static class AtomContext extends ParserRuleContext {
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ParArgContext parArg() {
			return getRuleContext(ParArgContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public PseudoVarContext pseudoVar() {
			return getRuleContext(PseudoVarContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); access();
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); grouping();
				}
				break;
			case INT:
			case HASH:
			case BRA_OP:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(251); literal();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(252); pseudoVar();
				}
				break;
			case BACK_SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(253); parArg();
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

	public static class SelfSingleKeyMessageContext extends ParserRuleContext {
		public SingleKeyMessageContext singleKeyMessage() {
			return getRuleContext(SingleKeyMessageContext.class,0);
		}
		public SelfSingleKeyMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfSingleKeyMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfSingleKeyMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfSingleKeyMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfSingleKeyMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfSingleKeyMessageContext selfSingleKeyMessage() throws RecognitionException {
		SelfSingleKeyMessageContext _localctx = new SelfSingleKeyMessageContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selfSingleKeyMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); singleKeyMessage();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleKeyMessageContext extends ParserRuleContext {
		public MultiKeyMessageArgContext multiKeyMessageArg() {
			return getRuleContext(MultiKeyMessageArgContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public MultiKeyMessageModifierContext multiKeyMessageModifier() {
			return getRuleContext(MultiKeyMessageModifierContext.class,0);
		}
		public SingleKeyMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleKeyMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSingleKeyMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSingleKeyMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSingleKeyMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleKeyMessageContext singleKeyMessage() throws RecognitionException {
		SingleKeyMessageContext _localctx = new SingleKeyMessageContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_singleKeyMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(ID_UNCAP);
			setState(259); multiKeyMessageModifier();
			setState(260); multiKeyMessageArg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryMessageContext extends ParserRuleContext {
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public UnaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterUnaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitUnaryMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitUnaryMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMessageContext unaryMessage() throws RecognitionException {
		UnaryMessageContext _localctx = new UnaryMessageContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(ID_UNCAP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotAccessContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DuroParser.AT, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SlotAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSlotAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSlotAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSlotAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotAccessContext slotAccess() throws RecognitionException {
		SlotAccessContext _localctx = new SlotAccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(AT);
			setState(265); selector();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
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
		enterRule(_localctx, 60, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(SQ_OP);
			setState(268); expression();
			setState(269); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryMessageContext extends ParserRuleContext {
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
		public BinaryMessageArgContext binaryMessageArg() {
			return getRuleContext(BinaryMessageArgContext.class,0);
		}
		public BinaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageContext binaryMessage() throws RecognitionException {
		BinaryMessageContext _localctx = new BinaryMessageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(BIN_OP);
			setState(272); binaryMessageArg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryMessageArgContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public List<BinaryMessageArgChainContext> binaryMessageArgChain() {
			return getRuleContexts(BinaryMessageArgChainContext.class);
		}
		public BinaryMessageArgChainContext binaryMessageArgChain(int i) {
			return getRuleContext(BinaryMessageArgChainContext.class,i);
		}
		public BinaryMessageArgEndContext binaryMessageArgEnd() {
			return getRuleContext(BinaryMessageArgEndContext.class,0);
		}
		public BinaryMessageArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageArgContext binaryMessageArg() throws RecognitionException {
		BinaryMessageArgContext _localctx = new BinaryMessageArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_binaryMessageArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274); receiver();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(275); binaryMessageArgChain();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(281); binaryMessageArgEnd();
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

	public static class BinaryMessageArgChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public BinaryMessageArgChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageArgChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageArgChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageArgChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageArgChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageArgChainContext binaryMessageArgChain() throws RecognitionException {
		BinaryMessageArgChainContext _localctx = new BinaryMessageArgChainContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_binaryMessageArgChain);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); match(DOT);
				setState(285); unaryMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); slotAccess();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); indexAccess();
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

	public static class BinaryMessageArgEndContext extends ParserRuleContext {
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public BinaryMessageArgEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageArgEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageArgEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageArgEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageArgEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageArgEndContext binaryMessageArgEnd() throws RecognitionException {
		BinaryMessageArgEndContext _localctx = new BinaryMessageArgEndContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binaryMessageArgEnd);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); indexAssignment();
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

	public static class IndexAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
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
		enterRule(_localctx, 70, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(SQ_OP);
			setState(295); expression();
			setState(296); match(SQ_CL);
			setState(297); match(ASSIGN);
			setState(298); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotAssignmentContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DuroParser.AT, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public SlotAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSlotAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSlotAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSlotAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotAssignmentContext slotAssignment() throws RecognitionException {
		SlotAssignmentContext _localctx = new SlotAssignmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_slotAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(AT);
			setState(301); selector();
			setState(302); assignmentOperator();
			setState(303); expression();
			}
		}
		catch (RecognitionException re) {
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
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
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
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); string();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307); dict();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308); closure();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309); array();
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
		enterRule(_localctx, 76, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(DuroParser.STRING, 0); }
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
		enterRule(_localctx, 78, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictContext extends ParserRuleContext {
		public ExpressionContext explicitPrototype;
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public TerminalNode BRA_OP() { return getToken(DuroParser.BRA_OP, 0); }
		public TerminalNode BRA_CL() { return getToken(DuroParser.BRA_CL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(HASH);
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(317); ((DictContext)_localctx).explicitPrototype = expression();
				}
				break;
			}
			setState(320); match(BRA_OP);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(321); dictEntry();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327); match(BRA_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictEntryContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); selector();
			setState(333);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_PROTO) | (1L << ASSIGN_QUOTED))) != 0)) {
				{
				setState(330); assignmentOperator();
				setState(331); expression();
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

	public static class ClosureContext extends ParserRuleContext {
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BRA_OP() { return getToken(DuroParser.BRA_OP, 0); }
		public TerminalNode BRA_CL() { return getToken(DuroParser.BRA_CL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(BRA_OP);
			setState(336); behaviorParams();
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(337); expression();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(343); match(BRA_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BehaviorParamsContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(DuroParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(DuroParser.PIPE, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public BehaviorParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBehaviorParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBehaviorParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBehaviorParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorParamsContext behaviorParams() throws RecognitionException {
		BehaviorParamsContext _localctx = new BehaviorParamsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(345); match(PIPE);
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(346); id();
					}
					}
					setState(349); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(351); match(PIPE);
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

	public static class ArrayContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
		public TerminalNode HASH() { return getToken(DuroParser.HASH, 0); }
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
		enterRule(_localctx, 88, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(HASH);
			setState(356); match(SQ_OP);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(357); expression();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoVarContext extends ParserRuleContext {
		public TerminalNode PSEUDO_VAR() { return getToken(DuroParser.PSEUDO_VAR, 0); }
		public PseudoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterPseudoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitPseudoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitPseudoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoVarContext pseudoVar() throws RecognitionException {
		PseudoVarContext _localctx = new PseudoVarContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(PSEUDO_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParArgContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BACK_SLASH() { return getToken(DuroParser.BACK_SLASH, 0); }
		public ParArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterParArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitParArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitParArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParArgContext parArg() throws RecognitionException {
		ParArgContext _localctx = new ParArgContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(BACK_SLASH);
			setState(368); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==ID_CAP || _la==ID_UNCAP) ) {
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

	public static class SelectorContext extends ParserRuleContext {
		public IndexOperatorContext indexOperator() {
			return getRuleContext(IndexOperatorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selector);
		try {
			setState(375);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(372); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(374); indexOperator();
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(BIN_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOperatorContext extends ParserRuleContext {
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
		public IndexOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterIndexOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitIndexOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitIndexOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOperatorContext indexOperator() throws RecognitionException {
		IndexOperatorContext _localctx = new IndexOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(SQ_OP);
			setState(380); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\37\u0181\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\7\2j\n\2\f\2\16\2m\13\2\3\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4{\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\5\b\u0090\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\6\13\u00a0\n"+
		"\13\r\13\16\13\u00a1\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\3\21\3\21"+
		"\6\21\u00bc\n\21\r\21\16\21\u00bd\3\21\3\21\3\22\3\22\7\22\u00c4\n\22"+
		"\f\22\16\22\u00c7\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\5\25\u00d4\n\25\3\26\3\26\3\26\7\26\u00d9\n\26\f\26\16\26\u00dc"+
		"\13\26\5\26\u00de\n\26\3\27\3\27\3\27\7\27\u00e3\n\27\f\27\16\27\u00e6"+
		"\13\27\3\27\5\27\u00e9\n\27\5\27\u00eb\n\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\5\31\u00f3\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00fa\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\7\"\u0117\n\"\f\"\16\"\u011a"+
		"\13\"\3\"\5\"\u011d\n\"\3#\3#\3#\3#\5#\u0123\n#\3$\3$\5$\u0127\n$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u0139\n\'\3(\3(\3"+
		")\3)\3*\3*\5*\u0141\n*\3*\3*\7*\u0145\n*\f*\16*\u0148\13*\3*\3*\3+\3+"+
		"\3+\3+\5+\u0150\n+\3,\3,\3,\7,\u0155\n,\f,\16,\u0158\13,\3,\3,\3-\3-\6"+
		"-\u015e\n-\r-\16-\u015f\3-\3-\5-\u0164\n-\3.\3.\3.\7.\u0169\n.\f.\16."+
		"\u016c\13.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u017a"+
		"\n\62\3\63\3\63\3\64\3\64\3\64\3\64\2\65\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\4\3\2\31\33"+
		"\3\2\6\7\u0185\2k\3\2\2\2\4n\3\2\2\2\6z\3\2\2\2\b|\3\2\2\2\n\u0080\3\2"+
		"\2\2\f\u0083\3\2\2\2\16\u0087\3\2\2\2\20\u0095\3\2\2\2\22\u009c\3\2\2"+
		"\2\24\u009f\3\2\2\2\26\u00a3\3\2\2\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2"+
		"\34\u00b1\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2\2\"\u00c1\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00cc\3\2\2\2(\u00d3\3\2\2\2*\u00dd\3\2\2\2,\u00ea\3\2\2\2."+
		"\u00ec\3\2\2\2\60\u00f2\3\2\2\2\62\u00f9\3\2\2\2\64\u0100\3\2\2\2\66\u0102"+
		"\3\2\2\28\u0104\3\2\2\2:\u0108\3\2\2\2<\u010a\3\2\2\2>\u010d\3\2\2\2@"+
		"\u0111\3\2\2\2B\u0114\3\2\2\2D\u0122\3\2\2\2F\u0126\3\2\2\2H\u0128\3\2"+
		"\2\2J\u012e\3\2\2\2L\u0138\3\2\2\2N\u013a\3\2\2\2P\u013c\3\2\2\2R\u013e"+
		"\3\2\2\2T\u014b\3\2\2\2V\u0151\3\2\2\2X\u0163\3\2\2\2Z\u0165\3\2\2\2\\"+
		"\u016f\3\2\2\2^\u0171\3\2\2\2`\u0174\3\2\2\2b\u0179\3\2\2\2d\u017b\3\2"+
		"\2\2f\u017d\3\2\2\2hj\5\4\3\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"l\3\3\2\2\2mk\3\2\2\2nr\5\6\4\2oq\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\5\3\2\2\2tr\3\2\2\2u{\5\b\5\2v{\5\34\17\2w{\5\32\16\2x{"+
		"\5\f\7\2y{\5\16\b\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2"+
		"{\7\3\2\2\2|}\5`\61\2}~\5\n\6\2~\177\5\4\3\2\177\t\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\u0082\5X-\2\u0082\13\3\2\2\2\u0083\u0084\7\21\2\2\u0084"+
		"\u0085\5`\61\2\u0085\u0086\5\4\3\2\u0086\r\3\2\2\2\u0087\u008b\5\30\r"+
		"\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0090\5\22\n\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\17\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0096\5:\36\2\u0093\u0096\5> \2"+
		"\u0094\u0096\5<\37\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\21\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u009d\5\"\22\2\u0099"+
		"\u009d\5J&\2\u009a\u009d\5H%\2\u009b\u009d\5\24\13\2\u009c\u0097\3\2\2"+
		"\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23"+
		"\3\2\2\2\u009e\u00a0\5@!\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00ab\7\17\2"+
		"\2\u00a4\u00ac\5\"\22\2\u00a5\u00ac\5:\36\2\u00a6\u00ac\5H%\2\u00a7\u00ac"+
		"\5> \2\u00a8\u00ac\5J&\2\u00a9\u00ac\5<\37\2\u00aa\u00ac\5\24\13\2\u00ab"+
		"\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\27\3\2\2\2\u00ad\u00ae\5\64\33\2\u00ae\31\3\2\2\2\u00af\u00b0\5\"\22"+
		"\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b5\5`\61\2\u00b3\u00b4"+
		"\7\31\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\35\3\2\2\2\u00b7\u00b8\5`\61\2\u00b8\37\3\2\2\2\u00b9\u00bb\7\22"+
		"\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\23"+
		"\2\2\u00c0!\3\2\2\2\u00c1\u00c5\5$\23\2\u00c2\u00c4\5&\24\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"#\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\5(\25\2"+
		"\u00ca\u00cb\5*\26\2\u00cb%\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5"+
		"(\25\2\u00ce\u00cf\5*\26\2\u00cf\'\3\2\2\2\u00d0\u00d4\7\16\2\2\u00d1"+
		"\u00d2\7\f\2\2\u00d2\u00d4\5X-\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4)\3\2\2\2\u00d5\u00da\5,\27\2\u00d6\u00d7\7\r\2\2\u00d7\u00d9"+
		"\5,\27\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de+\3\2\2\2\u00df\u00eb\5\66\34\2\u00e0\u00e4"+
		"\5.\30\2\u00e1\u00e3\5\60\31\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e9\5\62\32\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00eb\3\2\2\2\u00ea\u00df\3\2\2\2\u00ea\u00e0\3\2\2\2\u00eb-\3"+
		"\2\2\2\u00ec\u00ed\5\64\33\2\u00ed/\3\2\2\2\u00ee\u00ef\7\13\2\2\u00ef"+
		"\u00f3\5:\36\2\u00f0\u00f3\5<\37\2\u00f1\u00f3\5> \2\u00f2\u00ee\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5"+
		"\7\13\2\2\u00f5\u00fa\58\35\2\u00f6\u00fa\5J&\2\u00f7\u00fa\5H%\2\u00f8"+
		"\u00fa\5\24\13\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u0101\5\36\20\2\u00fc"+
		"\u0101\5 \21\2\u00fd\u0101\5L\'\2\u00fe\u0101\5\\/\2\u00ff\u0101\5^\60"+
		"\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\65\3\2\2\2\u0102\u0103\58\35\2\u0103"+
		"\67\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\5(\25\2\u0106\u0107\5,\27"+
		"\2\u01079\3\2\2\2\u0108\u0109\7\7\2\2\u0109;\3\2\2\2\u010a\u010b\7\n\2"+
		"\2\u010b\u010c\5b\62\2\u010c=\3\2\2\2\u010d\u010e\7\24\2\2\u010e\u010f"+
		"\5\4\3\2\u010f\u0110\7\25\2\2\u0110?\3\2\2\2\u0111\u0112\7\30\2\2\u0112"+
		"\u0113\5B\"\2\u0113A\3\2\2\2\u0114\u0118\5\30\r\2\u0115\u0117\5D#\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\5F$\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011dC\3\2\2\2\u011e\u011f\7\13\2\2\u011f"+
		"\u0123\5:\36\2\u0120\u0123\5<\37\2\u0121\u0123\5> \2\u0122\u011e\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123E\3\2\2\2\u0124\u0127"+
		"\5J&\2\u0125\u0127\5H%\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"G\3\2\2\2\u0128\u0129\7\24\2\2\u0129\u012a\5\4\3\2\u012a\u012b\7\25\2"+
		"\2\u012b\u012c\7\31\2\2\u012c\u012d\5\4\3\2\u012dI\3\2\2\2\u012e\u012f"+
		"\7\n\2\2\u012f\u0130\5b\62\2\u0130\u0131\5\n\6\2\u0131\u0132\5\4\3\2\u0132"+
		"K\3\2\2\2\u0133\u0139\5N(\2\u0134\u0139\5P)\2\u0135\u0139\5R*\2\u0136"+
		"\u0139\5V,\2\u0137\u0139\5Z.\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2\2\2"+
		"\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139M\3"+
		"\2\2\2\u013a\u013b\7\5\2\2\u013bO\3\2\2\2\u013c\u013d\7\37\2\2\u013dQ"+
		"\3\2\2\2\u013e\u0140\7\t\2\2\u013f\u0141\5\4\3\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0146\7\26\2\2\u0143\u0145\5"+
		"T+\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\27"+
		"\2\2\u014aS\3\2\2\2\u014b\u014f\5b\62\2\u014c\u014d\5\n\6\2\u014d\u014e"+
		"\5\4\3\2\u014e\u0150\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"U\3\2\2\2\u0151\u0152\7\26\2\2\u0152\u0156\5X-\2\u0153\u0155\5\4\3\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\27\2\2\u015a"+
		"W\3\2\2\2\u015b\u015d\7\b\2\2\u015c\u015e\5`\61\2\u015d\u015c\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\7\b\2\2\u0162\u0164\3\2\2\2\u0163\u015b\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164Y\3\2\2\2\u0165\u0166\7\t\2\2\u0166\u016a\7\24\2\2"+
		"\u0167\u0169\5\4\3\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\7\25\2\2\u016e[\3\2\2\2\u016f\u0170\7\4\2\2\u0170]\3\2\2\2\u0171"+
		"\u0172\7\20\2\2\u0172\u0173\5`\61\2\u0173_\3\2\2\2\u0174\u0175\t\3\2\2"+
		"\u0175a\3\2\2\2\u0176\u017a\5`\61\2\u0177\u017a\5d\63\2\u0178\u017a\5"+
		"f\64\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a"+
		"c\3\2\2\2\u017b\u017c\7\30\2\2\u017ce\3\2\2\2\u017d\u017e\7\24\2\2\u017e"+
		"\u017f\7\25\2\2\u017fg\3\2\2\2$krz\u008b\u008f\u0095\u009c\u00a1\u00ab"+
		"\u00b5\u00bd\u00c5\u00d3\u00da\u00dd\u00e4\u00e8\u00ea\u00f2\u00f9\u0100"+
		"\u0118\u011c\u0122\u0126\u0138\u0140\u0146\u014f\u0156\u015f\u0163\u016a"+
		"\u0179";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}