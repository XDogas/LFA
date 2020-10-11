grammar ReadDatabaseQuestions;

@parser::header {
import javaClasses.*;
}

program: stat;

stat locals[Integer dif = null, String t = null]: 
    'difficulty[' min = Integer ':' max = Integer ']' difficulty ';' assignment* theme[$dif, $t]+ EOF;

assignment: 
    var '=' Integer ';';

theme[Integer dif, String t]: 
    '<' String difficulty? '>' question[$dif, $t]* theme[$dif, $t]* question[$dif, $t]* '</' String '>';

question[Integer dif, String t]: 
    id '(' String ')' difficulty? '{'(pnt '-' answer)+ '}';

answer: 
    ans = String ':' score = var ';';		//parametros?

difficulty: 
    ':=' dif = Integer;


pnt:
   p = (Point | Integer);

var: 
    Point pnt*;

id:
    ID;

String: '"' (ESC | .)*? '"';
Integer: [0-9]+;
ID:'P' Integer;
Point: [a-zA-Z];
Comment: '//' .*? '\n' -> skip;
WS: [ \r\t\n]+ -> skip;
fragment ESC: '\\"' | '\\\\';
