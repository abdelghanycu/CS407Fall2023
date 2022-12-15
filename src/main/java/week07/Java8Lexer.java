// Generated from java-escape by ANTLR 4.11.1
package week07;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Java8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MethodIditifer=10, Type=11, Static=12, Id=13, Integer=14, StringType=15, 
		Semicolon=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"MethodIditifer", "Type", "Static", "Id", "Integer", "StringType", "Semicolon", 
			"WS", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "'return'", "','", "'void'", 
			"'.'", null, null, "'static'", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MethodIditifer", 
			"Type", "Static", "Id", "Integer", "StringType", "Semicolon", "WS"
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


	public Java8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

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
		"\u0004\u0000\u0011\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tZ\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nt\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f~\b\f\u000b"+
		"\f\f\f\u007f\u0001\f\u0005\f\u0083\b\f\n\f\f\f\u0086\t\f\u0001\r\u0004"+
		"\r\u0089\b\r\u000b\r\f\r\u008a\u0001\u000e\u0001\u000e\u0005\u000e\u008f"+
		"\b\u000e\n\u000e\f\u000e\u0092\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u0099\b\u0010\u000b\u0010\f\u0010"+
		"\u009a\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0000\u0001\u0000\u0004\u0004\u0000$"+
		"$AZ__az\u0005\u0000$$09AZ__az\u0001\u0000\"\"\u0003\u0000\t\n\r\r  \u00a9"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000"+
		"\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t"+
		"1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r:\u0001\u0000"+
		"\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000"+
		"\u0013Y\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000\u0000\u0017u"+
		"\u0001\u0000\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b\u0088\u0001"+
		"\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f\u0095\u0001"+
		"\u0000\u0000\u0000!\u0098\u0001\u0000\u0000\u0000#\u009e\u0001\u0000\u0000"+
		"\u0000%&\u0005c\u0000\u0000&\'\u0005l\u0000\u0000\'(\u0005a\u0000\u0000"+
		"()\u0005s\u0000\u0000)*\u0005s\u0000\u0000*\u0002\u0001\u0000\u0000\u0000"+
		"+,\u0005{\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005}\u0000\u0000"+
		".\u0006\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\b\u0001\u0000\u0000"+
		"\u000012\u0005)\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005r\u0000"+
		"\u000045\u0005e\u0000\u000056\u0005t\u0000\u000067\u0005u\u0000\u0000"+
		"78\u0005r\u0000\u000089\u0005n\u0000\u00009\f\u0001\u0000\u0000\u0000"+
		":;\u0005,\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005v\u0000\u0000"+
		"=>\u0005o\u0000\u0000>?\u0005i\u0000\u0000?@\u0005d\u0000\u0000@\u0010"+
		"\u0001\u0000\u0000\u0000AB\u0005.\u0000\u0000B\u0012\u0001\u0000\u0000"+
		"\u0000CD\u0005p\u0000\u0000DE\u0005u\u0000\u0000EF\u0005b\u0000\u0000"+
		"FG\u0005l\u0000\u0000GH\u0005i\u0000\u0000HZ\u0005c\u0000\u0000IJ\u0005"+
		"p\u0000\u0000JK\u0005r\u0000\u0000KL\u0005i\u0000\u0000LM\u0005v\u0000"+
		"\u0000MN\u0005a\u0000\u0000NO\u0005t\u0000\u0000OZ\u0005e\u0000\u0000"+
		"PQ\u0005p\u0000\u0000QR\u0005r\u0000\u0000RS\u0005o\u0000\u0000ST\u0005"+
		"t\u0000\u0000TU\u0005e\u0000\u0000UV\u0005c\u0000\u0000VW\u0005t\u0000"+
		"\u0000WX\u0005e\u0000\u0000XZ\u0005d\u0000\u0000YC\u0001\u0000\u0000\u0000"+
		"YI\u0001\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000Z\u0014\u0001\u0000"+
		"\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]t\u0005t\u0000"+
		"\u0000^_\u0005d\u0000\u0000_`\u0005o\u0000\u0000`a\u0005u\u0000\u0000"+
		"ab\u0005b\u0000\u0000bc\u0005l\u0000\u0000ct\u0005e\u0000\u0000de\u0005"+
		"l\u0000\u0000ef\u0005o\u0000\u0000fg\u0005n\u0000\u0000gt\u0005g\u0000"+
		"\u0000hi\u0005f\u0000\u0000ij\u0005l\u0000\u0000jk\u0005o\u0000\u0000"+
		"kl\u0005a\u0000\u0000lt\u0005t\u0000\u0000mn\u0005S\u0000\u0000no\u0005"+
		"t\u0000\u0000op\u0005r\u0000\u0000pq\u0005i\u0000\u0000qr\u0005n\u0000"+
		"\u0000rt\u0005g\u0000\u0000s[\u0001\u0000\u0000\u0000s^\u0001\u0000\u0000"+
		"\u0000sd\u0001\u0000\u0000\u0000sh\u0001\u0000\u0000\u0000sm\u0001\u0000"+
		"\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0005s\u0000\u0000vw\u0005"+
		"t\u0000\u0000wx\u0005a\u0000\u0000xy\u0005t\u0000\u0000yz\u0005i\u0000"+
		"\u0000z{\u0005c\u0000\u0000{\u0018\u0001\u0000\u0000\u0000|~\u0007\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0084\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0001\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u001a\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u000209\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u001c\u0001\u0000\u0000\u0000\u008c\u0090\u0005"+
		"\"\u0000\u0000\u008d\u008f\b\u0002\u0000\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\"\u0000"+
		"\u0000\u0094\u001e\u0001\u0000\u0000\u0000\u0095\u0096\u0005;\u0000\u0000"+
		"\u0096 \u0001\u0000\u0000\u0000\u0097\u0099\u0003#\u0011\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0010\u0000\u0000\u009d\"\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0007\u0003\u0000\u0000\u009f$\u0001\u0000"+
		"\u0000\u0000\b\u0000Ys\u007f\u0084\u008a\u0090\u009a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}