import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;
import javaTypes.*;

public class Compiler extends QuestionarioBaseVisitor<ST> {

    protected int varCount = 0;
	protected STGroup coreTemplates = new STGroupFile("java.stg");
    protected STGroup quizTemplates = new STGroupFile("quizTemplates.stg");
    
	protected String newVarName() {
		varCount++;
		return "var" + varCount;
   }
   
   protected String strVarName = null;

   @Override public ST visitProgram(QuestionarioParser.ProgramContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("program");

		Iterator<QuestionarioParser.LoadContext> list = ctx.load().iterator();
		while(list.hasNext()){
			res.add("load",visit(list.next()).render());
		}
		res.add("quiz",visit(ctx.quiz()));
		res.add("main",visit(ctx.main()));

		return res;
   }

   @Override public ST visitQuiz(QuestionarioParser.QuizContext ctx) {
      return visitChildren(ctx);
   }

   /*@Override public ST visitOptions(QuestionarioParser.OptionsContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitSections(QuestionarioParser.SectionsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFile(QuestionarioParser.FileContext ctx) {
      return visitChildren(ctx);
   }

   /*@Override public ST visitTheme(QuestionarioParser.ThemeContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitQuestions(QuestionarioParser.QuestionsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitLoad(QuestionarioParser.LoadContext ctx) {

      ST res = coreTemplates.getInstanceOf("load");

      res.add("qst",visit(ctx.qst()));

		return res;
   }

   @Override public ST visitQst(QuestionarioParser.QstContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("qst");
      res.add("fileName",ctx.fileName.getText() + ".qst");
      return res;
   }

   @Override public ST visitMain(QuestionarioParser.MainContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("module");
      ST stats = coreTemplates.getInstanceOf("stats");

      for(QuestionarioParser.StatContext sc : ctx.stat()){
         stats.add("stat",visit(sc));
      }

      res.add("name","Output");
      res.add("stat",stats.render());
      return res;
   }

   @Override public ST visitStatLine(QuestionarioParser.StatLineContext ctx) {
      
        ST res = coreTemplates.getInstanceOf("stats");
        
	    res.add("stat", visit(ctx.line()));

		return res;
   }

   /*@Override public ST visitStatIf(QuestionarioParser.StatIfContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitStatWhile(QuestionarioParser.StatWhileContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitStatAnswer(QuestionarioParser.StatAnswerContext ctx) {
      return visit(ctx.answer());
   }

   /*@Override public ST visitStatFor(QuestionarioParser.StatForContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitStatTimeEndTime(QuestionarioParser.StatTimeEndTimeContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineDeclaration(QuestionarioParser.LineDeclarationContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineQuizDeclaration(QuestionarioParser.LineQuizDeclarationContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineAssign(QuestionarioParser.LineAssignContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineQuizAssign(QuestionarioParser.LineQuizAssignContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLinePrint(QuestionarioParser.LinePrintContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineRead(QuestionarioParser.LineReadContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitLineEnableOp(QuestionarioParser.LineEnableOpContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitLineIteration(QuestionarioParser.LineIterationContext ctx) {
      return visit(ctx.iteration());
   }

   @Override public ST visitDeclaration(QuestionarioParser.DeclarationContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");

      for(TerminalNode t: ctx.idList().ID()) {

         Symbol s = QuestionarioParser.symbolTable.get(t.getText());
         s.setVarName(newVarName());

         ST decl = coreTemplates.getInstanceOf("decl");

         decl.add("type",s.type().getName());
         decl.add("var",s.varName());

         res.add("stat",decl.render());
      }
      return res;
   }

   @Override public ST visitQuizDeclaration(QuestionarioParser.QuizDeclarationContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");

      for(TerminalNode t: ctx.idList().ID()) {

         Symbol s = QuestionarioParser.symbolTable.get(t.getText());
         s.setVarName(newVarName());

         ST decl = coreTemplates.getInstanceOf("decl");

         decl.add("type","Quiz");
         decl.add("var",s.varName());

         res.add("stat",decl.render());
      }
      return res;
   }

   @Override public ST visitQuizAssignment(QuestionarioParser.QuizAssignmentContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("quizAssign");

      Symbol s = QuestionarioParser.symbolTable.get(ctx.var().getText());
      
      res.add("stat",visit(ctx.e1).render());
      res.add("stat",visit(ctx.e2).render());

      res.add("var",s.varName());
      res.add("value1",ctx.e1.varName);
      res.add("value2",ctx.e2.varName);

      
      return res;
   }

   @Override public ST visitAssignAtt(QuestionarioParser.AssignAttContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("assign");

      Symbol s = QuestionarioParser.symbolTable.get(ctx.var().getText());
      
      res.add("stat",visit(ctx.expr()).render());
      res.add("var",s.varName());
      res.add("value",ctx.expr().varName);
      
      return res;
   }

   @Override public ST visitAssignPlus(QuestionarioParser.AssignPlusContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("incrementDecrement");

      String var = ctx.var().getText();
      Symbol s = QuestionarioParser.symbolTable.get(var);

      res.add("var",s.varName());
      res.add("op","++");

      return res;
   }

   @Override public ST visitAssignMinus(QuestionarioParser.AssignMinusContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("incrementDecrement");

      String var = ctx.var().getText();
      Symbol s = QuestionarioParser.symbolTable.get(var);

      res.add("var",s.varName());
      res.add("op","--");

      return res;
   }

   @Override public ST visitType(QuestionarioParser.TypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprVar(QuestionarioParser.ExprVarContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");

      ST decl = coreTemplates.getInstanceOf("decl");

      String var = ctx.var().getText();
      Symbol s = QuestionarioParser.symbolTable.get(var);

      ctx.varName = newVarName();
    
      decl.add("type",ctx.types.getName());
      decl.add("var",ctx.varName);
      decl.add("value",s.varName());
      
      res.add("stat",decl.render());

      return res;
   }

   @Override public ST visitExprAddSub(QuestionarioParser.ExprAddSubContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("addSubMultDiv");

      ctx.varName = newVarName();

      res.add("stat",visit(ctx.e1).render());
      res.add("stat",visit(ctx.e2).render());

      res.add("type",ctx.types.getName());
      res.add("var",ctx.varName);
      res.add("expr1",ctx.e1.varName);
      res.add("op",ctx.op.getText());
      res.add("expr2",ctx.e2.varName);

      return res;
   }

   @Override public ST visitExprQuiz(QuestionarioParser.ExprQuizContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprDouble(QuestionarioParser.ExprDoubleContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("decl");

      ctx.varName = newVarName();

      res.add("type","double");
      res.add("var",ctx.varName);
      res.add("value",ctx.DOUBLE().getText());

      return res;
   }

   @Override public ST visitExprString(QuestionarioParser.ExprStringContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("decl");
      
      ctx.varName = newVarName();

      res.add("type","String");
      res.add("var",ctx.varName);
      res.add("value",ctx.STRING().getText());

      return res;
   }

   @Override public ST visitExprParent(QuestionarioParser.ExprParentContext ctx) {
      
      ST res = visit(ctx.expr());

      ctx.varName = ctx.expr().varName;
      
      return res;
   }

   @Override public ST visitExprBoolean(QuestionarioParser.ExprBooleanContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("decl");

      ctx.varName = newVarName();

      res.add("type","boolean");
      res.add("var",ctx.varName);

      ST valueBoolean = coreTemplates.getInstanceOf("valueBoolean");

      valueBoolean.add("value",ctx.BOOLEAN().getText());

      res.add("value",valueBoolean.render());

      return res;
   }

   @Override public ST visitExprMultDiv(QuestionarioParser.ExprMultDivContext ctx) {

      ST res = coreTemplates.getInstanceOf("addSubMultDiv");

      ctx.varName = newVarName();

      res.add("stat",visit(ctx.e1).render());
      res.add("stat",visit(ctx.e2).render());

      res.add("type",ctx.types.getName());
      res.add("var",ctx.varName);
      res.add("expr1",ctx.e1.varName);
      res.add("op",ctx.op.getText());
      res.add("expr2",ctx.e2.varName);

      return res;
   }

   @Override public ST visitExprSign(QuestionarioParser.ExprSignContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");

      res.add("stat",visit(ctx.e).render());

      ST decl = coreTemplates.getInstanceOf("decl");

      String strSign = ctx.sign.getText();

      ctx.varName = newVarName();

      decl.add("type",ctx.types.getName());
      decl.add("var",ctx.varName);
      decl.add("value",strSign + ctx.e.varName);

      res.add("stat",decl.render());

      return res;
   }

   @Override public ST visitExprInteger(QuestionarioParser.ExprIntegerContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("decl");

      ctx.varName = newVarName();

      res.add("type","int");
      res.add("var",ctx.varName);
      res.add("value",ctx.INTEGER().getText());

      return res;
   }

   @Override public ST visitVar(QuestionarioParser.VarContext ctx) {
      return visitChildren(ctx);
   }

    //---QuizExpr---
    @Override public ST visitExprSizeOfQuiz(QuestionarioParser.ExprSizeOfQuizContext ctx) {
        //get quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //use quizID on result template
        ST res = quizTemplates.getInstanceOf("sizeof");
        res.add("id",quizID);
         
        return res;

    }

	@Override public ST visitExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx) { 
        //get quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //use quizID on result template
        ST res = quizTemplates.getInstanceOf("result");
        res.add("id",quizID);
        
        return res;

    }

    @Override public ST visitExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx) {
        //get quizID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //use quizID on result template
        ST res = quizTemplates.getInstanceOf("sizeof");
        res.add("id",sectionID);
        
        return res;
    }

    @Override public ST visitExprResultSection(QuestionarioParser.ExprResultSectionContext ctx) {
        //get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //use sectionID on result template
        ST res = quizTemplates.getInstanceOf("result");
        res.add("id",sectionID);
    
        return res;
    }

    @Override public ST visitExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx) {
        //get questionID
        ST id = visit(ctx.questionID());
        String questionID = id.render();
        
        //use questionID on result template
        ST res = quizTemplates.getInstanceOf("result");
        res.add("id",questionID);
        
        return res;
    }

    //---quizID---
    @Override public ST visitQuizID(QuestionarioParser.QuizIDContext ctx) { 
        ST res = quizTemplates.getInstanceOf("id");
        String id = ctx.var().varName;
        res.add("quiz",id);

        return res;
    }
    
    //---sectionID---
	@Override public ST visitSectionByID(QuestionarioParser.SectionByIDContext ctx){
        ST res = visit(ctx.quizID());
        String sectionID = ".getByID(" + "\"" + ctx.ID().getText() + "\"" + ")";
        res.add("section", sectionID);

        return res;
    }

	@Override public ST visitSectionCurrent(QuestionarioParser.SectionCurrentContext ctx) {
        ST res = visit(ctx.quizID());
        String sectionID = ".getCurrent()";
        res.add("section", sectionID);

        return res;
    }  
    
    //--questionID--
    @Override public ST visitQuestionCurrent(QuestionarioParser.QuestionCurrentContext ctx) {
        ST res = visit(ctx.sectionID());
        String questionID = ".getCurrent()";
        res.add("question",questionID);
        return res;
    }
	
    @Override public ST visitQuestionPrev(QuestionarioParser.QuestionPrevContext ctx) { 
        ST res = visit(ctx.sectionID());
        String questionID = ".getPrevious()";
        res.add("question",questionID);
        return res;
    }

    @Override public ST visitQuestionNext(QuestionarioParser.QuestionNextContext ctx) {
        ST res = visit(ctx.sectionID());
        String questionID = ".getNext()";
        res.add("question",questionID);
        return res;
    }

    @Override public ST visitQuestionStart(QuestionarioParser.QuestionStartContext ctx) {
        ST res = visit(ctx.sectionID());
        String questionID = ".getFirst()";
        res.add("question",questionID);
        return res;
    }

    @Override public ST visitQuestionEnd(QuestionarioParser.QuestionEndContext ctx) {
        ST res = visit(ctx.sectionID());
        String questionID = ".getLast()";
        res.add("question",questionID);
        return res;
    }
	
    @Override public ST visitQuestionByID(QuestionarioParser.QuestionByIDContext ctx) {
        ST res = visit(ctx.sectionID());
        String questionID = ".getByID(" + "\"" + ctx.ID().getText() + "\"" + ")";
        res.add("question",questionID);
        return res;
    }
    
    //---iteration---
    @Override public ST visitIterationQuiz(QuestionarioParser.IterationQuizContext ctx) {
        return visit(ctx.quizIteration());
    }

    @Override public ST visitIterationSection(QuestionarioParser.IterationSectionContext ctx) {
        return visit(ctx.sectionIteration());
    }

    @Override public ST visitStartSection(QuestionarioParser.StartSectionContext ctx) {
        //consume quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("start");
        res.add("id", quizID);
        
        return res;

    }

    @Override public ST visitEndSection(QuestionarioParser.EndSectionContext ctx) {
        //consume quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("end");
        res.add("id", quizID);
        
        return res;

    }
    @Override public ST visitNextSection(QuestionarioParser.NextSectionContext ctx) {
        //consume quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("next");
        res.add("id", quizID);
        
        return res;
    }

    @Override public ST visitPrevSection(QuestionarioParser.PrevSectionContext ctx) {
        //consume quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //build prev template
        ST res = quizTemplates.getInstanceOf("prev");
        res.add("id", quizID);
        
        return res;

    }

    @Override public ST visitGoToSection(QuestionarioParser.GoToSectionContext ctx) {
        
        ST id = visit(ctx.sectionID());
        //get quizID
        String quizID = (String) id.getAttribute("quiz");

        //consume and get sectionID
        String sectionID = id.render() + ".getID()";
        
        //build goto template
        ST res = quizTemplates.getInstanceOf("goto");
        res.add("id", quizID);
        res.add("target", sectionID);
        return res;
    }

     @Override public ST visitNextQuestion(QuestionarioParser.NextQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("next");
        res.add("id", sectionID);
        
        return res;
    }

    /*@Override public ST visitNextUnansweredQuestion(QuestionarioParser.NextUnansweredQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("nextUnansweredQuestion");
        res.add("idSection", sectionID);
        
        return res;
    }*/

    @Override public ST visitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build prev template
        ST res = quizTemplates.getInstanceOf("prev");
        res.add("idSection", sectionID);
        
        return res;
    }

    /*@Override public ST visitPrevUnansweredQuestion(QuestionarioParser.PrevUnansweredQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("prevUnansweredQuestion");
        res.add("id", sectionID);
        
        return res;
    }*/

	@Override public ST visitStartQuestion(QuestionarioParser.StartQuestionContext ctx) { 
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build prev template
        ST res = quizTemplates.getInstanceOf("start");
        res.add("id", sectionID);
        
        return res;
    }

	@Override public ST visitEndQuestion(QuestionarioParser.EndQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build prev template
        ST res = quizTemplates.getInstanceOf("end");
        res.add("id", sectionID);
        
        return res;
    }
    
    @Override public ST visitGoToQuestion(QuestionarioParser.GoToQuestionContext ctx) {
        
        ST id = visit(ctx.questionID());
        
        //get SectionID (quiz.section) 
        String quiz = (String) id.getAttribute("quiz");
        String section = (String) id.getAttribute("section");
        
        String sectionID = quiz.concat(section);

        //get QuestionID
        String questionID = id.render() + ".getID()";
        
        //build goto template
        ST res = quizTemplates.getInstanceOf("goto");
        res.add("id", sectionID);
        res.add("target", questionID);
        
        return res;
    }

    //---ShowQuestion---
    @Override public ST visitShowQuestion(QuestionarioParser.ShowQuestionContext ctx) {
        ST questionID = visit(ctx.questionID());

        ST res = quizTemplates.getInstanceOf("show");

        res.add("questionID", questionID);

        return res;
    }
    
    //---AnswerQuestion---
    @Override public ST visitAnswerSimple(QuestionarioParser.AnswerSimpleContext ctx) {
        
        ST questionID = visit(ctx.questionID());
        
        ST res = quizTemplates.getInstanceOf("answer");

        res.add("questionID", questionID);
        
        //read from input questionID
        res.add("answerID", "in.nextLine()");
  
        return res; 
    }

    @Override public ST visitPrint(QuestionarioParser.PrintContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("print");

      res.add("stat",visit(ctx.expr()));
      res.add("expr",ctx.expr().varName);

      return res;
   }

   @Override public ST visitRead(QuestionarioParser.ReadContext ctx) {
      return visitChildren(ctx);
   }

   /*@Override public ST visitEnableOptions(QuestionarioParser.EnableOptionsContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitIfCondition(QuestionarioParser.IfConditionContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");
		ST ifs = coreTemplates.getInstanceOf("ifCondition");

		ifs.add("simpleIfCondition",visit(ctx.simpleIfCondition()).render());

		/*if(ctx.elseIfCondition() != null){
			Iterator<QuestionarioParser.ElseIfConditionContext> list = ctx.elseIfCondition().iterator();
			while(list.hasNext()){
				ifs.add("elseIfCondition",visit(list.next()).render());
			}
		}*/

		if(ctx.elseCondition() != null) ifs.add("elseCondition",visit(ctx.elseCondition()).render());

		res.add("stat", ifs.render());

		return res;
   }

   @Override public ST visitSimpleIfCondition(QuestionarioParser.SimpleIfConditionContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");

      ST simpleIf = coreTemplates.getInstanceOf("simpleIfCondition");

      simpleIf.add("stat",visit(ctx.c).render());

      simpleIf.add("condition",strVarName);  // deveria ser ctx.c.varName
      strVarName = null;
      
      Iterator<QuestionarioParser.StatContext> list = ctx.stat().iterator();
		while(list.hasNext()){
			simpleIf.add("stat_true",visit(list.next()).render());
      }
      
      res.add("stat",simpleIf.render());   

      return res;
   }

   /*@Override public ST visitElseIfCondition(QuestionarioParser.ElseIfConditionContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitElseCondition(QuestionarioParser.ElseConditionContext ctx) {

      ST res = coreTemplates.getInstanceOf("stats");

      ST elseCond = coreTemplates.getInstanceOf("elseCondition");

      Iterator<QuestionarioParser.StatContext> list = ctx.stat().iterator();
		while(list.hasNext()){
			elseCond.add("stat_true",visit(list.next()).render());
      }

      res.add("stat",elseCond.render());
      
      return res;
   }

   @Override public ST visitWhileCondition(QuestionarioParser.WhileConditionContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");
      
      ST whileCond = coreTemplates.getInstanceOf("whileCondition");

      whileCond.add("stat",visit(ctx.c).render());

      whileCond.add("condition",strVarName); // deveria ser ctx.c.varName
      strVarName = null;
      Iterator<QuestionarioParser.StatContext> list = ctx.stat().iterator();
		while(list.hasNext()){
			whileCond.add("stat_true",visit(list.next()).render());
      }
      
      res.add("stat",whileCond.render());
      return res;
   }

   /*@Override public ST visitForCondition(QuestionarioParser.ForConditionContext ctx) {
      return visitChildren(ctx);
   }*/

   /*@Override public ST visitTimeEndTime(QuestionarioParser.TimeEndTimeContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitConditionAnd(QuestionarioParser.ConditionAndContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("andOrCondition");

      ctx.varName = newVarName();

      res.add("stat",visit(ctx.c1).render());
      res.add("stat",visit(ctx.c2).render());
      
      res.add("type","boolean");
      res.add("var",ctx.varName);
      res.add("condition1",ctx.c1.varName);
      res.add("op","&&");
      res.add("condition2",ctx.c2.varName);
      
      return res;
   }

   @Override public ST visitConditionOr(QuestionarioParser.ConditionOrContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("andOrCondition");

      ctx.varName = newVarName();

      res.add("stat",visit(ctx.c1).render());
      res.add("stat",visit(ctx.c2).render());
      
      res.add("type","boolean");
      res.add("var",ctx.varName);
      res.add("condition1",ctx.c1.varName);
      res.add("op","||");
      res.add("condition2",ctx.c2.varName);
      
      return res;
   }

   @Override public ST visitConditionBoolean(QuestionarioParser.ConditionBooleanContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("decl");

      ctx.varName = newVarName();
      strVarName = ctx.varName;

      res.add("type","boolean");
      res.add("var",strVarName);   // aqui funciona usando ctx.varName

      ST valueBoolean = coreTemplates.getInstanceOf("valueBoolean");

      valueBoolean.add("value",ctx.BOOLEAN().getText());

      res.add("value",valueBoolean.render());

      return res;
   }

   @Override public ST visitConditionComparation(QuestionarioParser.ConditionComparationContext ctx) {
      ST res = visit(ctx.c);
      ctx.varName = ctx.c.varName;
      return res;      
   }

   @Override public ST visitConditionParent(QuestionarioParser.ConditionParentContext ctx) {
      
      ST res = visit(ctx.c);

      ctx.varName = ctx.c.varName;
      
		return res;
   }

   @Override public ST visitComparation(QuestionarioParser.ComparationContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("comparation");

      ctx.varName = newVarName();
      strVarName = ctx.varName;

      res.add("stat",visit(ctx.e1));
      res.add("stat",visit(ctx.e2));

      res.add("type","boolean");
      res.add("var",ctx.varName);
      res.add("expr1",ctx.e1.varName);
      res.add("condition",ctx.c.getText());
      res.add("expr2",ctx.e2.varName);

		return res;
   }
}
