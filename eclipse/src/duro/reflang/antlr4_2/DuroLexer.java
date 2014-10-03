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
		HASH=8, DOT=9, COMMA=10, COLON=11, PAR_OP=12, PAR_CL=13, SQ_OP=14, SQ_CL=15, 
		BRA_OP=16, BAR_CL=17, BIN_OP=18, ASSIGN=19, ASSIGN_PROTO=20, ASSIGN_QUOTED=21, 
		WS=22, SINGLELINE_COMMENT=23, MULTI_LINE_COMMENT=24, STRING=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", "'|'", "'#'", 
		"'.'", "','", "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", "BIN_OP", 
		"'='", "'^='", "'=>'", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", 
		"STRING"
	};
	public static final String[] ruleNames = {
		"VAR", "PSEUDO_VAR", "INT", "DIGIT", "LETTER_LOWER", "LETTER_UPPER", "LETTER", 
		"ID_CAP", "ID_UNCAP", "PARAGRAPH", "PIPE", "HASH", "DOT", "COMMA", "COLON", 
		"PAR_OP", "PAR_CL", "SQ_OP", "SQ_CL", "BRA_OP", "BAR_CL", "BIN_OP", "ASSIGN", 
		"ASSIGN_PROTO", "ASSIGN_QUOTED", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT", 
		"STRING", "HexDigit", "EscapeSequence", "OctalEscape", "UnicodeEscape"
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
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;

		case 26: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 27: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\6\4c\n"+
		"\4\r\4\16\4d\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t"+
		"\7\tu\n\t\f\t\16\tx\13\t\3\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00a4\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\6\33\u00af\n\33\r\33\16\33\u00b0\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\7\34\u00b9\n\34\f\34\16\34\u00bc\13\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\7\35\u00c4\n\35\f\35\16\35\u00c7\13\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\7\36\u00d1\n\36\f\36\16\36\u00d4\13\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \3 \5 \u00de\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e9\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\u00c5#\3\3\1\5\4\1\7\5\1\t\2\1\13\2\1\r\2\1"+
		"\17\2\1\21\6\1\23\7\1\25\b\1\27\t\1\31\n\1\33\13\1\35\f\1\37\r\1!\16\1"+
		"#\17\1%\20\1\'\21\1)\22\1+\23\1-\24\1/\25\1\61\26\1\63\27\1\65\30\2\67"+
		"\31\39\32\4;\33\1=\2\1?\2\1A\2\1C\2\1\3\2\f\3\2c|\3\2C\\\6\2\'\',-//\61"+
		"\61\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2$$^^\5\2\62;CHch\n\2$$))^^ddh"+
		"hppttvv\3\2\62\65\3\2\629\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3E\3\2\2\2\5"+
		"_\3\2\2\2\7b\3\2\2\2\tf\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17n\3\2\2\2\21"+
		"p\3\2\2\2\23y\3\2\2\2\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2"+
		"\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#"+
		"\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098\3"+
		"\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2"+
		"\65\u00ae\3\2\2\2\67\u00b4\3\2\2\29\u00bf\3\2\2\2;\u00cd\3\2\2\2=\u00d7"+
		"\3\2\2\2?\u00dd\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2EF\7x\2\2FG\7c\2"+
		"\2GH\7t\2\2H\4\3\2\2\2IJ\7v\2\2JK\7j\2\2KL\7k\2\2L`\7u\2\2MN\7p\2\2NO"+
		"\7w\2\2OP\7n\2\2P`\7n\2\2QR\7v\2\2RS\7t\2\2ST\7w\2\2T`\7g\2\2UV\7h\2\2"+
		"VW\7c\2\2WX\7n\2\2XY\7u\2\2Y`\7g\2\2Z[\7h\2\2[\\\7t\2\2\\]\7c\2\2]^\7"+
		"o\2\2^`\7g\2\2_I\3\2\2\2_M\3\2\2\2_Q\3\2\2\2_U\3\2\2\2_Z\3\2\2\2`\6\3"+
		"\2\2\2ac\5\t\5\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\b\3\2\2\2fg"+
		"\4\62;\2g\n\3\2\2\2hi\t\2\2\2i\f\3\2\2\2jk\t\3\2\2k\16\3\2\2\2lo\5\13"+
		"\6\2mo\5\r\7\2nl\3\2\2\2nm\3\2\2\2o\20\3\2\2\2pv\5\r\7\2qu\5\17\b\2ru"+
		"\5\t\5\2su\7a\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2w\22\3\2\2\2xv\3\2\2\2y\177\5\13\6\2z~\5\17\b\2{~\5\t\5\2|~\7"+
		"a\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\24\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\u00a9\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7~\2\2\u0085\30\3\2\2\2\u0086\u0087\7%\2\2\u0087"+
		"\32\3\2\2\2\u0088\u0089\7\60\2\2\u0089\34\3\2\2\2\u008a\u008b\7.\2\2\u008b"+
		"\36\3\2\2\2\u008c\u008d\7<\2\2\u008d \3\2\2\2\u008e\u008f\7*\2\2\u008f"+
		"\"\3\2\2\2\u0090\u0091\7+\2\2\u0091$\3\2\2\2\u0092\u0093\7]\2\2\u0093"+
		"&\3\2\2\2\u0094\u0095\7_\2\2\u0095(\3\2\2\2\u0096\u0097\7}\2\2\u0097*"+
		"\3\2\2\2\u0098\u0099\7\177\2\2\u0099,\3\2\2\2\u009a\u00a4\t\4\2\2\u009b"+
		"\u009c\7?\2\2\u009c\u00a4\7?\2\2\u009d\u00a4\7@\2\2\u009e\u009f\7@\2\2"+
		"\u009f\u00a4\7?\2\2\u00a0\u00a4\7>\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a4"+
		"\7?\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3"+
		"\u009e\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4.\3\2\2\2"+
		"\u00a5\u00a6\7?\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7`\2\2\u00a8\u00a9\7"+
		"?\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7@\2\2\u00ac\64"+
		"\3\2\2\2\u00ad\u00af\t\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\33"+
		"\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7\61\2\2\u00b6"+
		"\u00ba\3\2\2\2\u00b7\u00b9\n\6\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\b\34\3\2\u00be8\3\2\2\2\u00bf\u00c0\7\61\2"+
		"\2\u00c0\u00c1\7,\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\61"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\35\4\2\u00cc:\3\2\2\2\u00cd\u00d2"+
		"\7$\2\2\u00ce\u00d1\5? \2\u00cf\u00d1\n\7\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6"+
		"<\3\2\2\2\u00d7\u00d8\t\b\2\2\u00d8>\3\2\2\2\u00d9\u00da\7^\2\2\u00da"+
		"\u00de\t\t\2\2\u00db\u00de\5C\"\2\u00dc\u00de\5A!\2\u00dd\u00d9\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de@\3\2\2\2\u00df\u00e0"+
		"\7^\2\2\u00e0\u00e1\t\n\2\2\u00e1\u00e2\t\13\2\2\u00e2\u00e9\t\13\2\2"+
		"\u00e3\u00e4\7^\2\2\u00e4\u00e5\t\13\2\2\u00e5\u00e9\t\13\2\2\u00e6\u00e7"+
		"\7^\2\2\u00e7\u00e9\t\13\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ec\7w\2\2\u00ec"+
		"\u00ed\5=\37\2\u00ed\u00ee\5=\37\2\u00ee\u00ef\5=\37\2\u00ef\u00f0\5="+
		"\37\2\u00f0D\3\2\2\2\22\2_dntv}\177\u00a3\u00b0\u00ba\u00c5\u00d0\u00d2"+
		"\u00dd\u00e8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}