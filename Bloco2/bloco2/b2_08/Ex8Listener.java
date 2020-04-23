// Generated from Ex8.g4 by ANTLR 4.8

    import static java.lang.System.*;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex8Parser}.
 */
public interface Ex8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex8Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex8Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(Ex8Parser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(Ex8Parser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(Ex8Parser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(Ex8Parser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVAR}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVAR(Ex8Parser.ExprVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVAR}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVAR(Ex8Parser.ExprVARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Ex8Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Ex8Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Ex8Parser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Ex8Parser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(Ex8Parser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(Ex8Parser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(Ex8Parser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(Ex8Parser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExponent(Ex8Parser.ExprExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprExponent}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExponent(Ex8Parser.ExprExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(Ex8Parser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(Ex8Parser.FractionContext ctx);
}