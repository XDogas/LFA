import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;
import javaTypes.*;
import javaClasses.*;

public class Compiler extends QuestionarioBaseVisitor<ST> {

   protected int varCount = 0;
   protected STGroup coreTemplates = new STGroupFile("templates/java.stg");
   protected STGroup quizTemplates = new STGroupFile("templates/quizTemplates.stg");
    
	protected String newVarName() {
		varCount++;
		return "var" + varCount;
   }
   
   protected String strVarName = null;


   @Override public ST visitProgram(QuestionarioParser.ProgramContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("program");
      
      ST main = coreTemplates.getInstanceOf("module");
      main.add("name","Output");

      ST comment = coreTemplates.getInstanceOf("comment");
      ST comment2 = coreTemplates.getInstanceOf("comment");
      comment.add("string", "Início");
      main.add("stat",comment);
      for (QuestionarioParser.LoadContext loadCxt : ctx.load()) {
         main.add("stat",visit(loadCxt));
      }
      ST quizMap = coreTemplates.getInstanceOf("quizMap");
      quizMap.add("id","quizMap");
      main.add("stat",quizMap);
      
      for(QuestionarioParser.QuizContext quiz: ctx.quiz()) {
        main.add("stat",visit(quiz));
      }
      
      comment2.add("string", "Fim");
      main.add("stat",comment2);
      main.add("stat",visit(ctx.main()));
		res.add("main",main.render());

		return res;
   }

   @Override public ST visitQuiz(QuestionarioParser.QuizContext ctx) {
      ST res = coreTemplates.getInstanceOf("stats");
      //fazer aqui a instancia das options

      if (ctx.options() != null) {
         ctx.options().n = ctx.name.getText();
         res.add("stat", visit(ctx.options()));
      }

      ST ws = coreTemplates.getInstanceOf("whiteSpace");
      res.add("stat", ws.render());

		ST sectionList = coreTemplates.getInstanceOf("sectionList");
		sectionList.add("id", ctx.name.getText());
		res.add("stat", sectionList.render());
		ST quizListAdd = coreTemplates.getInstanceOf("quizAdd");
		quizListAdd.add("string", ctx.name.getText());
		quizListAdd.add("quiz", ctx.name.getText());
		res.add("stat",quizListAdd.render());
		for (QuestionarioParser.SectionsContext sctCxt : ctx.sections()) {
			sctCxt.n = ctx.name.getText();
			res.add("stat", visit(sctCxt).render());
		}
		return res;
	}

	@Override public ST visitOptions(QuestionarioParser.OptionsContext ctx) {
      ST res = coreTemplates.getInstanceOf("stats");

      ST options = quizTemplates.getInstanceOf("options");
      options.add("optionsID", ctx.n + "_" + "options");
      res.add("stat", options.render());
      
      for (int i = 0; i < ctx.ID().size(); i++) {
         ST addOp = quizTemplates.getInstanceOf("optionsAddOption");
         addOp.add("optionsID", ctx.n + "_" + "options");
         addOp.add("optionID", ctx.ID(i).getText());
         addOp.add("optionText", ctx.STRING(i));
         res.add("stat", addOp.render());
      }
      
      return res;
   }

	@Override public ST visitSections(QuestionarioParser.SectionsContext ctx) {
		ST res = coreTemplates.getInstanceOf("stats");
		ST section = coreTemplates.getInstanceOf("section");
		section.add("name", ctx.n + "_" + ctx.ID().getText());
      section.add("id", ctx.ID().getText());
      res.add("stat", section.render());
      ST perc = coreTemplates.getInstanceOf("sectionSetPercentage");
      perc.add("id", ctx.n + "_" + ctx.ID().getText());
      perc.add("dif", QuestionarioParser.quizTable.get(ctx.n).getQuestionMap(ctx.ID().getText()).getPercentage());
      res.add("stat",perc.render());
      ctx.file().d = ctx.n + " " + ctx.ID().getText();
		res.add("stat",  visit(ctx.file()).render());
		ST addSec = coreTemplates.getInstanceOf("listAddSection");
		addSec.add("id", ctx.n);
		addSec.add("section", ctx.n + "_" + ctx.ID().getText());
		res.add("stat", addSec.render());
		return res;
	}

	@Override public ST visitFile(QuestionarioParser.FileContext ctx) {
      String[] a = ctx.d.split(" ");
		ST res = coreTemplates.getInstanceOf("stats");
		for (QuestionarioParser.SimpleQuestionContext qstCxt : ctx.simpleQuestion()) {
			qstCxt.t = a[0] + " " + ctx.ref.getText();
			res.add("stat", visit(qstCxt).render());
			ST addQst = coreTemplates.getInstanceOf("sectionAddQuestion");
			addQst.add("id", a[0] + "_" + a[1]);
			addQst.add("question", a[0] + "_" + ctx.ref.getText() + "_" + qstCxt.name.getText());	
         res.add("stat", addQst.render());
         ST qstSetId = coreTemplates.getInstanceOf("questionSetId");
         qstSetId.add("question", a[0] + "_" + ctx.ref.getText() + "_" + qstCxt.name.getText());
         qstSetId.add("id", ctx.ref.getText() + "_" + qstCxt.name.getText()); 
         res.add("stat", qstSetId.render());
         ST ws = coreTemplates.getInstanceOf("whiteSpace");
         res.add("stat", ws.render());  
		}
		return res;
	}

	/*@Override public ST visitTheme(QuestionarioParser.ThemeContext ctx) {
		return visitChildren(ctx);
	}*/

	@Override public ST visitQuestions(QuestionarioParser.QuestionsContext ctx) {
		return visitChildren(ctx);
	}

	@Override public ST visitSimpleQuestion(QuestionarioParser.SimpleQuestionContext ctx) {
		ST res = coreTemplates.getInstanceOf("stats");
      ST qst = coreTemplates.getInstanceOf("question");
      String[] a = ctx.t.split(" ");
      qst.add("quiz", a[0]);
		qst.add("base", a[1]);		              
		qst.add("id", ctx.name.getText());
      res.add("stat", qst.render());
      List<TerminalNode> ids = ctx.ID();
		if (ids.size() > 1) {
			for (int i = 1; i < ids.size(); i++) {
				ST ans = coreTemplates.getInstanceOf("questionGetAns");
				ans.add("qstId",a[0] + "_" + a[1] + "_" + ctx.name.getText());		              
				ans.add("ansId", ids.get(i).getText());
				res.add("stat", ans.render());
			}
		}
		else {
			ST ans = coreTemplates.getInstanceOf("questionGetAll");
			ans.add("qstId",a[0] + "_" + a[1] + "_" + ctx.name.getText());		              
			res.add("stat", ans.render());
		}

		return res;
	}

   @Override public ST visitLoad(QuestionarioParser.LoadContext ctx) {
      ST res = coreTemplates.getInstanceOf("newQuestionsBank");
      res.add("id",ctx.fileRef.getText());
      res.add("filename", ctx.qst().fileName.getText());
		return res;
   }

   /*@Override public ST visitQst(QuestionarioParser.QstContext ctx) {

   }*/

   @Override public ST visitMain(QuestionarioParser.MainContext ctx) {
      
      ST stats = coreTemplates.getInstanceOf("stats");

      for(QuestionarioParser.StatContext sc : ctx.stat()){
         stats.add("stat",visit(sc));
      }
      
      return stats;
   }

   @Override public ST visitStatLine(QuestionarioParser.StatLineContext ctx) {
		return visit(ctx.line());
   }


   @Override public ST visitStatAnswer(QuestionarioParser.StatAnswerContext ctx) {
        return visit(ctx.answer());
   }


   @Override public ST visitLineAssign(QuestionarioParser.LineAssignContext ctx) {
      return visit(ctx.assignment());
   }


   @Override public ST visitLineShowQuestion(QuestionarioParser.LineShowQuestionContext ctx) {
      return visit(ctx.showQuestion());
   }

 
   @Override public ST visitLineIteration(QuestionarioParser.LineIterationContext ctx) {
      return visit(ctx.iteration());
   }

   @Override public ST visitLineClearScreen(QuestionarioParser.LineClearScreenContext ctx) {
      ST res = quizTemplates.getInstanceOf("clearScreen");
      return res;
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
      
      ST res = coreTemplates.getInstanceOf("stats");
      ST quiz = coreTemplates.getInstanceOf("quizAssign");

      Symbol s = QuestionarioParser.symbolTable.get(ctx.var().getText());
      
      quiz.add("stat",visit(ctx.e1).render());
      quiz.add("stat",visit(ctx.e2).render());

      quiz.add("var",s.varName());
      quiz.add("value1",ctx.e1.varName);
      quiz.add("value2",ctx.e2.varName);

      res.add("stat", quiz.render());

      ST addSeq = coreTemplates.getInstanceOf("quizSetSection");

      addSeq.add("var", s.varName());
      addSeq.add("listSection", ctx.quizId.getText());

      res.add("stat", addSeq.render());
      if (QuestionarioParser.optionsTable.containsKey(ctx.quizId.getText())) {
         ST addOptions = quizTemplates.getInstanceOf("quizAddOptions");
         addOptions.add("quizID", s.varName());
         addOptions.add("optionsID", ctx.quizId.getText() + "_" + QuestionarioParser.optionsTable.get(ctx.quizId.getText()).getID());

         res.add("stat", addOptions.render());
      }
      
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
      ST res = visit(ctx.quizExpr());
      ctx.varName = ctx.quizExpr().varName;
      return res;
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
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","int");
        res.add("var",ctx.varName);

        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //use quizID on result template
        ST sizeOf = quizTemplates.getInstanceOf("sizeof");
        sizeOf.add("id",quizID);
        
        res.add("value", sizeOf);

        return res;

    }

	@Override public ST visitExprResultQuiz(QuestionarioParser.ExprResultQuizContext ctx) { 
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","double");
        res.add("var",ctx.varName);


        //get quizID
        ST id = visit(ctx.quizID());
        String quizID = id.render();
        
        //use quizID on result template
        ST result = quizTemplates.getInstanceOf("result");
        result.add("id",quizID);
        
        res.add("value", result);
        return res;

    }

    @Override public ST visitExprSizeOfSection(QuestionarioParser.ExprSizeOfSectionContext ctx) {
        
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","int");
        res.add("var",ctx.varName);
    
        //get quizID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //use quizID on result template
        ST sizeOf = quizTemplates.getInstanceOf("sizeof");
        sizeOf.add("id",sectionID);
        
        res.add("value", sizeOf);
        return res;
    }

    @Override public ST visitExprResultSection(QuestionarioParser.ExprResultSectionContext ctx) {
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","double");
        res.add("var",ctx.varName);

        //get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //use sectionID on result template
        ST result = quizTemplates.getInstanceOf("result");
        result.add("id",sectionID);
    
        res.add("value", result);
        return res;
    }

    @Override public ST visitExprValueQuestion(QuestionarioParser.ExprValueQuestionContext ctx) {
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","double");
        res.add("var",ctx.varName);
    
        //get questionID
        ST id = visit(ctx.questionID());
        String questionID = id.render();
        
        //use questionID on result template
        ST result = quizTemplates.getInstanceOf("result");
        result.add("id",questionID);
        
        res.add("value", result);
        return res;
    }
    
    @Override public ST visitExprValueSection(QuestionarioParser.ExprValueSectionContext ctx) {
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","double");
        res.add("var",ctx.varName);

        //get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //use sectionID on value template
        ST result = quizTemplates.getInstanceOf("value");
        result.add("id",sectionID);
    
        res.add("value", result);
        return res;
    }

    @Override public ST visitExprResultQuestion(QuestionarioParser.ExprResultQuestionContext ctx) {
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","double");
        res.add("var",ctx.varName);
    
        //get questionID
        ST id = visit(ctx.questionID());
        String questionID = id.render();
        
        //use questionID on value template
        ST result = quizTemplates.getInstanceOf("value");
        result.add("id",questionID);
        
        res.add("value", result);
        return res;
    }
    
    @Override public ST visitExprSelectedAnswer(QuestionarioParser.ExprSelectedAnswerContext ctx) {
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","String");
        res.add("var",ctx.varName);
    
        //get questionID
        ST id = visit(ctx.questionID());
        String questionID = id.render();
        
        //use questionID on selected template
        ST result = quizTemplates.getInstanceOf("selected");
        result.add("id",questionID);
        
        res.add("value", result);
        return res;
    }

    @Override public ST visitExprQuestionTheme(QuestionarioParser.ExprQuestionThemeContext ctx) {
    
        ST res = coreTemplates.getInstanceOf("decl");
        ctx.varName = newVarName();

        res.add("type","String");
        res.add("var",ctx.varName);
    
        //get questionID
        ST id = visit(ctx.questionID());
        String questionID = id.render();
        
        //use questionID on them template
        ST result = quizTemplates.getInstanceOf("theme");
        result.add("id",questionID);
        
        res.add("value", result);
        return res;
    }
    
    //---quizID---
    @Override public ST visitQuizID(QuestionarioParser.QuizIDContext ctx) { 
        ST res = quizTemplates.getInstanceOf("id");
        String id = ctx.var().varName;
        
        Symbol s = QuestionarioParser.symbolTable.get(id);
        
        res.add("quiz",s.varName());

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

    @Override public ST visitNextUnansweredQuestion(QuestionarioParser.NextUnansweredQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("nextUnansweredQuestion");
        res.add("idSection", sectionID);
        
        return res;
    }

    @Override public ST visitPrevQuestion(QuestionarioParser.PrevQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build prev template
        ST res = quizTemplates.getInstanceOf("prev");
        res.add("id", sectionID);
        
        return res;
    }

    @Override public ST visitPrevUnansweredQuestion(QuestionarioParser.PrevUnansweredQuestionContext ctx) {
        //consume and get sectionID
        ST id = visit(ctx.sectionID());
        String sectionID = id.render();
        
        //build next template
        ST res = quizTemplates.getInstanceOf("prevUnansweredQuestion");
        res.add("idSection", sectionID);
        
        return res;
    }
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
        
        String quiz = (String) questionID.getAttribute("quiz");
        String section = (String) questionID.getAttribute("section");
        
        String sectionID = quiz + section;
        res.add("sectionID", sectionID);
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

    @Override public ST visitAnswerOptions(QuestionarioParser.AnswerOptionsContext ctx) {
        ST questionID = visit(ctx.questionID());

        ST res = quizTemplates.getInstanceOf("answerWithOptions");
        res.add("questionID", questionID);
        String varInput = newVarName();
        res.add("var",varInput);
        
        for(QuestionarioParser.CaseOptionContext option : ctx.caseOption()) {
            res.add("options", visit(option));
        }
        if(ctx.val() != null) {
            res.add("valid_stat", visit(ctx.val()));
        }
        
        if(ctx.inval() != null) {
            res.add("invalid_stat", visit(ctx.inval()));
        }
        return res;
    }
    //falta validar as options!!!!
   @Override public ST visitCaseOption(QuestionarioParser.CaseOptionContext ctx) {
      ST res = quizTemplates.getInstanceOf("option");
      
      String optionID = ctx.ID().getText();
      String quizInstance = ctx.instanceOfQuiz;
      String optionText = QuestionarioParser.optionsTable.get(quizInstance).getByOptionID(optionID).getText();
      res.add("optionID", optionText);

      for(QuestionarioParser.StatContext stat : ctx.stat()) {
           res.add("statOption", visit(stat));
      }
      
      return res;
   } 

  @Override public ST visitVal(QuestionarioParser.ValContext ctx) {
      ST res = quizTemplates.getInstanceOf("stats");

      for(QuestionarioParser.StatContext stat : ctx.stat()) {
        res.add("stat", visit(stat));
      }
      return res;
   }

  @Override public ST visitInval(QuestionarioParser.InvalContext ctx){
      ST res = quizTemplates.getInstanceOf("stats");

      for(QuestionarioParser.StatContext stat : ctx.stat()) {
        res.add("stat", visit(stat));
      }
      return res;
   } 

    @Override public ST visitPrint(QuestionarioParser.PrintContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("print");

      res.add("stat",visit(ctx.expr()));
      res.add("expr",ctx.expr().varName);

      return res;
   }

   @Override public ST visitRead(QuestionarioParser.ReadContext ctx) {     
      ST res = coreTemplates.getInstanceOf("lineRead");

      Symbol s = QuestionarioParser.symbolTable.get(ctx.var().getText());
      
      res.add("var",s.varName());
      
      return res;
   }

   /*@Override public ST visitEnableOptions(QuestionarioParser.EnableOptionsContext ctx) {
      return visitChildren(ctx);
   }*/

   @Override public ST visitIfCondition(QuestionarioParser.IfConditionContext ctx) {
      
      ST res = coreTemplates.getInstanceOf("stats");
		ST ifs = coreTemplates.getInstanceOf("ifCondition");

		ifs.add("simpleIfCondition",visit(ctx.simpleIfCondition()).render());

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
      
      ST whileCond = coreTemplates.getInstanceOf("whileCondition");

      whileCond.add("stat",visit(ctx.c).render());
      String varLoop = ctx.c.varName;
      whileCond.add("condition",varLoop);
       
      Iterator<QuestionarioParser.StatContext> list = ctx.stat().iterator();
	  while(list.hasNext()){
	      whileCond.add("stat_true",visit(list.next()).render());
      }
      ST assign = coreTemplates.getInstanceOf("assign");
      assign.add("stat", visit(ctx.c).render());
      assign.add("var", varLoop);
      assign.add("value", ctx.c.varName);
      whileCond.add("stat_true", assign.render());
      return whileCond;
   }


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
