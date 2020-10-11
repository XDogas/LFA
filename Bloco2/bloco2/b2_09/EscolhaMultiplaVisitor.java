// Generated from EscolhaMultipla.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EscolhaMultiplaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EscolhaMultiplaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EscolhaMultiplaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(EscolhaMultiplaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EscolhaMultiplaParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(EscolhaMultiplaParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EscolhaMultiplaParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(EscolhaMultiplaParser.AnswerContext ctx);
}