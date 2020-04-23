import static java.lang.System.*;

public class Interpreter extends Ex7BaseVisitor<String> {

    @Override public String visitStatExpr(Ex7Parser.StatExprContext ctx) {
        if(ctx.expr() != null) out.println(visit(ctx.expr()));
        return null;
    }

    @Override public String visitStatAssign(Ex7Parser.StatAssignContext ctx) {
        out.println(visit(ctx.assignment()));
        return null;
    }

    @Override public String visitAssignment(Ex7Parser.AssignmentContext ctx) {
        String var = ctx.ID().getText();
        String expr = visit(ctx.expr());
        return var + " = " + expr;
        //return ctx.ID().getText() + " = " + visit(ctx.expr()));
    }

    @Override public String visitExprAddSub(Ex7Parser.ExprAddSubContext ctx) {
        String expr0 = visit(ctx.expr(0));
        String expr1 = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return expr0 + " " + expr1 + " " + op;
        //return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
    }

    @Override public String visitExprParent(Ex7Parser.ExprParentContext ctx) {
        return visit(ctx.expr());
    }

    @Override public String visitExprUnary(Ex7Parser.ExprUnaryContext ctx) {
        String expr = visit(ctx.expr());
        String sinal = ctx.s.getText();
        if(sinal.equals("+")) sinal = "!+";
        else sinal = "!-";
        return expr + " " + sinal;
        //return visit(ctx.expr()) + " !" + ctx.s.getText();
    }

    @Override public String visitExprInteger(Ex7Parser.ExprIntegerContext ctx) {
        return ctx.getText();
    }

    @Override public String visitExprID(Ex7Parser.ExprIDContext ctx) {
        return ctx.ID().getText();
    }

    @Override public String visitExprMultDivMod(Ex7Parser.ExprMultDivModContext ctx) {
        String expr0 = visit(ctx.expr(0));
        String expr1 = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return expr0 + " " + expr1 + " " + op;
        //return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
    }
}
