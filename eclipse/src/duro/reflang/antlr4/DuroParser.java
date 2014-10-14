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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PARAGRAPH=6, PIPE=7, 
		HASH=8, AT=9, DOT=10, SINGLE_QUOTE=11, COMMA=12, COLON=13, SEMI_COLON=14, 
		BACK_SLASH=15, DOLLAR=16, PAR_OP=17, PAR_CL=18, SQ_OP=19, SQ_CL=20, BRA_OP=21, 
		BAR_CL=22, BIN_OP=23, ASSIGN=24, ASSIGN_PROTO=25, ASSIGN_QUOTED=26, WS=27, 
		SINGLELINE_COMMENT=28, MULTI_LINE_COMMENT=29, STRING=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", 
		"'|'", "'#'", "'@'", "'.'", "'''", "','", "':'", "';'", "'\\'", "'$'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_assignment = 2, RULE_interfaceId = 3, 
		RULE_messageExchange = 4, RULE_messageChain = 5, RULE_expressionChain = 6, 
		RULE_receiver = 7, RULE_selfMultiArgMessageNoPar = 8, RULE_variableDeclaration = 9, 
		RULE_access = 10, RULE_grouping = 11, RULE_multiArgMessageNoPar = 12, 
		RULE_multiArgMessageNoParHead = 13, RULE_multiArgMessageNoParTail = 14, 
		RULE_multiArgMessageArgsNoPar = 15, RULE_multiArgMessageArgNoPar = 16, 
		RULE_multiArgMessageArgNoParReceiver = 17, RULE_multiArgMessageArgNoParChain = 18, 
		RULE_atom = 19, RULE_selfSingleArgMessageNoPar = 20, RULE_singleArgMessageNoPar = 21, 
		RULE_unaryMessage = 22, RULE_slotAccess = 23, RULE_indexAccess = 24, RULE_binaryMessage = 25, 
		RULE_binaryMessageOperand = 26, RULE_binaryMessageOperandChain = 27, RULE_indexAssignment = 28, 
		RULE_slotAssignment = 29, RULE_literal = 30, RULE_integer = 31, RULE_string = 32, 
		RULE_dict = 33, RULE_dictEntry = 34, RULE_closure = 35, RULE_behaviorParams = 36, 
		RULE_array = 37, RULE_pseudoVar = 38, RULE_parArg = 39, RULE_id = 40, 
		RULE_selector = 41, RULE_binaryOperator = 42, RULE_indexOperator = 43;
	public static final String[] ruleNames = {
		"program", "expression", "assignment", "interfaceId", "messageExchange", 
		"messageChain", "expressionChain", "receiver", "selfMultiArgMessageNoPar", 
		"variableDeclaration", "access", "grouping", "multiArgMessageNoPar", "multiArgMessageNoParHead", 
		"multiArgMessageNoParTail", "multiArgMessageArgsNoPar", "multiArgMessageArgNoPar", 
		"multiArgMessageArgNoParReceiver", "multiArgMessageArgNoParChain", "atom", 
		"selfSingleArgMessageNoPar", "singleArgMessageNoPar", "unaryMessage", 
		"slotAccess", "indexAccess", "binaryMessage", "binaryMessageOperand", 
		"binaryMessageOperandChain", "indexAssignment", "slotAssignment", "literal", 
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(88); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public SelfMultiArgMessageNoParContext selfMultiArgMessageNoPar() {
			return getRuleContext(SelfMultiArgMessageNoParContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExpressionChainContext> expressionChain() {
			return getRuleContexts(ExpressionChainContext.class);
		}
		public ExpressionChainContext expressionChain(int i) {
			return getRuleContext(ExpressionChainContext.class,i);
		}
		public InterfaceIdContext interfaceId() {
			return getRuleContext(InterfaceIdContext.class,0);
		}
		public MessageExchangeContext messageExchange() {
			return getRuleContext(MessageExchangeContext.class,0);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(94); assignment();
				}
				break;

			case 2:
				{
				setState(95); variableDeclaration();
				}
				break;

			case 3:
				{
				setState(96); selfMultiArgMessageNoPar();
				}
				break;

			case 4:
				{
				setState(97); interfaceId();
				}
				break;

			case 5:
				{
				setState(98); messageExchange();
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(101); expressionChain();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
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
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); id();
			setState(114);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(108);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(109); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(110); ((AssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(111); behaviorParams();
				setState(112); expression();
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
		enterRule(_localctx, 6, RULE_interfaceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(DOLLAR);
			setState(117); id();
			{
			}
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

	public static class MessageExchangeContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
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
		enterRule(_localctx, 8, RULE_messageExchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); receiver();
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(122); messageChain();
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
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
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
		enterRule(_localctx, 10, RULE_messageChain);
		try {
			int _alt;
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(125); match(DOT);
					setState(126); unaryMessage();
					}
					break;
				case SQ_OP:
					{
					setState(127); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(130); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(DOT);
				setState(134); multiArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); slotAccess();
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(136); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); slotAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); indexAssignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); binaryMessage();
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(142); binaryMessage();
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpressionChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DuroParser.SEMI_COLON, 0); }
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
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
		enterRule(_localctx, 12, RULE_expressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(SEMI_COLON);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(153);
				switch (_input.LA(1)) {
				case ID_UNCAP:
					{
					setState(151); unaryMessage();
					}
					break;
				case SQ_OP:
					{
					setState(152); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(155); messageChain();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(158); multiArgMessageNoPar();
				}
				break;

			case 3:
				{
				setState(159); slotAccess();
				setState(161);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(160); messageChain();
					}
					break;
				}
				}
				break;

			case 4:
				{
				setState(163); slotAssignment();
				}
				break;

			case 5:
				{
				setState(164); indexAssignment();
				}
				break;

			case 6:
				{
				setState(165); binaryMessage();
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(166); binaryMessage();
						}
						} 
					}
					setState(171);
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
		enterRule(_localctx, 14, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfMultiArgMessageNoParContext extends ParserRuleContext {
		public MultiArgMessageNoParContext multiArgMessageNoPar() {
			return getRuleContext(MultiArgMessageNoParContext.class,0);
		}
		public SelfMultiArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfMultiArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfMultiArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfMultiArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfMultiArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfMultiArgMessageNoParContext selfMultiArgMessageNoPar() throws RecognitionException {
		SelfMultiArgMessageNoParContext _localctx = new SelfMultiArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selfMultiArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); multiArgMessageNoPar();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(VAR);
			setState(179); id();
			setState(182);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(180); match(ASSIGN);
				setState(181); expression();
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
		enterRule(_localctx, 20, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(PAR_OP);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187); expression();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(192); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgMessageNoParContext extends ParserRuleContext {
		public List<MultiArgMessageNoParTailContext> multiArgMessageNoParTail() {
			return getRuleContexts(MultiArgMessageNoParTailContext.class);
		}
		public MultiArgMessageNoParTailContext multiArgMessageNoParTail(int i) {
			return getRuleContext(MultiArgMessageNoParTailContext.class,i);
		}
		public MultiArgMessageNoParHeadContext multiArgMessageNoParHead() {
			return getRuleContext(MultiArgMessageNoParHeadContext.class,0);
		}
		public MultiArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParContext multiArgMessageNoPar() throws RecognitionException {
		MultiArgMessageNoParContext _localctx = new MultiArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiArgMessageNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); multiArgMessageNoParHead();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(195); multiArgMessageNoParTail();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class MultiArgMessageNoParHeadContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() {
			return getRuleContext(MultiArgMessageArgsNoParContext.class,0);
		}
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public MultiArgMessageNoParHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoParHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoParHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoParHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoParHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParHeadContext multiArgMessageNoParHead() throws RecognitionException {
		MultiArgMessageNoParHeadContext _localctx = new MultiArgMessageNoParHeadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiArgMessageNoParHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(ID_UNCAP);
			setState(202);
			((MultiArgMessageNoParHeadContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiArgMessageNoParHeadContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(203); multiArgMessageArgsNoPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgMessageNoParTailContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() {
			return getRuleContext(MultiArgMessageArgsNoParContext.class,0);
		}
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public MultiArgMessageNoParTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageNoParTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageNoParTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageNoParTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageNoParTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageNoParTailContext multiArgMessageNoParTail() throws RecognitionException {
		MultiArgMessageNoParTailContext _localctx = new MultiArgMessageNoParTailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiArgMessageNoParTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(ID_CAP);
			setState(206);
			((MultiArgMessageNoParTailContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiArgMessageNoParTailContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(207); multiArgMessageArgsNoPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgMessageArgsNoParContext extends ParserRuleContext {
		public List<MultiArgMessageArgNoParContext> multiArgMessageArgNoPar() {
			return getRuleContexts(MultiArgMessageArgNoParContext.class);
		}
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar(int i) {
			return getRuleContext(MultiArgMessageArgNoParContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DuroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DuroParser.COMMA, i);
		}
		public MultiArgMessageArgsNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgsNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgsNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgsNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgsNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgsNoParContext multiArgMessageArgsNoPar() throws RecognitionException {
		MultiArgMessageArgsNoParContext _localctx = new MultiArgMessageArgsNoParContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiArgMessageArgsNoPar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(209); multiArgMessageArgNoPar();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(210); match(COMMA);
						setState(211); multiArgMessageArgNoPar();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MultiArgMessageArgNoParContext extends ParserRuleContext {
		public MultiArgMessageArgNoParReceiverContext multiArgMessageArgNoParReceiver() {
			return getRuleContext(MultiArgMessageArgNoParReceiverContext.class,0);
		}
		public MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() {
			return getRuleContext(MultiArgMessageArgNoParChainContext.class,0);
		}
		public SelfSingleArgMessageNoParContext selfSingleArgMessageNoPar() {
			return getRuleContext(SelfSingleArgMessageNoParContext.class,0);
		}
		public MultiArgMessageArgNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParContext multiArgMessageArgNoPar() throws RecognitionException {
		MultiArgMessageArgNoParContext _localctx = new MultiArgMessageArgNoParContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiArgMessageArgNoPar);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); selfSingleArgMessageNoPar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); multiArgMessageArgNoParReceiver();
				setState(222);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(221); multiArgMessageArgNoParChain();
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

	public static class MultiArgMessageArgNoParReceiverContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public MultiArgMessageArgNoParReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoParReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoParReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoParReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoParReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParReceiverContext multiArgMessageArgNoParReceiver() throws RecognitionException {
		MultiArgMessageArgNoParReceiverContext _localctx = new MultiArgMessageArgNoParReceiverContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiArgMessageArgNoParReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiArgMessageArgNoParChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DuroParser.DOT, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() {
			return getRuleContext(MultiArgMessageArgNoParChainContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public SingleArgMessageNoParContext singleArgMessageNoPar() {
			return getRuleContext(SingleArgMessageNoParContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public MultiArgMessageArgNoParChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiArgMessageArgNoParChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterMultiArgMessageArgNoParChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitMultiArgMessageArgNoParChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitMultiArgMessageArgNoParChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiArgMessageArgNoParChainContext multiArgMessageArgNoParChain() throws RecognitionException {
		MultiArgMessageArgNoParChainContext _localctx = new MultiArgMessageArgNoParChainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiArgMessageArgNoParChain);
		try {
			int _alt;
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(228); match(DOT);
					setState(229); unaryMessage();
					}
					break;
				case AT:
					{
					setState(230); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(231); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(234); multiArgMessageArgNoParChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); match(DOT);
				setState(238); singleArgMessageNoPar();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); slotAssignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); indexAssignment();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(241); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(244); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); access();
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); grouping();
				}
				break;
			case INT:
			case HASH:
			case BRA_OP:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); literal();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(251); pseudoVar();
				}
				break;
			case BACK_SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(252); parArg();
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

	public static class SelfSingleArgMessageNoParContext extends ParserRuleContext {
		public SingleArgMessageNoParContext singleArgMessageNoPar() {
			return getRuleContext(SingleArgMessageNoParContext.class,0);
		}
		public SelfSingleArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfSingleArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSelfSingleArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSelfSingleArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSelfSingleArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfSingleArgMessageNoParContext selfSingleArgMessageNoPar() throws RecognitionException {
		SelfSingleArgMessageNoParContext _localctx = new SelfSingleArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selfSingleArgMessageNoPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); singleArgMessageNoPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleArgMessageNoParContext extends ParserRuleContext {
		public Token modifier;
		public MultiArgMessageArgNoParContext multiArgMessageArgNoPar() {
			return getRuleContext(MultiArgMessageArgNoParContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
		public SingleArgMessageNoParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgMessageNoPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterSingleArgMessageNoPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitSingleArgMessageNoPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitSingleArgMessageNoPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMessageNoParContext singleArgMessageNoPar() throws RecognitionException {
		SingleArgMessageNoParContext _localctx = new SingleArgMessageNoParContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_singleArgMessageNoPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(ID_UNCAP);
			setState(258);
			((SingleArgMessageNoParContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((SingleArgMessageNoParContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(259); multiArgMessageArgNoPar();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(ID_UNCAP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(AT);
			setState(264); selector();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(SQ_OP);
			setState(267); expression();
			setState(268); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		public BinaryMessageOperandContext binaryMessageOperand() {
			return getRuleContext(BinaryMessageOperandContext.class,0);
		}
		public TerminalNode BIN_OP() { return getToken(DuroParser.BIN_OP, 0); }
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
		enterRule(_localctx, 50, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(BIN_OP);
			setState(271); binaryMessageOperand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryMessageOperandContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public BinaryMessageOperandChainContext binaryMessageOperandChain() {
			return getRuleContext(BinaryMessageOperandChainContext.class,0);
		}
		public BinaryMessageOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageOperandContext binaryMessageOperand() throws RecognitionException {
		BinaryMessageOperandContext _localctx = new BinaryMessageOperandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_binaryMessageOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); receiver();
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(274); binaryMessageOperandChain();
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

	public static class BinaryMessageOperandChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public IndexAssignmentContext indexAssignment() {
			return getRuleContext(IndexAssignmentContext.class,0);
		}
		public SlotAssignmentContext slotAssignment() {
			return getRuleContext(SlotAssignmentContext.class,0);
		}
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public BinaryMessageOperandChainContext binaryMessageOperandChain() {
			return getRuleContext(BinaryMessageOperandChainContext.class,0);
		}
		public BinaryMessageOperandChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessageOperandChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterBinaryMessageOperandChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitBinaryMessageOperandChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitBinaryMessageOperandChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMessageOperandChainContext binaryMessageOperandChain() throws RecognitionException {
		BinaryMessageOperandChainContext _localctx = new BinaryMessageOperandChainContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_binaryMessageOperandChain);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				switch (_input.LA(1)) {
				case AT:
					{
					setState(277); slotAccess();
					}
					break;
				case SQ_OP:
					{
					setState(278); indexAccess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(281); binaryMessageOperandChain();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); slotAssignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285); indexAssignment();
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
		enterRule(_localctx, 56, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(SQ_OP);
			setState(289); expression();
			setState(290); match(SQ_CL);
			setState(291); match(ASSIGN);
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

	public static class SlotAssignmentContext extends ParserRuleContext {
		public Token op;
		public TerminalNode AT() { return getToken(DuroParser.AT, 0); }
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
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
		enterRule(_localctx, 58, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(AT);
			setState(295); selector();
			setState(302);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(296);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(297); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(298); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(299); behaviorParams();
				setState(300); expression();
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
		enterRule(_localctx, 60, RULE_literal);
		try {
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); string();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); dict();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307); closure();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308); array();
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
		enterRule(_localctx, 62, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public TerminalNode SQ_OP() { return getToken(DuroParser.SQ_OP, 0); }
		public TerminalNode SQ_CL() { return getToken(DuroParser.SQ_CL, 0); }
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
		enterRule(_localctx, 66, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(HASH);
			setState(316); match(SQ_OP);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(317); dictEntry();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		public Token op;
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DuroParser.ASSIGN, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode ASSIGN_QUOTED() { return getToken(DuroParser.ASSIGN_QUOTED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_PROTO() { return getToken(DuroParser.ASSIGN_PROTO, 0); }
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
		enterRule(_localctx, 68, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); selector();
			setState(332);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(326);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(327); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(328); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(329); behaviorParams();
				setState(330); expression();
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

	public static class ClosureContext extends ParserRuleContext {
		public BehaviorParamsContext behaviorParams() {
			return getRuleContext(BehaviorParamsContext.class,0);
		}
		public TerminalNode BAR_CL() { return getToken(DuroParser.BAR_CL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BRA_OP() { return getToken(DuroParser.BRA_OP, 0); }
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
		enterRule(_localctx, 70, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(BRA_OP);
			setState(335); behaviorParams();
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(336); expression();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(342); match(BAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(344); match(PIPE);
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(345); id();
					}
					}
					setState(348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(350); match(PIPE);
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
		public TerminalNode PAR_OP() { return getToken(DuroParser.PAR_OP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PAR_CL() { return getToken(DuroParser.PAR_CL, 0); }
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
		enterRule(_localctx, 74, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(HASH);
			setState(355); match(PAR_OP);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(356); expression();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(PSEUDO_VAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(BACK_SLASH);
			setState(367); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 82, RULE_selector);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(371); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(372); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(373); indexOperator();
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
		enterRule(_localctx, 84, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(BIN_OP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(SQ_OP);
			setState(379); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\3\3\3\3\3\3\5\3f\n\3\3"+
		"\3\7\3i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\5\7\u0083\n\7\3\7\5\7\u0086"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16"+
		"\7\u0095\13\7\5\7\u0097\n\7\3\b\3\b\3\b\5\b\u009c\n\b\3\b\5\b\u009f\n"+
		"\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad"+
		"\13\b\5\b\u00af\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00b9\n\13"+
		"\3\f\3\f\3\r\3\r\6\r\u00bf\n\r\r\r\16\r\u00c0\3\r\3\r\3\16\3\16\7\16\u00c7"+
		"\n\16\f\16\16\16\u00ca\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13\21\5\21\u00dc\n\21\3"+
		"\22\3\22\3\22\5\22\u00e1\n\22\5\22\u00e3\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00eb\n\24\3\24\5\24\u00ee\n\24\3\24\3\24\3\24\3\24\3\24\6"+
		"\24\u00f5\n\24\r\24\16\24\u00f6\5\24\u00f9\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0100\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\5\34\u0116\n\34\3\35"+
		"\3\35\5\35\u011a\n\35\3\35\5\35\u011d\n\35\3\35\3\35\5\35\u0121\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u0131\n\37\3 \3 \3 \3 \3 \5 \u0138\n \3!\3!\3\"\3\"\3#\3#\3#\7#\u0141"+
		"\n#\f#\16#\u0144\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u014f\n$\3%\3%\3%\7"+
		"%\u0154\n%\f%\16%\u0157\13%\3%\3%\3&\3&\6&\u015d\n&\r&\16&\u015e\3&\3"+
		"&\5&\u0163\n&\3\'\3\'\3\'\7\'\u0168\n\'\f\'\16\'\u016b\13\'\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\3+\5+\u0179\n+\3,\3,\3-\3-\3-\3-\2.\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"\2\5\3\2\32\33\4\2\r\r\17\17\3\2\6\7\u0192\2]\3\2\2\2\4e\3\2\2\2\6m\3"+
		"\2\2\2\bv\3\2\2\2\n{\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u00b0"+
		"\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3"+
		"\2\2\2\32\u00c4\3\2\2\2\34\u00cb\3\2\2\2\36\u00cf\3\2\2\2 \u00db\3\2\2"+
		"\2\"\u00e2\3\2\2\2$\u00e4\3\2\2\2&\u00f8\3\2\2\2(\u00ff\3\2\2\2*\u0101"+
		"\3\2\2\2,\u0103\3\2\2\2.\u0107\3\2\2\2\60\u0109\3\2\2\2\62\u010c\3\2\2"+
		"\2\64\u0110\3\2\2\2\66\u0113\3\2\2\28\u0120\3\2\2\2:\u0122\3\2\2\2<\u0128"+
		"\3\2\2\2>\u0137\3\2\2\2@\u0139\3\2\2\2B\u013b\3\2\2\2D\u013d\3\2\2\2F"+
		"\u0147\3\2\2\2H\u0150\3\2\2\2J\u0162\3\2\2\2L\u0164\3\2\2\2N\u016e\3\2"+
		"\2\2P\u0170\3\2\2\2R\u0173\3\2\2\2T\u0178\3\2\2\2V\u017a\3\2\2\2X\u017c"+
		"\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2"+
		"\2_]\3\2\2\2`f\5\6\4\2af\5\24\13\2bf\5\22\n\2cf\5\b\5\2df\5\n\6\2e`\3"+
		"\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fj\3\2\2\2gi\5\16\b\2hg"+
		"\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lj\3\2\2\2mt\5R*\2no"+
		"\t\2\2\2ou\5\4\3\2pq\7\34\2\2qr\5J&\2rs\5\4\3\2su\3\2\2\2tn\3\2\2\2tp"+
		"\3\2\2\2u\7\3\2\2\2vw\7\22\2\2wx\5R*\2xy\3\2\2\2yz\5\4\3\2z\t\3\2\2\2"+
		"{}\5\20\t\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177\u0080\7\f\2"+
		"\2\u0080\u0083\5.\30\2\u0081\u0083\5\62\32\2\u0082\177\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\f\7\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0097\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0097\5\32"+
		"\16\2\u0089\u008b\5\60\31\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0097\3\2\2\2\u008d\u0097\5<\37\2\u008e\u0097\5:"+
		"\36\2\u008f\u0093\5\64\33\2\u0090\u0092\5\64\33\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0087\3\2\2\2\u0096"+
		"\u0089\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2"+
		"\2\2\u0097\r\3\2\2\2\u0098\u00ae\7\20\2\2\u0099\u009c\5.\30\2\u009a\u009c"+
		"\5\62\32\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009e\3\2\2\2"+
		"\u009d\u009f\5\f\7\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00af"+
		"\3\2\2\2\u00a0\u00af\5\32\16\2\u00a1\u00a3\5\60\31\2\u00a2\u00a4\5\f\7"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00af\3\2\2\2\u00a5\u00af"+
		"\5<\37\2\u00a6\u00af\5:\36\2\u00a7\u00ab\5\64\33\2\u00a8\u00aa\5\64\33"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae"+
		"\u00a0\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a6\3\2"+
		"\2\2\u00ae\u00a7\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00b1\5(\25\2\u00b1\21"+
		"\3\2\2\2\u00b2\u00b3\5\32\16\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5"+
		"\u00b8\5R*\2\u00b6\u00b7\7\32\2\2\u00b7\u00b9\5\4\3\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\5R*\2\u00bb\27\3"+
		"\2\2\2\u00bc\u00be\7\23\2\2\u00bd\u00bf\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7\24\2\2\u00c3\31\3\2\2\2\u00c4\u00c8\5\34\17\2\u00c5"+
		"\u00c7\5\36\20\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce\5 \21\2\u00ce\35\3\2\2"+
		"\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00d2\5 \21\2\u00d2\37"+
		"\3\2\2\2\u00d3\u00d8\5\"\22\2\u00d4\u00d5\7\16\2\2\u00d5\u00d7\5\"\22"+
		"\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc!\3\2\2\2\u00dd\u00e3\5*\26\2\u00de\u00e0\5$\23\2"+
		"\u00df\u00e1\5&\24\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3#\3\2\2\2\u00e4"+
		"\u00e5\5(\25\2\u00e5%\3\2\2\2\u00e6\u00e7\7\f\2\2\u00e7\u00eb\5.\30\2"+
		"\u00e8\u00eb\5\60\31\2\u00e9\u00eb\5\62\32\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\5&"+
		"\24\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f9\3\2\2\2\u00ef"+
		"\u00f0\7\f\2\2\u00f0\u00f9\5,\27\2\u00f1\u00f9\5<\37\2\u00f2\u00f9\5:"+
		"\36\2\u00f3\u00f5\5\64\33\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00ea\3\2"+
		"\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f4\3\2\2\2\u00f9\'\3\2\2\2\u00fa\u0100\5\26\f\2\u00fb\u0100\5\30\r"+
		"\2\u00fc\u0100\5> \2\u00fd\u0100\5N(\2\u00fe\u0100\5P)\2\u00ff\u00fa\3"+
		"\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100)\3\2\2\2\u0101\u0102\5,\27\2\u0102+\3\2\2\2\u0103"+
		"\u0104\7\7\2\2\u0104\u0105\t\3\2\2\u0105\u0106\5\"\22\2\u0106-\3\2\2\2"+
		"\u0107\u0108\7\7\2\2\u0108/\3\2\2\2\u0109\u010a\7\13\2\2\u010a\u010b\5"+
		"T+\2\u010b\61\3\2\2\2\u010c\u010d\7\25\2\2\u010d\u010e\5\4\3\2\u010e\u010f"+
		"\7\26\2\2\u010f\63\3\2\2\2\u0110\u0111\7\31\2\2\u0111\u0112\5\66\34\2"+
		"\u0112\65\3\2\2\2\u0113\u0115\5\20\t\2\u0114\u0116\58\35\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\67\3\2\2\2\u0117\u011a\5\60\31\2\u0118"+
		"\u011a\5\62\32\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011c\3"+
		"\2\2\2\u011b\u011d\58\35\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0121\3\2\2\2\u011e\u0121\5<\37\2\u011f\u0121\5:\36\2\u0120\u0119\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u01219\3\2\2\2\u0122\u0123"+
		"\7\25\2\2\u0123\u0124\5\4\3\2\u0124\u0125\7\26\2\2\u0125\u0126\7\32\2"+
		"\2\u0126\u0127\5\4\3\2\u0127;\3\2\2\2\u0128\u0129\7\13\2\2\u0129\u0130"+
		"\5T+\2\u012a\u012b\t\2\2\2\u012b\u0131\5\4\3\2\u012c\u012d\7\34\2\2\u012d"+
		"\u012e\5J&\2\u012e\u012f\5\4\3\2\u012f\u0131\3\2\2\2\u0130\u012a\3\2\2"+
		"\2\u0130\u012c\3\2\2\2\u0131=\3\2\2\2\u0132\u0138\5@!\2\u0133\u0138\5"+
		"B\"\2\u0134\u0138\5D#\2\u0135\u0138\5H%\2\u0136\u0138\5L\'\2\u0137\u0132"+
		"\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138?\3\2\2\2\u0139\u013a\7\5\2\2\u013aA\3\2\2\2\u013b"+
		"\u013c\7 \2\2\u013cC\3\2\2\2\u013d\u013e\7\n\2\2\u013e\u0142\7\25\2\2"+
		"\u013f\u0141\5F$\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7\26\2\2\u0146E\3\2\2\2\u0147\u014e\5T+\2\u0148\u0149\t\2\2\2\u0149"+
		"\u014f\5\4\3\2\u014a\u014b\7\34\2\2\u014b\u014c\5J&\2\u014c\u014d\5\4"+
		"\3\2\u014d\u014f\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014a\3\2\2\2\u014f"+
		"G\3\2\2\2\u0150\u0151\7\27\2\2\u0151\u0155\5J&\2\u0152\u0154\5\4\3\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\30\2\2\u0159"+
		"I\3\2\2\2\u015a\u015c\7\t\2\2\u015b\u015d\5R*\2\u015c\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\7\t\2\2\u0161\u0163\3\2\2\2\u0162\u015a\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163K\3\2\2\2\u0164\u0165\7\n\2\2\u0165\u0169\7\23\2\2"+
		"\u0166\u0168\5\4\3\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\7\24\2\2\u016dM\3\2\2\2\u016e\u016f\7\4\2\2\u016fO\3\2\2\2\u0170"+
		"\u0171\7\21\2\2\u0171\u0172\5R*\2\u0172Q\3\2\2\2\u0173\u0174\t\4\2\2\u0174"+
		"S\3\2\2\2\u0175\u0179\5R*\2\u0176\u0179\5V,\2\u0177\u0179\5X-\2\u0178"+
		"\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179U\3\2\2\2"+
		"\u017a\u017b\7\31\2\2\u017bW\3\2\2\2\u017c\u017d\7\25\2\2\u017d\u017e"+
		"\7\26\2\2\u017eY\3\2\2\2*]ejt}\u0082\u0085\u008b\u0093\u0096\u009b\u009e"+
		"\u00a3\u00ab\u00ae\u00b8\u00c0\u00c8\u00d8\u00db\u00e0\u00e2\u00ea\u00ed"+
		"\u00f6\u00f8\u00ff\u0115\u0119\u011c\u0120\u0130\u0137\u0142\u014e\u0155"+
		"\u015e\u0162\u0169\u0178";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}