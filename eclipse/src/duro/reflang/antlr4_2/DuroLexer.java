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
		RETURN=1, VAR=2, PSEUDO_VAR=3, INT=4, ID_CAP=5, ID_UNCAP=6, PARAGRAPH=7, 
		PIPE=8, HASH=9, DOT=10, COMMA=11, COLON=12, PAR_OP=13, PAR_CL=14, SQ_OP=15, 
		SQ_CL=16, BRA_OP=17, BAR_CL=18, BIN_OP=19, ASSIGN=20, ASSIGN_PROTO=21, 
		ASSIGN_QUOTED=22, WS=23, SINGLELINE_COMMENT=24, MULTI_LINE_COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return'", "'var'", "PSEUDO_VAR", "INT", "ID_CAP", "ID_UNCAP", "'§'", 
		"'|'", "'#'", "'.'", "','", "':'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "BIN_OP", "'='", "'^='", "'=>'", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"RETURN", "VAR", "PSEUDO_VAR", "INT", "DIGIT", "LETTER_LOWER", "LETTER_UPPER", 
		"LETTER", "ID_CAP", "ID_UNCAP", "PARAGRAPH", "PIPE", "HASH", "DOT", "COMMA", 
		"COLON", "PAR_OP", "PAR_CL", "SQ_OP", "SQ_CL", "BRA_OP", "BAR_CL", "BIN_OP", 
		"ASSIGN", "ASSIGN_PROTO", "ASSIGN_QUOTED", "WS", "SINGLELINE_COMMENT", 
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
		case 26: WS_action((RuleContext)_localctx, actionIndex); break;

		case 27: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 28: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\6\5]\n\5\r\5\16\5^\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\7\no\n\n\f\n\16\nr\13"+
		"\n\3\13\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u009e\n\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\6\34"+
		"\u00a9\n\34\r\34\16\34\u00aa\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b3"+
		"\n\35\f\35\16\35\u00b6\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00be"+
		"\n\36\f\36\16\36\u00c1\13\36\3\36\3\36\3\36\3\36\3\36\3\u00bf\37\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\2\1\r\2\1\17\2\1\21\2\1\23\7\1\25\b\1\27\t\1\31"+
		"\n\1\33\13\1\35\f\1\37\r\1!\16\1#\17\1%\20\1\'\21\1)\22\1+\23\1-\24\1"+
		"/\25\1\61\26\1\63\27\1\65\30\1\67\31\29\32\3;\33\4\3\2\7\3\2c|\3\2C\\"+
		"\6\2\'\',-//\61\61\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00d5\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\3=\3\2\2\2\5D\3\2\2\2\7Y\3\2\2\2\t\\\3\2\2\2\13`\3\2\2\2"+
		"\rb\3\2\2\2\17d\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25s\3\2\2\2\27|\3\2\2"+
		"\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086"+
		"\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2"+
		"+\u0090\3\2\2\2-\u0092\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a1"+
		"\3\2\2\2\65\u00a4\3\2\2\2\67\u00a8\3\2\2\29\u00ae\3\2\2\2;\u00b9\3\2\2"+
		"\2=>\7t\2\2>?\7g\2\2?@\7v\2\2@A\7w\2\2AB\7t\2\2BC\7p\2\2C\4\3\2\2\2DE"+
		"\7x\2\2EF\7c\2\2FG\7t\2\2G\6\3\2\2\2HI\7v\2\2IJ\7j\2\2JK\7k\2\2KZ\7u\2"+
		"\2LM\7p\2\2MN\7w\2\2NO\7n\2\2OZ\7n\2\2PQ\7v\2\2QR\7t\2\2RS\7w\2\2SZ\7"+
		"g\2\2TU\7h\2\2UV\7c\2\2VW\7n\2\2WX\7u\2\2XZ\7g\2\2YH\3\2\2\2YL\3\2\2\2"+
		"YP\3\2\2\2YT\3\2\2\2Z\b\3\2\2\2[]\5\13\6\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\n\3\2\2\2`a\4\62;\2a\f\3\2\2\2bc\t\2\2\2c\16\3\2\2\2d"+
		"e\t\3\2\2e\20\3\2\2\2fi\5\r\7\2gi\5\17\b\2hf\3\2\2\2hg\3\2\2\2i\22\3\2"+
		"\2\2jp\5\17\b\2ko\5\21\t\2lo\5\13\6\2mo\7a\2\2nk\3\2\2\2nl\3\2\2\2nm\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\24\3\2\2\2rp\3\2\2\2sy\5\r\7\2t"+
		"x\5\21\t\2ux\5\13\6\2vx\7a\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z\26\3\2\2\2{y\3\2\2\2|}\7\u00a9\2\2}\30\3\2\2\2~"+
		"\177\7~\2\2\177\32\3\2\2\2\u0080\u0081\7%\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7\60\2\2\u0083\36\3\2\2\2\u0084\u0085\7.\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7<\2\2\u0087\"\3\2\2\2\u0088\u0089\7*\2\2\u0089$\3\2\2\2\u008a\u008b"+
		"\7+\2\2\u008b&\3\2\2\2\u008c\u008d\7]\2\2\u008d(\3\2\2\2\u008e\u008f\7"+
		"_\2\2\u008f*\3\2\2\2\u0090\u0091\7}\2\2\u0091,\3\2\2\2\u0092\u0093\7\177"+
		"\2\2\u0093.\3\2\2\2\u0094\u009e\t\4\2\2\u0095\u0096\7?\2\2\u0096\u009e"+
		"\7?\2\2\u0097\u009e\7@\2\2\u0098\u0099\7@\2\2\u0099\u009e\7?\2\2\u009a"+
		"\u009e\7>\2\2\u009b\u009c\7>\2\2\u009c\u009e\7?\2\2\u009d\u0094\3\2\2"+
		"\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009a"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\60\3\2\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\62\3\2\2\2\u00a1\u00a2\7`\2\2\u00a2\u00a3\7?\2\2\u00a3\64\3\2\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\u00a6\7@\2\2\u00a6\66\3\2\2\2\u00a7\u00a9\t\5\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\34\2\2\u00ad8\3\2\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\n"+
		"\6\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\35"+
		"\3\2\u00b8:\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bf"+
		"\3\2\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\b\36\4\2\u00c6<\3\2\2\2\16\2Y^hnpwy\u009d\u00aa\u00b4\u00bf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}