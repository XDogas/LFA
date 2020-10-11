// Generated from Questionario.g4 by ANTLR 4.8

import javaTypes.*;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionarioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		BOOLEAN=74, STRING=75, ID=76, INTEGER=77, DOUBLE=78, WS=79, LINE_COMMENT=80, 
		COMMENT=81, ERROR=82;
	public static final int
		RULE_program = 0, RULE_quiz = 1, RULE_options = 2, RULE_sections = 3, 
		RULE_file = 4, RULE_theme = 5, RULE_simpleQuestion = 6, RULE_questions = 7, 
		RULE_load = 8, RULE_qst = 9, RULE_main = 10, RULE_stat = 11, RULE_line = 12, 
		RULE_idList = 13, RULE_declaration = 14, RULE_quizDeclaration = 15, RULE_quizAssignment = 16, 
		RULE_assignment = 17, RULE_type = 18, RULE_expr = 19, RULE_var = 20, RULE_quizExpr = 21, 
		RULE_questionID = 22, RULE_sectionID = 23, RULE_quizID = 24, RULE_iteration = 25, 
		RULE_quizIteration = 26, RULE_sectionIteration = 27, RULE_showQuestion = 28, 
		RULE_answer = 29, RULE_print = 30, RULE_read = 31, RULE_enableOptions = 32, 
		RULE_ifCondition = 33, RULE_simpleIfCondition = 34, RULE_elseIfCondition = 35, 
		RULE_elseCondition = 36, RULE_whileCondition = 37, RULE_forCondition = 38, 
		RULE_timeEndTime = 39, RULE_condition = 40, RULE_comparation = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "quiz", "options", "sections", "file", "theme", "simpleQuestion", 
			"questions", "load", "qst", "main", "stat", "line", "idList", "declaration", 
			"quizDeclaration", "quizAssignment", "assignment", "type", "expr", "var", 
			"quizExpr", "questionID", "sectionID", "quizID", "iteration", "quizIteration", 
			"sectionIteration", "showQuestion", "answer", "print", "read", "enableOptions", 
			"ifCondition", "simpleIfCondition", "elseIfCondition", "elseCondition", 
			"whileCondition", "forCondition", "timeEndTime", "condition", "comparation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Quiz'", "'('", "','", "')'", "'{'", "'}'", "'Options'", "':'", 
			"';'", "'Section'", "'<'", "'%'", "'>'", "'from'", "'->'", "'=>'", "'all'", 
			"'random'", "'difficulty['", "']'", "'['", "'\\'", "'load'", "'as'", 
			"'''", "'.qst''", "'main'", "'='", "'++'", "'--'", "'Timer'", "'int'", 
			"'double'", "'boolean'", "'String'", "'+'", "'-'", "'*'", "'/'", "'sizeof'", 
			"'result'", "'.current'", "'.prev'", "'.next'", "'.start'", "'.end'", 
			"'.'", "'next'", "'prev'", "'start'", "'end'", "'goto'", "'show'", "'answer'", 
			"'case'", "'valid'", "'invalid'", "'print'", "'read'", "'enable'", "'if'", 
			"'else if'", "'else'", "'while'", "'for'", "'time'", "'endTime'", "'||'", 
			"'&&'", "'=='", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOLEAN", "STRING", "ID", "INTEGER", "DOUBLE", "WS", "LINE_COMMENT", 
			"COMMENT", "ERROR"
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
	public String getGrammarFileName() { return "Questionario.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static protected Map<String,Symbol> symbolTable = new HashMap<>();

	public QuestionarioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public QuizContext quiz() {
			return getRuleContext(QuizContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QuestionarioParser.EOF, 0); }
		public List<LoadContext> load() {
			return getRuleContexts(LoadContext.class);
		}
		public LoadContext load(int i) {
			return getRuleContext(LoadContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				load();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(89);
			quiz();
			setState(90);
			main();
			setState(91);
			match(EOF);
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

	public static class QuizContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<SectionsContext> sections() {
			return getRuleContexts(SectionsContext.class);
		}
		public SectionsContext sections(int i) {
			return getRuleContext(SectionsContext.class,i);
		}
		public QuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizContext quiz() throws RecognitionException {
		QuizContext _localctx = new QuizContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_quiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			match(ID);
			setState(95);
			match(T__1);
			setState(96);
			match(ID);
			setState(97);
			match(T__2);
			setState(98);
			match(ID);
			setState(99);
			match(T__3);
			setState(100);
			match(T__4);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(101);
				options();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					sections();
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
			}

			setState(111);
			match(T__5);
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

	public static class OptionsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(QuestionarioParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QuestionarioParser.STRING, i);
		}
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(114);
			match(ID);
			setState(115);
			match(T__1);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__7);
				setState(118);
				match(STRING);
				setState(119);
				match(T__8);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__3);
			setState(126);
			match(T__8);
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

	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(QuestionarioParser.INTEGER, 0); }
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitSections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(130);
				match(T__10);
				setState(131);
				match(INTEGER);
				setState(132);
				match(T__11);
				setState(133);
				match(T__12);
				}
			}

			setState(136);
			match(T__1);
			setState(137);
			file();
			setState(138);
			match(T__3);
			setState(139);
			match(T__8);
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

	public static class FileContext extends ParserRuleContext {
		public Token ref;
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public List<SimpleQuestionContext> simpleQuestion() {
			return getRuleContexts(SimpleQuestionContext.class);
		}
		public SimpleQuestionContext simpleQuestion(int i) {
			return getRuleContext(SimpleQuestionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__13);
			setState(142);
			((FileContext)_localctx).ref = match(ID);
			setState(143);
			match(T__7);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(144);
				simpleQuestion();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(145);
					match(T__2);
					setState(146);
					simpleQuestion();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
			match(T__8);
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

	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QuestionarioParser.STRING, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(QuestionarioParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(QuestionarioParser.INTEGER, i);
		}
		public List<ThemeContext> theme() {
			return getRuleContexts(ThemeContext.class);
		}
		public ThemeContext theme(int i) {
			return getRuleContext(ThemeContext.class,i);
		}
		public List<QuestionsContext> questions() {
			return getRuleContexts(QuestionsContext.class);
		}
		public QuestionsContext questions(int i) {
			return getRuleContext(QuestionsContext.class,i);
		}
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		return theme(0);
	}

	private ThemeContext theme(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ThemeContext _localctx = new ThemeContext(_ctx, _parentState);
		ThemeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_theme, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(157);
				match(STRING);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(158);
					match(T__10);
					setState(159);
					match(INTEGER);
					setState(160);
					match(T__11);
					setState(161);
					match(T__12);
					}
					break;
				}
				}
				break;
			case T__16:
				{
				setState(164);
				match(T__16);
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(165);
					match(T__10);
					setState(166);
					match(INTEGER);
					setState(167);
					match(T__11);
					setState(168);
					match(T__12);
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(171);
					match(T__15);
					setState(172);
					match(T__17);
					setState(173);
					match(T__1);
					setState(174);
					match(INTEGER);
					setState(175);
					match(T__2);
					setState(176);
					match(T__18);
					setState(177);
					match(INTEGER);
					setState(178);
					match(T__7);
					setState(179);
					match(INTEGER);
					setState(180);
					match(T__19);
					setState(181);
					match(T__3);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ThemeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_theme);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						match(T__14);
						setState(188);
						theme(5);
						}
						break;
					case 2:
						{
						_localctx = new ThemeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_theme);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
						match(T__15);
						setState(191);
						questions();
						setState(198);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(192);
							match(T__2);
							setState(193);
							match(T__14);
							setState(194);
							theme(0);
							}
							break;
						case 2:
							{
							setState(195);
							match(T__2);
							setState(196);
							match(T__15);
							setState(197);
							questions();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleQuestionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(QuestionarioParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(QuestionarioParser.INTEGER, i);
		}
		public SimpleQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterSimpleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitSimpleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitSimpleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleQuestionContext simpleQuestion() throws RecognitionException {
		SimpleQuestionContext _localctx = new SimpleQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleQuestion);
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__7);
				setState(208);
				match(T__20);
				setState(209);
				match(INTEGER);
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(210);
						match(T__2);
						setState(211);
						match(INTEGER);
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(217);
				match(T__19);
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

	public static class QuestionsContext extends ParserRuleContext {
		public SimpleQuestionContext simpleQuestion() {
			return getRuleContext(SimpleQuestionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public TerminalNode INTEGER() { return getToken(QuestionarioParser.INTEGER, 0); }
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_questions);
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				simpleQuestion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__16);
				setState(223);
				match(T__21);
				setState(224);
				match(ID);
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(225);
						match(T__2);
						setState(226);
						match(ID);
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__17);
				setState(233);
				match(T__1);
				setState(234);
				match(INTEGER);
				setState(235);
				match(T__3);
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

	public static class LoadContext extends ParserRuleContext {
		public Token fileRef;
		public QstContext qst() {
			return getRuleContext(QstContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__22);
			setState(239);
			qst();
			setState(240);
			match(T__23);
			setState(241);
			((LoadContext)_localctx).fileRef = match(ID);
			setState(242);
			match(T__8);
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

	public static class QstContext extends ParserRuleContext {
		public Token fileName;
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public QstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QstContext qst() throws RecognitionException {
		QstContext _localctx = new QstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__24);
			setState(245);
			((QstContext)_localctx).fileName = match(ID);
			setState(246);
			match(T__25);
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

	public static class MainContext extends ParserRuleContext {
		public StatContext s;
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__26);
			setState(249);
			match(T__4);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(250);
				((MainContext)_localctx).s = stat();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__5);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatTimeEndTimeContext extends StatContext {
		public TimeEndTimeContext timeEndTime() {
			return getRuleContext(TimeEndTimeContext.class,0);
		}
		public StatTimeEndTimeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatTimeEndTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatTimeEndTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatTimeEndTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatForContext extends StatContext {
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatIfContext extends StatContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public StatIfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatAnswerContext extends StatContext {
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public StatAnswerContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatAnswer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatLineContext extends StatContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public StatLineContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatWhileContext extends StatContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public StatWhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStatWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStatWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStatWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stat);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__57:
			case T__58:
			case T__59:
			case ID:
				_localctx = new StatLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				line();
				setState(259);
				match(T__8);
				}
				break;
			case T__60:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				ifCondition();
				}
				break;
			case T__63:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				whileCondition();
				}
				break;
			case T__53:
				_localctx = new StatAnswerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				answer();
				}
				break;
			case T__64:
				_localctx = new StatForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				forCondition();
				}
				break;
			case T__65:
				_localctx = new StatTimeEndTimeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				timeEndTime();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineIterationContext extends LineContext {
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public LineIterationContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineQuizDeclarationContext extends LineContext {
		public QuizDeclarationContext quizDeclaration() {
			return getRuleContext(QuizDeclarationContext.class,0);
		}
		public LineQuizDeclarationContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineQuizDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineQuizDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineQuizDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineShowQuestionContext extends LineContext {
		public ShowQuestionContext showQuestion() {
			return getRuleContext(ShowQuestionContext.class,0);
		}
		public LineShowQuestionContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineShowQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineShowQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineShowQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineAssignContext extends LineContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LineAssignContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineReadContext extends LineContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public LineReadContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineDeclarationContext extends LineContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LineDeclarationContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineQuizAssignmentContext extends LineContext {
		public QuizAssignmentContext quizAssignment() {
			return getRuleContext(QuizAssignmentContext.class,0);
		}
		public LineQuizAssignmentContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineQuizAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineQuizAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineQuizAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinePrintContext extends LineContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LinePrintContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLinePrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLinePrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLinePrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineEnableOpContext extends LineContext {
		public EnableOptionsContext enableOptions() {
			return getRuleContext(EnableOptionsContext.class,0);
		}
		public LineEnableOpContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterLineEnableOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitLineEnableOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitLineEnableOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new LineDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				declaration();
				}
				break;
			case 2:
				_localctx = new LineQuizDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				quizDeclaration();
				}
				break;
			case 3:
				_localctx = new LineQuizAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				quizAssignment();
				}
				break;
			case 4:
				_localctx = new LineAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				assignment();
				}
				break;
			case 5:
				_localctx = new LinePrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				print();
				}
				break;
			case 6:
				_localctx = new LineReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				read();
				}
				break;
			case 7:
				_localctx = new LineShowQuestionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				showQuestion();
				}
				break;
			case 8:
				_localctx = new LineEnableOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				enableOptions();
				}
				break;
			case 9:
				_localctx = new LineIterationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				iteration();
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(280);
				match(T__2);
				setState(281);
				match(ID);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			type();
			setState(288);
			idList();
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

	public static class QuizDeclarationContext extends ParserRuleContext {
		public Type varType;
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public QuizDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quizDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuizDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuizDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuizDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizDeclarationContext quizDeclaration() throws RecognitionException {
		QuizDeclarationContext _localctx = new QuizDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quizDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__0);
			setState(291);
			idList();
			((QuizDeclarationContext)_localctx).varType =  new QuizType();
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

	public static class QuizAssignmentContext extends ParserRuleContext {
		public Token quizId;
		public ExprContext e1;
		public ExprContext e2;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QuizAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quizAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuizAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuizAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuizAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizAssignmentContext quizAssignment() throws RecognitionException {
		QuizAssignmentContext _localctx = new QuizAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_quizAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			var();
			setState(295);
			match(T__27);
			setState(296);
			((QuizAssignmentContext)_localctx).quizId = match(ID);
			setState(297);
			match(T__1);
			setState(298);
			((QuizAssignmentContext)_localctx).e1 = expr(0);
			setState(299);
			match(T__2);
			setState(300);
			((QuizAssignmentContext)_localctx).e2 = expr(0);
			setState(301);
			match(T__3);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignPlusContext extends AssignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignPlusContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterAssignPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitAssignPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitAssignPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignMinusContext extends AssignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignMinusContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterAssignMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitAssignMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitAssignMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignAttContext extends AssignmentContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignAttContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterAssignAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitAssignAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitAssignAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new AssignAttContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				var();
				setState(304);
				match(T__27);
				setState(305);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				var();
				setState(308);
				match(T__28);
				}
				break;
			case 3:
				_localctx = new AssignMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				var();
				setState(311);
				match(T__29);
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

	public static class TypeContext extends ParserRuleContext {
		public Type varType;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__30);
				((TypeContext)_localctx).varType =  new TimerType();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__31);
				((TypeContext)_localctx).varType =  new IntegerType();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__32);
				((TypeContext)_localctx).varType =  new DoubleType();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(T__33);
				((TypeContext)_localctx).varType =  new BooleanType();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(T__34);
				((TypeContext)_localctx).varType =  new StringType();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(T__0);
				((TypeContext)_localctx).varType =  new QuizType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public Type types;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.types = ctx.types;
			this.varName = ctx.varName;
		}
	}
	public static class ExprVarContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprQuizContext extends ExprContext {
		public QuizExprContext quizExpr() {
			return getRuleContext(QuizExprContext.class,0);
		}
		public ExprQuizContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprQuiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(QuestionarioParser.DOUBLE, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(QuestionarioParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(QuestionarioParser.BOOLEAN, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSignContext extends ExprContext {
		public Token sign;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(QuestionarioParser.INTEGER, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
				{
				_localctx = new ExprSignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(330);
				((ExprSignContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
					((ExprSignContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				((ExprSignContext)_localctx).e = expr(10);
				}
				break;
			case T__1:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(T__1);
				setState(333);
				((ExprParentContext)_localctx).e = expr(0);
				setState(334);
				match(T__3);
				}
				break;
			case T__39:
			case T__40:
				{
				_localctx = new ExprQuizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				quizExpr();
				}
				break;
			case ID:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				var();
				}
				break;
			case INTEGER:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(DOUBLE);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						((ExprMultDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(345);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						((ExprMultDivContext)_localctx).e2 = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(348);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						((ExprAddSubContext)_localctx).e2 = expr(9);
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public String varName;
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ID);
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

	public static class QuizExprContext extends ParserRuleContext {
		public Type types;
		public QuizExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quizExpr; }
	 
		public QuizExprContext() { }
		public void copyFrom(QuizExprContext ctx) {
			super.copyFrom(ctx);
			this.types = ctx.types;
		}
	}
	public static class ExprSizeOfSectionContext extends QuizExprContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public ExprSizeOfSectionContext(QuizExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprSizeOfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprSizeOfSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprSizeOfSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprResultSectionContext extends QuizExprContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public ExprResultSectionContext(QuizExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprResultSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprResultSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprResultSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSizeOfQuizContext extends QuizExprContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public ExprSizeOfQuizContext(QuizExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprSizeOfQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprSizeOfQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprSizeOfQuiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprResultQuizContext extends QuizExprContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public ExprResultQuizContext(QuizExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprResultQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprResultQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprResultQuiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprResultQuestionContext extends QuizExprContext {
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public ExprResultQuestionContext(QuizExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterExprResultQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitExprResultQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitExprResultQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizExprContext quizExpr() throws RecognitionException {
		QuizExprContext _localctx = new QuizExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_quizExpr);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ExprSizeOfQuizContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__39);
				setState(358);
				quizID();
				}
				break;
			case 2:
				_localctx = new ExprResultQuizContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__40);
				setState(360);
				quizID();
				}
				break;
			case 3:
				_localctx = new ExprSizeOfSectionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(T__39);
				setState(362);
				sectionID();
				}
				break;
			case 4:
				_localctx = new ExprResultSectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(T__40);
				setState(364);
				sectionID();
				}
				break;
			case 5:
				_localctx = new ExprResultQuestionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(T__40);
				setState(366);
				questionID();
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

	public static class QuestionIDContext extends ParserRuleContext {
		public QuestionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionID; }
	 
		public QuestionIDContext() { }
		public void copyFrom(QuestionIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuestionStartContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public QuestionStartContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionStart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionEndContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public QuestionEndContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionByIDContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public QuestionByIDContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionByID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionByID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionByID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionCurrentContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public QuestionCurrentContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionPrevContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public QuestionPrevContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionPrev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionPrev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionPrev(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionNextContext extends QuestionIDContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public QuestionNextContext(QuestionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuestionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuestionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuestionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionIDContext questionID() throws RecognitionException {
		QuestionIDContext _localctx = new QuestionIDContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_questionID);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new QuestionCurrentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				sectionID();
				setState(370);
				match(T__41);
				}
				break;
			case 2:
				_localctx = new QuestionPrevContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				sectionID();
				setState(373);
				match(T__42);
				}
				break;
			case 3:
				_localctx = new QuestionNextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				sectionID();
				setState(376);
				match(T__43);
				}
				break;
			case 4:
				_localctx = new QuestionStartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				sectionID();
				setState(379);
				match(T__44);
				}
				break;
			case 5:
				_localctx = new QuestionEndContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				sectionID();
				setState(382);
				match(T__45);
				}
				break;
			case 6:
				_localctx = new QuestionByIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				sectionID();
				setState(385);
				match(T__46);
				setState(386);
				match(ID);
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

	public static class SectionIDContext extends ParserRuleContext {
		public SectionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionID; }
	 
		public SectionIDContext() { }
		public void copyFrom(SectionIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SectionByIDContext extends SectionIDContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public SectionByIDContext(SectionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterSectionByID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitSectionByID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitSectionByID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SectionCurrentContext extends SectionIDContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public SectionCurrentContext(SectionIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterSectionCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitSectionCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitSectionCurrent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionIDContext sectionID() throws RecognitionException {
		SectionIDContext _localctx = new SectionIDContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sectionID);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new SectionByIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				quizID();
				setState(391);
				match(T__46);
				setState(392);
				match(ID);
				}
				break;
			case 2:
				_localctx = new SectionCurrentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				quizID();
				setState(395);
				match(T__41);
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

	public static class QuizIDContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public QuizIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quizID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterQuizID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitQuizID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitQuizID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizIDContext quizID() throws RecognitionException {
		QuizIDContext _localctx = new QuizIDContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_quizID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			var();
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

	public static class IterationContext extends ParserRuleContext {
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
	 
		public IterationContext() { }
		public void copyFrom(IterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationSectionContext extends IterationContext {
		public SectionIterationContext sectionIteration() {
			return getRuleContext(SectionIterationContext.class,0);
		}
		public IterationSectionContext(IterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterIterationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitIterationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitIterationSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IterationQuizContext extends IterationContext {
		public QuizIterationContext quizIteration() {
			return getRuleContext(QuizIterationContext.class,0);
		}
		public IterationQuizContext(IterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterIterationQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitIterationQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitIterationQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iteration);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new IterationQuizContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				quizIteration();
				}
				break;
			case 2:
				_localctx = new IterationSectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				sectionIteration();
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

	public static class QuizIterationContext extends ParserRuleContext {
		public QuizIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quizIteration; }
	 
		public QuizIterationContext() { }
		public void copyFrom(QuizIterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartSectionContext extends QuizIterationContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public StartSectionContext(QuizIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStartSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStartSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStartSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoToSectionContext extends QuizIterationContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public GoToSectionContext(QuizIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterGoToSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitGoToSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitGoToSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndSectionContext extends QuizIterationContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public EndSectionContext(QuizIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterEndSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitEndSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitEndSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrevSectionContext extends QuizIterationContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public PrevSectionContext(QuizIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterPrevSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitPrevSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitPrevSection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextSectionContext extends QuizIterationContext {
		public QuizIDContext quizID() {
			return getRuleContext(QuizIDContext.class,0);
		}
		public NextSectionContext(QuizIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterNextSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitNextSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitNextSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizIterationContext quizIteration() throws RecognitionException {
		QuizIterationContext _localctx = new QuizIterationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_quizIteration);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				_localctx = new NextSectionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(T__47);
				setState(406);
				quizID();
				}
				break;
			case T__48:
				_localctx = new PrevSectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__48);
				setState(408);
				quizID();
				}
				break;
			case T__49:
				_localctx = new StartSectionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(T__49);
				setState(410);
				quizID();
				}
				break;
			case T__50:
				_localctx = new EndSectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				match(T__50);
				setState(412);
				quizID();
				}
				break;
			case T__51:
				_localctx = new GoToSectionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(T__51);
				setState(414);
				sectionID();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SectionIterationContext extends ParserRuleContext {
		public SectionIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionIteration; }
	 
		public SectionIterationContext() { }
		public void copyFrom(SectionIterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrevQuestionContext extends SectionIterationContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public PrevQuestionContext(SectionIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterPrevQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitPrevQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitPrevQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoToQuestionContext extends SectionIterationContext {
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public GoToQuestionContext(SectionIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterGoToQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitGoToQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitGoToQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndQuestionContext extends SectionIterationContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public EndQuestionContext(SectionIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterEndQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitEndQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitEndQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartQuestionContext extends SectionIterationContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public StartQuestionContext(SectionIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterStartQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitStartQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitStartQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextQuestionContext extends SectionIterationContext {
		public SectionIDContext sectionID() {
			return getRuleContext(SectionIDContext.class,0);
		}
		public NextQuestionContext(SectionIterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterNextQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitNextQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitNextQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionIterationContext sectionIteration() throws RecognitionException {
		SectionIterationContext _localctx = new SectionIterationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sectionIteration);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				_localctx = new NextQuestionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(T__47);
				setState(418);
				sectionID();
				}
				break;
			case T__48:
				_localctx = new PrevQuestionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__48);
				setState(420);
				sectionID();
				}
				break;
			case T__49:
				_localctx = new StartQuestionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(T__49);
				setState(422);
				sectionID();
				}
				break;
			case T__50:
				_localctx = new EndQuestionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(T__50);
				setState(424);
				sectionID();
				}
				break;
			case T__51:
				_localctx = new GoToQuestionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				match(T__51);
				setState(426);
				questionID();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ShowQuestionContext extends ParserRuleContext {
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public ShowQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterShowQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitShowQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitShowQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowQuestionContext showQuestion() throws RecognitionException {
		ShowQuestionContext _localctx = new ShowQuestionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_showQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__52);
			setState(430);
			questionID();
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

	public static class AnswerContext extends ParserRuleContext {
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
	 
		public AnswerContext() { }
		public void copyFrom(AnswerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnswerSimpleContext extends AnswerContext {
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public AnswerSimpleContext(AnswerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterAnswerSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitAnswerSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitAnswerSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnswerOptionsContext extends AnswerContext {
		public StatContext sc;
		public StatContext sv;
		public StatContext si;
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(QuestionarioParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QuestionarioParser.STRING, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(QuestionarioParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(QuestionarioParser.INTEGER, i);
		}
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public AnswerOptionsContext(AnswerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterAnswerOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitAnswerOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitAnswerOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_answer);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new AnswerSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(T__53);
				setState(433);
				match(T__1);
				setState(434);
				questionID();
				setState(435);
				match(T__3);
				setState(436);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new AnswerOptionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(T__53);
				setState(439);
				match(T__1);
				setState(440);
				questionID();
				setState(441);
				match(T__3);
				setState(442);
				match(T__4);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__54) {
					{
					{
					setState(443);
					match(T__54);
					setState(444);
					match(T__1);
					setState(445);
					_la = _input.LA(1);
					if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STRING - 75)) | (1L << (ID - 75)) | (1L << (INTEGER - 75)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(446);
					match(T__3);
					setState(447);
					match(T__7);
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
						{
						{
						setState(448);
						((AnswerOptionsContext)_localctx).sc = stat();
						}
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(459);
					match(T__55);
					setState(460);
					match(T__7);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
						{
						{
						setState(461);
						((AnswerOptionsContext)_localctx).sv = stat();
						}
						}
						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(469);
					match(T__56);
					setState(470);
					match(T__7);
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
						{
						{
						setState(471);
						((AnswerOptionsContext)_localctx).si = stat();
						}
						}
						setState(476);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(479);
				match(T__5);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__57);
			setState(484);
			expr(0);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__58);
			setState(487);
			match(ID);
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

	public static class EnableOptionsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public EnableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterEnableOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitEnableOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitEnableOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnableOptionsContext enableOptions() throws RecognitionException {
		EnableOptionsContext _localctx = new EnableOptionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enableOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__59);
			setState(490);
			match(ID);
			setState(491);
			match(T__46);
			setState(492);
			match(ID);
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

	public static class IfConditionContext extends ParserRuleContext {
		public SimpleIfConditionContext simpleIfCondition() {
			return getRuleContext(SimpleIfConditionContext.class,0);
		}
		public List<ElseIfConditionContext> elseIfCondition() {
			return getRuleContexts(ElseIfConditionContext.class);
		}
		public ElseIfConditionContext elseIfCondition(int i) {
			return getRuleContext(ElseIfConditionContext.class,i);
		}
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			simpleIfCondition();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(495);
					elseIfCondition();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(501);
				elseCondition();
				}
			}

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

	public static class SimpleIfConditionContext extends ParserRuleContext {
		public ConditionContext c;
		public StatContext s;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public SimpleIfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIfCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterSimpleIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitSimpleIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitSimpleIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIfConditionContext simpleIfCondition() throws RecognitionException {
		SimpleIfConditionContext _localctx = new SimpleIfConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simpleIfCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__60);
			setState(505);
			match(T__1);
			setState(506);
			((SimpleIfConditionContext)_localctx).c = condition(0);
			setState(507);
			match(T__3);
			setState(508);
			match(T__4);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(509);
				((SimpleIfConditionContext)_localctx).s = stat();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__5);
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

	public static class ElseIfConditionContext extends ParserRuleContext {
		public ConditionContext c;
		public StatContext s;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseIfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterElseIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitElseIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitElseIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfConditionContext elseIfCondition() throws RecognitionException {
		ElseIfConditionContext _localctx = new ElseIfConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseIfCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(T__61);
			setState(518);
			match(T__1);
			setState(519);
			((ElseIfConditionContext)_localctx).c = condition(0);
			setState(520);
			match(T__3);
			setState(521);
			match(T__4);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(522);
				((ElseIfConditionContext)_localctx).s = stat();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(T__5);
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

	public static class ElseConditionContext extends ParserRuleContext {
		public StatContext s;
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__62);
			setState(531);
			match(T__4);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(532);
				((ElseConditionContext)_localctx).s = stat();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(T__5);
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

	public static class WhileConditionContext extends ParserRuleContext {
		public ConditionContext c;
		public StatContext s;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whileCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__63);
			setState(541);
			match(T__1);
			setState(542);
			((WhileConditionContext)_localctx).c = condition(0);
			setState(543);
			match(T__3);
			setState(544);
			match(T__4);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(545);
				((WhileConditionContext)_localctx).s = stat();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			match(T__5);
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

	public static class ForConditionContext extends ParserRuleContext {
		public StatContext s;
		public List<TerminalNode> ID() { return getTokens(QuestionarioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuestionarioParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__64);
			setState(554);
			match(T__1);
			setState(555);
			match(ID);
			setState(556);
			match(T__7);
			setState(557);
			match(ID);
			setState(558);
			match(T__3);
			setState(559);
			match(T__4);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(560);
				((ForConditionContext)_localctx).s = stat();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			match(T__5);
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

	public static class TimeEndTimeContext extends ParserRuleContext {
		public StatContext st;
		public StatContext set;
		public TerminalNode ID() { return getToken(QuestionarioParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(QuestionarioParser.INTEGER, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TimeEndTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeEndTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterTimeEndTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitTimeEndTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitTimeEndTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeEndTimeContext timeEndTime() throws RecognitionException {
		TimeEndTimeContext _localctx = new TimeEndTimeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_timeEndTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(T__65);
			setState(569);
			match(T__1);
			setState(570);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(571);
			match(T__3);
			setState(572);
			match(T__4);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(573);
				((TimeEndTimeContext)_localctx).st = stat();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(T__5);
			setState(580);
			match(T__66);
			setState(581);
			match(T__4);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(582);
				((TimeEndTimeContext)_localctx).set = stat();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(T__5);
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

	public static class ConditionContext extends ParserRuleContext {
		public Type types;
		public boolean cond;
		public String varName;
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
			this.types = ctx.types;
			this.cond = ctx.cond;
			this.varName = ctx.varName;
		}
	}
	public static class ConditionAndContext extends ConditionContext {
		public ConditionContext c1;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionAndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitConditionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitConditionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionOrContext extends ConditionContext {
		public ConditionContext c1;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionOrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterConditionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitConditionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitConditionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionBooleanContext extends ConditionContext {
		public TerminalNode BOOLEAN() { return getToken(QuestionarioParser.BOOLEAN, 0); }
		public ConditionBooleanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterConditionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitConditionBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitConditionBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionComparationContext extends ConditionContext {
		public ComparationContext c;
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public ConditionComparationContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterConditionComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitConditionComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitConditionComparation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionParentContext extends ConditionContext {
		public ConditionContext c;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionParentContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterConditionParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitConditionParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitConditionParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ConditionComparationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(591);
				((ConditionComparationContext)_localctx).c = comparation();
				}
				break;
			case 2:
				{
				_localctx = new ConditionParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(T__1);
				setState(593);
				((ConditionParentContext)_localctx).c = condition(0);
				setState(594);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new ConditionBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(596);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionOrContext(new ConditionContext(_parentctx, _parentState));
						((ConditionOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(599);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(600);
						match(T__67);
						setState(601);
						((ConditionOrContext)_localctx).c2 = condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionAndContext(new ConditionContext(_parentctx, _parentState));
						((ConditionAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(602);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(603);
						match(T__68);
						setState(604);
						((ConditionAndContext)_localctx).c2 = condition(5);
						}
						break;
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparationContext extends ParserRuleContext {
		public Type types;
		public boolean comp;
		public String varName;
		public ExprContext e1;
		public Token c;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).enterComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionarioListener ) ((QuestionarioListener)listener).exitComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionarioVisitor ) return ((QuestionarioVisitor<? extends T>)visitor).visitComparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comparation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((ComparationContext)_localctx).e1 = expr(0);
			setState(611);
			((ComparationContext)_localctx).c = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__12 - 11)) | (1L << (T__69 - 11)) | (1L << (T__70 - 11)) | (1L << (T__71 - 11)) | (1L << (T__72 - 11)))) != 0)) ) {
				((ComparationContext)_localctx).c = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(612);
			((ComparationContext)_localctx).e2 = expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return theme_sempred((ThemeContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 40:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean theme_sempred(ThemeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0269\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3i\n\3\3\3\6\3l\n\3\r\3\16\3m\5\3p\n\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0089\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0096"+
		"\n\6\f\6\16\6\u0099\13\6\5\6\u009b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\5\7\u00bb\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\7\7\u00cb\n\7\f\7\16\7\u00ce"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d7\n\b\f\b\16\b\u00da\13\b\3"+
		"\b\5\b\u00dd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e6\n\t\f\t\16\t\u00e9"+
		"\13\t\3\t\3\t\3\t\3\t\5\t\u00ef\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u00fe\n\f\f\f\16\f\u0101\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010d\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0118\n\16\3\17\3\17\3\17\7\17\u011d\n\17\f\17\16"+
		"\17\u0120\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u013c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u014a\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0159\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0161\n\25\f\25\16\25\u0164\13\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0172\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0187\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0190\n\31\3\32\3"+
		"\32\3\33\3\33\5\33\u0196\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01a2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01ae\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01c4\n\37\f\37"+
		"\16\37\u01c7\13\37\7\37\u01c9\n\37\f\37\16\37\u01cc\13\37\3\37\3\37\3"+
		"\37\7\37\u01d1\n\37\f\37\16\37\u01d4\13\37\5\37\u01d6\n\37\3\37\3\37\3"+
		"\37\7\37\u01db\n\37\f\37\16\37\u01de\13\37\5\37\u01e0\n\37\3\37\3\37\5"+
		"\37\u01e4\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u01f3\n"+
		"#\f#\16#\u01f6\13#\3#\5#\u01f9\n#\3$\3$\3$\3$\3$\3$\7$\u0201\n$\f$\16"+
		"$\u0204\13$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u020e\n%\f%\16%\u0211\13%\3%\3"+
		"%\3&\3&\3&\7&\u0218\n&\f&\16&\u021b\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u0225\n\'\f\'\16\'\u0228\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\7("+
		"\u0234\n(\f(\16(\u0237\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u0241\n)\f)\16)"+
		"\u0244\13)\3)\3)\3)\3)\7)\u024a\n)\f)\16)\u024d\13)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u0258\n*\3*\3*\3*\3*\3*\3*\7*\u0260\n*\f*\16*\u0263\13*\3"+
		"+\3+\3+\3+\3+\5\u00d8\u00e7\u01f4\5\f(R,\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\7\3\2&\'\3\2()\3\2MO\3"+
		"\2NO\5\2\r\r\17\17HK\2\u029a\2W\3\2\2\2\4_\3\2\2\2\6s\3\2\2\2\b\u0082"+
		"\3\2\2\2\n\u008f\3\2\2\2\f\u00ba\3\2\2\2\16\u00dc\3\2\2\2\20\u00ee\3\2"+
		"\2\2\22\u00f0\3\2\2\2\24\u00f6\3\2\2\2\26\u00fa\3\2\2\2\30\u010c\3\2\2"+
		"\2\32\u0117\3\2\2\2\34\u0119\3\2\2\2\36\u0121\3\2\2\2 \u0124\3\2\2\2\""+
		"\u0128\3\2\2\2$\u013b\3\2\2\2&\u0149\3\2\2\2(\u0158\3\2\2\2*\u0165\3\2"+
		"\2\2,\u0171\3\2\2\2.\u0186\3\2\2\2\60\u018f\3\2\2\2\62\u0191\3\2\2\2\64"+
		"\u0195\3\2\2\2\66\u01a1\3\2\2\28\u01ad\3\2\2\2:\u01af\3\2\2\2<\u01e3\3"+
		"\2\2\2>\u01e5\3\2\2\2@\u01e8\3\2\2\2B\u01eb\3\2\2\2D\u01f0\3\2\2\2F\u01fa"+
		"\3\2\2\2H\u0207\3\2\2\2J\u0214\3\2\2\2L\u021e\3\2\2\2N\u022b\3\2\2\2P"+
		"\u023a\3\2\2\2R\u0257\3\2\2\2T\u0264\3\2\2\2VX\5\22\n\2WV\3\2\2\2XY\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\4\3\2\\]\5\26\f\2]^\7\2\2\3"+
		"^\3\3\2\2\2_`\7\3\2\2`a\7N\2\2ab\7\4\2\2bc\7N\2\2cd\7\5\2\2de\7N\2\2e"+
		"f\7\6\2\2fh\7\7\2\2gi\5\6\4\2hg\3\2\2\2hi\3\2\2\2io\3\2\2\2jl\5\b\5\2"+
		"kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2ok\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\7\b\2\2r\5\3\2\2\2st\7\t\2\2tu\7N\2\2u|\7\4\2\2vw\7N\2\2"+
		"wx\7\n\2\2xy\7M\2\2y{\7\13\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\6\2\2\u0080\u0081\7\13\2\2\u0081\7"+
		"\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0088\7N\2\2\u0084\u0085\7\r\2\2\u0085"+
		"\u0086\7O\2\2\u0086\u0087\7\16\2\2\u0087\u0089\7\17\2\2\u0088\u0084\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\4\2\2\u008b"+
		"\u008c\5\n\6\2\u008c\u008d\7\6\2\2\u008d\u008e\7\13\2\2\u008e\t\3\2\2"+
		"\2\u008f\u0090\7\20\2\2\u0090\u0091\7N\2\2\u0091\u009a\7\n\2\2\u0092\u0097"+
		"\5\16\b\2\u0093\u0094\7\5\2\2\u0094\u0096\5\16\b\2\u0095\u0093\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\13\2\2\u009d\13\3\2\2\2\u009e\u009f\b\7\1"+
		"\2\u009f\u00a4\7M\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7O\2\2\u00a2\u00a3"+
		"\7\16\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00bb\3\2\2\2\u00a6\u00ab\7\23\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9"+
		"\7O\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ac\7\17\2\2\u00ab\u00a7\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af"+
		"\7\24\2\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7\5\2\2\u00b2"+
		"\u00b3\7\25\2\2\u00b3\u00b4\7O\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7O"+
		"\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b9\7\6\2\2\u00b8\u00ad\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u009e\3\2\2\2\u00ba\u00a6\3\2"+
		"\2\2\u00bb\u00cc\3\2\2\2\u00bc\u00bd\f\6\2\2\u00bd\u00be\7\21\2\2\u00be"+
		"\u00cb\5\f\7\7\u00bf\u00c0\f\5\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c8\5"+
		"\20\t\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7\21\2\2\u00c4\u00c9\5\f\7\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c9\5\20\t\2\u00c8\u00c2\3"+
		"\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00bc\3\2\2\2\u00ca\u00bf\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00dd"+
		"\7N\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\7\27\2\2\u00d3"+
		"\u00d8\7O\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d7\7O\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7\26\2\2\u00dc\u00cf\3\2\2\2"+
		"\u00dc\u00d0\3\2\2\2\u00dd\17\3\2\2\2\u00de\u00ef\5\16\b\2\u00df\u00ef"+
		"\7\23\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\7\30\2\2\u00e2\u00e7\7N\2\2"+
		"\u00e3\u00e4\7\5\2\2\u00e4\u00e6\7N\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ef\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\7"+
		"O\2\2\u00ed\u00ef\7\6\2\2\u00ee\u00de\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee"+
		"\u00e0\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\21\3\2\2\2\u00f0\u00f1\7\31\2"+
		"\2\u00f1\u00f2\5\24\13\2\u00f2\u00f3\7\32\2\2\u00f3\u00f4\7N\2\2\u00f4"+
		"\u00f5\7\13\2\2\u00f5\23\3\2\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\7N\2"+
		"\2\u00f8\u00f9\7\34\2\2\u00f9\25\3\2\2\2\u00fa\u00fb\7\35\2\2\u00fb\u00ff"+
		"\7\7\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7\b\2\2\u0103\27\3\2\2\2\u0104\u0105\5\32\16\2\u0105"+
		"\u0106\7\13\2\2\u0106\u010d\3\2\2\2\u0107\u010d\5D#\2\u0108\u010d\5L\'"+
		"\2\u0109\u010d\5<\37\2\u010a\u010d\5N(\2\u010b\u010d\5P)\2\u010c\u0104"+
		"\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\31\3\2\2\2\u010e\u0118\5\36\20"+
		"\2\u010f\u0118\5 \21\2\u0110\u0118\5\"\22\2\u0111\u0118\5$\23\2\u0112"+
		"\u0118\5> \2\u0113\u0118\5@!\2\u0114\u0118\5:\36\2\u0115\u0118\5B\"\2"+
		"\u0116\u0118\5\64\33\2\u0117\u010e\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110"+
		"\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\33\3\2\2"+
		"\2\u0119\u011e\7N\2\2\u011a\u011b\7\5\2\2\u011b\u011d\7N\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\35\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5&\24\2\u0122\u0123\5\34\17"+
		"\2\u0123\37\3\2\2\2\u0124\u0125\7\3\2\2\u0125\u0126\5\34\17\2\u0126\u0127"+
		"\b\21\1\2\u0127!\3\2\2\2\u0128\u0129\5*\26\2\u0129\u012a\7\36\2\2\u012a"+
		"\u012b\7N\2\2\u012b\u012c\7\4\2\2\u012c\u012d\5(\25\2\u012d\u012e\7\5"+
		"\2\2\u012e\u012f\5(\25\2\u012f\u0130\7\6\2\2\u0130#\3\2\2\2\u0131\u0132"+
		"\5*\26\2\u0132\u0133\7\36\2\2\u0133\u0134\5(\25\2\u0134\u013c\3\2\2\2"+
		"\u0135\u0136\5*\26\2\u0136\u0137\7\37\2\2\u0137\u013c\3\2\2\2\u0138\u0139"+
		"\5*\26\2\u0139\u013a\7 \2\2\u013a\u013c\3\2\2\2\u013b\u0131\3\2\2\2\u013b"+
		"\u0135\3\2\2\2\u013b\u0138\3\2\2\2\u013c%\3\2\2\2\u013d\u013e\7!\2\2\u013e"+
		"\u014a\b\24\1\2\u013f\u0140\7\"\2\2\u0140\u014a\b\24\1\2\u0141\u0142\7"+
		"#\2\2\u0142\u014a\b\24\1\2\u0143\u0144\7$\2\2\u0144\u014a\b\24\1\2\u0145"+
		"\u0146\7%\2\2\u0146\u014a\b\24\1\2\u0147\u0148\7\3\2\2\u0148\u014a\b\24"+
		"\1\2\u0149\u013d\3\2\2\2\u0149\u013f\3\2\2\2\u0149\u0141\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a\'\3\2\2\2"+
		"\u014b\u014c\b\25\1\2\u014c\u014d\t\2\2\2\u014d\u0159\5(\25\f\u014e\u014f"+
		"\7\4\2\2\u014f\u0150\5(\25\2\u0150\u0151\7\6\2\2\u0151\u0159\3\2\2\2\u0152"+
		"\u0159\5,\27\2\u0153\u0159\5*\26\2\u0154\u0159\7O\2\2\u0155\u0159\7P\2"+
		"\2\u0156\u0159\7L\2\2\u0157\u0159\7M\2\2\u0158\u014b\3\2\2\2\u0158\u014e"+
		"\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u0162\3\2"+
		"\2\2\u015a\u015b\f\13\2\2\u015b\u015c\t\3\2\2\u015c\u0161\5(\25\f\u015d"+
		"\u015e\f\n\2\2\u015e\u015f\t\2\2\2\u015f\u0161\5(\25\13\u0160\u015a\3"+
		"\2\2\2\u0160\u015d\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163)\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7N\2\2\u0166"+
		"+\3\2\2\2\u0167\u0168\7*\2\2\u0168\u0172\5\62\32\2\u0169\u016a\7+\2\2"+
		"\u016a\u0172\5\62\32\2\u016b\u016c\7*\2\2\u016c\u0172\5\60\31\2\u016d"+
		"\u016e\7+\2\2\u016e\u0172\5\60\31\2\u016f\u0170\7+\2\2\u0170\u0172\5."+
		"\30\2\u0171\u0167\3\2\2\2\u0171\u0169\3\2\2\2\u0171\u016b\3\2\2\2\u0171"+
		"\u016d\3\2\2\2\u0171\u016f\3\2\2\2\u0172-\3\2\2\2\u0173\u0174\5\60\31"+
		"\2\u0174\u0175\7,\2\2\u0175\u0187\3\2\2\2\u0176\u0177\5\60\31\2\u0177"+
		"\u0178\7-\2\2\u0178\u0187\3\2\2\2\u0179\u017a\5\60\31\2\u017a\u017b\7"+
		".\2\2\u017b\u0187\3\2\2\2\u017c\u017d\5\60\31\2\u017d\u017e\7/\2\2\u017e"+
		"\u0187\3\2\2\2\u017f\u0180\5\60\31\2\u0180\u0181\7\60\2\2\u0181\u0187"+
		"\3\2\2\2\u0182\u0183\5\60\31\2\u0183\u0184\7\61\2\2\u0184\u0185\7N\2\2"+
		"\u0185\u0187\3\2\2\2\u0186\u0173\3\2\2\2\u0186\u0176\3\2\2\2\u0186\u0179"+
		"\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u017f\3\2\2\2\u0186\u0182\3\2\2\2\u0187"+
		"/\3\2\2\2\u0188\u0189\5\62\32\2\u0189\u018a\7\61\2\2\u018a\u018b\7N\2"+
		"\2\u018b\u0190\3\2\2\2\u018c\u018d\5\62\32\2\u018d\u018e\7,\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u018c\3\2\2\2\u0190\61\3\2\2"+
		"\2\u0191\u0192\5*\26\2\u0192\63\3\2\2\2\u0193\u0196\5\66\34\2\u0194\u0196"+
		"\58\35\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\65\3\2\2\2\u0197"+
		"\u0198\7\62\2\2\u0198\u01a2\5\62\32\2\u0199\u019a\7\63\2\2\u019a\u01a2"+
		"\5\62\32\2\u019b\u019c\7\64\2\2\u019c\u01a2\5\62\32\2\u019d\u019e\7\65"+
		"\2\2\u019e\u01a2\5\62\32\2\u019f\u01a0\7\66\2\2\u01a0\u01a2\5\60\31\2"+
		"\u01a1\u0197\3\2\2\2\u01a1\u0199\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u019d"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\67\3\2\2\2\u01a3\u01a4\7\62\2\2\u01a4"+
		"\u01ae\5\60\31\2\u01a5\u01a6\7\63\2\2\u01a6\u01ae\5\60\31\2\u01a7\u01a8"+
		"\7\64\2\2\u01a8\u01ae\5\60\31\2\u01a9\u01aa\7\65\2\2\u01aa\u01ae\5\60"+
		"\31\2\u01ab\u01ac\7\66\2\2\u01ac\u01ae\5.\30\2\u01ad\u01a3\3\2\2\2\u01ad"+
		"\u01a5\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae9\3\2\2\2\u01af\u01b0\7\67\2\2\u01b0\u01b1\5.\30\2\u01b1;\3"+
		"\2\2\2\u01b2\u01b3\78\2\2\u01b3\u01b4\7\4\2\2\u01b4\u01b5\5.\30\2\u01b5"+
		"\u01b6\7\6\2\2\u01b6\u01b7\7\13\2\2\u01b7\u01e4\3\2\2\2\u01b8\u01b9\7"+
		"8\2\2\u01b9\u01ba\7\4\2\2\u01ba\u01bb\5.\30\2\u01bb\u01bc\7\6\2\2\u01bc"+
		"\u01ca\7\7\2\2\u01bd\u01be\79\2\2\u01be\u01bf\7\4\2\2\u01bf\u01c0\t\4"+
		"\2\2\u01c0\u01c1\7\6\2\2\u01c1\u01c5\7\n\2\2\u01c2\u01c4\5\30\r\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01bd\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d5\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7:\2\2\u01ce\u01d2\7\n\2\2\u01cf"+
		"\u01d1\5\30\r\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01cd\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01df\3\2\2\2\u01d7\u01d8\7;"+
		"\2\2\u01d8\u01dc\7\n\2\2\u01d9\u01db\5\30\r\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\7\b\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01b2\3\2"+
		"\2\2\u01e3\u01b8\3\2\2\2\u01e4=\3\2\2\2\u01e5\u01e6\7<\2\2\u01e6\u01e7"+
		"\5(\25\2\u01e7?\3\2\2\2\u01e8\u01e9\7=\2\2\u01e9\u01ea\7N\2\2\u01eaA\3"+
		"\2\2\2\u01eb\u01ec\7>\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ee\7\61\2\2\u01ee"+
		"\u01ef\7N\2\2\u01efC\3\2\2\2\u01f0\u01f4\5F$\2\u01f1\u01f3\5H%\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5J&\2\u01f8\u01f7"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9E\3\2\2\2\u01fa\u01fb\7?\2\2\u01fb\u01fc"+
		"\7\4\2\2\u01fc\u01fd\5R*\2\u01fd\u01fe\7\6\2\2\u01fe\u0202\7\7\2\2\u01ff"+
		"\u0201\5\30\r\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3"+
		"\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0206\7\b\2\2\u0206G\3\2\2\2\u0207\u0208\7@\2\2\u0208\u0209\7\4\2\2\u0209"+
		"\u020a\5R*\2\u020a\u020b\7\6\2\2\u020b\u020f\7\7\2\2\u020c\u020e\5\30"+
		"\r\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\b"+
		"\2\2\u0213I\3\2\2\2\u0214\u0215\7A\2\2\u0215\u0219\7\7\2\2\u0216\u0218"+
		"\5\30\r\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d"+
		"\7\b\2\2\u021dK\3\2\2\2\u021e\u021f\7B\2\2\u021f\u0220\7\4\2\2\u0220\u0221"+
		"\5R*\2\u0221\u0222\7\6\2\2\u0222\u0226\7\7\2\2\u0223\u0225\5\30\r\2\u0224"+
		"\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\b\2\2\u022a"+
		"M\3\2\2\2\u022b\u022c\7C\2\2\u022c\u022d\7\4\2\2\u022d\u022e\7N\2\2\u022e"+
		"\u022f\7\n\2\2\u022f\u0230\7N\2\2\u0230\u0231\7\6\2\2\u0231\u0235\7\7"+
		"\2\2\u0232\u0234\5\30\r\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u0239\7\b\2\2\u0239O\3\2\2\2\u023a\u023b\7D\2\2\u023b\u023c"+
		"\7\4\2\2\u023c\u023d\t\5\2\2\u023d\u023e\7\6\2\2\u023e\u0242\7\7\2\2\u023f"+
		"\u0241\5\30\r\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3"+
		"\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0246\7\b\2\2\u0246\u0247\7E\2\2\u0247\u024b\7\7\2\2\u0248\u024a\5\30"+
		"\r\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\7\b"+
		"\2\2\u024fQ\3\2\2\2\u0250\u0251\b*\1\2\u0251\u0258\5T+\2\u0252\u0253\7"+
		"\4\2\2\u0253\u0254\5R*\2\u0254\u0255\7\6\2\2\u0255\u0258\3\2\2\2\u0256"+
		"\u0258\7L\2\2\u0257\u0250\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0256\3\2"+
		"\2\2\u0258\u0261\3\2\2\2\u0259\u025a\f\7\2\2\u025a\u025b\7F\2\2\u025b"+
		"\u0260\5R*\b\u025c\u025d\f\6\2\2\u025d\u025e\7G\2\2\u025e\u0260\5R*\7"+
		"\u025f\u0259\3\2\2\2\u025f\u025c\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262S\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0265\5(\25\2\u0265\u0266\t\6\2\2\u0266\u0267\5(\25\2\u0267U\3\2\2\2"+
		"\67Yhmo|\u0088\u0097\u009a\u00a4\u00ab\u00b8\u00ba\u00c8\u00ca\u00cc\u00d8"+
		"\u00dc\u00e7\u00ee\u00ff\u010c\u0117\u011e\u013b\u0149\u0158\u0160\u0162"+
		"\u0171\u0186\u018f\u0195\u01a1\u01ad\u01c5\u01ca\u01d2\u01d5\u01dc\u01df"+
		"\u01e3\u01f4\u01f8\u0202\u020f\u0219\u0226\u0235\u0242\u024b\u0257\u025f"+
		"\u0261";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}