// Generated from Ex5.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex5Parser}.
 */
public interface Ex5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex5Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex5Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex5Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex5Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(Ex5Parser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(Ex5Parser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(Ex5Parser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(Ex5Parser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex5Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex5Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex5Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex5Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Ex5Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Ex5Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Ex5Parser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Ex5Parser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(Ex5Parser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(Ex5Parser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(Ex5Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(Ex5Parser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(Ex5Parser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(Ex5Parser.ExprMultDivModContext ctx);
}