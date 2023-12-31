// Generated from typelang\parser\TypeLang.g by ANTLR 4.5
package typelang.parser; import static typelang.AST.*; import typelang.*; import typelang.Type.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Define=18, Let=19, Lambda=20, If=21, Switch=22, Car=23, Cdr=24, Cons=25, 
		List=26, Null=27, Less=28, Equal=29, Greater=30, TrueLiteral=31, FalseLiteral=32, 
		Ref=33, Deref=34, Assign=35, Free=36, Fork=37, Lock=38, UnLock=39, Process=40, 
		Send=41, Stop=42, Self=43, Dot=44, Number=45, Identifier=46, Letter=47, 
		LetterOrDigit=48, StrLiteral=49, AT=50, ELLIPSIS=51, WS=52, Comment=53, 
		Line_Comment=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"Define", "Let", "Lambda", "If", "Switch", "Car", "Cdr", "Cons", "List", 
		"Null", "Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", "Ref", 
		"Deref", "Assign", "Free", "Fork", "Lock", "UnLock", "Process", "Send", 
		"Stop", "Self", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"DIGIT", "ESCQUOTE", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'('", "'+'", "')'", "'*'", "'/'", "':'", "'case'", "'default'", 
		"'bool'", "'unit'", "'num'", "'List<'", "','", "'Ref'", "'Str'", "'->'", 
		"'define'", "'let'", "'lambda'", "'if'", "'switch'", "'car'", "'cdr'", 
		"'cons'", "'list'", "'null?'", "'<'", "'='", "'>'", "'#t'", "'#f'", "'ref'", 
		"'deref'", "'set!'", "'free'", "'fork'", "'lock'", "'unlock'", "'process'", 
		"'send'", "'stop'", "'self'", "'.'", null, null, null, null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Define", "Let", "Lambda", "If", "Switch", 
		"Car", "Cdr", "Cons", "List", "Null", "Less", "Equal", "Greater", "TrueLiteral", 
		"FalseLiteral", "Ref", "Deref", "Assign", "Free", "Fork", "Lock", "UnLock", 
		"Process", "Send", "Stop", "Self", "Dot", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public TypeLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 46:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 47:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\6.\u012f\n.\r.\16.\u0130"+
		"\3/\3/\7/\u0135\n/\f/\16/\u0138\13/\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0140\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0148\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\7\64\u0152\n\64\f\64\16\64\u0155\13\64\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\6\67\u0160\n\67\r\67\16\67"+
		"\u0161\3\67\3\67\38\38\38\38\78\u016a\n8\f8\168\u016d\138\38\38\38\38"+
		"\38\39\39\39\39\79\u0178\n9\f9\169\u017b\139\39\39\4\u0153\u016b\2:\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\63i\64k\65m\66o\67"+
		"q8\3\2\t\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u0186\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3"+
		"\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177"+
		"\3\2\2\2\21\u0081\3\2\2\2\23\u0086\3\2\2\2\25\u008e\3\2\2\2\27\u0093\3"+
		"\2\2\2\31\u0098\3\2\2\2\33\u009c\3\2\2\2\35\u00a2\3\2\2\2\37\u00a4\3\2"+
		"\2\2!\u00a8\3\2\2\2#\u00ac\3\2\2\2%\u00af\3\2\2\2\'\u00b6\3\2\2\2)\u00ba"+
		"\3\2\2\2+\u00c1\3\2\2\2-\u00c4\3\2\2\2/\u00cb\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d3\3\2\2\2\65\u00d8\3\2\2\2\67\u00dd\3\2\2\29\u00e3\3\2\2\2;\u00e5"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00f3\3\2\2\2G\u00f9\3\2\2\2I\u00fe\3\2\2\2K\u0103\3\2\2\2M\u0108\3\2"+
		"\2\2O\u010d\3\2\2\2Q\u0114\3\2\2\2S\u011c\3\2\2\2U\u0121\3\2\2\2W\u0126"+
		"\3\2\2\2Y\u012b\3\2\2\2[\u012e\3\2\2\2]\u0132\3\2\2\2_\u013f\3\2\2\2a"+
		"\u0147\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g\u014e\3\2\2\2i\u0158\3\2"+
		"\2\2k\u015a\3\2\2\2m\u015f\3\2\2\2o\u0165\3\2\2\2q\u0173\3\2\2\2st\7/"+
		"\2\2t\4\3\2\2\2uv\7*\2\2v\6\3\2\2\2wx\7-\2\2x\b\3\2\2\2yz\7+\2\2z\n\3"+
		"\2\2\2{|\7,\2\2|\f\3\2\2\2}~\7\61\2\2~\16\3\2\2\2\177\u0080\7<\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\22\3\2\2\2\u0086\u0087\7f\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7h\2\2\u0089\u008a\7c\2\2\u008a\u008b\7w\2\2\u008b\u008c\7n\2\2"+
		"\u008c\u008d\7v\2\2\u008d\24\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7"+
		"q\2\2\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\26\3\2\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7p\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b\7o\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7N\2\2\u009d\u009e\7k\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7>\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3"+
		"\36\3\2\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7h\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7@\2\2\u00ae$\3\2\2\2\u00af"+
		"\u00b0\7f\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7n\2"+
		"\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7"+
		"n\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7d\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7c\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		".\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce"+
		"\60\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\62\3\2\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7k\2\2\u00da"+
		"\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7w\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7A\2\2"+
		"\u00e28\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6"+
		"<\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\7h\2\2\u00eeB\3"+
		"\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7h\2\2\u00f2"+
		"D\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7h\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7#\2\2\u00fdH\3\2\2\2\u00fe"+
		"\u00ff\7h\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7g\2\2"+
		"\u0102J\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7q\2\2\u0105\u0106\7t\2"+
		"\2\u0106\u0107\7m\2\2\u0107L\3\2\2\2\u0108\u0109\7n\2\2\u0109\u010a\7"+
		"q\2\2\u010a\u010b\7e\2\2\u010b\u010c\7m\2\2\u010cN\3\2\2\2\u010d\u010e"+
		"\7w\2\2\u010e\u010f\7p\2\2\u010f\u0110\7n\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7e\2\2\u0112\u0113\7m\2\2\u0113P\3\2\2\2\u0114\u0115\7r\2\2\u0115"+
		"\u0116\7t\2\2\u0116\u0117\7q\2\2\u0117\u0118\7e\2\2\u0118\u0119\7g\2\2"+
		"\u0119\u011a\7u\2\2\u011a\u011b\7u\2\2\u011bR\3\2\2\2\u011c\u011d\7u\2"+
		"\2\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f\u0120\7f\2\2\u0120T\3\2"+
		"\2\2\u0121\u0122\7u\2\2\u0122\u0123\7v\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7r\2\2\u0125V\3\2\2\2\u0126\u0127\7u\2\2\u0127\u0128\7g\2\2\u0128\u0129"+
		"\7n\2\2\u0129\u012a\7h\2\2\u012aX\3\2\2\2\u012b\u012c\7\60\2\2\u012cZ"+
		"\3\2\2\2\u012d\u012f\5c\62\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\\\3\2\2\2\u0132\u0136\5_\60\2"+
		"\u0133\u0135\5a\61\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137^\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u0140\t\2\2\2\u013a\u013b\n\3\2\2\u013b\u0140\6\60\2\2\u013c\u013d\t"+
		"\4\2\2\u013d\u013e\t\5\2\2\u013e\u0140\6\60\3\2\u013f\u0139\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u013f\u013c\3\2\2\2\u0140`\3\2\2\2\u0141\u0148\t\6\2\2"+
		"\u0142\u0143\n\3\2\2\u0143\u0148\6\61\4\2\u0144\u0145\t\4\2\2\u0145\u0146"+
		"\t\5\2\2\u0146\u0148\6\61\5\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2"+
		"\u0147\u0144\3\2\2\2\u0148b\3\2\2\2\u0149\u014a\4\62;\2\u014ad\3\2\2\2"+
		"\u014b\u014c\7^\2\2\u014c\u014d\7$\2\2\u014df\3\2\2\2\u014e\u0153\7$\2"+
		"\2\u014f\u0152\5e\63\2\u0150\u0152\n\7\2\2\u0151\u014f\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7$\2\2\u0157h\3\2\2\2\u0158"+
		"\u0159\7B\2\2\u0159j\3\2\2\2\u015a\u015b\7\60\2\2\u015b\u015c\7\60\2\2"+
		"\u015c\u015d\7\60\2\2\u015dl\3\2\2\2\u015e\u0160\t\b\2\2\u015f\u015e\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\b\67\2\2\u0164n\3\2\2\2\u0165\u0166\7\61\2"+
		"\2\u0166\u0167\7,\2\2\u0167\u016b\3\2\2\2\u0168\u016a\13\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7\61"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b8\2\2\u0172p\3\2\2\2\u0173\u0174"+
		"\7\61\2\2\u0174\u0175\7\61\2\2\u0175\u0179\3\2\2\2\u0176\u0178\n\7\2\2"+
		"\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\b9\2\2\u017d"+
		"r\3\2\2\2\f\2\u0130\u0136\u013f\u0147\u0151\u0153\u0161\u016b\u0179\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}