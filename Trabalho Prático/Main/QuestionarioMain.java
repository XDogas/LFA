import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import javaClasses.*;
import javaTypes.*;
import static java.lang.System.*;

import java.io.File;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileInputStream;

public class QuestionarioMain {
   public static void main(String[] args) throws Exception {
      if(args.length != 1) {
          System.out.println("USAGE: java QuestionarioMain <file>");
          System.exit(1);
      }
      CharStream input = null;
      try {
          // create a CharStream that reads from standard input:
          //CharStream input = CharStreams.fromStream(System.in);
          input = CharStreams.fromStream(new FileInputStream(args[0]));
      } catch (FileNotFoundException e) {
           System.out.println("File \"" + args[0] + "\" not found");
           System.exit(1);
      }
      // create a lexer that feeds off of input CharStream:
      QuestionarioLexer lexer = new QuestionarioLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      QuestionarioParser parser = new QuestionarioParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         QuestionarioSemanticCheck semanticCheck = new QuestionarioSemanticCheck();
         boolean valid = semanticCheck.visit(tree);
          
         if(valid) {
             
             Compiler compiler = new Compiler();
             ST result = compiler.visit(tree); 
             //ns se e preciso + alguma coisa

             String filename = "Output.java";
             try
             {
                PrintWriter pw = new PrintWriter(new File(filename));
                pw.print(result.render());
                pw.close();
             }
             catch(IOException e)
             {
                err.println("ERROR: unable to write in file "+filename);
                exit(3);
             }
             System.out.println("Output.java has been created!");
         }
      }
   }
	
   public static QuestionsBank interpreter(String filename) throws Exception {

      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromFileName("qstFiles/" + filename + ".qst");
      // create a lexer that feeds off of input CharStream:
      ReadDatabaseQuestionsLexer lexer = new ReadDatabaseQuestionsLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      ReadDatabaseQuestionsParser parser = new ReadDatabaseQuestionsParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         DatabaseQuestionsVisitor visitor0 = new DatabaseQuestionsVisitor();
         return (QuestionsBank) visitor0.visit(tree);
      }
      return null;
   }
}
