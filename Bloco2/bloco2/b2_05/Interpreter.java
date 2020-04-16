import java.util.*;

public class Interpreter extends Ex5BaseVisitor<Integer> {

    HashMap<String, Integer> map = new HashMap<>();

    @Override public Integer visitStatExpr(Ex5Parser.StatExprContext ctx) {

        Integer res = visit(ctx.expr());
        if(res != null) System.out.println(" = " + res);

        return res;
    }

    @Override public Integer visitAssignment(Ex5Parser.AssignmentContext ctx) {

        String key = ctx.ID().getText();
        Integer value = visit(ctx.expr());

        if(value != null) {
            map.put(key, value);
            System.out.println(key + " = " + value);
        }

        return value;
    }

    @Override public Integer visitExprAddSub(Ex5Parser.ExprAddSubContext ctx) {

        Integer num1 = visit(ctx.expr(0));
        Integer num2 = visit(ctx.expr(1));
        Integer res = null;

        if(num1 != null && num2 != null) {
            String op = ctx.op.getText();
            switch(op) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
            }
        }

        return res;
    }

    @Override public Integer visitExprParent(Ex5Parser.ExprParentContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Integer visitExprInteger(Ex5Parser.ExprIntegerContext ctx) {
        return Integer.parseInt(ctx.Integer().getText());
    }

    @Override public Integer visitExprID(Ex5Parser.ExprIDContext ctx) {
        if(map.containsKey(ctx.ID().getText())) {
            System.err.println("Variável " + ctx.ID().getText() + " não existe");
            return null;
        }
        return map.get(ctx.ID().getText());
    }

    @Override public Integer visitExprMultDivMod(Ex5Parser.ExprMultDivModContext ctx) {

        Integer num1 = visit(ctx.expr(0));
        Integer num2 = visit(ctx.expr(1));
        Integer res = null;

        if(num1 != null && num2 != null) {
            String op = ctx.op.getText();
            switch(op) {
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if(num2 == 0) {
                        System.out.println("A divisão não pode ser por 0!");
                        break;
                    }
                    res = num1 / num2;
                    break;
                case "%":
                    if(num2 == 0) {
                        System.out.println("A divisão não pode ser por 0!");
                        break;
                    }
                    res = num1 % num2;
                    break;
            }
        }
        return res;
    }
}
