// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DuroLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BIN_OP1=1, BIN_OP2=2, HASH=3, OPEN_BRA=4, CLOSE_BRA=5, OPEN_PAR=6, CLOSE_PAR=7, 
		EQUALS=8, INT=9, SEMICOLON=10, COMMA=11, COLON=12, KW_VAR=13, KW_PAUSE=14, 
		KW_FUNCTION=15, KW_RETURN=16, KW_TRUE=17, KW_FALSE=18, KW_IF=19, KW_ELSE=20, 
		ID=21, WS=22, SINGLELINE_COMMENT=23, MULTI_LINE_COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BIN_OP1", "BIN_OP2", "'#'", "'{'", "'}'", "'('", "')'", "'='", "INT", 
		"';'", "','", "':'", "'var'", "'pause'", "'function'", "'return'", "'true'", 
		"'false'", "'if'", "'else'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"BIN_OP1", "BIN_OP2", "HASH", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", 
		"EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", "KW_PAUSE", 
		"KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", 
		"DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};


	public DuroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Duro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23: WS_action((RuleContext)_localctx, actionIndex); break;

		case 24: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 25: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SINGLELINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\6\nI\n\n\r\n\16\nJ\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\5\27\u0083\n\27\3\30\3\30\3\30\3\30\7\30"+
		"\u0089\n\30\f\30\16\30\u008c\13\30\3\31\6\31\u008f\n\31\r\31\16\31\u0090"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0099\n\32\f\32\16\32\u009c\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00a4\n\33\f\33\16\33\u00a7\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\u00a5\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\2\1-\2\1/\27\1\61\30\2\63\31\3\65\32"+
		"\4\3\2\7\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2"+
		"\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23H\3\2\2\2\25L\3\2"+
		"\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35V\3\2\2\2\37\\\3\2\2\2!e\3"+
		"\2\2\2#l\3\2\2\2%q\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+\177\3\2\2\2-\u0082\3"+
		"\2\2\2/\u0084\3\2\2\2\61\u008e\3\2\2\2\63\u0094\3\2\2\2\65\u009f\3\2\2"+
		"\2\678\t\2\2\28\4\3\2\2\29:\t\3\2\2:\6\3\2\2\2;<\7%\2\2<\b\3\2\2\2=>\7"+
		"}\2\2>\n\3\2\2\2?@\7\177\2\2@\f\3\2\2\2AB\7*\2\2B\16\3\2\2\2CD\7+\2\2"+
		"D\20\3\2\2\2EF\7?\2\2F\22\3\2\2\2GI\5+\26\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2K\24\3\2\2\2LM\7=\2\2M\26\3\2\2\2NO\7.\2\2O\30\3\2\2\2P"+
		"Q\7<\2\2Q\32\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7t\2\2U\34\3\2\2\2VW\7r\2\2W"+
		"X\7c\2\2XY\7w\2\2YZ\7u\2\2Z[\7g\2\2[\36\3\2\2\2\\]\7h\2\2]^\7w\2\2^_\7"+
		"p\2\2_`\7e\2\2`a\7v\2\2ab\7k\2\2bc\7q\2\2cd\7p\2\2d \3\2\2\2ef\7t\2\2"+
		"fg\7g\2\2gh\7v\2\2hi\7w\2\2ij\7t\2\2jk\7p\2\2k\"\3\2\2\2lm\7v\2\2mn\7"+
		"t\2\2no\7w\2\2op\7g\2\2p$\3\2\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2"+
		"uv\7g\2\2v&\3\2\2\2wx\7k\2\2xy\7h\2\2y(\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7"+
		"u\2\2}~\7g\2\2~*\3\2\2\2\177\u0080\4\62;\2\u0080,\3\2\2\2\u0081\u0083"+
		"\t\4\2\2\u0082\u0081\3\2\2\2\u0083.\3\2\2\2\u0084\u008a\5-\27\2\u0085"+
		"\u0089\5-\27\2\u0086\u0089\5+\26\2\u0087\u0089\7a\2\2\u0088\u0085\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\60\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\31\2\2"+
		"\u0093\62\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7\61\2\2\u0096\u009a"+
		"\3\2\2\2\u0097\u0099\n\6\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\b\32\3\2\u009e\64\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\33\4\2\u00ac\66\3\2\2\2\n\2J\u0082"+
		"\u0088\u008a\u0090\u009a\u00a5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}