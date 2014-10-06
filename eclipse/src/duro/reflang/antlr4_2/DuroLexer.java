// Generated from C:\github\duro\eclipse\src\duro\reflang\antlr4_2\Duro.g4 by ANTLR 4.1
package duro.reflang.antlr4_2;
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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PARAGRAPH=6, PIPE=7, 
		HASH=8, DOT=9, COMMA=10, COLON=11, DOLLAR=12, PAR_OP=13, PAR_CL=14, SQ_OP=15, 
		SQ_CL=16, BRA_OP=17, BAR_CL=18, BIN_OP=19, ASSIGN=20, ASSIGN_PROTO=21, 
		ASSIGN_QUOTED=22, WS_NL=23, WS_NOT_NL=24, SINGLELINE_COMMENT=25, MULTI_LINE_COMMENT=26, 
		STRING=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'�'", "'|'", "'#'", 
		"'.'", "','", "':'", "'$'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"BIN_OP", "'='", "'^='", "'=>'", "'\r\n'", "WS_NOT_NL", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT", "STRING"
	};
	public static final String[] ruleNames = {
		"VAR", "PSEUDO_VAR", "INT", "DIGIT", "LETTER_LOWER", "LETTER_UPPER", "LETTER", 
		"ID_CAP", "ID_UNCAP", "PARAGRAPH", "PIPE", "HASH", "DOT", "COMMA", "COLON", 
		"DOLLAR", "PAR_OP", "PAR_CL", "SQ_OP", "SQ_CL", "BRA_OP", "BAR_CL", "BIN_OP", 
		"ASSIGN", "ASSIGN_PROTO", "ASSIGN_QUOTED", "WS_NL", "WS_NOT_NL", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT", "STRING", "HexDigit", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape"
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
		case 27: WS_NOT_NL_action((RuleContext)_localctx, actionIndex); break;

		case 28: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 29: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_NOT_NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u00fa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3d\n"+
		"\3\3\4\6\4g\n\4\r\4\16\4h\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5\bs\n\b\3\t"+
		"\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f\n"+
		"\16\n\u0085\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00aa\n\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00b8\n\35"+
		"\r\35\16\35\u00b9\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00c2\n\36\f\36\16"+
		"\36\u00c5\13\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00cd\n\37\f\37\16"+
		"\37\u00d0\13\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u00da\n \f \16 \u00dd"+
		"\13 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\5\"\u00e7\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u00f2\n#\3$\3$\3$\3$\3$\3$\3$\3\u00ce%\3\3\1\5\4\1\7\5\1\t\2\1"+
		"\13\2\1\r\2\1\17\2\1\21\6\1\23\7\1\25\b\1\27\t\1\31\n\1\33\13\1\35\f\1"+
		"\37\r\1!\16\1#\17\1%\20\1\'\21\1)\22\1+\23\1-\24\1/\25\1\61\26\1\63\27"+
		"\1\65\30\1\67\31\19\32\2;\33\3=\34\4?\35\1A\2\1C\2\1E\2\1G\2\1\3\2\f\3"+
		"\2c|\3\2C\\\6\2\'\',-//\61\61\5\2\13\13\16\16\"\"\4\2\f\f\17\17\4\2$$"+
		"^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\u010b\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3I\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\t"+
		"j\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23}\3\2\2\2\25"+
		"\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e"+
		"\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u0098\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a9\3"+
		"\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b3\3\2"+
		"\2\29\u00b7\3\2\2\2;\u00bd\3\2\2\2=\u00c8\3\2\2\2?\u00d6\3\2\2\2A\u00e0"+
		"\3\2\2\2C\u00e6\3\2\2\2E\u00f1\3\2\2\2G\u00f3\3\2\2\2IJ\7x\2\2JK\7c\2"+
		"\2KL\7t\2\2L\4\3\2\2\2MN\7v\2\2NO\7j\2\2OP\7k\2\2Pd\7u\2\2QR\7p\2\2RS"+
		"\7w\2\2ST\7n\2\2Td\7n\2\2UV\7v\2\2VW\7t\2\2WX\7w\2\2Xd\7g\2\2YZ\7h\2\2"+
		"Z[\7c\2\2[\\\7n\2\2\\]\7u\2\2]d\7g\2\2^_\7h\2\2_`\7t\2\2`a\7c\2\2ab\7"+
		"o\2\2bd\7g\2\2cM\3\2\2\2cQ\3\2\2\2cU\3\2\2\2cY\3\2\2\2c^\3\2\2\2d\6\3"+
		"\2\2\2eg\5\t\5\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\b\3\2\2\2jk"+
		"\4\62;\2k\n\3\2\2\2lm\t\2\2\2m\f\3\2\2\2no\t\3\2\2o\16\3\2\2\2ps\5\13"+
		"\6\2qs\5\r\7\2rp\3\2\2\2rq\3\2\2\2s\20\3\2\2\2tz\5\r\7\2uy\5\17\b\2vy"+
		"\5\t\5\2wy\7a\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{"+
		"\3\2\2\2{\22\3\2\2\2|z\3\2\2\2}\u0083\5\13\6\2~\u0082\5\17\b\2\177\u0082"+
		"\5\t\5\2\u0080\u0082\7a\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\u00a9\2\2\u0087\26\3\2\2"+
		"\2\u0088\u0089\7~\2\2\u0089\30\3\2\2\2\u008a\u008b\7%\2\2\u008b\32\3\2"+
		"\2\2\u008c\u008d\7\60\2\2\u008d\34\3\2\2\2\u008e\u008f\7.\2\2\u008f\36"+
		"\3\2\2\2\u0090\u0091\7<\2\2\u0091 \3\2\2\2\u0092\u0093\7&\2\2\u0093\""+
		"\3\2\2\2\u0094\u0095\7*\2\2\u0095$\3\2\2\2\u0096\u0097\7+\2\2\u0097&\3"+
		"\2\2\2\u0098\u0099\7]\2\2\u0099(\3\2\2\2\u009a\u009b\7_\2\2\u009b*\3\2"+
		"\2\2\u009c\u009d\7}\2\2\u009d,\3\2\2\2\u009e\u009f\7\177\2\2\u009f.\3"+
		"\2\2\2\u00a0\u00aa\t\4\2\2\u00a1\u00a2\7?\2\2\u00a2\u00aa\7?\2\2\u00a3"+
		"\u00aa\7@\2\2\u00a4\u00a5\7@\2\2\u00a5\u00aa\7?\2\2\u00a6\u00aa\7>\2\2"+
		"\u00a7\u00a8\7>\2\2\u00a8\u00aa\7?\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a1"+
		"\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\62\3\2\2\2\u00ad"+
		"\u00ae\7`\2\2\u00ae\u00af\7?\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		"\u00b2\7@\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7\f\2"+
		"\2\u00b58\3\2\2\2\u00b6\u00b8\t\5\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\b\35\2\2\u00bc:\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2"+
		"\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\n\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\b\36\3\2\u00c7<\3\2\2\2\u00c8\u00c9\7\61\2"+
		"\2\u00c9\u00ca\7,\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\13\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2\u00d3\7\61"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\37\4\2\u00d5>\3\2\2\2\u00d6\u00db"+
		"\7$\2\2\u00d7\u00da\5C\"\2\u00d8\u00da\n\7\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7$\2\2\u00df"+
		"@\3\2\2\2\u00e0\u00e1\t\b\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7^\2\2\u00e3"+
		"\u00e7\t\t\2\2\u00e4\u00e7\5G$\2\u00e5\u00e7\5E#\2\u00e6\u00e2\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7"+
		"^\2\2\u00e9\u00ea\t\n\2\2\u00ea\u00eb\t\13\2\2\u00eb\u00f2\t\13\2\2\u00ec"+
		"\u00ed\7^\2\2\u00ed\u00ee\t\13\2\2\u00ee\u00f2\t\13\2\2\u00ef\u00f0\7"+
		"^\2\2\u00f0\u00f2\t\13\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2F\3\2\2\2\u00f3\u00f4\7^\2\2\u00f4\u00f5\7w\2\2\u00f5"+
		"\u00f6\5A!\2\u00f6\u00f7\5A!\2\u00f7\u00f8\5A!\2\u00f8\u00f9\5A!\2\u00f9"+
		"H\3\2\2\2\22\2chrxz\u0081\u0083\u00a9\u00b9\u00c3\u00ce\u00d9\u00db\u00e6"+
		"\u00f1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}