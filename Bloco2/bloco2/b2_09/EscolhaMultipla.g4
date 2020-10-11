grammar EscolhaMultipla;

stat: question* EOF;

question: ID '(' STRING ')' '{' answer+ '}';

answer: STRING ':' SCORE ';';

ID: [a-zA-Z0-9._]+;
STRING: '"' ( '\\"' | . )*? '"';
SCORE: [0-9]+;

WS: [ \t\n\r] -> skip;
COMMENT: '#' .*? '\n' -> skip;
