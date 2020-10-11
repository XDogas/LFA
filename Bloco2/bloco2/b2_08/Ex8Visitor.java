// Generated from Ex8.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ex8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ex8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Ex8Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(Ex8Parser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(Ex8Parser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVAR}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVAR(Ex8Parser.ExprVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(Ex8Parser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(Ex8Parser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(Ex8Parser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(Ex8Parser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExponent(Ex8Parser.ExprExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(Ex8Parser.FractionContext ctx);
}