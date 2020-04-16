public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

    @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {

        Double res;

        if(ctx.expr() == null) return null;

        res = (Double)visit(ctx.expr());

        if(res == null) res = null;
        else System.out.println(ctx.getText() + " = " + res);

        return res;
    }

    @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {

        Double num1 = visit(ctx.expr(0));
        Double num2 = visit(ctx.expr(1));
        Double res = null;
        String op = ctx.op.getText();

        if(num1 != null && num2 != null) {
            switch(op) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if(num2 == 0) System.out.println("A divisão não pode ser por 0!");
                    else res = num1 / num2;
                    break;
            }
        }

        return res;
    }

    @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
        return Double.parseDouble(ctx.Number().getText());
    }
}
