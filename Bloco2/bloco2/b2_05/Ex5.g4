grammar Ex5;

program :
        stat* EOF
    ;

stat :
        expr? NEWLINE               #StatExpr
    |   assignment NEWLINE          #StatAssign
    ;

assignment :
        ID '=' expr
    ;

expr :
        expr op=('*'|'/'|'%') expr  #ExprMultDivMod
    |   expr op=('+'|'-') expr      #ExprAddSub
    |   Integer                     #ExprInteger
    |   '(' expr ')'                #ExprParent
    |   ID                          #ExprID
    ;

ID      : [A-Za-z]+;
Integer : [0-9]+;                   // implement with long integers
NEWLINE : '\r'? '\n';
WS      : [ \t] -> skip;
COMMENT : '#' .*? '\n' -> skip;
