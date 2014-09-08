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
		STRING_LITERAL=1, LINE_TERMINATOR=2, DOUBLE_AMP=3, DOUBLE_PIPE=4, BIN_OP1=5, 
		BIN_OP2=6, HASH=7, OPEN_SQ=8, CLOSE_SQ=9, OPEN_BRA=10, CLOSE_BRA=11, OPEN_PAR=12, 
		CLOSE_PAR=13, EQUALS=14, INT=15, SEMICOLON=16, COMMA=17, COLON=18, KW_VAR=19, 
		KW_PAUSE=20, KW_FUNCTION=21, KW_RETURN=22, KW_TRUE=23, KW_FALSE=24, KW_IF=25, 
		KW_ELSE=26, KW_THIS=27, KW_WHILE=28, ID=29, WS=30, SINGLELINE_COMMENT=31, 
		MULTI_LINE_COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", 
		"','", "':'", "'var'", "'pause'", "'function'", "'return'", "'true'", 
		"'false'", "'if'", "'else'", "'this'", "'while'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "BIN_OP1", "BIN_OP2", 
		"HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", 
		"EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", "KW_PAUSE", 
		"KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", "KW_ELSE", 
		"KW_THIS", "KW_WHILE", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
		case 13: LINE_TERMINATOR_action((RuleContext)_localctx, actionIndex); break;

		case 43: WS_action((RuleContext)_localctx, actionIndex); break;

		case 44: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 45: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void SINGLELINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINE_TERMINATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\"\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3\2\7\2"+
		"j\n\2\f\2\16\2m\13\2\3\2\5\2p\n\2\3\3\3\3\3\3\3\3\5\3v\n\3\3\4\3\4\3\4"+
		"\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\5\6\u0086\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u0099\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\6\34\u00c4\n\34\r\34\16\34\u00c5\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\5+\u0109\n+\3,\3"+
		",\3,\3,\7,\u010f\n,\f,\16,\u0112\13,\3-\6-\u0115\n-\r-\16-\u0116\3-\3"+
		"-\3.\3.\3.\3.\7.\u011f\n.\f.\16.\u0122\13.\3.\3.\3/\3/\3/\3/\7/\u012a"+
		"\n/\f/\16/\u012d\13/\3/\3/\3/\3/\3/\3\u012b\60\3\3\1\5\2\1\7\2\1\t\2\1"+
		"\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2"+
		"\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20"+
		"\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1"+
		"M\34\1O\35\1Q\36\1S\2\1U\2\1W\37\1Y \3[!\4]\"\5\3\2\16\6\2\f\f\17\17$"+
		"$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^"+
		"ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\4\2"+
		",,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0139\2\3\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\3o\3\2\2\2\5u\3\2\2\2\7{\3\2\2\2\t\u0081\3\2\2\2\13\u0085\3\2\2\2"+
		"\r\u0087\3\2\2\2\17\u008b\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25"+
		"\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2\35\u00a4"+
		"\3\2\2\2\37\u00a8\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2"+
		"\'\u00b2\3\2\2\2)\u00b4\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3"+
		"\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c3\3\2"+
		"\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d1"+
		"\3\2\2\2C\u00d7\3\2\2\2E\u00e0\3\2\2\2G\u00e7\3\2\2\2I\u00ec\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00f5\3\2\2\2O\u00fa\3\2\2\2Q\u00ff\3\2\2\2S\u0105\3\2"+
		"\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u0114\3\2\2\2[\u011a\3\2\2\2]\u0125"+
		"\3\2\2\2_c\7$\2\2`b\5\5\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df"+
		"\3\2\2\2ec\3\2\2\2fp\7$\2\2gk\7)\2\2hj\5\7\4\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2np\7)\2\2o_\3\2\2\2og\3\2\2\2p\4\3"+
		"\2\2\2qv\n\2\2\2rs\7^\2\2sv\5\t\5\2tv\5\27\f\2uq\3\2\2\2ur\3\2\2\2ut\3"+
		"\2\2\2v\6\3\2\2\2w|\n\3\2\2xy\7^\2\2y|\5\t\5\2z|\5\27\f\2{w\3\2\2\2{x"+
		"\3\2\2\2{z\3\2\2\2|\b\3\2\2\2}\u0082\5\13\6\2~\u0082\7\62\2\2\177\u0082"+
		"\5\r\7\2\u0080\u0082\5\17\b\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0080\3\2\2\2\u0082\n\3\2\2\2\u0083\u0086\5\21\t\2\u0084"+
		"\u0086\5\23\n\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\f\3\2\2"+
		"\2\u0087\u0088\7z\2\2\u0088\u0089\5\33\16\2\u0089\u008a\5\33\16\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7w\2\2\u008c\u008d\5\33\16\2\u008d\u008e\5\33"+
		"\16\2\u008e\u008f\5\33\16\2\u008f\u0090\5\33\16\2\u0090\20\3\2\2\2\u0091"+
		"\u0092\t\4\2\2\u0092\22\3\2\2\2\u0093\u0094\n\5\2\2\u0094\24\3\2\2\2\u0095"+
		"\u0099\5\21\t\2\u0096\u0099\5S*\2\u0097\u0099\t\6\2\2\u0098\u0095\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\26\3\2\2\2\u009a\u009b"+
		"\7^\2\2\u009b\u009c\5\31\r\2\u009c\30\3\2\2\2\u009d\u009e\7\17\2\2\u009e"+
		"\u00a1\7\f\2\2\u009f\u00a1\5\35\17\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\t\7\2\2\u00a3\34\3\2\2\2\u00a4\u00a5"+
		"\t\b\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\17\2\2\u00a7\36\3\2\2\2\u00a8"+
		"\u00a9\7(\2\2\u00a9\u00aa\7(\2\2\u00aa \3\2\2\2\u00ab\u00ac\7~\2\2\u00ac"+
		"\u00ad\7~\2\2\u00ad\"\3\2\2\2\u00ae\u00af\t\t\2\2\u00af$\3\2\2\2\u00b0"+
		"\u00b1\t\n\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3(\3\2\2\2\u00b4"+
		"\u00b5\7]\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7_\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\7}\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7*\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7+\2\2\u00bf\64\3\2\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1\66\3\2\2\2\u00c2\u00c4\5S*\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c68\3\2\2\2\u00c7"+
		"\u00c8\7=\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca<\3\2\2\2\u00cb\u00cc"+
		"\7<\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6B\3\2\2\2\u00d7\u00d8"+
		"\7h\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2"+
		"\u00dfD\3\2\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2"+
		"\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7p\2\2\u00e6F\3\2"+
		"\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb"+
		"\7g\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1J\3\2\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7h\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9N\3\2\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7u\2\2\u00fe"+
		"P\3\2\2\2\u00ff\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104R\3\2\2\2\u0105\u0106\4\62;\2\u0106"+
		"T\3\2\2\2\u0107\u0109\t\13\2\2\u0108\u0107\3\2\2\2\u0109V\3\2\2\2\u010a"+
		"\u0110\5U+\2\u010b\u010f\5U+\2\u010c\u010f\5S*\2\u010d\u010f\7a\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111X\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0115\t\f\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b-"+
		"\3\2\u0119Z\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c\7\61\2\2\u011c\u0120"+
		"\3\2\2\2\u011d\u011f\n\r\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\b.\4\2\u0124\\\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127"+
		"\7,\2\2\u0127\u012b\3\2\2\2\u0128\u012a\13\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7\61\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\b/\5\2\u0132^\3\2\2\2\23\2ckou{\u0081\u0085"+
		"\u0098\u00a0\u00c5\u0108\u010e\u0110\u0116\u0120\u012b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}