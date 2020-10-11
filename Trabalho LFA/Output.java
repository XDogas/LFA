import java.util.*;
import question.qst;
public class Output {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
          String var1;
          String var2 = "Joao";
          var1 = var2;
          int var3;
          int var4 = 100;
          var3 = var4;
          null var5;
          String var6 = var1;
          int var7 = var3;
          var5 = new Quiz(var6,var7);
          t.goTo(t.getByID("parte1").getID());
          t.getByID("parte1").goTo(t.getByID("parte1").getByID("f1P1").getID());
          double var8;
          t.getByID("parte1").size();
          var8 = ;
          int var9;
          int var10 = 0;
          var9 = var10;
          double var11;
          int var12 = 0;
          var11 = var12;
          int var15 = var9;
          double var16 = var8;
          boolean var14 = var15 < var16;
          int var18 = var9;
          double var19 = var8;
          boolean var17 = var18 < var19;
          boolean var13 = var14 && var17;
          while(var17){

              //show Question
              String text = t.getCurrent().getCurrent().getText();
              Map<String, Answer> enabled = t.getCurrent().getCurrent().getEnabledAnswers();

              //print QuestionText
              System.out.println(text);

              Iterator<Map.Entry<String,Answer>> iterator = enabled.entrySet().iterator;

              //print AnswerText
              while(iterator.hasNext()) {
                  Map.Entry<String, Answer> entry = iterator.next();
                  String answerID = entry.getkey();
                  Answer answer = entry.getValue();

                  String answerText = answer.getText();

                  answerText = answerID.concat("- " + answerText);
                  System.out.println(answerText);
              }t.getCurrent().getCurrent().answer(in.nextLine());double var20;t.getCurrent().getCurrent().result();
              var20 = ;double var22 = var11;
              double var24 = 0.25;
              double var25 = var20;
              double var23 = var24 * var25;
              double var21 = var22 + var23;
              var11 = var21;t.getCurrent().goToNext();var9++;
          }
          t.goToNext();
          t.getByID("parte2").goTo(t.getByID("parte2").getByID("f1P7").getID());
          int var26 = 0;
          var9 = var26;
          int var27;
          t.getByID("parte2").size();
          var27 = ;
          double var28;
          int var29 = 0;
          var28 = var29;
          int var31 = var9;
          int var32 = var27;
          boolean var30 = var31 < var32;
          while(var30){

              //show Question
              String text = t.getCurrent().getCurrent().getText();
              Map<String, Answer> enabled = t.getCurrent().getCurrent().getEnabledAnswers();

              //print QuestionText
              System.out.println(text);

              Iterator<Map.Entry<String,Answer>> iterator = enabled.entrySet().iterator;

              //print AnswerText
              while(iterator.hasNext()) {
                  Map.Entry<String, Answer> entry = iterator.next();
                  String answerID = entry.getkey();
                  Answer answer = entry.getValue();

                  String answerText = answer.getText();

                  answerText = answerID.concat("- " + answerText);
                  System.out.println(answerText);
              }t.getCurrent().getCurrent().answer(in.nextLine());t.getCurrent().getCurrent().result();
              var20 = ;double var34 = var28;
              double var36 = 0.5;
              double var37 = var20;
              double var35 = var36 * var37;
              double var33 = var34 + var35;
              var28 = var33;t.getCurrent().goToNext();var9++;
          }
          double var38;
          double var41 = var11;
          double var42 = 0.6;
          double var40 = var41 * var42;
          double var44 = var28;
          double var45 = 0.4;
          double var43 = var44 * var45;
          double var39 = var40 + var43;
          var38 = var39;
          double var47 = var38;
          int var48 = 50;
          boolean var46 = var47 < var48;
          if(var46){
              String var49 = "Reprovado ! \n";
              System.out.println(var49);
          }
          else{
              String var50 = "Aprovado ! \n";
              System.out.println(var50);
          }
          String var52 = "Resultado final : ";
          double var53 = var38;
          String var51 = var52 + var53;
          System.out.println(var51);
    }
}