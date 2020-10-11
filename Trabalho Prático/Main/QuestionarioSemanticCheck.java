import static java.lang.System.*;

import java.io.IOException;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import javaTypes.*;
import javaClasses.*;
import java.util.*;

public class QuestionarioSemanticCheck extends QuestionarioBaseVisitor<Boolean> {
    
	private final DoubleType doubleType = new DoubleType();
	private final IntegerType intType = new IntegerType();
	private final BooleanType booleanType = new BooleanType();
	private final StringType stringType = new StringType();
	private final QuizType quizType = new QuizType();
 
    @Override public Boolean visitProgram(QuestionarioParser.ProgramContext ctx) {
      boolean res = true;

      for(QuestionarioParser.LoadContext c : ctx.load()) {
          res = res && visit(c);
      }
      for(QuestionarioParser.QuizContext quiz : ctx.quiz()) {
         res = res && visit(quiz);
      }

      res = res && visit(ctx.main());
      return res;
   }

   @Override public Boolean visitQuiz(QuestionarioParser.QuizContext ctx) {
      Boolean res = true;
      Boolean checkPercentage = false;
      String name = ctx.name.getText();
      int percentage = 0;
      int count = 0;
      if (QuestionarioParser.quizTable.containsKey(name)) {
        ErrorHandling.printError(ctx, "Quiz: " + name + " already declared!");
        res = false;
      }
      else
        QuestionarioParser.quizTable.put(name, new SectionMap());

      if (ctx.options() != null) {
         ctx.options().n = name;
         if(!visit(ctx.options())) return false;
      }
  
      for (QuestionarioParser.SectionsContext sctCtx : ctx.sections()) {
        sctCtx.n = name;
        if (sctCtx.INTEGER() != null) {
           percentage += Integer.parseInt(sctCtx.INTEGER().getText());
           checkPercentage = true;
        } 
        else {
          count++;
        }

        if(!visit(sctCtx)) return false;
      }

      if (count == ctx.sections().size()) {
         int dif = 100 / ctx.sections().size();
         for (QuestionarioParser.SectionsContext sctCtx : ctx.sections()) {
            SectionMap map = QuestionarioParser.quizTable.get(name);
            QuestionMap qMap = map.getQuestionMap(sctCtx.ID().getText());
            qMap.setPercentage(dif);
         }
      } 

      if (percentage != 100 && checkPercentage) {
         ErrorHandling.printError(ctx,"Total percentage of sections has to be 100");
         return false;
      }
      
      return res;
    }
  
    @Override public Boolean visitOptions(QuestionarioParser.OptionsContext ctx) {
      Boolean res = true;
      Options options = new Options("options");

      for (int i = 0; i < ctx.ID().size(); i++) {
         Option op = new Option(ctx.ID(i).getText(), ctx.STRING(i).getText().replace("\"",""));
         if (options.getOptions().containsKey(op.getID())) {
            ErrorHandling.printError(ctx,"Option " + op.getID() + " already exists!");
            return false;
         }
         options.addOption(op);
      }
      QuestionarioParser.optionsTable.put(ctx.n, options);

      return res;
    }
  
     @Override public Boolean visitSections(QuestionarioParser.SectionsContext ctx) {
         Boolean res = true;
         String name = ctx.ID().getText();
         if (QuestionarioParser.quizTable.containsKey(ctx.n)) {
         SectionMap map = QuestionarioParser.quizTable.get(ctx.n);
         if (map.containsSection(name)) {
            ErrorHandling.printError(ctx,"Section: " + name + " already declared!");
            return false;
         }
         else
            map.addSection(name);
         }

         if (ctx.INTEGER() != null) {
            ctx.file().i = Integer.parseInt(ctx.INTEGER().getText());
         }
         
         ctx.file().d = ctx.n + " " + name;
         res = visit(ctx.file());
   
         return res;
     }
  
     @Override public Boolean visitFile(QuestionarioParser.FileContext ctx) {
        String[] a = ctx.d.split(" ");
  
        Boolean res = true;
        SectionMap map = QuestionarioParser.quizTable.get(a[0]);
        QuestionMap qMap = map.getQuestionMap(a[1]);

        if (ctx.i != null) {
          qMap.setPercentage(ctx.i);
        }
        for (QuestionarioParser.SimpleQuestionContext qstCtx : ctx.simpleQuestion()) {
          qstCtx.t = ctx.d + " " + ctx.ref.getText();
          if(!visit(qstCtx)) return false;
        }
  
        return res;
      }
  
     //@Override public Boolean visitTheme(QuestionarioParser.ThemeContext ctx) {
       // return visitChildren(ctx);
     //}
  
     @Override public Boolean visitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx) {
        String[] a = ctx.t.split(" ");  
        Boolean res = true;
  
        SectionMap map = QuestionarioParser.quizTable.get(a[0]);
        QuestionMap qMap = map.getQuestionMap(a[1]);
          if (qMap.containsQuestion(a[2] + "_" + ctx.name.getText())) {
            ErrorHandling.printError(ctx,"Question: " + a[2] + "_" + ctx.name.getText() + " already declared!");
            return false;
          }
          else {
            if (QuestionarioParser.bankTable.containsKey(a[2])) {
              QuestionsBank bank = QuestionarioParser.bankTable.get(a[2]);
              if (bank.containsQuestion(ctx.name.getText())) {
                qMap.addQuestion(a[2] + "_" + ctx.name.getText());
                AnswersMap ansMap = qMap.getAnswersMap(a[2] + "_" + ctx.name.getText());
                List<TerminalNode> ids = ctx.ID();
		          if (ids.size() > 1) {
			         for (int i = 1; i < ids.size(); i++) {
                    if (bank.getById(ctx.name.getText()).getAnswers().containsKey(ids.get(i).getText())) {
                      if(ansMap.containsAns(ids.get(i).getText())) {
                        ErrorHandling.printError(ctx,"Answer: " + ids.get(i).getText() + " already declared!");
                        return false;
                      }
                      else {
                        ansMap.addAns(ids.get(i).getText());
                      }
                    }
                    else {
                      ErrorHandling.printError(ctx,"Answer: " + ids.get(i).getText() + " does not exist in Database!");
                      return false;
                    }
                  }
                }
                else {
                  for (String ans : bank.getById(ctx.name.getText()).getAnswers().keySet()){
                    ansMap.addAns(ans);
                  }
                }
              }
              else {
                ErrorHandling.printError(ctx,"Question: " + ctx.name.getText() + " does not exist in Database!");
                return false;
              }
            }
            else {
               ErrorHandling.printError(ctx, a[2] + " Database does not exist!");
               return false;
            }
          }
        return res;
      }

   //@Override public Boolean visitQuestions(QuestionarioParser.QuestionsContext ctx) {
     // return visitChildren(ctx);
   //}

   @Override public Boolean visitLoad(QuestionarioParser.LoadContext ctx) {
      Boolean res = true;

      if (QuestionarioParser.bankTable.containsKey(ctx.fileRef.getText())) {
         ErrorHandling.printError(ctx, ctx.fileRef.getText() + " already exists in Database!");
         return false;
      }
      else {
         ctx.qst().ref = ctx.fileRef.getText();
         if(!visit(ctx.qst())) return false;
      }
      return res;
   }

   @Override public Boolean visitQst(QuestionarioParser.QstContext ctx) {
      try {
         String path = ctx.fileName.getText();
         String[] split = path.split("/");
         String file = split[split.length-1];
         
         QuestionsBank bank = QuestionarioMain.interpreter(file);
         QuestionarioParser.bankTable.put(ctx.ref,bank);
      }
      catch (Exception e) {
         ErrorHandling.printError(ctx, "IOException found!");
      }
      
      return true;
   }

   @Override public Boolean visitMain(QuestionarioParser.MainContext ctx) {
      boolean res = true;
      for(QuestionarioParser.StatContext c : ctx.stat()) {
          res = res && visit(c);
      }
      return res;
   }

   @Override public Boolean visitStatLine(QuestionarioParser.StatLineContext ctx) {
      return visit(ctx.line());
   }

   @Override public Boolean visitStatIf(QuestionarioParser.StatIfContext ctx) {
      return visit(ctx.ifCondition());
   }

   @Override public Boolean visitStatWhile(QuestionarioParser.StatWhileContext ctx) {
      return visit(ctx.whileCondition()); 
   }

   @Override public Boolean visitStatAnswer(QuestionarioParser.StatAnswerContext ctx) {
      return visit(ctx.answer());
   }

   @Override public Boolean visitStatFor(QuestionarioParser.StatForContext ctx) {
      return visit(ctx.forCondition());
   }

   //@Override public Boolean visitStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx) {
      //return visitChildren(ctx);
   //}

   @Override public Boolean visitLineDeclaration(QuestionarioParser.LineDeclarationContext ctx) {
        return visit(ctx.declaration());
   }

   @Override public Boolean visitLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx) {
      return visit(ctx.quizDeclaration());
   }

   @Override public Boolean visitLineAssign(QuestionarioParser.LineAssignContext ctx) {
      return visit(ctx.assignment());
   }

   @Override public Boolean visitLinePrint(QuestionarioParser.LinePrintContext ctx) {
      return visit(ctx.print());
   }
   
   @Override public Boolean visitLineClearScreen(QuestionarioParser.LineClearScreenContext ctx) {
      return true;
   }

   @Override public Boolean visitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx) {
      return visit(ctx.showQuestion());
   }


   @Override public Boolean visitLineRead(QuestionarioParser.LineReadContext ctx) {
      return visit(ctx.read());
   }

   //@Override public Boolean visitLineEnableOp(QuestionarioParser.LineEnableOpContext ctx) {
     // return visitChildren(ctx);
   //}

   @Override public Boolean visitLineIteration(QuestionarioParser.LineIterationContext ctx) {
      return visitChildren(ctx.iteration());
   }

   @Override public Boolean visitDeclaration(QuestionarioParser.DeclarationContext ctx) {
      
      Boolean res = true;
     
      for(TerminalNode t: ctx.idList().ID()){
         String id = t.getText();
         if (QuestionarioParser.symbolTable.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
            res = false;
         }
         else
            QuestionarioParser.symbolTable.put(id, new VariableSymbol(id, ctx.type().varType));
      }
      return res;
   }

   @Override public Boolean visitQuizDeclaration(QuestionarioParser.QuizDeclarationContext ctx) {
      
      Boolean res = true;
      for(TerminalNode t: ctx.idList().ID()){
         String id = t.getText();
         if (QuestionarioParser.symbolTable.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
            res = false;
         }
         else {
            QuestionarioParser.symbolTable.put(id, new VariableSymbol(id,ctx.varType));
         }
      }
      return res;
   }
   
   @Override public Boolean visitQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx) {
		
      Boolean res = visit(ctx.e1) && visit(ctx.e2) && visit(ctx.var());
      if (res){
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);

            if(!s.type().equalsType(quizType)) {
               ErrorHandling.printError(ctx, "Variable \""+var+"\" must match type" + quizType.getName() + "!");
               res = false;
            }

            if (!stringType.equalsType(ctx.e1.types)){
               ErrorHandling.printError(ctx, "The first variable expression has to be a String");
               res = false;
            }
            
            if(!intType.equalsType(ctx.e2.types)){
			   ErrorHandling.printError(ctx, "The second variable expression has to be an Integer");
               res = false;
		    }
            if(res) {
               String quizID = ctx.quizId.getText();
               if(!QuestionarioParser.quizTable.containsKey(quizID)) {
                   ErrorHandling.printError(ctx, "Structure" + quizID + "does not exists!");
                   res = false;
               }
               else {
                   s.setValueDefined();
                   ((QuizType)s.type()).setInstanceOfQuiz(quizID);
                   
               }
            }
		}	
	
      return res;
	}

   @Override public Boolean visitAssignAtt(QuestionarioParser.AssignAttContext ctx) {
      Boolean res = visit(ctx.expr()) && visit(ctx.var());
      
      if (res){
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);
            if (!ctx.expr().types.conformsTo(s.type()))
            {
               ErrorHandling.printError(ctx, "Variable \"" + var + "\" of type " + s.type() + " does not match " + ctx.expr().types + " type");
               res = false;
            }
            else{
				s.setValueDefined();
			}
		}
	
      return res;
   }

   @Override public Boolean visitAssignPlus(QuestionarioParser.AssignPlusContext ctx) {
      
       Boolean res = visit(ctx.var());
		 
       if(res){
          String var = ctx.var().varName;
          Symbol s = QuestionarioParser.symbolTable.get(var);
          if(!s.valueDefined()) {
              ErrorHandling.printError(ctx, "Variable \""+var+"\" not initialized,so you cannot increment!");
              res = false;
          }
          if (!s.type().isNumeric()) {
               ErrorHandling.printError(ctx, "You cannot increment the variable \""+var+"\" because it's not numeric!");
               res = false;
          }
      }
      
      return res;
   }

   @Override public Boolean visitAssignMinus(QuestionarioParser.AssignMinusContext ctx) {
      
	   Boolean res = visit(ctx.var());
		 
       if(res){
          String var = ctx.var().varName;
          Symbol s = QuestionarioParser.symbolTable.get(var);
          if(!s.valueDefined()) {
              ErrorHandling.printError(ctx, "Variable \""+var+"\" not initialized,so you cannot increment!");
              res = false;
          }
          if (!s.type().isNumeric()) {
               ErrorHandling.printError(ctx, "You cannot increment the variable \""+var+"\" because it's not numeric!");
               res = false;
          }
       }
      
      return res;
   }

   @Override public Boolean visitExprVar(QuestionarioParser.ExprVarContext ctx) {
      
      Boolean res = visit(ctx.var());
      
      if(res){
         String var = ctx.var().varName;

         Symbol s = QuestionarioParser.symbolTable.get(var);
         if (!s.valueDefined())
         {
            ErrorHandling.printError(ctx, "Variable \""+var+"\" not defined!");
            res = false;
         }
         else{
            ctx.types = s.type();
		}
      }
      return res;
   }

   @Override public Boolean visitExprAddSub(QuestionarioParser.ExprAddSubContext ctx) {
      
         Boolean res1 = visit(ctx.e1);
         Boolean res2 = visit(ctx.e2);
		 if(res1 && res2){
			  //Suport string concatenation with any type
              if(ctx.e1.types.equalsType(stringType) || ctx.e2.types.equalsType(stringType)) {
                  ctx.types = stringType;
              }
              else if(!ctx.e1.types.isNumeric() || !ctx.e2.types.isNumeric()){
				  ErrorHandling.printError(ctx, "Invalid operation \"+\" or \"-\" for given types " + ctx.e1.types.getName() + ", " + ctx.e1.types.getName() );
				  res1 = false; 
				  res2 = false; 
			  }
			  else{
				  if("int".equals(ctx.e1.types.getName()) && "int".equals(ctx.e2.types.getName())){
					  ctx.types = intType;
				  }
				  if("int".equals(ctx.e1.types.getName()) && "double".equals(ctx.e2.types.getName()) || 
				  "double".equals(ctx.e1.types.getName()) && "int".equals(ctx.e2.types.getName()) ||
				  "double".equals(ctx.e1.types.getName()) && "double".equals(ctx.e2.types.getName())){
					  ctx.types = doubleType;
				  }
			 }
		}
		return res1 && res2;
   }

   @Override public Boolean visitExprQuiz(QuestionarioParser.ExprQuizContext ctx) {
       boolean res = visit(ctx.quizExpr());
       ctx.types = ctx.quizExpr().types;
       
       return res;
   }

   @Override public Boolean visitExprDouble(QuestionarioParser.ExprDoubleContext ctx) {
 
      ctx.types = doubleType;
      return true;
   }

   @Override public Boolean visitExprString(QuestionarioParser.ExprStringContext ctx) {
      
      ctx.types = stringType;
      return true;
   }

   @Override public Boolean visitExprParent(QuestionarioParser.ExprParentContext ctx) {
      
      Boolean res = visit(ctx.e);
      if (res)
         ctx.types = ctx.e.types;
      return res;
   }

   @Override public Boolean visitExprBoolean(QuestionarioParser.ExprBooleanContext ctx) {
      
      ctx.types = booleanType;
      return true;
   }

   @Override public Boolean visitExprMultDiv(QuestionarioParser.ExprMultDivContext ctx) {
      
		 Boolean res1 = visit(ctx.e1);
         Boolean res2 = visit(ctx.e2);
		  if(res1 && res2){
			  if(!ctx.e1.types.isNumeric() || !ctx.e2.types.isNumeric()){
				  ErrorHandling.printError(ctx, "You cannot multiply or divide if you don't have two numeric variables!");
				  res1 = false; 
				  res2 = false; 
			  }
			  else{
				  if("int".equals(ctx.e1.types.getName()) && "int".equals(ctx.e2.types.getName())){
					  ctx.types = intType;
				  }
				  if("int".equals(ctx.e1.types.getName()) && "double".equals(ctx.e2.types.getName()) || 
				  "double".equals(ctx.e1.types.getName()) && "int".equals(ctx.e2.types.getName()) ||
				  "double".equals(ctx.e1.types.getName()) && "double".equals(ctx.e2.types.getName())){
					  ctx.types = doubleType;
				  }
			 }
		}
		return res1 && res2;
   }

   @Override public Boolean visitExprSign(QuestionarioParser.ExprSignContext ctx) {
      
      Boolean res = visit(ctx.e) && ctx.e.types.isNumeric();
      if (res){
         ctx.types = ctx.e.types;
	  }
      else{
		  ErrorHandling.printError(ctx, "Not numeric expressions does not have sign!");
	  }
      return res;
   }

   @Override public Boolean visitExprInteger(QuestionarioParser.ExprIntegerContext ctx) {
      
      ctx.types = intType;
      return true;
   }

   @Override public Boolean visitVar(QuestionarioParser.VarContext ctx) {
      
      ctx.varName = ctx.ID().getText();
      if (!QuestionarioParser.symbolTable.containsKey(ctx.varName)){
          ErrorHandling.printError(ctx, "Variable \""+ctx.varName+"\" not initialized!");
          return false;
      }
      
      return true;
  }
    
   //---ExprQuiz---
   @Override public Boolean visitExprSizeOfQuiz(QuestionarioParser.ExprSizeOfQuizContext ctx) {
        ctx.types = intType;
        return visit(ctx.quizID()); 
   }

   @Override public Boolean visitExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx) {
        ctx.types = doubleType;
        return visit(ctx.quizID());
   }

   @Override public Boolean visitExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx) {
        ctx.types = intType;
        return visit(ctx.sectionID());
   }

   @Override public Boolean visitExprResultSection(QuestionarioParser.ExprResultSectionContext ctx) {
        ctx.types = doubleType;
        return visit(ctx.sectionID());
   }

   @Override public Boolean visitExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx) {
        ctx.types = doubleType;
        return visit(ctx.questionID());
  }
  
  @Override public Boolean visitExprValueSection(QuestionarioParser.ExprValueSectionContext ctx) {
        ctx.types = doubleType;
        return visit(ctx.sectionID());
   }

   @Override public Boolean visitExprValueQuestion(QuestionarioParser.ExprValueQuestionContext ctx) {
        ctx.types = doubleType;
        return visit(ctx.questionID());
   }
   
   @Override public Boolean visitExprSelectedAnswer(QuestionarioParser.ExprSelectedAnswerContext ctx) {
        ctx.types = stringType;
        return visit(ctx.questionID());
   }

   @Override public Boolean visitExprQuestionTheme(QuestionarioParser.ExprQuestionThemeContext ctx) {
        ctx.types = stringType;
        return visit(ctx.questionID());
   }


   //---QuizID---
   @Override public Boolean visitQuizID(QuestionarioParser.QuizIDContext ctx) {
      boolean res = visit(ctx.var());     
      if(res) {
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);
            if(!s.type().equalsType(quizType)) {
                ErrorHandling.printError(ctx, "Variable \""+var+"\" must match type" + quizType.getName() + "!");
                res = false;
            }
            else if(!s.valueDefined()) {
   
                ErrorHandling.printError(ctx, "Variable \""+var+"\" not defined!");
                res = false;
            }
            else {
                ctx.instanceOfQuiz = ((QuizType) s.type()).getInstanceOfQuiz();
                
            }
            
      }
      return res;
   }
   //---SectionID---
   @Override public Boolean visitSectionByID(QuestionarioParser.SectionByIDContext ctx) {  
      
      boolean res = visit(ctx.quizID());

      if(res) {
          ctx.instanceOfQuiz = ctx.quizID().instanceOfQuiz;
          SectionMap map = QuestionarioParser.quizTable.get(ctx.instanceOfQuiz);          
          String sectionID = ctx.ID().getText();
          if(!map.containsSection(sectionID)) {
             ErrorHandling.printError(ctx, "Quiz structure \"" + ctx.instanceOfQuiz+ "\" does not contain structure \"" + sectionID + "\"");
             res = false;
          }
          else {
               ctx.instanceOfSection = sectionID; 
          }
      }
      return res;
   }

   @Override public Boolean visitSectionCurrent(QuestionarioParser.SectionCurrentContext ctx) {
      boolean res = visit(ctx.quizID());
      if(res)
        ctx.instanceOfQuiz = ctx.quizID().instanceOfQuiz;
      return res;
   }


   @Override public Boolean visitQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx) {
      boolean res = visit(ctx.sectionID());
      if(res)
        ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
      return res;
   }

   @Override public Boolean visitQuestionPrev(QuestionarioParser.QuestionPrevContext ctx) {
      boolean res = visit(ctx.sectionID());
      if(res)
        ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
      return res;
   }

   @Override public Boolean visitQuestionNext(QuestionarioParser.QuestionNextContext ctx) {
      boolean res = visit(ctx.sectionID());
      if(res)
        ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
      return res;
   }

   @Override public Boolean visitQuestionStart(QuestionarioParser.QuestionStartContext ctx) {
      boolean res = visit(ctx.sectionID());
      if(res)
        ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
      return res;
   }

   @Override public Boolean visitQuestionEnd(QuestionarioParser.QuestionEndContext ctx) {
      boolean res = visit(ctx.sectionID());
      if(res)
        ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
      return res;
   }

   @Override public Boolean visitQuestionByID(QuestionarioParser.QuestionByIDContext ctx) {
      boolean res = visit(ctx.sectionID());
      
       
      if(res) {
         ctx.instanceOfQuiz = ctx.sectionID().instanceOfQuiz;
         
         String instanceQuiz = ctx.sectionID().instanceOfQuiz;
         String instanceSection = ctx.sectionID().instanceOfSection;
         //get all question 
         QuestionMap map = QuestionarioParser.quizTable.get(instanceQuiz).getQuestionMap(instanceSection);
         
         String instanceQuestion = ctx.ID().getText();
         if(!map.containsQuestion(instanceQuestion)) {
            ErrorHandling.printError(ctx, "Section structure \"" + instanceSection + "\" of Quiz structure \"" + instanceQuiz + "\" does not contain Question structure \"" + instanceQuestion + "\"");
             res = false;

         }
      }     

      return res;
   }
   
   @Override public Boolean visitIterationQuiz(QuestionarioParser.IterationQuizContext ctx) {       
      return visit(ctx.quizIteration());
   }

   @Override public Boolean visitIterationSection(QuestionarioParser.IterationSectionContext ctx) {       
      return visit(ctx.sectionIteration());
   }

   @Override public Boolean visitNextSection(QuestionarioParser.NextSectionContext ctx) {
      return visit(ctx.quizID());
   }

   @Override public Boolean visitPrevSection(QuestionarioParser.PrevSectionContext ctx) {
      return visit(ctx.quizID());
   }
 
   @Override public Boolean visitStartSection(QuestionarioParser.StartSectionContext ctx) {
      return visit(ctx.quizID());
   }
 
   @Override public Boolean visitEndSection(QuestionarioParser.EndSectionContext ctx) {
      return visit(ctx.quizID());
   }

   @Override public Boolean visitGoToSection(QuestionarioParser.GoToSectionContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitNextQuestion(QuestionarioParser.NextQuestionContext ctx) {
      return visit(ctx.sectionID());
   }
   
   @Override public Boolean visitNextUnansweredQuestion(QuestionarioParser.NextUnansweredQuestionContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx) {
      return visit(ctx.sectionID());
   }
 
   @Override public Boolean visitPrevUnansweredQuestion(QuestionarioParser.PrevUnansweredQuestionContext ctx) {
      return visit(ctx.sectionID());
   }

@Override public Boolean visitStartQuestion(QuestionarioParser.StartQuestionContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitEndQuestion(QuestionarioParser.EndQuestionContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitGoToQuestion(QuestionarioParser.GoToQuestionContext ctx) {
        return visit(ctx.questionID());
   }

   @Override public Boolean visitShowQuestion(QuestionarioParser.ShowQuestionContext ctx) {
      return visit(ctx.questionID());
   }
   @Override public Boolean visitAnswerSimple(QuestionarioParser.AnswerSimpleContext ctx) { 
      return visit(ctx.questionID());
   }
    
     @Override public Boolean visitAnswerOptions(QuestionarioParser.AnswerOptionsContext ctx) { 
      boolean res = visit(ctx.questionID());
      String quizInstance = ctx.questionID().instanceOfQuiz; 
      
      for(QuestionarioParser.CaseOptionContext option : ctx.caseOption()) {
          option.instanceOfQuiz = quizInstance;
          res = res && visit(option);
      }
      
      if(ctx.val() != null) {
         res = res && visit(ctx.val());
      }
      if(ctx.inval() != null) {
        res = res && visit(ctx.inval());
      }
      
      return res;
   }
   
   @Override public Boolean visitCaseOption(QuestionarioParser.CaseOptionContext ctx) {
      boolean res = true;
      String optionID = ctx.ID().getText();
      
      Options ops = QuestionarioParser.optionsTable.get(ctx.instanceOfQuiz);  
      
      //validate optionID
      if(!ops.containsOption(optionID)) {
          ErrorHandling.printError(ctx, "Option \"" + optionID + "\" is not declared in strucure \"" + ctx.instanceOfQuiz +"\"");
          res = false;
      }
      for(QuestionarioParser.StatContext stat : ctx.stat()) {
          res = res && visit(stat);
      }
      return res;
   } 

  @Override public Boolean visitVal(QuestionarioParser.ValContext ctx) {
      boolean res = true;

      for(QuestionarioParser.StatContext stat : ctx.stat()) {
          res = res && visit(stat);
      }
      return res;
   }

  @Override public Boolean visitInval(QuestionarioParser.InvalContext ctx) {
      boolean res = true;

      for(QuestionarioParser.StatContext stat : ctx.stat()) {
          res = res && visit(stat);
      }
      return res;
   } 


   @Override public Boolean visitPrint(QuestionarioParser.PrintContext ctx) {
      return visit(ctx.expr());
   }
   
   @Override public Boolean visitRead(QuestionarioParser.ReadContext ctx) {
      boolean res = visit(ctx.var());
      
      if (res){
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);
            if (!s.type().equalsType(stringType))
            {
               ErrorHandling.printError(ctx, "Variable \"" + var + "\" of type " + s.type() + " does not match String type");
               res = false;
            }
            else{
				s.setValueDefined();
			}
		}

      return res;
   }

   //@Override public Boolean visitEnableOptions(QuestionarioParser.EnableOptionsContext ctx) {
     // return visitChildren(ctx);
   //}
   
   //BUG
   @Override public Boolean visitIfCondition(QuestionarioParser.IfConditionContext ctx) {
      boolean res = visit(ctx.simpleIfCondition());
      
      if(ctx.elseCondition() != null) {
          res = res && visit(ctx.elseCondition());
      }
      return res;
   }

   @Override public Boolean visitSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx) {
      Boolean res = visit(ctx.c);
      return res;
   }

   //@Override public Boolean visitElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx) {
     // return visitChildren(ctx);
   //}

   @Override public Boolean visitElseCondition(QuestionarioParser.ElseConditionContext ctx) {
      boolean res = true;

      for(QuestionarioParser.StatContext c : ctx.stat()) {
          res = res && visit(c);
      }
      return res;
   }

   @Override public Boolean visitWhileCondition(QuestionarioParser.WhileConditionContext ctx) {
     
      Boolean res = visit(ctx.condition());

      for(QuestionarioParser.StatContext context : ctx.stat()) {
           res = res && visit(context);
      }          
      return res;
   }
   
 
   @Override public Boolean visitForCondition(QuestionarioParser.ForConditionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitTimeEndTime(QuestionarioParser.TimeEndTimeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitConditionAnd(QuestionarioParser.ConditionAndContext ctx) {
      
      Boolean res = visit(ctx.c1) && visit(ctx.c2);
      
      return res;
      
   }

   @Override public Boolean visitConditionOr(QuestionarioParser.ConditionOrContext ctx) {
      
      Boolean res = visit(ctx.c1) && visit(ctx.c2);
      
      return res;
   }

   @Override public Boolean visitConditionBoolean(QuestionarioParser.ConditionBooleanContext ctx) {
      return true;
   }

   @Override public Boolean visitConditionComparation(QuestionarioParser.ConditionComparationContext ctx) {
      
      Boolean res = visit(ctx.c);
      return res;
   }

   @Override public Boolean visitConditionParent(QuestionarioParser.ConditionParentContext ctx) {
      
      Boolean res = visit(ctx.c);
      return res;
   }

   @Override public Boolean visitComparation(QuestionarioParser.ComparationContext ctx) {
     
      Boolean res = visit(ctx.e1) && visit(ctx.e2);
     
      if(res){
        if("String".equals(ctx.e1.types.getName()) || "String".equals(ctx.e2.types.getName())){
            ErrorHandling.printError(ctx, "You cannot compare anything with strings");
            res = false;
         }
        if(!((!ctx.e1.types.isNumeric() && !ctx.e2.types.isNumeric()) || (!"boolean".equals(ctx.e1.types.getName()) && !"boolean".equals(ctx.e2.types.getName())))){
           ErrorHandling.printError(ctx, "You need two numeric or to boolean expressions compare expressions or variables");
             res = false;
       }
       else if("boolean".equals(ctx.e1.types.getName()) && "boolean".equals(ctx.e2.types.getName())){
          if(!"==".equals(ctx.c.getText()) && !"!=".equals(ctx.c.getText())){
             ErrorHandling.printError(ctx, "You only can compare booleans with (!=) or (==)");
             res = false;
          }
       }
       else{
          ctx.types = booleanType;
       }
    }
    return res;
   }
}
