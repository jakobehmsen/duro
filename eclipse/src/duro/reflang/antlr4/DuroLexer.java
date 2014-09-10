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
		COLON=19, DOT=20, KW_VAR=21, KW_PAUSE=22, KW_FUNCTION=23, KW_RETURN=24, 
		KW_TRUE=25, KW_FALSE=26, KW_IF=27, KW_ELSE=28, KW_THIS=29, KW_WHILE=30, 
		KW_FOR=31, KW_IN=32, ID=33, WS=34, SINGLELINE_COMMENT=35, MULTI_LINE_COMMENT=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING_LITERAL", "LINE_TERMINATOR", "'&&'", "'||'", "BIN_OP1", "BIN_OP2", 
		"'#'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'=='", "INT", 
		"';'", "','", "':'", "'.'", "'var'", "'pause'", "'function'", "'return'", 
		"'true'", "'false'", "'if'", "'else'", "'this'", "'while'", "'for'", "'in'", 
		"ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"STRING_LITERAL", "DOUBLE_STRING_CHARACTER", "SINGLE_STRING_CHARACTER", 
		"ESCAPE_SEQUENCE", "CHARACTER_ESCAPE_SEQUENCE", "HEX_ESCAPE_SEQUENCE", 
		"UNICODE_ESCAPE_SEQUENCE", "SINGLE_ESCAPE_CHARACTER", "NON_ESCAPE_CHARACTER", 
		"ESCAPE_CHARACTER", "LINE_CONTINUATION", "LINE_TERMINATOR_SEQUENCE", "HEX_DIGIT", 
		"LINE_TERMINATOR", "DOUBLE_AMP", "DOUBLE_PIPE", "BIN_OP1", "BIN_OP2", 
		"HASH", "OPEN_SQ", "CLOSE_SQ", "OPEN_BRA", "CLOSE_BRA", "OPEN_PAR", "CLOSE_PAR", 
		"EQUALS", "DOUBLE_EQUALS", "INT", "SEMICOLON", "COMMA", "COLON", "DOT", 
		"KW_VAR", "KW_PAUSE", "KW_FUNCTION", "KW_RETURN", "KW_TRUE", "KW_FALSE", 
		"KW_IF", "KW_ELSE", "KW_THIS", "KW_WHILE", "KW_FOR", "KW_IN", "DIGIT", 
		"LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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

		case 47: WS_action((RuleContext)_localctx, actionIndex); break;

		case 48: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 49: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u0147\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3\2\5\2x"+
		"\n\2\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3"+
		"\5\3\5\5\5\u008a\n\5\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\6"+
		"\35\u00cf\n\35\r\35\16\35\u00d0\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3/\5/\u011d"+
		"\n/\3\60\3\60\3\60\3\60\7\60\u0123\n\60\f\60\16\60\u0126\13\60\3\61\6"+
		"\61\u0129\n\61\r\61\16\61\u012a\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0133"+
		"\n\62\f\62\16\62\u0136\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u013e"+
		"\n\63\f\63\16\63\u0141\13\63\3\63\3\63\3\63\3\63\3\63\3\u013f\64\3\3\1"+
		"\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31"+
		"\2\1\33\2\1\35\4\2\37\5\1!\6\1#\7\1%\b\1\'\t\1)\n\1+\13\1-\f\1/\r\1\61"+
		"\16\1\63\17\1\65\20\1\67\21\19\22\1;\23\1=\24\1?\25\1A\26\1C\27\1E\30"+
		"\1G\31\1I\32\1K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\"\1[\2\1]\2\1_#"+
		"\1a$\3c%\4e&\5\3\2\16\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^d"+
		"dhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\4\2wwzz\5\2\62;CHch\5"+
		"\2\f\f\17\17\u202a\u202b\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\u014d\2\3\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\3w\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t\u0089\3\2\2\2"+
		"\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0093\3\2\2\2\21\u0099\3\2\2\2\23"+
		"\u009b\3\2\2\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa"+
		"\3\2\2\2\35\u00ac\3\2\2\2\37\u00b0\3\2\2\2!\u00b3\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0"+
		"\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2"+
		"\2\2\67\u00ca\3\2\2\29\u00ce\3\2\2\2;\u00d2\3\2\2\2=\u00d4\3\2\2\2?\u00d6"+
		"\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00de\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00ed\3\2\2\2K\u00f4\3\2\2\2M\u00f9\3\2\2\2O\u00ff\3\2\2\2Q\u0102\3\2"+
		"\2\2S\u0107\3\2\2\2U\u010c\3\2\2\2W\u0112\3\2\2\2Y\u0116\3\2\2\2[\u0119"+
		"\3\2\2\2]\u011c\3\2\2\2_\u011e\3\2\2\2a\u0128\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0139\3\2\2\2gk\7$\2\2hj\5\5\3\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2ln\3\2\2\2mk\3\2\2\2nx\7$\2\2os\7)\2\2pr\5\7\4\2qp\3\2\2\2ru\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vx\7)\2\2wg\3\2\2\2wo\3\2\2"+
		"\2x\4\3\2\2\2y~\n\2\2\2z{\7^\2\2{~\5\t\5\2|~\5\27\f\2}y\3\2\2\2}z\3\2"+
		"\2\2}|\3\2\2\2~\6\3\2\2\2\177\u0084\n\3\2\2\u0080\u0081\7^\2\2\u0081\u0084"+
		"\5\t\5\2\u0082\u0084\5\27\f\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\b\3\2\2\2\u0085\u008a\5\13\6\2\u0086\u008a\7\62\2"+
		"\2\u0087\u008a\5\r\7\2\u0088\u008a\5\17\b\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\n\3\2\2\2"+
		"\u008b\u008e\5\21\t\2\u008c\u008e\5\23\n\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\f\3\2\2\2\u008f\u0090\7z\2\2\u0090\u0091\5\33\16\2\u0091"+
		"\u0092\5\33\16\2\u0092\16\3\2\2\2\u0093\u0094\7w\2\2\u0094\u0095\5\33"+
		"\16\2\u0095\u0096\5\33\16\2\u0096\u0097\5\33\16\2\u0097\u0098\5\33\16"+
		"\2\u0098\20\3\2\2\2\u0099\u009a\t\4\2\2\u009a\22\3\2\2\2\u009b\u009c\n"+
		"\5\2\2\u009c\24\3\2\2\2\u009d\u00a1\5\21\t\2\u009e\u00a1\5[.\2\u009f\u00a1"+
		"\t\6\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7^\2\2\u00a3\u00a4\5\31\r\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7\17\2\2\u00a6\u00a9\7\f\2\2\u00a7\u00a9\5\35\17\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\t\7\2\2\u00ab"+
		"\34\3\2\2\2\u00ac\u00ad\t\b\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\17\2"+
		"\2\u00af\36\3\2\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\7(\2\2\u00b2 \3\2\2"+
		"\2\u00b3\u00b4\7~\2\2\u00b4\u00b5\7~\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\t"+
		"\t\2\2\u00b7$\3\2\2\2\u00b8\u00b9\t\n\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7"+
		"%\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7]\2\2\u00bd*\3\2\2\2\u00be\u00bf\7_"+
		"\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7\177"+
		"\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\7+\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\66\3\2\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\u00cc\7?\2\2\u00cc8\3\2\2\2\u00cd\u00cf\5[.\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		":\3\2\2\2\u00d2\u00d3\7=\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7.\2\2\u00d5>"+
		"\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7\60\2\2\u00d9"+
		"B\3\2\2\2\u00da\u00db\7x\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"D\3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5"+
		"\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2"+
		"\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7p\2\2\u00ecH\3\2\2"+
		"\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1"+
		"\7w\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3J\3\2\2\2\u00f4\u00f5"+
		"\7v\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"L\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2\u00fc"+
		"\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00feN\3\2\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7h\2\2\u0101P\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106R\3\2\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7j\2\2\u0109\u010a\7k\2\2\u010a\u010b\7u\2\2\u010bT\3\2\2\2\u010c"+
		"\u010d\7y\2\2\u010d\u010e\7j\2\2\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2"+
		"\u0110\u0111\7g\2\2\u0111V\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7q\2"+
		"\2\u0114\u0115\7t\2\2\u0115X\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7"+
		"p\2\2\u0118Z\3\2\2\2\u0119\u011a\4\62;\2\u011a\\\3\2\2\2\u011b\u011d\t"+
		"\13\2\2\u011c\u011b\3\2\2\2\u011d^\3\2\2\2\u011e\u0124\5]/\2\u011f\u0123"+
		"\5]/\2\u0120\u0123\5[.\2\u0121\u0123\7a\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125`\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129"+
		"\t\f\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b\61\3\2\u012db\3\2\2\2"+
		"\u012e\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130\u0134\3\2\2\2\u0131\u0133"+
		"\n\r\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b\62"+
		"\4\2\u0138d\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b\7,\2\2\u013b\u013f"+
		"\3\2\2\2\u013c\u013e\13\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0143\7,\2\2\u0143\u0144\7\61\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\b\63\5\2\u0146f\3\2\2\2\23\2ksw}\u0083\u0089\u008d\u00a0\u00a8"+
		"\u00d0\u011c\u0122\u0124\u012a\u0134\u013f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}