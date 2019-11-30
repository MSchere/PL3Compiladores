// Generated from GramJIns.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, COM=3, WS=4, COMENTARIO_BLOQUE=5, INT=6, NEWLINE=7, COMA=8, 
		CADENA=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "COM", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", "COMA", 
			"CADENA", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'\"'", null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "COM", "WS", "COMENTARIO_BLOQUE", "INT", "NEWLINE", 
			"COMA", "CADENA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13O\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\37\n\5\r\5\16\5 \3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\64\n\7\r\7"+
		"\16\7\65\3\b\6\b9\n\b\r\b\16\b:\3\t\3\t\3\n\3\n\3\n\6\nB\n\n\r\n\16\n"+
		"C\7\nF\n\n\f\n\16\nI\13\n\3\n\3\n\3\13\3\13\3\13\4*G\2\f\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\2\3\2\7\4\2\13\13\"\"\3\2\62;\4\2\f\f\17"+
		"\17\t\2\"\"..\60\60\62=C\\aac|\b\2$$^^ddppttvv\2T\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\36\3\2"+
		"\2\2\13$\3\2\2\2\r\63\3\2\2\2\178\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25L"+
		"\3\2\2\2\27\30\7]\2\2\30\4\3\2\2\2\31\32\7_\2\2\32\6\3\2\2\2\33\34\7$"+
		"\2\2\34\b\3\2\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!\"\3\2\2\2\"#\b\5\2\2#\n\3\2\2\2$%\7\61\2\2%&\7,\2\2&*\3\2"+
		"\2\2\')\13\2\2\2(\'\3\2\2\2),\3\2\2\2*+\3\2\2\2*(\3\2\2\2+-\3\2\2\2,*"+
		"\3\2\2\2-.\7,\2\2./\7\61\2\2/\60\3\2\2\2\60\61\b\6\2\2\61\f\3\2\2\2\62"+
		"\64\t\3\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\16\3\2\2\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\20"+
		"\3\2\2\2<=\7.\2\2=\22\3\2\2\2>G\5\7\4\2?F\5\25\13\2@B\t\5\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E?\3\2\2\2EA\3\2\2\2FI\3\2\2"+
		"\2GH\3\2\2\2GE\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\7\4\2K\24\3\2\2\2LM\7^"+
		"\2\2MN\t\6\2\2N\26\3\2\2\2\n\2 *\65:CEG\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}