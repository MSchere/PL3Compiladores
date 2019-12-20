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
		CI=1, CD=2, COM=3, LVI=4, LVD=5, COMA=6, PUNTO=7, WS=8, COMENTARIO_BLOQUE=9, 
		INT=10, NEWLINE=11, CADENA=12, BOOL=13, ARRAY=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "COM", "LVI", "LVD", "COMA", "PUNTO", "WS", "COMENTARIO_BLOQUE", 
			"INT", "NEWLINE", "CADENA", "BOOL", "ESC", "ARRAY"
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
			"INT", "NEWLINE", "CADENA", "BOOL", "ARRAY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\61\n\t\r\t\16\t\62\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\7\n;\n\n\f\n\16\n>\13\n\3\n\3\n\3\n\3\n\3\n\3\13\6"+
		"\13F\n\13\r\13\16\13G\3\f\6\fK\n\f\r\f\16\fL\3\r\3\r\7\rQ\n\r\f\r\16\r"+
		"T\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16a\n\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20k\n\20\3\20\5\20n\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20u\n\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3"+
		"\20\3\20\4<R\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\20\3\2\6\4\2\13\13\"\"\3\2\62;\4\2\f\f\17\17\b\2$$^"+
		"^ddppttvv\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3"+
		"\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21\60"+
		"\3\2\2\2\23\66\3\2\2\2\25E\3\2\2\2\27J\3\2\2\2\31N\3\2\2\2\33`\3\2\2\2"+
		"\35b\3\2\2\2\37e\3\2\2\2!\"\7]\2\2\"\4\3\2\2\2#$\7_\2\2$\6\3\2\2\2%&\7"+
		"$\2\2&\b\3\2\2\2\'(\7}\2\2(\n\3\2\2\2)*\7\177\2\2*\f\3\2\2\2+,\7.\2\2"+
		",\16\3\2\2\2-.\7\60\2\2.\20\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\b\t\2\2\65\22\3\2"+
		"\2\2\66\67\7\61\2\2\678\7,\2\28<\3\2\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2"+
		"\2<=\3\2\2\2<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7,\2\2@A\7\61\2\2AB\3\2\2"+
		"\2BC\b\n\2\2C\24\3\2\2\2DF\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2H\26\3\2\2\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30"+
		"\3\2\2\2NR\5\7\4\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2"+
		"SU\3\2\2\2TR\3\2\2\2UV\5\7\4\2V\32\3\2\2\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2"+
		"Za\7g\2\2[\\\7h\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_a\7g\2\2`W\3\2\2\2`[\3"+
		"\2\2\2a\34\3\2\2\2bc\7^\2\2cd\t\5\2\2d\36\3\2\2\2em\5\t\5\2fj\5\25\13"+
		"\2gh\5\17\b\2hi\5\25\13\2ik\3\2\2\2jg\3\2\2\2jk\3\2\2\2kn\3\2\2\2ln\5"+
		"\31\r\2mf\3\2\2\2ml\3\2\2\2mn\3\2\2\2ny\3\2\2\2ox\5\r\7\2pt\5\25\13\2"+
		"qr\5\17\b\2rs\5\25\13\2su\3\2\2\2tq\3\2\2\2tu\3\2\2\2ux\3\2\2\2vx\5\31"+
		"\r\2wo\3\2\2\2wp\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2"+
		"\2\2{y\3\2\2\2|}\5\13\6\2} \3\2\2\2\16\2\62<GLR`jmtwy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}