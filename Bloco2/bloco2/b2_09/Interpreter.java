import static java.lang.System.*;

public class Interpreter extends EscolhaMultiplaBaseVisitor<Question> {

   @Override public Question visitStat(EscolhaMultiplaParser.StatContext ctx) {
       //Question q = visit(ctx.question());
       out.println(visit(ctx.question()).toString());
       return null;
   }

   @Override public Question visitQuestion(EscolhaMultiplaParser.QuestionContext ctx) {
       String questionID = ctx.ID().getText();
       String questionText = ctx.STRING().getText();

       return new Question(questionID, questionText);
   }

   @Override public Question visitAnswer(EscolhaMultiplaParser.AnswerContext ctx) {
      return visitChildren(ctx);
   }
}
