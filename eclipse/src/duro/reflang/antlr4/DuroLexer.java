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
		EQUALS=1, INT=2, SEMICOLON=3, KW_VAR=4, KW_PAUSE=5, ID=6, WS=7, SINGLELINE_COMMENT=8, 
		MULTI_LINE_COMMENT=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "INT", "';'", "'var'", "'pause'", "ID", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"EQUALS", "INT", "SEMICOLON", "KW_VAR", "KW_PAUSE", "DIGIT", "LETTER", 
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
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;

		case 9: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 10: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\6\3\35\n\3\r\3\16\3\36\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\b\60\n\b\3\t\3\t\3\t\3\t\7\t\66"+
		"\n\t\f\t\16\t9\13\t\3\n\6\n<\n\n\r\n\16\n=\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13F\n\13\f\13\16\13I\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fQ\n\f\f\f\16"+
		"\fT\13\f\3\f\3\f\3\f\3\f\3\f\3R\r\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\2\1"+
		"\17\2\1\21\b\1\23\t\2\25\n\3\27\13\4\3\2\5\4\2C\\c|\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2"+
		"\2\5\34\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13&\3\2\2\2\r,\3\2\2\2\17/\3\2"+
		"\2\2\21\61\3\2\2\2\23;\3\2\2\2\25A\3\2\2\2\27L\3\2\2\2\31\32\7?\2\2\32"+
		"\4\3\2\2\2\33\35\5\r\7\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\6\3\2\2\2 !\7=\2\2!\b\3\2\2\2\"#\7x\2\2#$\7c\2\2$%\7t\2"+
		"\2%\n\3\2\2\2&\'\7r\2\2\'(\7c\2\2()\7w\2\2)*\7u\2\2*+\7g\2\2+\f\3\2\2"+
		"\2,-\4\62;\2-\16\3\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\20\3\2\2\2\61\67\5\17"+
		"\b\2\62\66\5\17\b\2\63\66\5\r\7\2\64\66\7a\2\2\65\62\3\2\2\2\65\63\3\2"+
		"\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\22\3\2\2\29"+
		"\67\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?@\b\n\2\2@\24\3\2\2\2AB\7\61\2\2BC\7\61\2\2CG\3\2\2\2DF\n\4\2\2ED\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\b\13\3\2K\26"+
		"\3\2\2\2LM\7\61\2\2MN\7,\2\2NR\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2"+
		"RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7,\2\2VW\7\61\2\2WX\3\2\2\2"+
		"XY\b\f\4\2Y\30\3\2\2\2\n\2\36/\65\67=GR";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}