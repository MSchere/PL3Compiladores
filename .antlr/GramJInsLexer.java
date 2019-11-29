// Generated from c:\Users\Manuel\Desktop\ \Programación\Java\PL3Compiladores\PL3Compiladores\GramJIns.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramJInsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, WS=3, COMENTARIO_BLOQUE=4, INT=5, NEWLINE=6, COMA=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CI", "CD", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", "COMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CI", "CD", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", "COMA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GramJInsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramJIns.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\6"+
		"\4\27\n\4\r\4\16\4\30\3\4\3\4\3\5\3\5\3\5\3\5\7\5!\n\5\f\5\16\5$\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\7\6\7\61\n\7\r\7\16\7\62"+
		"\3\b\3\b\3\"\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\4\2\13\13\"\"\3\2"+
		"\62;\4\2\f\f\17\17\29\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\26"+
		"\3\2\2\2\t\34\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2\17\64\3\2\2\2\21\22\7]"+
		"\2\2\22\4\3\2\2\2\23\24\7_\2\2\24\6\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2"+
		"\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\b\4\2"+
		"\2\33\b\3\2\2\2\34\35\7\61\2\2\35\36\7,\2\2\36\"\3\2\2\2\37!\13\2\2\2"+
		" \37\3\2\2\2!$\3\2\2\2\"#\3\2\2\2\" \3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7"+
		",\2\2&\'\7\61\2\2\'(\3\2\2\2()\b\5\2\2)\n\3\2\2\2*,\t\3\2\2+*\3\2\2\2"+
		",-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\16\3\2\2\2\64\65\7.\2\2\65\20"+
		"\3\2\2\2\7\2\30\"-\62\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}