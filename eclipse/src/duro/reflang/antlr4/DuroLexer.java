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
		STRING_LITERAL=1, LINE_TERMINATOR=2, BIN_OP1=3, BIN_OP2=4, HASH=5, OPEN_SQ=6, 
		CLOSE_SQ=7, OPEN_BRA=8, CLOSE_BRA=9, OPEN_PAR=10, CLOSE_PAR=11, EQUALS=12, 
		INT=13, SEMICOLON=14, COMMA=15, COLON=16, KW_VAR=17, KW_PAUSE=18, KW_FUNCTION=19, 
		KW_RETURN=20, KW_TRUE=21, KW_FALSE=22, KW_IF=23, KW_ELSE=24, KW_THIS=25, 
		KW_WHILE=26, ID=27, WS=28, SINGLELINE_COMMENT=29, MULTI_LINE_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "'#'", "'['", 
		"']'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", "','", "':'", 
		"'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", "'if'", 
		"'else'", "'this'", "'while'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "HASH", "OPEN_SQ", "CLOSE_SQ", 
		"OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "EQUALS", "INT", "SEMICOLON", 
		"COMMA", "COLON", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", 
		"KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "KW_WHILE", "DIGIT", "LETTER", 
		"ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 41: WS_action((RuleContext)_localctx, actionIndex); break;

		case 42: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 43: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\2\7\2f\n\2\f\2\16"+
		"\2i\13\2\3\2\5\2l\n\2\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\5\4x\n"+
		"\4\3\5\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0095\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00ba\n\32\r\32\16\32\u00bb\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3)\5)\u00ff\n)\3*\3*\3*\3*\7*\u0105\n*\f*\16*\u0108"+
		"\13*\3+\6+\u010b\n+\r+\16+\u010c\3+\3+\3,\3,\3,\3,\7,\u0115\n,\f,\16,"+
		"\u0118\13,\3,\3,\3-\3-\3-\3-\7-\u0120\n-\f-\16-\u0123\13-\3-\3-\3-\3-"+
		"\3-\3\u0121.\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1"+
		"\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+"+
		"\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25"+
		"\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\2\1Q\2\1S\35\1U\36\3W\37"+
		"\4Y \5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttv"+
		"vxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17"+
		"\17\u202a\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\u012f\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\3k\3\2\2\2\5q\3\2\2\2\7w\3\2\2\2\t}\3\2\2\2\13\u0081\3\2\2\2"+
		"\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25"+
		"\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u009c\3\2\2\2\33\u009e\3\2\2\2\35\u00a0"+
		"\3\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2"+
		"\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3"+
		"\2\2\2\61\u00b6\3\2\2\2\63\u00b9\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2"+
		"\2\29\u00c1\3\2\2\2;\u00c3\3\2\2\2=\u00c7\3\2\2\2?\u00cd\3\2\2\2A\u00d6"+
		"\3\2\2\2C\u00dd\3\2\2\2E\u00e2\3\2\2\2G\u00e8\3\2\2\2I\u00eb\3\2\2\2K"+
		"\u00f0\3\2\2\2M\u00f5\3\2\2\2O\u00fb\3\2\2\2Q\u00fe\3\2\2\2S\u0100\3\2"+
		"\2\2U\u010a\3\2\2\2W\u0110\3\2\2\2Y\u011b\3\2\2\2[_\7$\2\2\\^\5\5\3\2"+
		"]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bl\7$\2\2"+
		"cg\7)\2\2df\5\7\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jl\7)\2\2k[\3\2\2\2kc\3\2\2\2l\4\3\2\2\2mr\n\2\2\2no\7^\2\2"+
		"or\5\t\5\2pr\5\27\f\2qm\3\2\2\2qn\3\2\2\2qp\3\2\2\2r\6\3\2\2\2sx\n\3\2"+
		"\2tu\7^\2\2ux\5\t\5\2vx\5\27\f\2ws\3\2\2\2wt\3\2\2\2wv\3\2\2\2x\b\3\2"+
		"\2\2y~\5\13\6\2z~\7\62\2\2{~\5\r\7\2|~\5\17\b\2}y\3\2\2\2}z\3\2\2\2}{"+
		"\3\2\2\2}|\3\2\2\2~\n\3\2\2\2\177\u0082\5\21\t\2\u0080\u0082\5\23\n\2"+
		"\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\f\3\2\2\2\u0083\u0084\7z"+
		"\2\2\u0084\u0085\5\33\16\2\u0085\u0086\5\33\16\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\7w\2\2\u0088\u0089\5\33\16\2\u0089\u008a\5\33\16\2\u008a\u008b"+
		"\5\33\16\2\u008b\u008c\5\33\16\2\u008c\20\3\2\2\2\u008d\u008e\t\4\2\2"+
		"\u008e\22\3\2\2\2\u008f\u0090\n\5\2\2\u0090\24\3\2\2\2\u0091\u0095\5\21"+
		"\t\2\u0092\u0095\5O(\2\u0093\u0095\t\6\2\2\u0094\u0091\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\26\3\2\2\2\u0096\u0097\7^\2\2\u0097"+
		"\u0098\5\31\r\2\u0098\30\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009d\7\f"+
		"\2\2\u009b\u009d\5\35\17\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\t\7\2\2\u009f\34\3\2\2\2\u00a0\u00a1\t\b\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\b\17\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\t\t\2"+
		"\2\u00a5 \3\2\2\2\u00a6\u00a7\t\n\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7%\2"+
		"\2\u00a9$\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7_\2\2"+
		"\u00ad(\3\2\2\2\u00ae\u00af\7}\2\2\u00af*\3\2\2\2\u00b0\u00b1\7\177\2"+
		"\2\u00b1,\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7+\2\2"+
		"\u00b5\60\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\62\3\2\2\2\u00b8\u00ba\5O("+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7=\2\2\u00be\66\3\2\2\2\u00bf\u00c0"+
		"\7.\2\2\u00c08\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7"+
		"x\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6<\3\2\2\2\u00c7\u00c8"+
		"\7r\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7w\2\2\u00cf"+
		"\u00d0\7p\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2"+
		"\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7t\2"+
		"\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7p\2\2\u00dcB\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7t\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7g\2\2\u00e1D\3\2\2\2\u00e2\u00e3"+
		"\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"H\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7g\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7j\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7u\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7j\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2"+
		"\u00faN\3\2\2\2\u00fb\u00fc\4\62;\2\u00fcP\3\2\2\2\u00fd\u00ff\t\13\2"+
		"\2\u00fe\u00fd\3\2\2\2\u00ffR\3\2\2\2\u0100\u0106\5Q)\2\u0101\u0105\5"+
		"Q)\2\u0102\u0105\5O(\2\u0103\u0105\7a\2\2\u0104\u0101\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107T\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\t\f\2\2"+
		"\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b+\3\2\u010fV\3\2\2\2\u0110\u0111"+
		"\7\61\2\2\u0111\u0112\7\61\2\2\u0112\u0116\3\2\2\2\u0113\u0115\n\r\2\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\b,\4\2\u011a"+
		"X\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u011d\7,\2\2\u011d\u0121\3\2\2\2"+
		"\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0126\7\61\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b-"+
		"\5\2\u0128Z\3\2\2\2\23\2_gkqw}\u0081\u0094\u009c\u00bb\u00fe\u0104\u0106"+
		"\u010c\u0116\u0121";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}