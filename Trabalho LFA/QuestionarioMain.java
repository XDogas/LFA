import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;

public class QuestionarioMain {
   public static void main(String[] args) throws Exception {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      //CharStream input = CharStreams.fromStream(new FileInputStream("Teste1.txt"));
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
         Compiler compiler = new Compiler();
         semanticCheck.visit(tree);

         //if(!ErrorHandling.error()) {

            ST result = compiler.visit(tree);
            String filename = "Output.java";

            System.out.println(result.render());

            try {
               //result.add("name", "Output");
               PrintWriter pw = new PrintWriter(new File(filename));
               pw.print(result.render());
               pw.close();
            }
            catch(IOException e) {
               err.println("ERROR: unable to write in file " + filename);
               exit(3);
            }
         //}
      }
   }
}
