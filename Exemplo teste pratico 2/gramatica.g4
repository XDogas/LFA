grammar gramatica;

program: stat* EOF;

stat:
        NEWLINE         #statNewLine
    |   assignment      #statAssign
    |   print           #statPrint
    ;

assignment:
        VAR ':' STRING                  #assignString
    |   VAR ':' 'input' '(' STRING ')'  #assignInput
    ;

print: 'print' expr;

expr:
        STRING                                      #exprString
    |   VAR                                         #exprVar
    |   e1=expr '+' e2=expr                         #exprConcat
    |   '(' expr '/' s1=STRING '/' s2=STRING ')'    #exprSubst
    ;

fragment ESC: '\\"' | '\\\\';
fragment DIGIT: '0'..'9';
fragment LETTER: 'a'..'z' | 'A'..'Z' | '_';

STRING: '"' (ESC | .)*? '"';
VAR: LETTER (LETTER | DIGIT)*;

NEWLINE: '\r'? '\n';
WS: [ \t] -> skip;
COMMENT: '//' .*? '\n' -> skip;

