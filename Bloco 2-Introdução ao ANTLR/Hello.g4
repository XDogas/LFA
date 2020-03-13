grammar Hello;

top         : greetings | bye;
greetings   : 'hello' name;
bye         : 'goodbye' name;
name        : ID+;
main        : top* EOF;

ID          : [A-Za-z]+;
WS          : [ \t\r\n]+ -> skip;
