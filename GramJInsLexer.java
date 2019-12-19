// Generated from .\GramJIns.g4 by ANTLR 4.7.2
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
		CI=1, CD=2, COM=3, LVI=4, LVD=5, COMA=6, PUNTO=7, WS=8, COMENTARIO_BLOQUE=9, 
		INT=10, NEWLINE=11, CADENA=12, ARRAY=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "COM", "LVI", "LVD", "COMA", "PUNTO", "WS", "COMENTARIO_BLOQUE", 
			"INT", "NEWLINE", "CADENA", "ESC", "ARRAY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'\"'", "'{'", "'}'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "COM", "LVI", "LVD", "COMA", "PUNTO", "WS", "COMENTARIO_BLOQUE", 
			"INT", "NEWLINE", "CADENA", "ARRAY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t/\n\t\r\t\16\t\60\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\7\n9\n\n\f\n\16\n<\13\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13D\n\13\r\13"+
		"\16\13E\3\f\6\fI\n\f\r\f\16\fJ\3\r\3\r\7\rO\n\r\f\r\16\rR\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17^\n\17\3\17\5\17a\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17h\n\17\3\17\7\17k\n\17\f\17\16\17n\13\17\3"+
		"\17\3\17\4:P\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\2\35\17\3\2\6\4\2\13\13\"\"\3\2\62;\4\2\f\f\17\17\b\2$$^^ddppt"+
		"tvv\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t"+
		"%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21.\3\2\2\2\23\64\3\2\2"+
		"\2\25C\3\2\2\2\27H\3\2\2\2\31L\3\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37 \7]"+
		"\2\2 \4\3\2\2\2!\"\7_\2\2\"\6\3\2\2\2#$\7$\2\2$\b\3\2\2\2%&\7}\2\2&\n"+
		"\3\2\2\2\'(\7\177\2\2(\f\3\2\2\2)*\7.\2\2*\16\3\2\2\2+,\7\60\2\2,\20\3"+
		"\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\b\t\2\2\63\22\3\2\2\2\64\65\7\61\2\2\65\66\7,\2\2\66:\3"+
		"\2\2\2\679\13\2\2\28\67\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2"+
		"\2<:\3\2\2\2=>\7,\2\2>?\7\61\2\2?@\3\2\2\2@A\b\n\2\2A\24\3\2\2\2BD\t\3"+
		"\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GI\t\4\2\2HG\3"+
		"\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\30\3\2\2\2LP\5\7\4\2MO\13\2\2\2"+
		"NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\7\4\2"+
		"T\32\3\2\2\2UV\7^\2\2VW\t\5\2\2W\34\3\2\2\2X`\5\t\5\2Y]\5\25\13\2Z[\5"+
		"\17\b\2[\\\5\25\13\2\\^\3\2\2\2]Z\3\2\2\2]^\3\2\2\2^a\3\2\2\2_a\5\31\r"+
		"\2`Y\3\2\2\2`_\3\2\2\2`a\3\2\2\2al\3\2\2\2bk\5\r\7\2cg\5\25\13\2de\5\17"+
		"\b\2ef\5\25\13\2fh\3\2\2\2gd\3\2\2\2gh\3\2\2\2hk\3\2\2\2ik\5\31\r\2jb"+
		"\3\2\2\2jc\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n"+
		"l\3\2\2\2op\5\13\6\2p\36\3\2\2\2\r\2\60:EJP]`gjl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}