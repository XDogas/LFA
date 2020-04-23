grammar Ex8;

program :
        (stat ';')* EOF
    ;

stat :
        'print' expr        #StatPrint
    |   assignment          #StatAssign
    ;

assignment :
        expr '->' VAR
    ;

expr :
        fraction                                    #ExprFraction
    |   'reduce' expr                               #ExprReduce
    |   expr op=('*'|':') expr                      #ExprMultDiv
    |   expr op=('+'|'-') expr                      #ExprAddSub
    |   '(' expr ')'                                #ExprParent
    |   '(' expr ')' '^' op=('+'|'-')? Integer      #ExprExponent
    |   VAR                                         #ExprVAR
    ;

fraction: s=('+'|'-')? num=Integer ('/' den=Integer)?;

VAR      : [A-Za-z]+;
Integer : [0-9]+;
WS      : [ \t\n\r] -> skip;
COMMENT : '#' .*? '\n' -> skip;
