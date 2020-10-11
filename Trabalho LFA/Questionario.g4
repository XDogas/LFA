grammar Questionario;

@parser::header {
import javaTypes.*;
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}

program: load+ quiz main EOF;

quiz: 'Quiz' ID '(' ID ',' ID ')' '{' options? (sections+)? '}'; // ? acrescentado nas sections!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//Options 
options: 'Options' ID '(' (ID ':' STRING ';')* ')' ';';

//Sections
sections: 'Section' ID ('<' INTEGER '%' '>')? '(' file ')' ';';

file : 'from' ref = ID ':' (simpleQuestion (',' simpleQuestion)*)? ';';

theme:
		theme '->' theme
	|	theme '=>' questions (',' '->' theme | ',' '=>' questions)?
	|	STRING ('<' INTEGER'%''>')?
	|   	'all' ('<' INTEGER'%''>')? ('=>' 'random' '(' INTEGER ',' 'difficulty[' INTEGER ':' INTEGER']'')')?
	;

simpleQuestion:
   		ID
	|	ID ':' '[' INTEGER (',' INTEGER)*?  ']'
    ;

 
questions:
        simpleQuestion
	|	'all'
	|	'all' '\\' ID (',' ID)*?
	|	'random' '(' INTEGER ')'
	;


load: 'load' qst 'as' fileRef = ID';';	// definir depois que a string tem de acabar em ”.qst”

//'fileName.qst'
qst: '\'' fileName = ID '.qst\'';

main: 'main' '{' s=stat* '}';

stat:                   	 
		line ';'			#StatLine
	|	ifCondition			#StatIf
	|	whileCondition		#StatWhile
	|	answer	            #StatAnswer
	|	forCondition		#StatFor
	|	timeEndTime			#StatTimeEndTime
	;


line:
        declaration         #LineDeclaration
    |   quizDeclaration     #LineQuizDeclaration
    |   quizAssignment      #LineQuizAssignment
    |	assignment			#LineAssign
	|	print				#LinePrint
    |	read				#LineRead
	|	showQuestion		#LineShowQuestion
	|	enableOptions		#LineEnableOp
	|   iteration           #LineIteration
    ;

idList: ID (',' ID)*;

declaration:
        type  idList //('=' expr)? 
    ;

quizDeclaration locals[Type varType]: 
        'Quiz' idList {$varType = new QuizType();};

quizAssignment: var '=' quizId=ID '(' e1=expr ',' e2=expr ')';

assignment :
		var '=' expr											#AssignAtt
	|   var '++'												#AssignPlus
	|  	var '--'												#AssignMinus
	;

type returns[Type varType]:
		'Timer'		{$varType = new TimerType();}	// timer = integer
	|	'int'		{$varType = new IntegerType();}
	|	'double'	{$varType = new DoubleType();}
	|	'boolean'	{$varType = new BooleanType();}
	|	'String'	{$varType = new StringType();}
	|	'Quiz'		{$varType = new QuizType();}
	;

expr returns[Type types,String varName]:
		sign=('+'|'-') e=expr			#ExprSign
	|	e1=expr op=( '*' | '/' ) e2=expr	#ExprMultDiv
	|	e1=expr op=( '+' | '-' ) e2=expr	#ExprAddSub
	|	'('  e=expr  ')'			#ExprParent
    |   quizExpr                #ExprQuiz
	|   var                     #ExprVar
    |	INTEGER					#ExprInteger
	|	DOUBLE					#ExprDouble
	|	BOOLEAN					#ExprBoolean
	|	STRING					#ExprString
	;

var returns[String varName]: ID;

quizExpr returns[Type types]:
        'sizeof' quizID         #ExprSizeOfQuiz
    |   'result' quizID         #ExprResultQuiz
    |   'sizeof' sectionID      #ExprSizeOfSection
    |   'result' sectionID      #ExprResultSection
    |   'result' questionID     #ExprResultQuestion
    ;
    
questionID: 
		sectionID '.current'				#QuestionCurrent
	|	sectionID '.prev'					#QuestionPrev
	|	sectionID '.next'					#QuestionNext
	|	sectionID '.start'					#QuestionStart
	|	sectionID '.end'					#QuestionEnd
	|	sectionID '.' ID				    #QuestionByID
	;

sectionID : 
        quizID '.' ID                       #SectionByID
    |   quizID '.current'                   #SectionCurrent
    ;
    
quizID : var;    

iteration:
        quizIteration          #IterationQuiz 
   |    sectionIteration       #IterationSection
   ;

quizIteration:  
        'next' quizID          #NextSection
   |    'prev' quizID          #PrevSection
   |    'start' quizID         #StartSection
   |    'end' quizID           #EndSection
   |    'goto' sectionID       #GoToSection
   ;

sectionIteration:
        'next' sectionID       #NextQuestion
   |    'prev' sectionID       #PrevQuestion
   |    'start' sectionID      #StartQuestion
   |    'end' sectionID        #EndQuestion
   |    'goto' questionID      #GoToQuestion

   ;

showQuestion: 'show' questionID;

answer: 
		'answer' '(' questionID ')' ';'                                 #AnswerSimple                                         
    |   'answer' '(' questionID ')' '{' 
              ('case' '(' ( STRING | INTEGER | ID ) ')' ':' sc=stat* )* 
              ('valid' ':' sv=stat*)?  
              ('invalid' ':' si=stat*)? '}'                             #AnswerOptions
	;   

print: 'print' expr;

read: 'read' ID;

enableOptions: 'enable' ID '.' ID;

ifCondition: simpleIfCondition elseIfCondition*? elseCondition?;

simpleIfCondition: 'if' '(' c=condition ')' '{' s=stat* '}';

elseIfCondition: 'else if' '(' c=condition ')' '{' s=stat* '}';

elseCondition: 'else' '{' s=stat* '}';

whileCondition: 'while' '(' c=condition ')' '{' s=stat* '}';

forCondition: 'for' '(' ID ':' ID ')' '{' s=stat* '}';

timeEndTime: 'time' '(' (ID | INTEGER) ')' '{' st=stat* '}' 'endTime' '{' set=stat* '}';

condition returns [Type types, boolean cond, String varName]:
		c1=condition  '||' c2=condition	#ConditionOr
	|   c1=condition  '&&' c2=condition   #ConditionAnd
	|	c=comparation					#ConditionComparation
	|	'(' c=condition ')'				#ConditionParent
	|	BOOLEAN						#ConditionBoolean
	;

comparation returns [Type types, boolean comp, String varName]: e1=expr c=( '<' | '>' | '==' | '!=' | '<=' | '>=' ) e2=expr;

fragment DIGIT: '0'..'9';
fragment ESC: '\\”' | '\\\\' ;
fragment LETTER: 'a'..'z' | 'A'..'Z' | '_';

BOOLEAN: 'true' | 'false';
STRING: '"' ( ESC | . )*? '"';
ID:  LETTER (LETTER | DIGIT)*;
INTEGER: DIGIT+;
DOUBLE:  DIGIT+ '.' DIGIT+ | '.' DIGIT+;

WS: [ \t\n\r] -> skip;
LINE_COMMENT: '//' .*? '\n' -> skip;
COMMENT: '/*' .*? '*/' ->skip;
ERROR: .;
