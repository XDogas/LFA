// Generated from Questionario.g4 by ANTLR 4.8

import javaTypes.*;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionarioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionarioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuestionarioParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#quiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuiz(QuestionarioParser.QuizContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions(QuestionarioParser.OptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections(QuestionarioParser.SectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(QuestionarioParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(QuestionarioParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#simpleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(QuestionarioParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(QuestionarioParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#qst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQst(QuestionarioParser.QstContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(QuestionarioParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatLine}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLine(QuestionarioParser.StatLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(QuestionarioParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatWhile}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatWhile(QuestionarioParser.StatWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAnswer}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAnswer(QuestionarioParser.StatAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatFor}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFor(QuestionarioParser.StatForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatTimeEndTime}
	 * labeled alternative in {@link QuestionarioParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineDeclaration(QuestionarioParser.LineDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineQuizDeclaration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineQuizAssignment}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineQuizAssignment(QuestionarioParser.LineQuizAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineAssign}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAssign(QuestionarioParser.LineAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LinePrint}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinePrint(QuestionarioParser.LinePrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineRead}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRead(QuestionarioParser.LineReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineShowQuestion}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineEnableOp}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineEnableOp(QuestionarioParser.LineEnableOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineIteration}
	 * labeled alternative in {@link QuestionarioParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIteration(QuestionarioParser.LineIterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(QuestionarioParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QuestionarioParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#quizDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuizDeclaration(QuestionarioParser.QuizDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#quizAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAtt}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAtt(QuestionarioParser.AssignAttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignPlus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignPlus(QuestionarioParser.AssignPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignMinus}
	 * labeled alternative in {@link QuestionarioParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignMinus(QuestionarioParser.AssignMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QuestionarioParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(QuestionarioParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(QuestionarioParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprQuiz}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprQuiz(QuestionarioParser.ExprQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDouble(QuestionarioParser.ExprDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(QuestionarioParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(QuestionarioParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(QuestionarioParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(QuestionarioParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSign(QuestionarioParser.ExprSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link QuestionarioParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(QuestionarioParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(QuestionarioParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSizeOfQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSizeOfQuiz(QuestionarioParser.ExprSizeOfQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprResultQuiz}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSizeOfSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprResultSection}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprResultSection(QuestionarioParser.ExprResultSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprResultQuestion}
	 * labeled alternative in {@link QuestionarioParser#quizExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionCurrent}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionPrev}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionPrev(QuestionarioParser.QuestionPrevContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionNext}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionNext(QuestionarioParser.QuestionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionStart}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionStart(QuestionarioParser.QuestionStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionEnd}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionEnd(QuestionarioParser.QuestionEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuestionByID}
	 * labeled alternative in {@link QuestionarioParser#questionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionByID(QuestionarioParser.QuestionByIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SectionByID}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionByID(QuestionarioParser.SectionByIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SectionCurrent}
	 * labeled alternative in {@link QuestionarioParser#sectionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionCurrent(QuestionarioParser.SectionCurrentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#quizID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuizID(QuestionarioParser.QuizIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationQuiz}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationQuiz(QuestionarioParser.IterationQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationSection}
	 * labeled alternative in {@link QuestionarioParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationSection(QuestionarioParser.IterationSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NextSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextSection(QuestionarioParser.NextSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrevSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevSection(QuestionarioParser.PrevSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StartSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSection(QuestionarioParser.StartSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndSection(QuestionarioParser.EndSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoToSection}
	 * labeled alternative in {@link QuestionarioParser#quizIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToSection(QuestionarioParser.GoToSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NextQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextQuestion(QuestionarioParser.NextQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrevQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StartQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartQuestion(QuestionarioParser.StartQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndQuestion(QuestionarioParser.EndQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoToQuestion}
	 * labeled alternative in {@link QuestionarioParser#sectionIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToQuestion(QuestionarioParser.GoToQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#showQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowQuestion(QuestionarioParser.ShowQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnswerSimple}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerSimple(QuestionarioParser.AnswerSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnswerOptions}
	 * labeled alternative in {@link QuestionarioParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerOptions(QuestionarioParser.AnswerOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QuestionarioParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(QuestionarioParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#enableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableOptions(QuestionarioParser.EnableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(QuestionarioParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#simpleIfCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#elseIfCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(QuestionarioParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#whileCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCondition(QuestionarioParser.WhileConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(QuestionarioParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#timeEndTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeEndTime(QuestionarioParser.TimeEndTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionAnd}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAnd(QuestionarioParser.ConditionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionOr}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOr(QuestionarioParser.ConditionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionBoolean}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBoolean(QuestionarioParser.ConditionBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionComparation}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionComparation(QuestionarioParser.ConditionComparationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionParent}
	 * labeled alternative in {@link QuestionarioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionParent(QuestionarioParser.ConditionParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionarioParser#comparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(QuestionarioParser.ComparationContext ctx);
}