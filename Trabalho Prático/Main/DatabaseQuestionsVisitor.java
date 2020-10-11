import java.util.*;
import javaClasses.*;

public class DatabaseQuestionsVisitor extends ReadDatabaseQuestionsBaseVisitor<Object> {

   QuestionsBank bank = new QuestionsBank();
   Map<String, Double> score = new HashMap<>();

   @Override public Object visitStat(ReadDatabaseQuestionsParser.StatContext ctx) {
      
      List<ReadDatabaseQuestionsParser.ThemeContext> ctxThemes = ctx.theme();
      List<ReadDatabaseQuestionsParser.AssignmentContext> ctxAssg = null;
      
      ctx.dif = (Integer) visit(ctx.difficulty());

      bank.setMinDifficulty(Integer.parseInt(ctx.min.getText()));
      bank.setMaxDifficulty(Integer.parseInt(ctx.max.getText()));

      if (ctx.assignment() != null) {
         ctxAssg = ctx.assignment();
         for(ReadDatabaseQuestionsParser.AssignmentContext assgmt: ctxAssg) {
            visit(assgmt);
         }
      }

      for(ReadDatabaseQuestionsParser.ThemeContext thm : ctxThemes) {
         thm.dif = ctx.dif;
         visit(thm);
      }

      return bank;
   }

   @Override public Object visitAssignment(ReadDatabaseQuestionsParser.AssignmentContext ctx) {
      score.put((String) visit(ctx.var()), Double.parseDouble(ctx.Integer().getText()));
      return null;
   }

   @Override public Object visitTheme(ReadDatabaseQuestionsParser.ThemeContext ctx) {

      List<ReadDatabaseQuestionsParser.ThemeContext> ctxThemes = ctx.theme();
      List<ReadDatabaseQuestionsParser.QuestionContext> ctxQst = ctx.question();

      if(ctx.difficulty() != null) {
         ctx.dif = (Integer) visit(ctx.difficulty());
      }

      if(ctx. t == null) {
         ctx.t = "/" + ctx.String(1).getText().replace("\"","");
      }else {
         ctx.t += "/" + ctx.String(1).getText().replace("\"","");
      }

      if(ctxQst != null) {
         for(ReadDatabaseQuestionsParser.QuestionContext qst : ctxQst) {
            qst.dif = ctx.dif;
            qst.t = ctx.t;

            Question question = (Question) visit(qst);

            if (bank.containsQuestion(question.getID())) {
               System.err.println("Não pode conter perguntas com ID's iguais.");
               System.exit(1);
            }
            else if (!bank.validDifficulty(question)) {
               System.err.println("Dificuldade da pergunta não se encontra dentro dos limites.");
               System.exit(1);
            }
            bank.addQuestion(question);
         }
      }

      for(ReadDatabaseQuestionsParser.ThemeContext thm : ctxThemes) {
         thm.dif = ctx.dif;
         thm.t = ctx.t;
         visit(thm);
      }

      return null;
   }

   @Override public Object visitQuestion(ReadDatabaseQuestionsParser.QuestionContext ctx) {

      List<ReadDatabaseQuestionsParser.AnswerContext> ansCtx = ctx.answer();
      Question question = null;

      if(ctx.difficulty() == null) {
         question = new Question(ctx.t, (String) visit(ctx.id()), ctx.String().getText(), ctx.dif);
      }
      else {
         question = new Question(ctx.t, (String) visit(ctx.id()), ctx.String().getText(), (Integer) visit(ctx.difficulty()));
      }

      for(int i = 0; i < ansCtx.size(); i++) {
         Answer ans = (Answer) visit(ansCtx.get(i));
         String id = (String) visit(ctx.pnt(i));

         if (question.getAnswers().containsKey(id)) {
            System.err.println("Não pode conter respostas com alíneas iguais.");
            System.exit(1);
         }
         question.addAnswer(ans,id); 
      }
      return question;
   }

   @Override public Object visitAnswer(ReadDatabaseQuestionsParser.AnswerContext ctx) {

      String var = (String) visit(ctx.var());

      if(!score.containsKey(var)) System.out.println("Não foi atribuído nenhum valor à variável " + var);

      return new Answer(ctx.ans.getText(), score.get(var));  
   }

   @Override public Object visitDifficulty(ReadDatabaseQuestionsParser.DifficultyContext ctx) {
      if (ctx.dif != null){
         return Integer.parseInt(ctx.dif.getText());
      }
      return null;
   }

   @Override public Object visitVar(ReadDatabaseQuestionsParser.VarContext ctx) {
      String s = ctx.Point().getText();

      List<ReadDatabaseQuestionsParser.PntContext> str = ctx.pnt();

      for(int i = 0; i < str.size(); i++) {

         s = s.concat((String) visit(ctx.pnt(i)));
      }
      return s;
   }

   @Override public Object visitPnt(ReadDatabaseQuestionsParser.PntContext ctx) {
      return ctx.p.getText();
   }

   @Override public Object visitId(ReadDatabaseQuestionsParser.IdContext ctx) {
      return ctx.ID().getText();
   }
}
