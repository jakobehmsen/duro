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
		CLOSE_PAR=13, EQUALS=14, DOUBLE_EQUALS=15, INT=16, SEMICOLON=17, COMMA=18, 
		COLON=19, KW_VAR=20, KW_PAUSE=21, KW_FUNCTION=22, KW_RETURN=23, KW_TRUE=24, 
		KW_FALSE=25, KW_IF=26, KW_ELSE=27, KW_THIS=28, KW_WHILE=29, ID=30, WS=31, 
		SINGLELINE_COMMENT=32, MULTI_LINE_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", "INT", 
		"';'", "','", "':'", "'var'", "'pause'", "'function'", "'return'", "'true'", 
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
		"EQUALS", "DOUBLE_EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", "KW_VAR", 
		"KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", "KW_IF", 
		"KW_ELSE", "KW_THIS", "KW_WHILE", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", 
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

		case 44: WS_action((RuleContext)_localctx, actionIndex); break;

		case 45: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u0138\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3"+
		"\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\5\2r\n\2\3\3\3\3\3\3\3\3\5\3x\n\3\3"+
		"\4\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\5\6\u0088"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a3\n\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00c9\n\35\r\35\16\35\u00ca\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\5"+
		",\u010e\n,\3-\3-\3-\3-\7-\u0114\n-\f-\16-\u0117\13-\3.\6.\u011a\n.\r."+
		"\16.\u011b\3.\3.\3/\3/\3/\3/\7/\u0124\n/\f/\16/\u0127\13/\3/\3/\3\60\3"+
		"\60\3\60\3\60\7\60\u012f\n\60\f\60\16\60\u0132\13\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\u0130\61\3\3\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1"+
		"\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1"+
		")\n\1+\13\1-\f\1/\r\1\61\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24"+
		"\1?\25\1A\26\1C\27\1E\30\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U"+
		"\2\1W\2\1Y \1[!\3]\"\4_#\5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^"+
		"\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5"+
		"\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\u013e\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3q\3"+
		"\2\2\2\5w\3\2\2\2\7}\3\2\2\2\t\u0083\3\2\2\2\13\u0087\3\2\2\2\r\u0089"+
		"\3\2\2\2\17\u008d\3\2\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u009a\3"+
		"\2\2\2\27\u009c\3\2\2\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2"+
		"\2\2\37\u00aa\3\2\2\2!\u00ad\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3\2\2\2\'\u00b4"+
		"\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00c8"+
		"\3\2\2\2;\u00cc\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00d6\3\2\2\2E\u00dc\3\2\2\2G\u00e5\3\2\2\2I\u00ec\3\2\2\2K\u00f1\3\2"+
		"\2\2M\u00f7\3\2\2\2O\u00fa\3\2\2\2Q\u00ff\3\2\2\2S\u0104\3\2\2\2U\u010a"+
		"\3\2\2\2W\u010d\3\2\2\2Y\u010f\3\2\2\2[\u0119\3\2\2\2]\u011f\3\2\2\2_"+
		"\u012a\3\2\2\2ae\7$\2\2bd\5\5\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ge\3\2\2\2hr\7$\2\2im\7)\2\2jl\5\7\4\2kj\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pr\7)\2\2qa\3\2\2\2qi\3\2\2"+
		"\2r\4\3\2\2\2sx\n\2\2\2tu\7^\2\2ux\5\t\5\2vx\5\27\f\2ws\3\2\2\2wt\3\2"+
		"\2\2wv\3\2\2\2x\6\3\2\2\2y~\n\3\2\2z{\7^\2\2{~\5\t\5\2|~\5\27\f\2}y\3"+
		"\2\2\2}z\3\2\2\2}|\3\2\2\2~\b\3\2\2\2\177\u0084\5\13\6\2\u0080\u0084\7"+
		"\62\2\2\u0081\u0084\5\r\7\2\u0082\u0084\5\17\b\2\u0083\177\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\n\3\2\2\2"+
		"\u0085\u0088\5\21\t\2\u0086\u0088\5\23\n\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\f\3\2\2\2\u0089\u008a\7z\2\2\u008a\u008b\5\33\16\2\u008b"+
		"\u008c\5\33\16\2\u008c\16\3\2\2\2\u008d\u008e\7w\2\2\u008e\u008f\5\33"+
		"\16\2\u008f\u0090\5\33\16\2\u0090\u0091\5\33\16\2\u0091\u0092\5\33\16"+
		"\2\u0092\20\3\2\2\2\u0093\u0094\t\4\2\2\u0094\22\3\2\2\2\u0095\u0096\n"+
		"\5\2\2\u0096\24\3\2\2\2\u0097\u009b\5\21\t\2\u0098\u009b\5U+\2\u0099\u009b"+
		"\t\6\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\26\3\2\2\2\u009c\u009d\7^\2\2\u009d\u009e\5\31\r\2\u009e\30\3\2\2\2\u009f"+
		"\u00a0\7\17\2\2\u00a0\u00a3\7\f\2\2\u00a1\u00a3\5\35\17\2\u00a2\u009f"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\t\7\2\2\u00a5"+
		"\34\3\2\2\2\u00a6\u00a7\t\b\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\17\2"+
		"\2\u00a9\36\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\7(\2\2\u00ac \3\2\2"+
		"\2\u00ad\u00ae\7~\2\2\u00ae\u00af\7~\2\2\u00af\"\3\2\2\2\u00b0\u00b1\t"+
		"\t\2\2\u00b1$\3\2\2\2\u00b2\u00b3\t\n\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7"+
		"%\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7_"+
		"\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7\177"+
		"\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7*\2\2\u00bf\62\3\2\2\2\u00c0\u00c1"+
		"\7+\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\66\3\2\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5\u00c6\7?\2\2\u00c68\3\2\2\2\u00c7\u00c9\5U+\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		":\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf>"+
		"\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7t\2\2\u00d5B\3\2\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db"+
		"D\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7e\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7q\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb"+
		"\7p\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7w\2\2\u00ef\u00f0\7g\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6"+
		"L\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7h\2\2\u00f9N\3\2\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"P\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7u\2\2\u0103R\3\2\2\2\u0104\u0105\7y\2\2\u0105\u0106\7j\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109T\3\2\2\2\u010a"+
		"\u010b\4\62;\2\u010bV\3\2\2\2\u010c\u010e\t\13\2\2\u010d\u010c\3\2\2\2"+
		"\u010eX\3\2\2\2\u010f\u0115\5W,\2\u0110\u0114\5W,\2\u0111\u0114\5U+\2"+
		"\u0112\u0114\7a\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"Z\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\f\2\2\u0119\u0118\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\b.\3\2\u011e\\\3\2\2\2\u011f\u0120\7\61\2\2\u0120"+
		"\u0121\7\61\2\2\u0121\u0125\3\2\2\2\u0122\u0124\n\r\2\2\u0123\u0122\3"+
		"\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\b/\4\2\u0129^\3\2\2\2\u012a"+
		"\u012b\7\61\2\2\u012b\u012c\7,\2\2\u012c\u0130\3\2\2\2\u012d\u012f\13"+
		"\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7,"+
		"\2\2\u0134\u0135\7\61\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\60\5\2\u0137"+
		"`\3\2\2\2\23\2emqw}\u0083\u0087\u009a\u00a2\u00ca\u010d\u0113\u0115\u011b"+
		"\u0125\u0130";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}