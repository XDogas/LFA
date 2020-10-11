import static java.lang.System.*;

import java.util.*;

public class FractionVisitor extends Ex8BaseVisitor<Fraction> {

    HashMap<String, Fraction> map = new HashMap<>();

    @Override public Fraction visitStatPrint(Ex8Parser.StatPrintContext ctx) {
        Fraction res = visit(ctx.expr());
        out.println(res.toString());
        return null;
    }

    @Override public Fraction visitStatAssign(Ex8Parser.StatAssignContext ctx) {
        out.println(visit(ctx.assignment()));
        return null;
    }

    @Override public Fraction visitAssignment(Ex8Parser.AssignmentContext ctx) {

        String key = ctx.VAR().getText();
        Fraction value = visit(ctx.expr());

        if(value != null) {
            map.put(key, value);
        }

        return null;
    }

    @Override public Fraction visitExprVAR(Ex8Parser.ExprVARContext ctx) {
        String key = ctx.VAR().getText();
        Fraction value = null;
        if(map.containsKey(key)) value = map.get(key);
        return value;
    }

    @Override public Fraction visitExprAddSub(Ex8Parser.ExprAddSubContext ctx) {

        Fraction f1 = visit(ctx.expr(0));
        Fraction f2 = visit(ctx.expr(1));
        Fraction res = null;

        if(f1 != null && f2 != null) {
            String op = ctx.op.getText();
            switch(op) {
                case "+":
                    res = new Fraction(f1.num * f2.den + f2.num * f1.den, f1.den * f2.den);
                    break;
                case "-":
                    res = new Fraction(f1.num * f2.den - f2.num * f1.den, f1.den * f2.den);
                    break;
            }
            res.reduce();
        }

        return res;
    }

    @Override public Fraction visitExprParent(Ex8Parser.ExprParentContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Fraction visitExprMultDiv(Ex8Parser.ExprMultDivContext ctx) {

        Fraction f1 = visit(ctx.expr(0));
        Fraction f2 = visit(ctx.expr(1));
        Fraction res = null;

        if(f1 != null && f2 != null) {
            String op = ctx.op.getText();
            switch(op) {
                case "*":
                    res = new Fraction(f1.num * f2.num, f1.den * f2.den);
                    break;
                case ":":
                    res = new Fraction(f1.num * f2.den, f1.den * f2.num);
                    break;
            }
            res.reduce();
        }

        return res;
    }

    @Override public Fraction visitExprReduce(Ex8Parser.ExprReduceContext ctx) {
        Fraction f = visit(ctx.expr());
        if(f != null) f.reduce();
        return f;
    }

    @Override public Fraction visitExprFraction(Ex8Parser.ExprFractionContext ctx) {
        return visit(ctx.fraction());
    }

    @Override public Fraction visitExprExponent(Ex8Parser.ExprExponentContext ctx) {

        Fraction res = visit(ctx.expr());
        Integer e = Integer.parseInt(ctx.Integer().getText());
        Integer num = res.num;
        Integer den = res.den;

        if(ctx.s != null && ctx.s.getText().equals("-")) res = new Fraction(den^e,num^e);
        res = new Fraction(num^e,den^e);

        res.reduce();

        return res;
    }

    @Override public Fraction visitFraction(Ex8Parser.FractionContext ctx) {

        Integer num = Integer.parseInt(ctx.num.getText());
        Integer den = 1;
        if(ctx.s != null && ctx.s.getText().equals("-")) num = -num;
        if(ctx.den != null) den = Integer.parseInt(ctx.den.getText());

        return new Fraction(num,den);



        /*Integer num = Integer.parseInt(ctx.num.getText());

        String s = ctx.s.getText();
        if(s != null && s.equals("-")) num = -num;

        Integer den;
        if(ctx.den.getText() != null) den = Integer.parseInt(ctx.den.getText());
        else den = 1;

        Fraction f = new Fraction(num,den);

        return f;*/
    }
}
