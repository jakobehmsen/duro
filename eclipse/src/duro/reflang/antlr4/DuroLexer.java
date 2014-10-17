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
		VAR=1, PSEUDO_VAR=2, INT=3, ID_CAP=4, ID_UNCAP=5, PIPE=6, HASH=7, AT=8, 
		DOT=9, SINGLE_QUOTE=10, COMMA=11, COLON=12, SEMI_COLON=13, BACK_SLASH=14, 
		DOLLAR=15, PAR_OP=16, PAR_CL=17, SQ_OP=18, SQ_CL=19, BRA_OP=20, BAR_CL=21, 
		BIN_OP=22, ASSIGN=23, ASSIGN_PROTO=24, ASSIGN_QUOTED=25, WS=26, SINGLELINE_COMMENT=27, 
		MULTI_LINE_COMMENT=28, STRING=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'|'", "'#'", "'@'", 
		"'.'", "'''", "','", "':'", "';'", "'\\'", "'$'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "BIN_OP", "'='", "'^='", "'=>'", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT", "STRING"
	};
	public static final String[] ruleNames = {
		"VAR", "PSEUDO_VAR", "INT", "DIGIT", "LETTER_LOWER", "LETTER_UPPER", "LETTER", 
		"ID_CAP", "ID_UNCAP", "PIPE", "HASH", "AT", "DOT", "SINGLE_QUOTE", "COMMA", 
		"COLON", "SEMI_COLON", "BACK_SLASH", "DOLLAR", "PAR_OP", "PAR_CL", "SQ_OP", 
		"SQ_CL", "BRA_OP", "BAR_CL", "BIN_OP", "ASSIGN", "ASSIGN_PROTO", "ASSIGN_QUOTED", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", "STRING", "HexDigit", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape"
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
		case 29: WS_action((RuleContext)_localctx, actionIndex); break;

		case 30: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 31: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u0103\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3h\n\3\3\4\6\4k\n\4\r\4\16\4l\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5"+
		"\bw\n\b\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0086\n\n\f\n\16\n\u0089\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b6\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\6\37\u00c1\n\37\r\37\16\37\u00c2\3\37\3\37\3"+
		" \3 \3 \3 \7 \u00cb\n \f \16 \u00ce\13 \3 \3 \3!\3!\3!\3!\7!\u00d6\n!"+
		"\f!\16!\u00d9\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u00e3\n\"\f\"\16\"\u00e6"+
		"\13\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u00f0\n$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u00fb\n%\3&\3&\3&\3&\3&\3&\3&\3\u00d7\'\3\3\1\5\4\1\7\5\1\t\2\1\13"+
		"\2\1\r\2\1\17\2\1\21\6\1\23\7\1\25\b\1\27\t\1\31\n\1\33\13\1\35\f\1\37"+
		"\r\1!\16\1#\17\1%\20\1\'\21\1)\22\1+\23\1-\24\1/\25\1\61\26\1\63\27\1"+
		"\65\30\1\67\31\19\32\1;\33\1=\34\2?\35\3A\36\4C\37\1E\2\1G\2\1I\2\1K\2"+
		"\1\3\2\f\3\2c|\3\2C\\\6\2\'\',-//\61\61\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\u0115\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2"+
		"\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3"+
		"M\3\2\2\2\5g\3\2\2\2\7j\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17v"+
		"\3\2\2\2\21x\3\2\2\2\23\u0081\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2"+
		"\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2"+
		"!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3"+
		"\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63"+
		"\u00a8\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bc"+
		"\3\2\2\2=\u00c0\3\2\2\2?\u00c6\3\2\2\2A\u00d1\3\2\2\2C\u00df\3\2\2\2E"+
		"\u00e9\3\2\2\2G\u00ef\3\2\2\2I\u00fa\3\2\2\2K\u00fc\3\2\2\2MN\7x\2\2N"+
		"O\7c\2\2OP\7t\2\2P\4\3\2\2\2QR\7v\2\2RS\7j\2\2ST\7k\2\2Th\7u\2\2UV\7p"+
		"\2\2VW\7w\2\2WX\7n\2\2Xh\7n\2\2YZ\7v\2\2Z[\7t\2\2[\\\7w\2\2\\h\7g\2\2"+
		"]^\7h\2\2^_\7c\2\2_`\7n\2\2`a\7u\2\2ah\7g\2\2bc\7h\2\2cd\7t\2\2de\7c\2"+
		"\2ef\7o\2\2fh\7g\2\2gQ\3\2\2\2gU\3\2\2\2gY\3\2\2\2g]\3\2\2\2gb\3\2\2\2"+
		"h\6\3\2\2\2ik\5\t\5\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\b\3\2\2"+
		"\2no\4\62;\2o\n\3\2\2\2pq\t\2\2\2q\f\3\2\2\2rs\t\3\2\2s\16\3\2\2\2tw\5"+
		"\13\6\2uw\5\r\7\2vt\3\2\2\2vu\3\2\2\2w\20\3\2\2\2x~\5\r\7\2y}\5\17\b\2"+
		"z}\5\t\5\2{}\7a\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\22\3\2\2\2\u0080~\3\2\2\2\u0081\u0087\5\13\6\2\u0082"+
		"\u0086\5\17\b\2\u0083\u0086\5\t\5\2\u0084\u0086\7a\2\2\u0085\u0082\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\24\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008b\7~\2\2\u008b\26\3\2\2\2\u008c\u008d\7%\2\2\u008d\30\3\2"+
		"\2\2\u008e\u008f\7B\2\2\u008f\32\3\2\2\2\u0090\u0091\7\60\2\2\u0091\34"+
		"\3\2\2\2\u0092\u0093\7)\2\2\u0093\36\3\2\2\2\u0094\u0095\7.\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7<\2\2\u0097\"\3\2\2\2\u0098\u0099\7=\2\2\u0099"+
		"$\3\2\2\2\u009a\u009b\7^\2\2\u009b&\3\2\2\2\u009c\u009d\7&\2\2\u009d("+
		"\3\2\2\2\u009e\u009f\7*\2\2\u009f*\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1,\3"+
		"\2\2\2\u00a2\u00a3\7]\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5\60\3"+
		"\2\2\2\u00a6\u00a7\7}\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9"+
		"\64\3\2\2\2\u00aa\u00b6\t\4\2\2\u00ab\u00ac\7?\2\2\u00ac\u00b6\7?\2\2"+
		"\u00ad\u00ae\7#\2\2\u00ae\u00b6\7?\2\2\u00af\u00b6\7@\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\u00b6\7?\2\2\u00b2\u00b6\7>\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\u00b6\7?\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ad\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7?\2\2\u00b88\3\2\2\2\u00b9"+
		"\u00ba\7`\2\2\u00ba\u00bb\7?\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\u00be\7@\2\2\u00be<\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\b\37\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8"+
		"\7\61\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\n\6\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b \3\2\u00d0@\3\2\2\2\u00d1\u00d2"+
		"\7\61\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00dc\7\61\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b!\4\2\u00deB\3\2\2\2"+
		"\u00df\u00e4\7$\2\2\u00e0\u00e3\5G$\2\u00e1\u00e3\n\7\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$"+
		"\2\2\u00e8D\3\2\2\2\u00e9\u00ea\t\b\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7^"+
		"\2\2\u00ec\u00f0\t\t\2\2\u00ed\u00f0\5K&\2\u00ee\u00f0\5I%\2\u00ef\u00eb"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0H\3\2\2\2\u00f1"+
		"\u00f2\7^\2\2\u00f2\u00f3\t\n\2\2\u00f3\u00f4\t\13\2\2\u00f4\u00fb\t\13"+
		"\2\2\u00f5\u00f6\7^\2\2\u00f6\u00f7\t\13\2\2\u00f7\u00fb\t\13\2\2\u00f8"+
		"\u00f9\7^\2\2\u00f9\u00fb\t\13\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7^\2\2\u00fd\u00fe"+
		"\7w\2\2\u00fe\u00ff\5E#\2\u00ff\u0100\5E#\2\u0100\u0101\5E#\2\u0101\u0102"+
		"\5E#\2\u0102L\3\2\2\2\22\2glv|~\u0085\u0087\u00b5\u00c2\u00cc\u00d7\u00e2"+
		"\u00e4\u00ef\u00fa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}