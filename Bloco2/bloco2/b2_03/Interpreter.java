public class Interpreter extends CalculatorBaseVisitor<Integer> {

    @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Integer visitStat(CalculatorParser.StatContext ctx) {

        Integer res;

        if(ctx.expr() == null) return null;

        res = visit(ctx.expr());

        if(res == null) res = null;
        else System.out.println(" = " + res);

        return res;
    }

    @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {

        Integer num1 = visit(ctx.expr(0));
        Integer num2 = visit(ctx.expr(1));
        Integer res = 0;
        String op = ctx.op.getText();

        if(num1 != null && num2 != null) {
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

    @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
        return visit(ctx.expr());
        //Integer res = visit(ctx.expr());

        //if(ctx.op != null && ctx.op.getText().equals("-") && res != null) res = -res;

        //return res;
    }

    @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
        return Integer.parseInt(ctx.Integer().getText());
    }

    @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {

        Integer num1 = visit(ctx.expr(0));
        Integer num2 = visit(ctx.expr(1));
        Integer res = 0;
        String op = ctx.op.getText();

        if(num1 != null && num2 != null) {
            switch(op) {
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if(num2 == 0) {
                        System.out.println("A divisão não pode ser por 0!");
                        return null;
                    }
                    res = num1 / num2;
                    break;
                case "%":
                    if(num2 == 0) {
                        System.out.println("A divisão não pode ser por 0!");
                        return null;
                    }
                    res = num1 % num2;
                    break;
            }
        }
        return res;
    }
}
