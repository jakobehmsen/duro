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
		RULE_messageExchange = 4, RULE_messageChain = 5, RULE_messageEnd = 6, 
		RULE_expressionChain = 7, RULE_expressionEnd = 8, RULE_receiver = 9, RULE_selfMultiKeyMessage = 10, 
		RULE_variableDeclaration = 11, RULE_access = 12, RULE_grouping = 13, RULE_multiKeyMessage = 14, 
		RULE_multiKeyMessageHead = 15, RULE_multiKeyMessageTail = 16, RULE_multiKeyMessageArgs = 17, 
		RULE_multiKeyMessageArg = 18, RULE_multiKeyMessageArgReceiver = 19, RULE_multiKeyMessageArgChain = 20, 
		RULE_multiKeyMessageArgEnd = 21, RULE_atom = 22, RULE_selfSingleKeyMessage = 23, 
		RULE_singleKeyMessage = 24, RULE_unaryMessage = 25, RULE_slotAccess = 26, 
		RULE_indexAccess = 27, RULE_binaryMessage = 28, RULE_binaryMessageArg = 29, 
		RULE_binaryMessageArgChain = 30, RULE_binaryMessageArgEnd = 31, RULE_indexAssignment = 32, 
		RULE_slotAssignment = 33, RULE_literal = 34, RULE_integer = 35, RULE_string = 36, 
		RULE_dict = 37, RULE_dictEntry = 38, RULE_closure = 39, RULE_behaviorParams = 40, 
		RULE_array = 41, RULE_pseudoVar = 42, RULE_parArg = 43, RULE_id = 44, 
		RULE_selector = 45, RULE_binaryOperator = 46, RULE_indexOperator = 47;
	public static final String[] ruleNames = {
		"program", "expression", "assignment", "interfaceId", "messageExchange", 
		"messageChain", "messageEnd", "expressionChain", "expressionEnd", "receiver", 
		"selfMultiKeyMessage", "variableDeclaration", "access", "grouping", "multiKeyMessage", 
		"multiKeyMessageHead", "multiKeyMessageTail", "multiKeyMessageArgs", "multiKeyMessageArg", 
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(96); expression();
				}
				}
				setState(101);
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
		public ExpressionEndContext expressionEnd() {
			return getRuleContext(ExpressionEndContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		public SelfMultiKeyMessageContext selfMultiKeyMessage() {
			return getRuleContext(SelfMultiKeyMessageContext.class,0);
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(102); assignment();
				}
				break;

			case 2:
				{
				setState(103); variableDeclaration();
				}
				break;

			case 3:
				{
				setState(104); selfMultiKeyMessage();
				}
				break;

			case 4:
				{
				setState(105); interfaceId();
				}
				break;

			case 5:
				{
				setState(106); messageExchange();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(115); expressionEnd();
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
			setState(118); id();
			setState(125);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(119);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(120); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(121); ((AssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(122); behaviorParams();
				setState(123); expression();
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
			setState(127); match(DOLLAR);
			setState(128); id();
			setState(129); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_messageExchange);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131); receiver();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(132); messageChain();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(138); messageEnd();
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
		enterRule(_localctx, 10, RULE_messageChain);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(DOT);
				setState(142); unaryMessage();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); indexAccess();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(144); slotAccess();
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
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
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
		enterRule(_localctx, 12, RULE_messageEnd);
		try {
			int _alt;
			setState(156);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(DOT);
				setState(148); multiKeyMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); indexAssignment();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(151); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(154); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class ExpressionChainContext extends ParserRuleContext {
		public SlotAccessContext slotAccess() {
			return getRuleContext(SlotAccessContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DuroParser.SEMI_COLON, 0); }
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
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
		enterRule(_localctx, 14, RULE_expressionChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(SEMI_COLON);
			setState(162);
			switch (_input.LA(1)) {
			case ID_UNCAP:
				{
				setState(159); unaryMessage();
				}
				break;
			case SQ_OP:
				{
				setState(160); indexAccess();
				}
				break;
			case AT:
				{
				setState(161); slotAccess();
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

	public static class ExpressionEndContext extends ParserRuleContext {
		public MultiKeyMessageContext multiKeyMessage() {
			return getRuleContext(MultiKeyMessageContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DuroParser.SEMI_COLON, 0); }
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
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
		public ExpressionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).enterExpressionEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DuroListener ) ((DuroListener)listener).exitExpressionEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DuroVisitor ) return ((DuroVisitor<? extends T>)visitor).visitExpressionEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEndContext expressionEnd() throws RecognitionException {
		ExpressionEndContext _localctx = new ExpressionEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionEnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(SEMI_COLON);
			setState(173);
			switch (_input.LA(1)) {
			case ID_UNCAP:
				{
				setState(165); multiKeyMessage();
				}
				break;
			case AT:
				{
				setState(166); slotAssignment();
				}
				break;
			case SQ_OP:
				{
				setState(167); indexAssignment();
				}
				break;
			case BIN_OP:
				{
				setState(169); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(168); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 18, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); atom();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_selfMultiKeyMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); multiKeyMessage();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(VAR);
			setState(180); id();
			setState(183);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(181); match(ASSIGN);
				setState(182); expression();
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
		enterRule(_localctx, 24, RULE_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(PAR_OP);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188); expression();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0) );
			setState(193); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_multiKeyMessage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195); multiKeyMessageHead();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(196); multiKeyMessageTail();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public Token modifier;
		public MultiKeyMessageArgsContext multiKeyMessageArgs() {
			return getRuleContext(MultiKeyMessageArgsContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
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
		enterRule(_localctx, 30, RULE_multiKeyMessageHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(ID_UNCAP);
			setState(203);
			((MultiKeyMessageHeadContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiKeyMessageHeadContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MultiKeyMessageTailContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode ID_CAP() { return getToken(DuroParser.ID_CAP, 0); }
		public MultiKeyMessageArgsContext multiKeyMessageArgs() {
			return getRuleContext(MultiKeyMessageArgsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
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
		enterRule(_localctx, 32, RULE_multiKeyMessageTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(ID_CAP);
			setState(207);
			((MultiKeyMessageTailContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((MultiKeyMessageTailContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(208); multiKeyMessageArgs();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_multiKeyMessageArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(210); multiKeyMessageArg();
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(211); match(COMMA);
						setState(212); multiKeyMessageArg();
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 36, RULE_multiKeyMessageArg);
		try {
			int _alt;
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); selfSingleKeyMessage();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); multiKeyMessageArgReceiver();
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(222); multiKeyMessageArgChain();
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(229);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(228); multiKeyMessageArgEnd();
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
		enterRule(_localctx, 38, RULE_multiKeyMessageArgReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); atom();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_multiKeyMessageArgChain);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); match(DOT);
				setState(236); unaryMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); slotAccess();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); indexAccess();
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
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public SingleKeyMessageContext singleKeyMessage() {
			return getRuleContext(SingleKeyMessageContext.class,0);
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
		enterRule(_localctx, 42, RULE_multiKeyMessageArgEnd);
		try {
			int _alt;
			setState(250);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(DOT);
				setState(242); singleKeyMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); indexAssignment();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245); binaryMessage();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(248); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); access();
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); grouping();
				}
				break;
			case INT:
			case HASH:
			case BRA_OP:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); literal();
				}
				break;
			case PSEUDO_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(255); pseudoVar();
				}
				break;
			case BACK_SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(256); parArg();
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
		enterRule(_localctx, 46, RULE_selfSingleKeyMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); singleKeyMessage();
			}
		}
		catch (RecognitionException re) {
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
		public Token modifier;
		public MultiKeyMessageArgContext multiKeyMessageArg() {
			return getRuleContext(MultiKeyMessageArgContext.class,0);
		}
		public TerminalNode ID_UNCAP() { return getToken(DuroParser.ID_UNCAP, 0); }
		public TerminalNode COLON() { return getToken(DuroParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(DuroParser.SINGLE_QUOTE, 0); }
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
		enterRule(_localctx, 48, RULE_singleKeyMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(ID_UNCAP);
			setState(262);
			((SingleKeyMessageContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE || _la==COLON) ) {
				((SingleKeyMessageContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(263); multiKeyMessageArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(ID_UNCAP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_slotAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(AT);
			setState(268); selector();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_indexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(SQ_OP);
			setState(271); expression();
			setState(272); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(BIN_OP);
			setState(275); binaryMessageArg();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_binaryMessageArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277); receiver();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(278); binaryMessageArgChain();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(284); binaryMessageArgEnd();
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
		enterRule(_localctx, 60, RULE_binaryMessageArgChain);
		try {
			setState(291);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(DOT);
				setState(288); unaryMessage();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); slotAccess();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(290); indexAccess();
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
		enterRule(_localctx, 62, RULE_binaryMessageArgEnd);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); slotAssignment();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); indexAssignment();
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
		enterRule(_localctx, 64, RULE_indexAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(SQ_OP);
			setState(298); expression();
			setState(299); match(SQ_CL);
			setState(300); match(ASSIGN);
			setState(301); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_slotAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(AT);
			setState(304); selector();
			setState(311);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(305);
				((SlotAssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((SlotAssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(306); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(307); ((SlotAssignmentContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(308); behaviorParams();
				setState(309); expression();
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
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); string();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315); dict();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316); closure();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317); array();
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
		enterRule(_localctx, 70, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(HASH);
			setState(325); match(SQ_OP);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_CAP) | (1L << ID_UNCAP) | (1L << SQ_OP) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(326); dictEntry();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_dictEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); selector();
			setState(341);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ASSIGN_PROTO:
				{
				{
				setState(335);
				((DictEntryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_PROTO) ) {
					((DictEntryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(336); expression();
				}
				}
				break;
			case ASSIGN_QUOTED:
				{
				setState(337); ((DictEntryContext)_localctx).op = match(ASSIGN_QUOTED);
				setState(338); behaviorParams();
				setState(339); expression();
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
		enterRule(_localctx, 78, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); match(BRA_OP);
			setState(344); behaviorParams();
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(345); expression();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(351); match(BAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_behaviorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(353); match(PIPE);
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(354); id();
					}
					}
					setState(357); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_CAP || _la==ID_UNCAP );
				setState(359); match(PIPE);
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
		enterRule(_localctx, 82, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(HASH);
			setState(364); match(PAR_OP);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PSEUDO_VAR) | (1L << INT) | (1L << ID_CAP) | (1L << ID_UNCAP) | (1L << HASH) | (1L << BACK_SLASH) | (1L << DOLLAR) | (1L << PAR_OP) | (1L << BRA_OP) | (1L << STRING))) != 0)) {
				{
				{
				setState(365); expression();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371); match(PAR_CL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_pseudoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(PSEUDO_VAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_parArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(BACK_SLASH);
			setState(376); id();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		enterRule(_localctx, 90, RULE_selector);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case ID_CAP:
			case ID_UNCAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(380); id();
				}
				break;
			case BIN_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); binaryOperator();
				}
				break;
			case SQ_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(382); indexOperator();
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
		enterRule(_localctx, 92, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(BIN_OP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_indexOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(SQ_OP);
			setState(388); match(SQ_CL);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 \u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\5\3w\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6"+
		"\u0088\n\6\f\6\16\6\u008b\13\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\5\7\u0094"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\6\b\u009b\n\b\r\b\16\b\u009c\5\b\u009f\n\b\3"+
		"\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\6\n\u00ac\n\n\r\n\16"+
		"\n\u00ad\5\n\u00b0\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00ba\n\r"+
		"\3\16\3\16\3\17\3\17\6\17\u00c0\n\17\r\17\16\17\u00c1\3\17\3\17\3\20\3"+
		"\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\7\23\u00d8\n\23\f\23\16\23\u00db\13\23\5"+
		"\23\u00dd\n\23\3\24\3\24\3\24\7\24\u00e2\n\24\f\24\16\24\u00e5\13\24\3"+
		"\24\5\24\u00e8\n\24\5\24\u00ea\n\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00f2\n\26\3\27\3\27\3\27\3\27\3\27\6\27\u00f9\n\27\r\27\16\27\u00fa"+
		"\5\27\u00fd\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0104\n\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\7\37\u011a\n\37\f\37\16\37\u011d\13\37\3\37\5\37\u0120"+
		"\n\37\3 \3 \3 \3 \5 \u0126\n \3!\3!\5!\u012a\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u013a\n#\3$\3$\3$\3$\3$\5$\u0141\n$\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\7\'\u014a\n\'\f\'\16\'\u014d\13\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u0158\n(\3)\3)\3)\7)\u015d\n)\f)\16)\u0160\13)\3)\3)"+
		"\3*\3*\6*\u0166\n*\r*\16*\u0167\3*\3*\5*\u016c\n*\3+\3+\3+\7+\u0171\n"+
		"+\f+\16+\u0174\13+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\5/\u0182\n/\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\5\3\2\32\33\4\2\r\r\17\17"+
		"\3\2\6\7\u0192\2e\3\2\2\2\4m\3\2\2\2\6x\3\2\2\2\b\u0081\3\2\2\2\n\u0085"+
		"\3\2\2\2\f\u0093\3\2\2\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00a6\3"+
		"\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00bb\3\2"+
		"\2\2\34\u00bd\3\2\2\2\36\u00c5\3\2\2\2 \u00cc\3\2\2\2\"\u00d0\3\2\2\2"+
		"$\u00dc\3\2\2\2&\u00e9\3\2\2\2(\u00eb\3\2\2\2*\u00f1\3\2\2\2,\u00fc\3"+
		"\2\2\2.\u0103\3\2\2\2\60\u0105\3\2\2\2\62\u0107\3\2\2\2\64\u010b\3\2\2"+
		"\2\66\u010d\3\2\2\28\u0110\3\2\2\2:\u0114\3\2\2\2<\u0117\3\2\2\2>\u0125"+
		"\3\2\2\2@\u0129\3\2\2\2B\u012b\3\2\2\2D\u0131\3\2\2\2F\u0140\3\2\2\2H"+
		"\u0142\3\2\2\2J\u0144\3\2\2\2L\u0146\3\2\2\2N\u0150\3\2\2\2P\u0159\3\2"+
		"\2\2R\u016b\3\2\2\2T\u016d\3\2\2\2V\u0177\3\2\2\2X\u0179\3\2\2\2Z\u017c"+
		"\3\2\2\2\\\u0181\3\2\2\2^\u0183\3\2\2\2`\u0185\3\2\2\2bd\5\4\3\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\3\3\2\2\2ge\3\2\2\2hn\5\6\4\2in\5"+
		"\30\r\2jn\5\26\f\2kn\5\b\5\2ln\5\n\6\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2m"+
		"k\3\2\2\2ml\3\2\2\2nr\3\2\2\2oq\5\20\t\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\5\22\n\2vu\3\2\2\2vw\3\2\2\2w\5\3\2\2"+
		"\2x\177\5Z.\2yz\t\2\2\2z\u0080\5\4\3\2{|\7\34\2\2|}\5R*\2}~\5\4\3\2~\u0080"+
		"\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082\7\22\2"+
		"\2\u0082\u0083\5Z.\2\u0083\u0084\5\4\3\2\u0084\t\3\2\2\2\u0085\u0089\5"+
		"\24\13\2\u0086\u0088\5\f\7\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008e\5\16\b\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\13\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0094\5\64\33\2\u0091\u0094\58\35"+
		"\2\u0092\u0094\5\66\34\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\r\3\2\2\2\u0095\u0096\7\f\2\2\u0096\u009f\5\36\20"+
		"\2\u0097\u009f\5D#\2\u0098\u009f\5B\"\2\u0099\u009b\5:\36\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2"+
		"\2\2\u009e\u009a\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a4\7\20\2\2\u00a1\u00a5"+
		"\5\64\33\2\u00a2\u00a5\58\35\2\u00a3\u00a5\5\66\34\2\u00a4\u00a1\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00af"+
		"\7\20\2\2\u00a7\u00b0\5\36\20\2\u00a8\u00b0\5D#\2\u00a9\u00b0\5B\"\2\u00aa"+
		"\u00ac\5:\36\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a7\3\2\2\2\u00af"+
		"\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\23\3\2\2"+
		"\2\u00b1\u00b2\5.\30\2\u00b2\25\3\2\2\2\u00b3\u00b4\5\36\20\2\u00b4\27"+
		"\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b9\5Z.\2\u00b7\u00b8\7\32\2\2\u00b8"+
		"\u00ba\5\4\3\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2"+
		"\2\u00bb\u00bc\5Z.\2\u00bc\33\3\2\2\2\u00bd\u00bf\7\23\2\2\u00be\u00c0"+
		"\5\4\3\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\24\2\2\u00c4\35\3\2\2"+
		"\2\u00c5\u00c9\5 \21\2\u00c6\u00c8\5\"\22\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\t\3\2\2\u00ce\u00cf"+
		"\5$\23\2\u00cf!\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\t\3\2\2\u00d2"+
		"\u00d3\5$\23\2\u00d3#\3\2\2\2\u00d4\u00d9\5&\24\2\u00d5\u00d6\7\16\2\2"+
		"\u00d6\u00d8\5&\24\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd%\3\2\2\2\u00de\u00ea\5\60\31"+
		"\2\u00df\u00e3\5(\25\2\u00e0\u00e2\5*\26\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\5,\27\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00ea"+
		"\'\3\2\2\2\u00eb\u00ec\5.\30\2\u00ec)\3\2\2\2\u00ed\u00ee\7\f\2\2\u00ee"+
		"\u00f2\5\64\33\2\u00ef\u00f2\5\66\34\2\u00f0\u00f2\58\35\2\u00f1\u00ed"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2+\3\2\2\2\u00f3"+
		"\u00f4\7\f\2\2\u00f4\u00fd\5\62\32\2\u00f5\u00fd\5D#\2\u00f6\u00fd\5B"+
		"\"\2\u00f7\u00f9\5:\36\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f3\3\2"+
		"\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd"+
		"-\3\2\2\2\u00fe\u0104\5\32\16\2\u00ff\u0104\5\34\17\2\u0100\u0104\5F$"+
		"\2\u0101\u0104\5V,\2\u0102\u0104\5X-\2\u0103\u00fe\3\2\2\2\u0103\u00ff"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"/\3\2\2\2\u0105\u0106\5\62\32\2\u0106\61\3\2\2\2\u0107\u0108\7\7\2\2\u0108"+
		"\u0109\t\3\2\2\u0109\u010a\5&\24\2\u010a\63\3\2\2\2\u010b\u010c\7\7\2"+
		"\2\u010c\65\3\2\2\2\u010d\u010e\7\13\2\2\u010e\u010f\5\\/\2\u010f\67\3"+
		"\2\2\2\u0110\u0111\7\25\2\2\u0111\u0112\5\4\3\2\u0112\u0113\7\26\2\2\u0113"+
		"9\3\2\2\2\u0114\u0115\7\31\2\2\u0115\u0116\5<\37\2\u0116;\3\2\2\2\u0117"+
		"\u011b\5\24\13\2\u0118\u011a\5> \2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0120\5@!\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2"+
		"\2\u0120=\3\2\2\2\u0121\u0122\7\f\2\2\u0122\u0126\5\64\33\2\u0123\u0126"+
		"\5\66\34\2\u0124\u0126\58\35\2\u0125\u0121\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0124\3\2\2\2\u0126?\3\2\2\2\u0127\u012a\5D#\2\u0128\u012a\5B\""+
		"\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012aA\3\2\2\2\u012b\u012c"+
		"\7\25\2\2\u012c\u012d\5\4\3\2\u012d\u012e\7\26\2\2\u012e\u012f\7\32\2"+
		"\2\u012f\u0130\5\4\3\2\u0130C\3\2\2\2\u0131\u0132\7\13\2\2\u0132\u0139"+
		"\5\\/\2\u0133\u0134\t\2\2\2\u0134\u013a\5\4\3\2\u0135\u0136\7\34\2\2\u0136"+
		"\u0137\5R*\2\u0137\u0138\5\4\3\2\u0138\u013a\3\2\2\2\u0139\u0133\3\2\2"+
		"\2\u0139\u0135\3\2\2\2\u013aE\3\2\2\2\u013b\u0141\5H%\2\u013c\u0141\5"+
		"J&\2\u013d\u0141\5L\'\2\u013e\u0141\5P)\2\u013f\u0141\5T+\2\u0140\u013b"+
		"\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u013f\3\2\2\2\u0141G\3\2\2\2\u0142\u0143\7\5\2\2\u0143I\3\2\2\2\u0144"+
		"\u0145\7 \2\2\u0145K\3\2\2\2\u0146\u0147\7\n\2\2\u0147\u014b\7\25\2\2"+
		"\u0148\u014a\5N(\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\7\26\2\2\u014fM\3\2\2\2\u0150\u0157\5\\/\2\u0151\u0152\t\2\2\2"+
		"\u0152\u0158\5\4\3\2\u0153\u0154\7\34\2\2\u0154\u0155\5R*\2\u0155\u0156"+
		"\5\4\3\2\u0156\u0158\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0153\3\2\2\2\u0158"+
		"O\3\2\2\2\u0159\u015a\7\27\2\2\u015a\u015e\5R*\2\u015b\u015d\5\4\3\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\30\2\2\u0162"+
		"Q\3\2\2\2\u0163\u0165\7\t\2\2\u0164\u0166\5Z.\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\7\t\2\2\u016a\u016c\3\2\2\2\u016b\u0163\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016cS\3\2\2\2\u016d\u016e\7\n\2\2\u016e\u0172\7\23\2\2"+
		"\u016f\u0171\5\4\3\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\7\24\2\2\u0176U\3\2\2\2\u0177\u0178\7\4\2\2\u0178W\3\2\2\2\u0179"+
		"\u017a\7\21\2\2\u017a\u017b\5Z.\2\u017bY\3\2\2\2\u017c\u017d\t\4\2\2\u017d"+
		"[\3\2\2\2\u017e\u0182\5Z.\2\u017f\u0182\5^\60\2\u0180\u0182\5`\61\2\u0181"+
		"\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182]\3\2\2\2"+
		"\u0183\u0184\7\31\2\2\u0184_\3\2\2\2\u0185\u0186\7\25\2\2\u0186\u0187"+
		"\7\26\2\2\u0187a\3\2\2\2(emrv\177\u0089\u008d\u0093\u009c\u009e\u00a4"+
		"\u00ad\u00af\u00b9\u00c1\u00c9\u00d9\u00dc\u00e3\u00e7\u00e9\u00f1\u00fa"+
		"\u00fc\u0103\u011b\u011f\u0125\u0129\u0139\u0140\u014b\u0157\u015e\u0167"+
		"\u016b\u0172\u0181";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}