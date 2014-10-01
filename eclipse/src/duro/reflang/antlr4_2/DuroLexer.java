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
		Number=1, WS=2, MULTIPLY=3, DIVIDE=4, ADD=5, SUBTRACT=6, LEFT=7, RIGHT=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Number", "WS", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
	};
	public static final String[] ruleNames = {
		"Number", "DIGIT", "WS", "MULTIPLY", "DIVIDE", "ADD", "SUBTRACT", "LEFT", 
		"RIGHT"
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
		case 2: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\nC\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\6\2$\n\2"+
		"\r\2\16\2%\3\2\6\2)\n\2\r\2\16\2*\5\2-\n\2\3\3\3\3\3\4\6\4\62\n\4\r\4"+
		"\16\4\63\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\2\13"+
		"\3\3\1\5\2\1\7\4\2\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\3\2\3\5\2\13"+
		"\f\17\17\"\"H\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3,\3\2\2\2\5.\3\2\2\2\7\61"+
		"\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23"+
		"A\3\2\2\2\25\27\5\5\3\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\32\3\2\2\2\32\36\7\60\2\2\33\35\5\5\3\2\34\33\3\2\2\2\35 "+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37-\3\2\2\2 \36\3\2\2\2!#\7\60\2"+
		"\2\"$\5\5\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&-\3\2\2\2\')\5"+
		"\5\3\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\26\3\2\2\2"+
		",!\3\2\2\2,(\3\2\2\2-\4\3\2\2\2./\4\62;\2/\6\3\2\2\2\60\62\t\2\2\2\61"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\b\4\2\2\66\b\3\2\2\2\678\7,\2\28\n\3\2\2\29:\7\61\2\2:\f\3\2\2\2;"+
		"<\7-\2\2<\16\3\2\2\2=>\7/\2\2>\20\3\2\2\2?@\7*\2\2@\22\3\2\2\2AB\7+\2"+
		"\2B\24\3\2\2\2\t\2\30\36%*,\63";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}