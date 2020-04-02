public class Interpreter extends SuffixCalculatorBaseVisitor<String> {

   @Override public String visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitStat(SuffixCalculatorParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      return visitChildren(ctx);
   }
}
