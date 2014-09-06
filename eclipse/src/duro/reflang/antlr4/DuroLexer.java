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
		OPEN_PAR=1, CLOSE_PAR=2, EQUALS=3, INT=4, SEMICOLON=5, COMMA=6, KW_VAR=7, 
		KW_PAUSE=8, ID=9, WS=10, SINGLELINE_COMMENT=11, MULTI_LINE_COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'='", "INT", "';'", "','", "'var'", "'pause'", "ID", "WS", 
		"SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"OPEN_PAR", "CLOSE_PAR", "EQUALS", "INT", "SEMICOLON", "COMMA", "KW_VAR", 
		"KW_PAUSE", "DIGIT", "LETTER", "ID", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;

		case 12: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 13: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\5\13<\n\13\3\f\3\f\3\f\3\f\7\fB\n\f\f\f\16\fE\13\f\3"+
		"\r\6\rH\n\r\r\r\16\rI\3\r\3\r\3\16\3\16\3\16\3\16\7\16R\n\16\f\16\16\16"+
		"U\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17]\n\17\f\17\16\17`\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3^\20\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\2\1\25\2\1\27\13\1\31\f\2\33\r\3\35\16\4\3\2\5\4\2C\\c|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3"+
		"\2\2\2\t&\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\62\3\2\2\2\23"+
		"8\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31G\3\2\2\2\33M\3\2\2\2\35X\3\2\2\2"+
		"\37 \7*\2\2 \4\3\2\2\2!\"\7+\2\2\"\6\3\2\2\2#$\7?\2\2$\b\3\2\2\2%\'\5"+
		"\23\n\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*+\7=\2\2+"+
		"\f\3\2\2\2,-\7.\2\2-\16\3\2\2\2./\7x\2\2/\60\7c\2\2\60\61\7t\2\2\61\20"+
		"\3\2\2\2\62\63\7r\2\2\63\64\7c\2\2\64\65\7w\2\2\65\66\7u\2\2\66\67\7g"+
		"\2\2\67\22\3\2\2\289\4\62;\29\24\3\2\2\2:<\t\2\2\2;:\3\2\2\2<\26\3\2\2"+
		"\2=C\5\25\13\2>B\5\25\13\2?B\5\23\n\2@B\7a\2\2A>\3\2\2\2A?\3\2\2\2A@\3"+
		"\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\30\3\2\2\2EC\3\2\2\2FH\t\3\2\2G"+
		"F\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\r\2\2L\32\3\2\2"+
		"\2MN\7\61\2\2NO\7\61\2\2OS\3\2\2\2PR\n\4\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\b\16\3\2W\34\3\2\2\2XY\7\61\2\2Y"+
		"Z\7,\2\2Z^\3\2\2\2[]\13\2\2\2\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2"+
		"\2_a\3\2\2\2`^\3\2\2\2ab\7,\2\2bc\7\61\2\2cd\3\2\2\2de\b\17\4\2e\36\3"+
		"\2\2\2\n\2(;ACIS^";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}