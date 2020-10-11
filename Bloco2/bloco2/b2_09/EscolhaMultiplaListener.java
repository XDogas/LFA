// Generated from EscolhaMultipla.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EscolhaMultiplaParser}.
 */
public interface EscolhaMultiplaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EscolhaMultiplaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(EscolhaMultiplaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscolhaMultiplaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(EscolhaMultiplaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscolhaMultiplaParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(EscolhaMultiplaParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscolhaMultiplaParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(EscolhaMultiplaParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscolhaMultiplaParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(EscolhaMultiplaParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscolhaMultiplaParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(EscolhaMultiplaParser.AnswerContext ctx);
}