import static java.lang.System.*;

import java.util.*;

public class Interpreter extends gramaticaBaseVisitor<String> {

   static final Scanner in = new Scanner(System.in);

   private Map<String,String> map = new HashMap<>();

   /*@Override public String visitProgram(gramaticaParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitStat(gramaticaParser.StatContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public String visitAssignment(gramaticaParser.AssignmentContext ctx) {

      String key = ctx.VAR().getText();
      String value = visit(ctx.expr());

      if(value != null) map.put(key,value);

      return null;
   }

   @Override public String visitPrint(gramaticaParser.PrintContext ctx) {

      out.println(visit(ctx.expr()));

      return null;
   }

   @Override public String visitExprInput(gramaticaParser.ExprInputContext ctx) {

      String value = in.nextLine();

      return value;
   }

   @Override public String visitExprConcat(gramaticaParser.ExprConcatContext ctx) {

      String str = visit(ctx.e1) + visit(ctx.e2);

      return "\"" + str.replace("\"","") + "\"";
   }

   @Override public String visitExprString(gramaticaParser.ExprStringContext ctx) {
      return ctx.STRING().getText();
   }

   @Override public String visitExprVar(gramaticaParser.ExprVarContext ctx) {

      String key = ctx.VAR().getText();
      String value = null;

      if(map.containsKey(key)) value = map.get(key);
      
      return value;
   }

   @Override public String visitExprSubst(gramaticaParser.ExprSubstContext ctx) {

      String original = visit(ctx.expr());

      String str1 = ctx.s1.getText();
      String str2 = ctx.s2.getText();

      return original.replace(str1,str2);
   }
}
