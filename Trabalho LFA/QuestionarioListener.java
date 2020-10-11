// Generated from Questionario.g4 by ANTLR 4.8

import javaTypes.*;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionarioParser}.
 */
public interface QuestionarioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuestionarioParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuestionarioParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#quiz}.
	 * @param ctx the parse tree
	 */
	void enterQuiz(QuestionarioParser.QuizContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#quiz}.
	 * @param ctx the parse tree
	 */
	void exitQuiz(QuestionarioParser.QuizContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(QuestionarioParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(QuestionarioParser.OptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(QuestionarioParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(QuestionarioParser.SectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(QuestionarioParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(QuestionarioParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(QuestionarioParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(QuestionarioParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#simpleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#simpleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(QuestionarioParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(QuestionarioParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(QuestionarioParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(QuestionarioParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#qst}.
	 * @param ctx the parse tree
	 */
	void enterQst(QuestionarioParser.QstContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#qst}.
	 * @param ctx the parse tree
	 */
	void exitQst(QuestionarioParser.QstContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(QuestionarioParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(QuestionarioParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatLine}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatLine(QuestionarioParser.StatLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatLine}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatLine(QuestionarioParser.StatLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(QuestionarioParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(QuestionarioParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatWhile}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatWhile(QuestionarioParser.StatWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatWhile}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatWhile(QuestionarioParser.StatWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAnswer}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAnswer(QuestionarioParser.StatAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAnswer}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAnswer(QuestionarioParser.StatAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFor}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFor(QuestionarioParser.StatForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFor}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFor(QuestionarioParser.StatForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatTimeEndTime}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatTimeEndTime}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineDeclaration(QuestionarioParser.LineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineDeclaration(QuestionarioParser.LineDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineQuizDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineQuizDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineQuizAssignment}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineQuizAssignment(QuestionarioParser.LineQuizAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineQuizAssignment}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineQuizAssignment(QuestionarioParser.LineQuizAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineAssign}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineAssign(QuestionarioParser.LineAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineAssign}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineAssign(QuestionarioParser.LineAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinePrint}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinePrint(QuestionarioParser.LinePrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinePrint}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinePrint(QuestionarioParser.LinePrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineRead}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineRead(QuestionarioParser.LineReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineRead}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineRead(QuestionarioParser.LineReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineShowQuestion}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineShowQuestion}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineEnableOp}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineEnableOp(QuestionarioParser.LineEnableOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineEnableOp}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineEnableOp(QuestionarioParser.LineEnableOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineIteration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIteration(QuestionarioParser.LineIterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineIteration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIteration(QuestionarioParser.LineIterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(QuestionarioParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(QuestionarioParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QuestionarioParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QuestionarioParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#quizDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQuizDeclaration(QuestionarioParser.QuizDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#quizDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQuizDeclaration(QuestionarioParser.QuizDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#quizAssignment}.
	 * @param ctx the parse tree
	 */
	void enterQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#quizAssignment}.
	 * @param ctx the parse tree
	 */
	void exitQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignAtt}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignAtt(QuestionarioParser.AssignAttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignAtt}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignAtt(QuestionarioParser.AssignAttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignPlus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignPlus(QuestionarioParser.AssignPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignPlus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignPlus(QuestionarioParser.AssignPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignMinus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignMinus(QuestionarioParser.AssignMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignMinus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignMinus(QuestionarioParser.AssignMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QuestionarioParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QuestionarioParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(QuestionarioParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(QuestionarioParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(QuestionarioParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(QuestionarioParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprQuiz}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprQuiz(QuestionarioParser.ExprQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprQuiz}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprQuiz(QuestionarioParser.ExprQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDouble(QuestionarioParser.ExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDouble(QuestionarioParser.ExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(QuestionarioParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(QuestionarioParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(QuestionarioParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(QuestionarioParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(QuestionarioParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(QuestionarioParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(QuestionarioParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(QuestionarioParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSign(QuestionarioParser.ExprSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSign(QuestionarioParser.ExprSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(QuestionarioParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(QuestionarioParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(QuestionarioParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(QuestionarioParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSizeOfQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprSizeOfQuiz(QuestionarioParser.ExprSizeOfQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSizeOfQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprSizeOfQuiz(QuestionarioParser.ExprSizeOfQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprResultQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprResultQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSizeOfSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSizeOfSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprResultSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprResultSection(QuestionarioParser.ExprResultSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprResultSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprResultSection(QuestionarioParser.ExprResultSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprResultQuestion}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprResultQuestion}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionCurrent}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionCurrent}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionPrev}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionPrev(QuestionarioParser.QuestionPrevContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionPrev}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionPrev(QuestionarioParser.QuestionPrevContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionNext}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionNext(QuestionarioParser.QuestionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionNext}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionNext(QuestionarioParser.QuestionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionStart}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionStart(QuestionarioParser.QuestionStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionStart}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionStart(QuestionarioParser.QuestionStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionEnd}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionEnd(QuestionarioParser.QuestionEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionEnd}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionEnd(QuestionarioParser.QuestionEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuestionByID}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void enterQuestionByID(QuestionarioParser.QuestionByIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuestionByID}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 */
	void exitQuestionByID(QuestionarioParser.QuestionByIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SectionByID}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 */
	void enterSectionByID(QuestionarioParser.SectionByIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SectionByID}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 */
	void exitSectionByID(QuestionarioParser.SectionByIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SectionCurrent}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 */
	void enterSectionCurrent(QuestionarioParser.SectionCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SectionCurrent}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 */
	void exitSectionCurrent(QuestionarioParser.SectionCurrentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#quizID}.
	 * @param ctx the parse tree
	 */
	void enterQuizID(QuestionarioParser.QuizIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#quizID}.
	 * @param ctx the parse tree
	 */
	void exitQuizID(QuestionarioParser.QuizIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterationQuiz}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIterationQuiz(QuestionarioParser.IterationQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterationQuiz}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIterationQuiz(QuestionarioParser.IterationQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterationSection}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIterationSection(QuestionarioParser.IterationSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterationSection}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIterationSection(QuestionarioParser.IterationSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NextSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void enterNextSection(QuestionarioParser.NextSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NextSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void exitNextSection(QuestionarioParser.NextSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrevSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void enterPrevSection(QuestionarioParser.PrevSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrevSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void exitPrevSection(QuestionarioParser.PrevSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void enterStartSection(QuestionarioParser.StartSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void exitStartSection(QuestionarioParser.StartSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void enterEndSection(QuestionarioParser.EndSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void exitEndSection(QuestionarioParser.EndSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoToSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void enterGoToSection(QuestionarioParser.GoToSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoToSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 */
	void exitGoToSection(QuestionarioParser.GoToSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NextQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void enterNextQuestion(QuestionarioParser.NextQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NextQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void exitNextQuestion(QuestionarioParser.NextQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrevQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void enterPrevQuestion(QuestionarioParser.PrevQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrevQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void exitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void enterStartQuestion(QuestionarioParser.StartQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void exitStartQuestion(QuestionarioParser.StartQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void enterEndQuestion(QuestionarioParser.EndQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void exitEndQuestion(QuestionarioParser.EndQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoToQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void enterGoToQuestion(QuestionarioParser.GoToQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoToQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 */
	void exitGoToQuestion(QuestionarioParser.GoToQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#showQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShowQuestion(QuestionarioParser.ShowQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#showQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShowQuestion(QuestionarioParser.ShowQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnswerSimple}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswerSimple(QuestionarioParser.AnswerSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnswerSimple}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswerSimple(QuestionarioParser.AnswerSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnswerOptions}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswerOptions(QuestionarioParser.AnswerOptionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnswerOptions}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswerOptions(QuestionarioParser.AnswerOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QuestionarioParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QuestionarioParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(QuestionarioParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(QuestionarioParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#enableOptions}.
	 * @param ctx the parse tree
	 */
	void enterEnableOptions(QuestionarioParser.EnableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#enableOptions}.
	 * @param ctx the parse tree
	 */
	void exitEnableOptions(QuestionarioParser.EnableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(QuestionarioParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(QuestionarioParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#simpleIfCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#simpleIfCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#elseIfCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#elseIfCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(QuestionarioParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(QuestionarioParser.ElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(QuestionarioParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(QuestionarioParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(QuestionarioParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(QuestionarioParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#timeEndTime}.
	 * @param ctx the parse tree
	 */
	void enterTimeEndTime(QuestionarioParser.TimeEndTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#timeEndTime}.
	 * @param ctx the parse tree
	 */
	void exitTimeEndTime(QuestionarioParser.TimeEndTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionAnd(QuestionarioParser.ConditionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionAnd(QuestionarioParser.ConditionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionOr(QuestionarioParser.ConditionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionOr(QuestionarioParser.ConditionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBoolean}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionBoolean(QuestionarioParser.ConditionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBoolean}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionBoolean(QuestionarioParser.ConditionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionComparation}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionComparation(QuestionarioParser.ConditionComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionComparation}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionComparation(QuestionarioParser.ConditionComparationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionParent}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionParent(QuestionarioParser.ConditionParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionParent}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionParent(QuestionarioParser.ConditionParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionarioParser#comparation}.
	 * @param ctx the parse tree
	 */
	void enterComparation(QuestionarioParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionarioParser#comparation}.
	 * @param ctx the parse tree
	 */
	void exitComparation(QuestionarioParser.ComparationContext ctx);
}