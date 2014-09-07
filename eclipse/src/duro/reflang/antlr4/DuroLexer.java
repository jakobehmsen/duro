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
		ID=26, WS=27, SINGLELINE_COMMENT=28, MULTI_LINE_COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "'#'", "'['", 
		"']'", "'{'", "'}'", "'('", "')'", "'='", "INT", "';'", "','", "':'", 
		"'var'", "'pause'", "'function'", "'return'", "'true'", "'false'", "'if'", 
		"'else'", "'this'", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "BIN_OP1", "BIN_OP2", "HASH", "OPEN_SQ", "CLOSE_SQ", 
		"OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", "EQUALS", "INT", "SEMICOLON", 
		"COMMA", "COLON", "KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", 
		"KW_FALSE", "KW_IF", "KW_ELSE", "KW_THIS", "DIGIT", "LETTER", "ID", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 40: WS_action((RuleContext)_localctx, actionIndex); break;

		case 41: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 42: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u0121\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2"+
		"g\13\2\3\2\5\2j\n\2\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\5\4v\n\4"+
		"\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0093\n\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00b8\n\32\r\32\16\32\u00b9\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"(\5(\u00f7\n(\3)\3)\3)\3)\7)\u00fd\n)\f)\16)\u0100\13)\3*\6*\u0103\n*"+
		"\r*\16*\u0104\3*\3*\3+\3+\3+\3+\7+\u010d\n+\f+\16+\u0110\13+\3+\3+\3,"+
		"\3,\3,\3,\7,\u0118\n,\f,\16,\u011b\13,\3,\3,\3,\3,\3,\3\u0119-\3\3\1\5"+
		"\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2"+
		"\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61\16"+
		"\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30\1G"+
		"\31\1I\32\1K\33\1M\2\1O\2\1Q\34\1S\35\3U\36\4W\37\5\3\2\16\6\2\f\f\17"+
		"\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62"+
		";^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5\2\f\f\17\17\u202a\u202b\4\2--//"+
		"\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0127\2\3\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3i\3\2\2\2\5o\3\2\2\2\7u"+
		"\3\2\2\2\t{\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0085\3\2\2\2\21"+
		"\u008b\3\2\2\2\23\u008d\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u009a"+
		"\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2"+
		"\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00ae"+
		"\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2\63\u00b7\3\2\2"+
		"\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c5"+
		"\3\2\2\2?\u00cb\3\2\2\2A\u00d4\3\2\2\2C\u00db\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00e6\3\2\2\2I\u00e9\3\2\2\2K\u00ee\3\2\2\2M\u00f3\3\2\2\2O\u00f6\3\2"+
		"\2\2Q\u00f8\3\2\2\2S\u0102\3\2\2\2U\u0108\3\2\2\2W\u0113\3\2\2\2Y]\7$"+
		"\2\2Z\\\5\5\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3"+
		"\2\2\2`j\7$\2\2ae\7)\2\2bd\5\7\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ge\3\2\2\2hj\7)\2\2iY\3\2\2\2ia\3\2\2\2j\4\3\2\2\2kp\n\2"+
		"\2\2lm\7^\2\2mp\5\t\5\2np\5\27\f\2ok\3\2\2\2ol\3\2\2\2on\3\2\2\2p\6\3"+
		"\2\2\2qv\n\3\2\2rs\7^\2\2sv\5\t\5\2tv\5\27\f\2uq\3\2\2\2ur\3\2\2\2ut\3"+
		"\2\2\2v\b\3\2\2\2w|\5\13\6\2x|\7\62\2\2y|\5\r\7\2z|\5\17\b\2{w\3\2\2\2"+
		"{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\n\3\2\2\2}\u0080\5\21\t\2~\u0080\5\23"+
		"\n\2\177}\3\2\2\2\177~\3\2\2\2\u0080\f\3\2\2\2\u0081\u0082\7z\2\2\u0082"+
		"\u0083\5\33\16\2\u0083\u0084\5\33\16\2\u0084\16\3\2\2\2\u0085\u0086\7"+
		"w\2\2\u0086\u0087\5\33\16\2\u0087\u0088\5\33\16\2\u0088\u0089\5\33\16"+
		"\2\u0089\u008a\5\33\16\2\u008a\20\3\2\2\2\u008b\u008c\t\4\2\2\u008c\22"+
		"\3\2\2\2\u008d\u008e\n\5\2\2\u008e\24\3\2\2\2\u008f\u0093\5\21\t\2\u0090"+
		"\u0093\5M\'\2\u0091\u0093\t\6\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\26\3\2\2\2\u0094\u0095\7^\2\2\u0095\u0096"+
		"\5\31\r\2\u0096\30\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u009b\7\f\2\2\u0099"+
		"\u009b\5\35\17\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b\32\3\2"+
		"\2\2\u009c\u009d\t\7\2\2\u009d\34\3\2\2\2\u009e\u009f\t\b\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\b\17\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\t\t\2\2\u00a3"+
		" \3\2\2\2\u00a4\u00a5\t\n\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7%\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab("+
		"\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad*\3\2\2\2\u00ae\u00af\7\177\2\2\u00af"+
		",\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3\60"+
		"\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\62\3\2\2\2\u00b6\u00b8\5M\'\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7.\2\2\u00be8\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7"+
		"x\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7t\2\2\u00c4<\3\2\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7w\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7t\2\2\u00d9\u00da\7p\2\2\u00daB\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7g\2\2\u00dfD\3\2\2\2\u00e0\u00e1"+
		"\7h\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"H\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"\u00ed\7g\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7u\2\2\u00f2L\3\2\2\2\u00f3\u00f4\4\62;\2\u00f4"+
		"N\3\2\2\2\u00f5\u00f7\t\13\2\2\u00f6\u00f5\3\2\2\2\u00f7P\3\2\2\2\u00f8"+
		"\u00fe\5O(\2\u00f9\u00fd\5O(\2\u00fa\u00fd\5M\'\2\u00fb\u00fd\7a\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffR\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0103\t\f\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b*"+
		"\3\2\u0107T\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7\61\2\2\u010a\u010e"+
		"\3\2\2\2\u010b\u010d\n\r\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0111\u0112\b+\4\2\u0112V\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115"+
		"\7,\2\2\u0115\u0119\3\2\2\2\u0116\u0118\13\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7,\2\2\u011d\u011e\7\61\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\b,\5\2\u0120X\3\2\2\2\23\2]eiou{\177\u0092"+
		"\u009a\u00b9\u00f6\u00fc\u00fe\u0104\u010e\u0119";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}