grammar gramatica;

program: stat* EOF;

stat:
        NEWLINE
    |   assignment
    |   print
    ;

assignment: VAR ':' expr;

print: 'print' expr;

expr:
        STRING                                      #exprString
    |   VAR                                         #exprVar
    |   'input' '(' STRING ')'                      #exprInput
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