// Generated from /home/coti/Downloads/TecCompilacion2024-master(2)/TecCompilacion2024-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, IF=3, ELSE=4, FOR=5, WHILE=6, RETURN=7, PUNTOCOMA=8, 
		COMA=9, IGUAL=10, PARENIZQ=11, PARENDER=12, LLAVEIZQ=13, LLAVEDER=14, 
		ID=15, NUMERO=16, MAS=17, MENOS=18, MULT=19, DIV=20, WS=21, COMPARACION=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "DOUBLE", "IF", "ELSE", "FOR", "WHILE", "RETURN", "PUNTOCOMA", 
			"COMA", "IGUAL", "PARENIZQ", "PARENDER", "LLAVEIZQ", "LLAVEDER", "ID", 
			"NUMERO", "MAS", "MENOS", "MULT", "DIV", "WS", "COMPARACION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'if'", "'else'", "'for'", "'while'", "'return'", 
			"';'", "','", "'='", "'('", "')'", "'{'", "'}'", null, null, "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "IF", "ELSE", "FOR", "WHILE", "RETURN", "PUNTOCOMA", 
			"COMA", "IGUAL", "PARENIZQ", "PARENDER", "LLAVEIZQ", "LLAVEDER", "ID", 
			"NUMERO", "MAS", "MENOS", "MULT", "DIV", "WS", "COMPARACION"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\u0016\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000eb\b\u000e\n\u000e\f\u000e"+
		"e\t\u000e\u0001\u000f\u0004\u000fh\b\u000f\u000b\u000f\f\u000fi\u0001"+
		"\u000f\u0001\u000f\u0004\u000fn\b\u000f\u000b\u000f\f\u000fo\u0003\u000f"+
		"r\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014}\b\u0014"+
		"\u000b\u0014\f\u0014~\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u008c\b\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"<<>>\u0095\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00031\u0001\u0000\u0000\u0000\u00058\u0001\u0000\u0000\u0000\u0007"+
		";\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bD\u0001\u0000"+
		"\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015W"+
		"\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019[\u0001\u0000"+
		"\u0000\u0000\u001b]\u0001\u0000\u0000\u0000\u001d_\u0001\u0000\u0000\u0000"+
		"\u001fg\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#u\u0001\u0000"+
		"\u0000\u0000%w\u0001\u0000\u0000\u0000\'y\u0001\u0000\u0000\u0000)|\u0001"+
		"\u0000\u0000\u0000+\u008b\u0001\u0000\u0000\u0000-.\u0005i\u0000\u0000"+
		"./\u0005n\u0000\u0000/0\u0005t\u0000\u00000\u0002\u0001\u0000\u0000\u0000"+
		"12\u0005d\u0000\u000023\u0005o\u0000\u000034\u0005u\u0000\u000045\u0005"+
		"b\u0000\u000056\u0005l\u0000\u000067\u0005e\u0000\u00007\u0004\u0001\u0000"+
		"\u0000\u000089\u0005i\u0000\u00009:\u0005f\u0000\u0000:\u0006\u0001\u0000"+
		"\u0000\u0000;<\u0005e\u0000\u0000<=\u0005l\u0000\u0000=>\u0005s\u0000"+
		"\u0000>?\u0005e\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005f\u0000"+
		"\u0000AB\u0005o\u0000\u0000BC\u0005r\u0000\u0000C\n\u0001\u0000\u0000"+
		"\u0000DE\u0005w\u0000\u0000EF\u0005h\u0000\u0000FG\u0005i\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005e\u0000\u0000I\f\u0001\u0000\u0000\u0000"+
		"JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000LM\u0005t\u0000\u0000MN\u0005"+
		"u\u0000\u0000NO\u0005r\u0000\u0000OP\u0005n\u0000\u0000P\u000e\u0001\u0000"+
		"\u0000\u0000QR\u0005;\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005"+
		",\u0000\u0000T\u0012\u0001\u0000\u0000\u0000UV\u0005=\u0000\u0000V\u0014"+
		"\u0001\u0000\u0000\u0000WX\u0005(\u0000\u0000X\u0016\u0001\u0000\u0000"+
		"\u0000YZ\u0005)\u0000\u0000Z\u0018\u0001\u0000\u0000\u0000[\\\u0005{\u0000"+
		"\u0000\\\u001a\u0001\u0000\u0000\u0000]^\u0005}\u0000\u0000^\u001c\u0001"+
		"\u0000\u0000\u0000_c\u0007\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u001e\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fh\u0007\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jq\u0001\u0000\u0000\u0000km\u0005.\u0000\u0000ln\u0007\u0002\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qk\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r \u0001\u0000\u0000\u0000"+
		"st\u0005+\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005-\u0000\u0000"+
		"v$\u0001\u0000\u0000\u0000wx\u0005*\u0000\u0000x&\u0001\u0000\u0000\u0000"+
		"yz\u0005/\u0000\u0000z(\u0001\u0000\u0000\u0000{}\u0007\u0003\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0006\u0014\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082"+
		"\u008c\u0007\u0004\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084\u008c"+
		"\u0005=\u0000\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u008c\u0005="+
		"\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u008c\u0005=\u0000\u0000"+
		"\u0089\u008a\u0005>\u0000\u0000\u008a\u008c\u0005=\u0000\u0000\u008b\u0082"+
		"\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0085"+
		"\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c,\u0001\u0000\u0000\u0000\u0007\u0000ci"+
		"oq~\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}