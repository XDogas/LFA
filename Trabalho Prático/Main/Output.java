import java.util.*;
import javaClasses.*;
import javaTypes.*;
public class Output {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
          //Início
          QuestionsBank f1 = QuestionarioMain.interpreter("question");
          QuestionsBank p = QuestionarioMain.interpreter("popup");
          Map<String,List<Section>> quizMap = new HashMap<>();
          Options Teste_options = new Options("Teste_options");
          Teste_options.addOption(new Option("giveUp","desistir"));
          Teste_options.addOption(new Option("part1","parte1"));
          Teste_options.addOption(new Option("part2","parte2"));
          Teste_options.addOption(new Option("nextQuestion","proximo"));
          Teste_options.addOption(new Option("prevQuestion","anterior"));
          Teste_options.addOption(new Option("prevToAnswer","anteriorN"));
          Teste_options.addOption(new Option("nextToAnswer","proximoN"));
          Teste_options.addOption(new Option("confirm","confirmar"));

          List<Section> Teste = new ArrayList<>();
          quizMap.put("Teste",Teste);
          Section Teste_parte1 = new Section("parte1");
          Teste_parte1.setPercentagem(50);
          Question Teste_f1_P1 = f1.getById("P1");
          Teste_f1_P1.enableAll();
          Teste_parte1.addQuestion(Teste_f1_P1);
          Teste_f1_P1.setID("f1_P1");

          Question Teste_f1_P2 = f1.getById("P2");
          Teste_f1_P2.enableAnswer("a");
          Teste_f1_P2.enableAnswer("b");
          Teste_f1_P2.enableAnswer("c");
          Teste_parte1.addQuestion(Teste_f1_P2);
          Teste_f1_P2.setID("f1_P2");

          Question Teste_f1_P4 = f1.getById("P4");
          Teste_f1_P4.enableAll();
          Teste_parte1.addQuestion(Teste_f1_P4);
          Teste_f1_P4.setID("f1_P4");

          Question Teste_f1_P5 = f1.getById("P5");
          Teste_f1_P5.enableAll();
          Teste_parte1.addQuestion(Teste_f1_P5);
          Teste_f1_P5.setID("f1_P5");

          Teste.add(Teste_parte1);
          Section Teste_parte2 = new Section("parte2");
          Teste_parte2.setPercentagem(50);
          Question Teste_f1_P7 = f1.getById("P7");
          Teste_f1_P7.enableAll();
          Teste_parte2.addQuestion(Teste_f1_P7);
          Teste_f1_P7.setID("f1_P7");

          Question Teste_f1_P8 = f1.getById("P8");
          Teste_f1_P8.enableAnswer("a");
          Teste_f1_P8.enableAnswer("d");
          Teste_parte2.addQuestion(Teste_f1_P8);
          Teste_f1_P8.setID("f1_P8");

          Teste.add(Teste_parte2);
          List<Section> Popup = new ArrayList<>();
          quizMap.put("Popup",Popup);
          Section Popup_pop = new Section("pop");
          Popup_pop.setPercentagem(100);
          Question Popup_p_P1 = p.getById("P1");
          Popup_p_P1.enableAll();
          Popup_pop.addQuestion(Popup_p_P1);
          Popup_p_P1.setID("p_P1");

          Popup.add(Popup_pop);
          //Fim
          String var1;
          String var2 = "Nome: ";
          System.out.print(var2);
          var1 = in.nextLine();
          int var3;
          int var4 = 100;
          var3 = var4;
          Quiz var5;
          String var6 = var1;
          int var7 = var3;
          var5 = new Quiz(var6,var7);
          var5.setListSections(Teste);
          var5.addOptions(Teste_options);
          Quiz var8;
          String var9 = var1;
          int var10 = 0;
          var8 = new Quiz(var9,var10);
          var8.setListSections(Popup);
          var5.goTo(var5.getByID("parte1").getID());
          var5.getByID("parte1").goTo(var5.getByID("parte1").getByID("f1_P1").getID());
          var5.getByID("parte2").goTo(var5.getByID("parte2").getByID("f1_P7").getID());
          var8.goTo(var8.getByID("pop").getID());
          var8.getByID("pop").goTo(var8.getByID("pop").getByID("p_P1").getID());
          double var11;
          int var12 = 0;
          var11 = var12;
          double var13;
          int var14 = var5.getByID("parte1").size();
          var13 = var14;
          //clear screen
          System.out.print("\033[H\033[2J");

          //show Question

          //print QuestionID
          System.out.print(var5.getCurrent().getIndexOfQuestion(var5.getCurrent().getCurrent().getID()) + 1 + ".");
          //print QuestionText
          System.out.println(var5.getCurrent().getCurrent().getText());

          //print AnswerText
          for(Map.Entry<String, Answer> answer : var5.getCurrent().getCurrent().getEnabledAnswers().entrySet()) {
              String result = answer.getKey();
              result = result.concat("- " + answer.getValue().getText());

              System.out.println(result);
          }

          String var15 = "-------------------Opções----------------------\n";
          System.out.print(var15);
          String var16 = "desistir   - para desistir\n";
          System.out.print(var16);
          String var17 = "parte1     - para avançar para ir para a parte 1\n";
          System.out.print(var17);
          String var18 = "parte2     - para avançar para ir para a parte 2\n";
          System.out.print(var18);
          String var19 = "proximo    - para avançar para a proxima pergunta\n";
          System.out.print(var19);
          String var20 = "proximoN   - para avançar para a proxima pergunta por responder\n";
          System.out.print(var20);
          String var21 = "anterior   - para voltar para a pergunta anterior\n";
          System.out.print(var21);
          String var22 = "anteriorN  - para voltar para a pergunta anterior por responder\n";
          System.out.print(var22);
          String var23 = "confirmar  - para acabar o teste\n";
          System.out.print(var23);
          Quiz var24 = var5;
          System.out.print(var24);
          boolean var25;
          boolean var26 = false;
          var25 = var26;
          boolean var27;
          boolean var28 = false;
          var27 = var28;
          boolean var31 = var25;
          boolean var32 = false;
          boolean var30 = var31 == var32;
          boolean var34 = var27;
          boolean var35 = false;
          boolean var33 = var34 == var35;
          boolean var29 = var30 && var33;
          while(var29){
              String var36 = in.nextLine();
              switch(var36) {
                  case("proximo") :
                      var5.getCurrent().goToNext();;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("anterior") :
                      var5.getCurrent().goToPrev();;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("proximoN") :
                      var5.getCurrent().goToNextUnanswered();;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("anteriorN") :
                      var5.getCurrent().goToPrevUnanswered();;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("confirmar") :
                      boolean var37 = true;
                      var25 = var37;
                      break;
                  case("parte1") :
                      var5.goTo(var5.getByID("parte1").getID());;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("parte2") :
                      var5.goTo(var5.getByID("parte2").getID());;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
                  case("desistir") :
                      //clear screen
                      System.out.print("\033[H\033[2J");;

                      //show Question

                      //print QuestionID
                      System.out.print(var8.getCurrent().getIndexOfQuestion(var8.getCurrent().getCurrent().getID()) + 1 + ".");
                      //print QuestionText
                      System.out.println(var8.getCurrent().getCurrent().getText());

                      //print AnswerText
                      for(Map.Entry<String, Answer> answer : var8.getCurrent().getCurrent().getEnabledAnswers().entrySet()) {
                          String result = answer.getKey();
                          result = result.concat("- " + answer.getValue().getText());

                          System.out.println(result);
                      }
                      ;
                      String var38 = in.nextLine();
                      switch(var38) {
                      default:
                          if(var8.getCurrent().getCurrent().answer(var38)) {
                              double var39 = var8.getCurrent().getCurrent().value();
                              var11 = var39;;
                              double var41 = var11;
                              int var42 = 1;
                              boolean var40 = var41 == var42;
                              if(var40){
                                  boolean var43 = true;
                                  var27 = var43;
                              }

                          }
                          else {
                          }
                      };
                      //clear screen
                      System.out.print("\033[H\033[2J");
                      break;
              default:
                  if(var5.getCurrent().getCurrent().answer(var36)) {
                      var5.getCurrent().goToNextUnanswered();;
                      //clear screen
                      System.out.print("\033[H\033[2J");
                  }
                  else {
                      //clear screen
                      System.out.print("\033[H\033[2J");
                  }
              }

              //show Question

              //print QuestionID
              System.out.print(var5.getCurrent().getIndexOfQuestion(var5.getCurrent().getCurrent().getID()) + 1 + ".");
              //print QuestionText
              System.out.println(var5.getCurrent().getCurrent().getText());

              //print AnswerText
              for(Map.Entry<String, Answer> answer : var5.getCurrent().getCurrent().getEnabledAnswers().entrySet()) {
                  String result = answer.getKey();
                  result = result.concat("- " + answer.getValue().getText());

                  System.out.println(result);
              }

              String var45 = "Selecionada: ";
              String var46 = var5.getCurrent().getCurrent().getSelectedAnswer();
              String var44 = var45 + var46;
              System.out.print(var44);
              String var47 = "---------Digite---------\n";
              System.out.print(var47);
              String var48 = "desistir   - para desistir\n";
              System.out.print(var48);
              String var49 = "parte1     - para para ir para a parte 1\n";
              System.out.print(var49);
              String var50 = "parte2     - para para ir para a parte 2\n";
              System.out.print(var50);
              String var51 = "proximo    - para avançar para a proxima pergunta\n";
              System.out.print(var51);
              String var52 = "proximoN   - para avançar para a proxima pergunta por responder\n";
              System.out.print(var52);
              String var53 = "anterior   - para voltar para a pergunta anterior\n";
              System.out.print(var53);
              String var54 = "anteriorN  - para voltar para a pergunta anterior por responder\n";
              System.out.print(var54);
              String var55 = "confirmar - para acabar o teste\n";
              System.out.print(var55);
              Quiz var56 = var5;
              System.out.print(var56);
              boolean var59 = var25;
              boolean var60 = false;
              boolean var58 = var59 == var60;
              boolean var62 = var27;
              boolean var63 = false;
              boolean var61 = var62 == var63;
              boolean var57 = var58 && var61;
              var29 = var57;
          }
          //clear screen
          System.out.print("\033[H\033[2J");
          boolean var65 = var27;
          boolean var66 = true;
          boolean var64 = var65 == var66;
          if(var64){
              String var67 = "Resultado: 0\n";
              System.out.print(var67);
          }
          else{
              double var68;
              double var69 = var5.result();
              var68 = var69;
              double var71 = var68;
              int var72 = 50;
              boolean var70 = var71 < var72;
              if(var70){
                  String var73 = "Reprovado ! \n";
                  System.out.print(var73);
              }
              else{
                  String var74 = "Aprovado ! \n";
                  System.out.print(var74);
              }
              String var77 = "Resultado parte 1: ";
              double var78 = var5.getByID("parte1").result();
              String var76 = var77 + var78;
              String var79 = "\n";
              String var75 = var76 + var79;
              System.out.print(var75);
              String var82 = "Valor parte 1: ";
              double var83 = var5.getByID("parte1").value();
              String var81 = var82 + var83;
              String var84 = "\n";
              String var80 = var81 + var84;
              System.out.print(var80);
              String var87 = "Resultado pergunta 1: ";
              double var88 = var5.getByID("parte1").getByID("f1_P1").value();
              String var86 = var87 + var88;
              String var89 = "\n";
              String var85 = var86 + var89;
              System.out.print(var85);
              String var92 = "Resultado pergunta 2: ";
              double var93 = var5.getByID("parte1").getByID("f1_P2").value();
              String var91 = var92 + var93;
              String var94 = "\n";
              String var90 = var91 + var94;
              System.out.print(var90);
              String var97 = "Resultado pergunta 4: ";
              double var98 = var5.getByID("parte1").getByID("f1_P4").value();
              String var96 = var97 + var98;
              String var99 = "\n";
              String var95 = var96 + var99;
              System.out.print(var95);
              String var102 = "Resultado pergunta 5: ";
              double var103 = var5.getByID("parte1").getByID("f1_P5").value();
              String var101 = var102 + var103;
              String var104 = "\n";
              String var100 = var101 + var104;
              System.out.print(var100);
              String var107 = "\nResultado parte 2: ";
              double var108 = var5.getByID("parte2").result();
              String var106 = var107 + var108;
              String var109 = "\n";
              String var105 = var106 + var109;
              System.out.print(var105);
              String var112 = "Valor parte 2: ";
              double var113 = var5.getByID("parte2").value();
              String var111 = var112 + var113;
              String var114 = "\n";
              String var110 = var111 + var114;
              System.out.print(var110);
              String var117 = "Resultado pergunta P7: ";
              double var118 = var5.getByID("parte2").getByID("f1_P7").value();
              String var116 = var117 + var118;
              String var119 = "\n";
              String var115 = var116 + var119;
              System.out.print(var115);
              String var122 = "Resultado pergunta P8: ";
              double var123 = var5.getByID("parte2").getByID("f1_P8").value();
              String var121 = var122 + var123;
              String var124 = "\n";
              String var120 = var121 + var124;
              System.out.print(var120);
              String var127 = "\nResultado final : ";
              double var128 = var68;
              String var126 = var127 + var128;
              String var129 = "\n";
              String var125 = var126 + var129;
              System.out.print(var125);
          }
    }
}