import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import javaTypes.*;

public class QuestionarioSemanticCheck extends QuestionarioBaseVisitor<Boolean> {
	
	private final DoubleType doubleType = new DoubleType();
	private final IntegerType intType = new IntegerType();
	private final BooleanType booleanType = new BooleanType();
	private final StringType stringType = new StringType();
	private final QuizType quizType = new QuizType();

  // @Override public Boolean visitProgram(QuestionarioParser.ProgramContext ctx) {
    //  return visitChildren(ctx);
   //}

   //@Override public Boolean visitQuiz(QuestionarioParser.QuizContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitOptions(QuestionarioParser.OptionsContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitSections(QuestionarioParser.SectionsContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitFile(QuestionarioParser.FileContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitTheme(QuestionarioParser.ThemeContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitQuestions(QuestionarioParser.QuestionsContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLoad(QuestionarioParser.LoadContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitQst(QuestionarioParser.QstContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitMain(QuestionarioParser.MainContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatLine(QuestionarioParser.StatLineContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatIf(QuestionarioParser.StatIfContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatWhile(QuestionarioParser.StatWhileContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatAnswer(QuestionarioParser.StatAnswerContext ctx) {
    //  return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatFor(QuestionarioParser.StatForContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineDeclaration(QuestionarioParser.LineDeclarationContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineAssign(QuestionarioParser.LineAssignContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLinePrint(QuestionarioParser.LinePrintContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineRead(QuestionarioParser.LineReadContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineEnableOp(QuestionarioParser.LineEnableOpContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitLineIteration(QuestionarioParser.LineIterationContext ctx) {
     // return visitChildren(ctx);
   //}

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
            QuestionarioParser.symbolTable.put(id, new VariableSymbol(id,quizType));
         }
      }
      return res;
   }
   //falta validacao do ID quiz
   @Override public Boolean visitQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx) {
		
      Boolean res = visit(ctx.e1) && visit(ctx.e2) && visit(ctx.var());
      
      if (res){
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);

            if(!s.type().equals(quizType)) {
               ErrorHandling.printError(ctx, "Variable expression \""+var+"\" is the wrong type!");
               res = false;
            }

            if (!stringType.equals(ctx.e1.types)){
               ErrorHandling.printError(ctx, "The first variable expression has to be a String");
               res = false;
            }
            
            if(!intType.equals(ctx.e2.types)){
			   ErrorHandling.printError(ctx, "The second variable expression has to be an Integer");
               res = false;
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
               ErrorHandling.printError(ctx, "Variable expression \""+var+"\" is the wrong type!");
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
    
   //---QuizID---
   @Override public Boolean visitQuizID(QuestionarioParser.QuizIDContext ctx) {
      boolean res = visit(ctx.var());     
      if(res) {
            String var = ctx.var().varName;
            Symbol s = QuestionarioParser.symbolTable.get(var);
            
            if(!s.type().equalsType(quizType)) {
                ErrorHandling.printError(ctx, "Variable expression \""+var+"\" is the wrong type!");
                res = false;
            }
      }
      return res;
   }
   //---SectionID---
   //to implement
   @Override public Boolean visitSectionByID(QuestionarioParser.SectionByIDContext ctx) {   
      return visit(ctx.quizID());
   }

   @Override public Boolean visitSectionCurrent(QuestionarioParser.SectionCurrentContext ctx) {
      return visit(ctx.quizID());
   }


   @Override public Boolean visitQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitQuestionPrev(QuestionarioParser.QuestionPrevContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitQuestionNext(QuestionarioParser.QuestionNextContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitQuestionStart(QuestionarioParser.QuestionStartContext ctx) {
      return visit(ctx.sectionID());
   }

   @Override public Boolean visitQuestionEnd(QuestionarioParser.QuestionEndContext ctx) {
      return visit(ctx.sectionID());
   }

   //@Override public Boolean visitQuestionByID(QuestionarioParser.QuestionByIDContext ctx) {
      //return visit(ctx.quizID());
   //}
   
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
   
   @Override public Boolean visitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx) {
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

   //@Override public Boolean visitPrint(QuestionarioParser.PrintContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitRead(QuestionarioParser.ReadContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitEnableOptions(QuestionarioParser.EnableOptionsContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitIfCondition(QuestionarioParser.IfConditionContext ctx) {
     // return visitChildren(ctx);
   //}

   @Override public Boolean visitSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx) {
      return visitChildren(ctx);
      /*Boolean res = visit(ctx.c);
      visit(ctx.s); //ainda ns para que e isto
      if (res)
      {
         if (!"boolean".equals(ctx.c.types.getName()))
         {
            ErrorHandling.printError(ctx, "The condition has to be boolean!");
            res = false;
         }
      }
      return res;*/
   }

   //@Override public Boolean visitElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx) {
     // return visitChildren(ctx);
   //}

   //@Override public Boolean visitElseCondition(QuestionarioParser.ElseConditionContext ctx) {
     // return visitChildren(ctx);
   //}

 /*  @Override public Boolean visitWhileCondition(QuestionarioParser.WhileConditionContext ctx) {
     
      Boolean res = visit(ctx.c);
      visit(ctx.s); 
      if (res)
      {
         if (!"boolean".equals(ctx.c.types.getName()))
         {
            ErrorHandling.printError(ctx, "The condition has to be boolean!");
            res = false;
         }
      }
      return res;
   }*/
 
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
      if (res)
         ctx.types = ctx.c.types;
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
