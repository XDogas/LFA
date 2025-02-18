// Generated from Calc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, BOOLEAN=24, 
		ID=25, REAL=26, INTEGER=27, WS=28, LINE_COMMENT=29, ERROR=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "BOOLEAN", "ID", 
			"REAL", "INTEGER", "WS", "LINE_COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'show'", "':'", "'->'", "'if'", "'then'", "'else'", "'end'", 
			"','", "'integer'", "'real'", "'boolean'", "'+'", "'-'", "'^'", "'*'", 
			"'/'", "'//'", "'\\\\'", "'='", "'/='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BOOLEAN", "ID", "REAL", "INTEGER", "WS", "LINE_COMMENT", "ERROR"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0096\n\31\3\32\3\32\7\32\u009a\n\32"+
		"\f\32\16\32\u009d\13\32\3\33\6\33\u00a0\n\33\r\33\16\33\u00a1\3\33\3\33"+
		"\7\33\u00a6\n\33\f\33\16\33\u00a9\13\33\3\34\6\34\u00ac\n\34\r\34\16\34"+
		"\u00ad\3\35\6\35\u00b1\n\35\r\35\16\35\u00b2\3\35\3\35\3\36\3\36\7\36"+
		"\u00b9\n\36\f\36\16\36\u00bc\13\36\3\36\3\36\3\37\3\37\3\u00ba\2 \3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3"+
		"\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00c7\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13K\3\2\2\2"+
		"\rN\3\2\2\2\17S\3\2\2\2\21X\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27f\3\2\2"+
		"\2\31k\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2"+
		"%}\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2\2\2+\u0085\3\2\2\2-\u0088\3\2\2"+
		"\2/\u008a\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u009f\3\2\2\2\67"+
		"\u00ab\3\2\2\29\u00b0\3\2\2\2;\u00b6\3\2\2\2=\u00bf\3\2\2\2?@\7=\2\2@"+
		"\4\3\2\2\2AB\7u\2\2BC\7j\2\2CD\7q\2\2DE\7y\2\2E\6\3\2\2\2FG\7<\2\2G\b"+
		"\3\2\2\2HI\7/\2\2IJ\7@\2\2J\n\3\2\2\2KL\7k\2\2LM\7h\2\2M\f\3\2\2\2NO\7"+
		"v\2\2OP\7j\2\2PQ\7g\2\2QR\7p\2\2R\16\3\2\2\2ST\7g\2\2TU\7n\2\2UV\7u\2"+
		"\2VW\7g\2\2W\20\3\2\2\2XY\7g\2\2YZ\7p\2\2Z[\7f\2\2[\22\3\2\2\2\\]\7.\2"+
		"\2]\24\3\2\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2ab\7g\2\2bc\7i\2\2cd\7g\2\2d"+
		"e\7t\2\2e\26\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7n\2\2j\30\3\2\2\2k"+
		"l\7d\2\2lm\7q\2\2mn\7q\2\2no\7n\2\2op\7g\2\2pq\7c\2\2qr\7p\2\2r\32\3\2"+
		"\2\2st\7-\2\2t\34\3\2\2\2uv\7/\2\2v\36\3\2\2\2wx\7`\2\2x \3\2\2\2yz\7"+
		",\2\2z\"\3\2\2\2{|\7\61\2\2|$\3\2\2\2}~\7\61\2\2~\177\7\61\2\2\177&\3"+
		"\2\2\2\u0080\u0081\7^\2\2\u0081\u0082\7^\2\2\u0082(\3\2\2\2\u0083\u0084"+
		"\7?\2\2\u0084*\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7?\2\2\u0087,"+
		"\3\2\2\2\u0088\u0089\7*\2\2\u0089.\3\2\2\2\u008a\u008b\7+\2\2\u008b\60"+
		"\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0096\7g\2\2\u0090\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2"+
		"\u0093\u0094\7u\2\2\u0094\u0096\7g\2\2\u0095\u008c\3\2\2\2\u0095\u0090"+
		"\3\2\2\2\u0096\62\3\2\2\2\u0097\u009b\t\2\2\2\u0098\u009a\t\3\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\64\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\t\4\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a7\7\60\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\66\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae8"+
		"\3\2\2\2\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\35"+
		"\2\2\u00b5:\3\2\2\2\u00b6\u00ba\7%\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\f\2\2\u00be<\3\2\2\2"+
		"\u00bf\u00c0\13\2\2\2\u00c0>\3\2\2\2\n\2\u0095\u009b\u00a1\u00a7\u00ad"+
		"\u00b2\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}