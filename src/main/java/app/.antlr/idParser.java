// Generated from /Users/enzoletona/Desktop/TC/renzo/proyecto-final-tc/src/main/java/app/id.g4 by ANTLR 4.13.1

package app;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INT=2, CHAR=3, DOUBLE=4, VOID=5, LLAVE_APERTURA=6, LLAVE_CLAUSURA=7, 
		PARENTESIS_APERTURA=8, PARENTESIS_CLAUSURA=9, PUNTO_COMA=10, SUMA=11, 
		RESTA=12, MULTIPLICAR=13, MODULO=14, EQUAL=15, INCREMENTADOR=16, DECREMENTADOR=17, 
		MAYOR=18, MENOR=19, MAYOR_IGUAL=20, MENOR_IGUAL=21, AND=22, OR=23, IF=24, 
		ELSE=25, FOR=26, WHILE=27, BREAK=28, CONTINUE=29, ID=30, OTRO=31;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'char'", "'double'", "'void'", "'{'", "'}'", "'('", 
			"')'", "';'", "'+'", "'-'", "'*'", "'%'", "'='", "'++'", "'--'", "'>'", 
			"'<'", "'>='", "'<='", "'&&'", "'||'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CHAR", "DOUBLE", "VOID", "LLAVE_APERTURA", "LLAVE_CLAUSURA", 
			"PARENTESIS_APERTURA", "PARENTESIS_CLAUSURA", "PUNTO_COMA", "SUMA", "RESTA", 
			"MULTIPLICAR", "MODULO", "EQUAL", "INCREMENTADOR", "DECREMENTADOR", "MAYOR", 
			"MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "AND", "OR", "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "CONTINUE", "ID", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public Token ID;
		public Token INT;
		public Token CHAR;
		public Token DOUBLE;
		public Token VOID;
		public Token LLAVE_APERTURA;
		public Token LLAVE_CLAUSURA;
		public Token PARENTESIS_APERTURA;
		public Token PARENTESIS_CLAUSURA;
		public Token PUNTO_COMA;
		public Token SUMA;
		public Token RESTA;
		public Token MULTIPLICAR;
		public Token MODULO;
		public Token EQUAL;
		public Token INCREMENTADOR;
		public Token DECREMENTADOR;
		public Token MAYOR;
		public Token MENOR;
		public Token MAYOR_IGUAL;
		public Token MENOR_IGUAL;
		public Token AND;
		public Token OR;
		public Token IF;
		public Token ELSE;
		public Token FOR;
		public Token WHILE;
		public Token BREAK;
		public Token CONTINUE;
		public Token OTRO;
		public TerminalNode ID() { return getToken(idParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(idParser.VOID, 0); }
		public TerminalNode LLAVE_APERTURA() { return getToken(idParser.LLAVE_APERTURA, 0); }
		public TerminalNode LLAVE_CLAUSURA() { return getToken(idParser.LLAVE_CLAUSURA, 0); }
		public TerminalNode PARENTESIS_APERTURA() { return getToken(idParser.PARENTESIS_APERTURA, 0); }
		public TerminalNode PARENTESIS_CLAUSURA() { return getToken(idParser.PARENTESIS_CLAUSURA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(idParser.PUNTO_COMA, 0); }
		public TerminalNode SUMA() { return getToken(idParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(idParser.RESTA, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(idParser.MULTIPLICAR, 0); }
		public TerminalNode MODULO() { return getToken(idParser.MODULO, 0); }
		public TerminalNode EQUAL() { return getToken(idParser.EQUAL, 0); }
		public TerminalNode INCREMENTADOR() { return getToken(idParser.INCREMENTADOR, 0); }
		public TerminalNode DECREMENTADOR() { return getToken(idParser.DECREMENTADOR, 0); }
		public TerminalNode MAYOR() { return getToken(idParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(idParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(idParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(idParser.MENOR_IGUAL, 0); }
		public TerminalNode AND() { return getToken(idParser.AND, 0); }
		public TerminalNode OR() { return getToken(idParser.OR, 0); }
		public TerminalNode IF() { return getToken(idParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(idParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(idParser.FOR, 0); }
		public TerminalNode WHILE() { return getToken(idParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(idParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(idParser.CONTINUE, 0); }
		public TerminalNode OTRO() { return getToken(idParser.OTRO, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).ID = match(ID);
				 System.out.println("ID -> " + ((SContext)_localctx).ID.getText()); 
				setState(4);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).INT = match(INT);
				 System.out.println("INT -> " + ((SContext)_localctx).INT.getText()); 
				setState(7);
				s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).CHAR = match(CHAR);
				 System.out.println("CHAR -> " + ((SContext)_localctx).CHAR.getText()); 
				setState(10);
				s();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).DOUBLE = match(DOUBLE);
				 System.out.println("DOUBLE -> " + ((SContext)_localctx).DOUBLE.getText()); 
				setState(13);
				s();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).VOID = match(VOID);
				 System.out.println("VOID -> " + ((SContext)_localctx).VOID.getText()); 
				setState(16);
				s();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				((SContext)_localctx).LLAVE_APERTURA = match(LLAVE_APERTURA);
				 System.out.println("LLAVE_APERTURA -> " + ((SContext)_localctx).LLAVE_APERTURA.getText()); 
				setState(19);
				s();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(20);
				((SContext)_localctx).LLAVE_CLAUSURA = match(LLAVE_CLAUSURA);
				 System.out.println("LLAVE_CLAUSURA -> " + ((SContext)_localctx).LLAVE_CLAUSURA.getText()); 
				setState(22);
				s();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(23);
				((SContext)_localctx).PARENTESIS_APERTURA = match(PARENTESIS_APERTURA);
				 System.out.println("PARENTESIS_APERTURA -> " + ((SContext)_localctx).PARENTESIS_APERTURA.getText()); 
						
				setState(25);
				s();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(26);
				((SContext)_localctx).PARENTESIS_CLAUSURA = match(PARENTESIS_CLAUSURA);
				 System.out.println("PARENTESIS_CLAUSURA -> " + ((SContext)_localctx).PARENTESIS_CLAUSURA.getText()); 
						
				setState(28);
				s();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(29);
				((SContext)_localctx).PUNTO_COMA = match(PUNTO_COMA);
				 System.out.println("PUNTO_COMA -> " + ((SContext)_localctx).PUNTO_COMA.getText()); 
				setState(31);
				s();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(32);
				((SContext)_localctx).SUMA = match(SUMA);
				 System.out.println("SUMA -> " + ((SContext)_localctx).SUMA.getText()); 
				setState(34);
				s();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(35);
				((SContext)_localctx).RESTA = match(RESTA);
				 System.out.println("RESTA -> " + ((SContext)_localctx).RESTA.getText()); 
				setState(37);
				s();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(38);
				((SContext)_localctx).MULTIPLICAR = match(MULTIPLICAR);
				 System.out.println("MULTIPLICAR -> " + ((SContext)_localctx).MULTIPLICAR.getText()); 
				setState(40);
				s();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(41);
				((SContext)_localctx).MODULO = match(MODULO);
				 System.out.println("MODULO -> " + ((SContext)_localctx).MODULO.getText()); 
				setState(43);
				s();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(44);
				((SContext)_localctx).EQUAL = match(EQUAL);
				 System.out.println("EQUAL -> " + ((SContext)_localctx).EQUAL.getText()); 
				setState(46);
				s();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(47);
				((SContext)_localctx).INCREMENTADOR = match(INCREMENTADOR);
				 System.out.println("INCREMENTADOR -> " + ((SContext)_localctx).INCREMENTADOR.getText()); 
				setState(49);
				s();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(50);
				((SContext)_localctx).DECREMENTADOR = match(DECREMENTADOR);
				 System.out.println("DECREMENTADOR -> " + ((SContext)_localctx).DECREMENTADOR.getText()); 
				setState(52);
				s();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(53);
				((SContext)_localctx).MAYOR = match(MAYOR);
				 System.out.println("MAYOR -> " + ((SContext)_localctx).MAYOR.getText()); 
				setState(55);
				s();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(56);
				((SContext)_localctx).MENOR = match(MENOR);
				 System.out.println("MENOR -> " + ((SContext)_localctx).MENOR.getText()); 
				setState(58);
				s();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(59);
				((SContext)_localctx).MAYOR_IGUAL = match(MAYOR_IGUAL);
				 System.out.println("MAYOR_IGUAL -> " + ((SContext)_localctx).MAYOR_IGUAL.getText()); 
				setState(61);
				s();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(62);
				((SContext)_localctx).MENOR_IGUAL = match(MENOR_IGUAL);
				 System.out.println("MENOR_IGUAL -> " + ((SContext)_localctx).MENOR_IGUAL.getText()); 
				setState(64);
				s();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(65);
				((SContext)_localctx).AND = match(AND);
				 System.out.println("AND -> " + ((SContext)_localctx).AND.getText()); 
				setState(67);
				s();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(68);
				((SContext)_localctx).OR = match(OR);
				 System.out.println("OR -> " + ((SContext)_localctx).OR.getText()); 
				setState(70);
				s();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(71);
				((SContext)_localctx).IF = match(IF);
				 System.out.println("IF -> " + ((SContext)_localctx).IF.getText()); 
				setState(73);
				s();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(74);
				((SContext)_localctx).ELSE = match(ELSE);
				 System.out.println("ELSE -> " + ((SContext)_localctx).ELSE.getText()); 
				setState(76);
				s();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(77);
				((SContext)_localctx).FOR = match(FOR);
				 System.out.println("FOR -> " + ((SContext)_localctx).FOR.getText()); 
				setState(79);
				s();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(80);
				((SContext)_localctx).WHILE = match(WHILE);
				 System.out.println("WHILE -> " + ((SContext)_localctx).WHILE.getText()); 
				setState(82);
				s();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(83);
				((SContext)_localctx).BREAK = match(BREAK);
				 System.out.println("BREAK -> " + ((SContext)_localctx).BREAK.getText()); 
				setState(85);
				s();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(86);
				((SContext)_localctx).CONTINUE = match(CONTINUE);
				 System.out.println("CONTINUE -> " + ((SContext)_localctx).CONTINUE.getText()); 
				setState(88);
				s();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(89);
				((SContext)_localctx).OTRO = match(OTRO);
				 System.out.println("OTRO -> " + ((SContext)_localctx).OTRO.getText()); 
				setState(91);
				s();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f`\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000^\b"+
		"\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000|\u0000]\u0001\u0000"+
		"\u0000\u0000\u0002\u0003\u0005\u001e\u0000\u0000\u0003\u0004\u0006\u0000"+
		"\uffff\uffff\u0000\u0004^\u0003\u0000\u0000\u0000\u0005\u0006\u0005\u0002"+
		"\u0000\u0000\u0006\u0007\u0006\u0000\uffff\uffff\u0000\u0007^\u0003\u0000"+
		"\u0000\u0000\b\t\u0005\u0003\u0000\u0000\t\n\u0006\u0000\uffff\uffff\u0000"+
		"\n^\u0003\u0000\u0000\u0000\u000b\f\u0005\u0004\u0000\u0000\f\r\u0006"+
		"\u0000\uffff\uffff\u0000\r^\u0003\u0000\u0000\u0000\u000e\u000f\u0005"+
		"\u0005\u0000\u0000\u000f\u0010\u0006\u0000\uffff\uffff\u0000\u0010^\u0003"+
		"\u0000\u0000\u0000\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u0013\u0006"+
		"\u0000\uffff\uffff\u0000\u0013^\u0003\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0007\u0000\u0000\u0015\u0016\u0006\u0000\uffff\uffff\u0000\u0016^\u0003"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018\u0019\u0006\u0000"+
		"\uffff\uffff\u0000\u0019^\u0003\u0000\u0000\u0000\u001a\u001b\u0005\t"+
		"\u0000\u0000\u001b\u001c\u0006\u0000\uffff\uffff\u0000\u001c^\u0003\u0000"+
		"\u0000\u0000\u001d\u001e\u0005\n\u0000\u0000\u001e\u001f\u0006\u0000\uffff"+
		"\uffff\u0000\u001f^\u0003\u0000\u0000\u0000 !\u0005\u000b\u0000\u0000"+
		"!\"\u0006\u0000\uffff\uffff\u0000\"^\u0003\u0000\u0000\u0000#$\u0005\f"+
		"\u0000\u0000$%\u0006\u0000\uffff\uffff\u0000%^\u0003\u0000\u0000\u0000"+
		"&\'\u0005\r\u0000\u0000\'(\u0006\u0000\uffff\uffff\u0000(^\u0003\u0000"+
		"\u0000\u0000)*\u0005\u000e\u0000\u0000*+\u0006\u0000\uffff\uffff\u0000"+
		"+^\u0003\u0000\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0006\u0000\uffff"+
		"\uffff\u0000.^\u0003\u0000\u0000\u0000/0\u0005\u0010\u0000\u000001\u0006"+
		"\u0000\uffff\uffff\u00001^\u0003\u0000\u0000\u000023\u0005\u0011\u0000"+
		"\u000034\u0006\u0000\uffff\uffff\u00004^\u0003\u0000\u0000\u000056\u0005"+
		"\u0012\u0000\u000067\u0006\u0000\uffff\uffff\u00007^\u0003\u0000\u0000"+
		"\u000089\u0005\u0013\u0000\u00009:\u0006\u0000\uffff\uffff\u0000:^\u0003"+
		"\u0000\u0000\u0000;<\u0005\u0014\u0000\u0000<=\u0006\u0000\uffff\uffff"+
		"\u0000=^\u0003\u0000\u0000\u0000>?\u0005\u0015\u0000\u0000?@\u0006\u0000"+
		"\uffff\uffff\u0000@^\u0003\u0000\u0000\u0000AB\u0005\u0016\u0000\u0000"+
		"BC\u0006\u0000\uffff\uffff\u0000C^\u0003\u0000\u0000\u0000DE\u0005\u0017"+
		"\u0000\u0000EF\u0006\u0000\uffff\uffff\u0000F^\u0003\u0000\u0000\u0000"+
		"GH\u0005\u0018\u0000\u0000HI\u0006\u0000\uffff\uffff\u0000I^\u0003\u0000"+
		"\u0000\u0000JK\u0005\u0019\u0000\u0000KL\u0006\u0000\uffff\uffff\u0000"+
		"L^\u0003\u0000\u0000\u0000MN\u0005\u001a\u0000\u0000NO\u0006\u0000\uffff"+
		"\uffff\u0000O^\u0003\u0000\u0000\u0000PQ\u0005\u001b\u0000\u0000QR\u0006"+
		"\u0000\uffff\uffff\u0000R^\u0003\u0000\u0000\u0000ST\u0005\u001c\u0000"+
		"\u0000TU\u0006\u0000\uffff\uffff\u0000U^\u0003\u0000\u0000\u0000VW\u0005"+
		"\u001d\u0000\u0000WX\u0006\u0000\uffff\uffff\u0000X^\u0003\u0000\u0000"+
		"\u0000YZ\u0005\u001f\u0000\u0000Z[\u0006\u0000\uffff\uffff\u0000[^\u0003"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]\u0002\u0001\u0000\u0000"+
		"\u0000]\u0005\u0001\u0000\u0000\u0000]\b\u0001\u0000\u0000\u0000]\u000b"+
		"\u0001\u0000\u0000\u0000]\u000e\u0001\u0000\u0000\u0000]\u0011\u0001\u0000"+
		"\u0000\u0000]\u0014\u0001\u0000\u0000\u0000]\u0017\u0001\u0000\u0000\u0000"+
		"]\u001a\u0001\u0000\u0000\u0000]\u001d\u0001\u0000\u0000\u0000] \u0001"+
		"\u0000\u0000\u0000]#\u0001\u0000\u0000\u0000]&\u0001\u0000\u0000\u0000"+
		"])\u0001\u0000\u0000\u0000],\u0001\u0000\u0000\u0000]/\u0001\u0000\u0000"+
		"\u0000]2\u0001\u0000\u0000\u0000]5\u0001\u0000\u0000\u0000]8\u0001\u0000"+
		"\u0000\u0000];\u0001\u0000\u0000\u0000]>\u0001\u0000\u0000\u0000]A\u0001"+
		"\u0000\u0000\u0000]D\u0001\u0000\u0000\u0000]G\u0001\u0000\u0000\u0000"+
		"]J\u0001\u0000\u0000\u0000]M\u0001\u0000\u0000\u0000]P\u0001\u0000\u0000"+
		"\u0000]S\u0001\u0000\u0000\u0000]V\u0001\u0000\u0000\u0000]Y\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0001\u0001\u0000\u0000\u0000"+
		"\u0001]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}