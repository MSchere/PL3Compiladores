// Generated from c:\Users\Manuel\Desktop\ \Programación\Java\PL3Compiladores\Antlr\Heredados\GramProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramProgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTIONid=1, BEGIN=2, END=3, STRINGid=4, INTid=5, VOIDid=6, INCLUDEid=7, 
		WHILEid=8, BOOLid=9, IFid=10, ELSEid=11, ENDIFid=12, RETURNid=13, TRUE=14, 
		FALSE=15, THENid=16, FORid=17, PI=18, PD=19, COMILLAS=20, COMA=21, FINSENTENCIA=22, 
		DOSPUNTOS=23, IGUAL=24, MAS=25, MENOS=26, MULTIPLICADO=27, DIVIDIDO=28, 
		IGUALIGUAL=29, DISTINTO=30, MAYOR=31, MENOR=32, AND=33, OR=34, OPERACION=35, 
		VAR=36, STRING=37, INT=38, FLOAT=39, WS=40, NEWLINE=41, COMENTARIO=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTIONid", "BEGIN", "END", "STRINGid", "INTid", "VOIDid", "INCLUDEid", 
		"WHILEid", "BOOLid", "IFid", "ELSEid", "ENDIFid", "RETURNid", "TRUE", 
		"FALSE", "THENid", "FORid", "PI", "PD", "COMILLAS", "COMA", "FINSENTENCIA", 
		"DOSPUNTOS", "IGUAL", "MAS", "MENOS", "MULTIPLICADO", "DIVIDIDO", "IGUALIGUAL", 
		"DISTINTO", "MAYOR", "MENOR", "AND", "OR", "OPERACION", "VAR", "STRING", 
		"ESC", "INT", "FLOAT", "LETRA", "DIGITO", "WS", "NEWLINE", "COMENTARIO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'begin'", "'end'", "'cadena'", "'numero'", "'void'", 
		"'include'", "'while'", "'booleano'", "'if'", "'else'", "'endif'", "'return'", 
		"'true'", "'false'", "'then'", "'for'", "'('", "')'", "'\"'", "','", "';'", 
		"':'", "':='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>'", "'<'", 
		"'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTIONid", "BEGIN", "END", "STRINGid", "INTid", "VOIDid", "INCLUDEid", 
		"WHILEid", "BOOLid", "IFid", "ELSEid", "ENDIFid", "RETURNid", "TRUE", 
		"FALSE", "THENid", "FORid", "PI", "PD", "COMILLAS", "COMA", "FINSENTENCIA", 
		"DOSPUNTOS", "IGUAL", "MAS", "MENOS", "MULTIPLICADO", "DIVIDIDO", "IGUALIGUAL", 
		"DISTINTO", "MAYOR", "MENOR", "AND", "OR", "OPERACION", "VAR", "STRING", 
		"INT", "FLOAT", "WS", "NEWLINE", "COMENTARIO"
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


	public GramProgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramProg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f4\n$\3%\6%\u00f7\n%\r%\16%\u00f8"+
		"\3%\7%\u00fc\n%\f%\16%\u00ff\13%\3&\3&\3&\7&\u0104\n&\f&\16&\u0107\13"+
		"&\3&\3&\3\'\3\'\3\'\3(\6(\u010f\n(\r(\16(\u0110\3)\6)\u0114\n)\r)\16)"+
		"\u0115\3)\3)\7)\u011a\n)\f)\16)\u011d\13)\3)\3)\6)\u0121\n)\r)\16)\u0122"+
		"\5)\u0125\n)\3*\3*\3+\3+\3,\6,\u012c\n,\r,\16,\u012d\3,\3,\3-\6-\u0133"+
		"\n-\r-\16-\u0134\3.\3.\3.\3.\7.\u013b\n.\f.\16.\u013e\13.\3.\3.\3.\3."+
		"\3.\7.\u0145\n.\f.\16.\u0148\13.\3.\3.\3.\3.\3.\3.\3.\5.\u0151\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u015c\n.\3.\3.\3.\3.\5.\u0162\n.\3.\3.\5\u0105"+
		"\u013c\u0146\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O(Q)S\2U\2W*Y+[,\3\2\t\4\2C\\c|"+
		"\6\2\62;C\\aac|\3\2$$\b\2$$^^ddppttvv\3\2\62;\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\2\u0175\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5f\3\2\2\2\7l\3\2\2\2\tp\3\2\2\2"+
		"\13w\3\2\2\2\r~\3\2\2\2\17\u0083\3\2\2\2\21\u008b\3\2\2\2\23\u0091\3\2"+
		"\2\2\25\u009a\3\2\2\2\27\u009d\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3\2\2"+
		"\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2!\u00ba\3\2\2\2#\u00bf\3\2\2\2%\u00c3"+
		"\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2"+
		"/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67"+
		"\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2?\u00e0\3\2"+
		"\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e7\3\2\2\2G\u00f3\3\2\2\2I\u00f6"+
		"\3\2\2\2K\u0100\3\2\2\2M\u010a\3\2\2\2O\u010e\3\2\2\2Q\u0124\3\2\2\2S"+
		"\u0126\3\2\2\2U\u0128\3\2\2\2W\u012b\3\2\2\2Y\u0132\3\2\2\2[\u0161\3\2"+
		"\2\2]^\7h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2\2ab\7v\2\2bc\7k\2\2cd\7q\2\2de"+
		"\7p\2\2e\4\3\2\2\2fg\7d\2\2gh\7g\2\2hi\7i\2\2ij\7k\2\2jk\7p\2\2k\6\3\2"+
		"\2\2lm\7g\2\2mn\7p\2\2no\7f\2\2o\b\3\2\2\2pq\7e\2\2qr\7c\2\2rs\7f\2\2"+
		"st\7g\2\2tu\7p\2\2uv\7c\2\2v\n\3\2\2\2wx\7p\2\2xy\7w\2\2yz\7o\2\2z{\7"+
		"g\2\2{|\7t\2\2|}\7q\2\2}\f\3\2\2\2~\177\7x\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\16\3\2\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086\u0087\7n\2\2\u0087\u0088\7w\2\2"+
		"\u0088\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\20\3\2\2\2\u008b\u008c\7"+
		"y\2\2\u008c\u008d\7j\2\2\u008d\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7g\2\2\u0090\22\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7q\2\2\u0099\24\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7h\2\2\u009c\26\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2"+
		"\u00a7\32\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7"+
		"v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae\34"+
		"\3\2\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9 \3\2\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2"+
		"\u00be\"\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t"+
		"\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7+\2"+
		"\2\u00c6(\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7.\2\2"+
		"\u00ca,\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce"+
		"\60\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\u00d1\7?\2\2\u00d1\62\3\2\2\2\u00d2"+
		"\u00d3\7-\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\66\3\2\2\2\u00d6"+
		"\u00d7\7,\2\2\u00d78\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9:\3\2\2\2\u00da"+
		"\u00db\7?\2\2\u00db\u00dc\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7#\2\2\u00de"+
		"\u00df\7?\2\2\u00df>\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1@\3\2\2\2\u00e2\u00e3"+
		"\7>\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7(\2\2\u00e6D\3"+
		"\2\2\2\u00e7\u00e8\7~\2\2\u00e8\u00e9\7~\2\2\u00e9F\3\2\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00f4\7u\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f4\7p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7c\2\2"+
		"\u00f2\u00f4\7p\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f4H\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\3\2"+
		"\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feJ\3\2\2\2\u00ff\u00fd\3\2\2\2"+
		"\u0100\u0105\5)\25\2\u0101\u0104\5M\'\2\u0102\u0104\n\4\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5)"+
		"\25\2\u0109L\3\2\2\2\u010a\u010b\7^\2\2\u010b\u010c\t\5\2\2\u010cN\3\2"+
		"\2\2\u010d\u010f\5U+\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111P\3\2\2\2\u0112\u0114\5U+\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011b\7\60\2\2\u0118\u011a\5U+\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0125\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\60\2\2\u011f\u0121\5"+
		"U+\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0113\3\2\2\2\u0124\u011e\3\2"+
		"\2\2\u0125R\3\2\2\2\u0126\u0127\t\2\2\2\u0127T\3\2\2\2\u0128\u0129\t\6"+
		"\2\2\u0129V\3\2\2\2\u012a\u012c\t\7\2\2\u012b\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\b,\2\2\u0130X\3\2\2\2\u0131\u0133\t\b\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135Z\3\2\2\2"+
		"\u0136\u0137\7\61\2\2\u0137\u0138\7\61\2\2\u0138\u013c\3\2\2\2\u0139\u013b"+
		"\13\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0162"+
		"\7\f\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7,\2\2\u0142\u0146\3\2\2\2\u0143"+
		"\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\7,\2\2\u014a\u0162\7\61\2\2\u014b\u014c\7\61\2\2\u014c\u014d\7"+
		",\2\2\u014d\u014e\7,\2\2\u014e\u0150\3\2\2\2\u014f\u0151\13\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7,"+
		"\2\2\u0153\u0154\7,\2\2\u0154\u0162\7\61\2\2\u0155\u0156\7\61\2\2\u0156"+
		"\u0157\7,\2\2\u0157\u0158\7,\2\2\u0158\u0159\7,\2\2\u0159\u015b\3\2\2"+
		"\2\u015a\u015c\13\2\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\7,\2\2\u015e\u015f\7,\2\2\u015f\u0160\7,\2"+
		"\2\u0160\u0162\7\61\2\2\u0161\u0136\3\2\2\2\u0161\u0140\3\2\2\2\u0161"+
		"\u014b\3\2\2\2\u0161\u0155\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b."+
		"\2\2\u0164\\\3\2\2\2\24\2\u00f3\u00f8\u00fd\u0103\u0105\u0110\u0115\u011b"+
		"\u0122\u0124\u012d\u0134\u013c\u0146\u0150\u015b\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}