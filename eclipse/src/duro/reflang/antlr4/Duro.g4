grammar Duro;

program: expressions;
expressions: ((expression | statement) SEMICOLON)*;
expression: assignment | literal;
assignment: KW_VAR ID EQUALS expression;
literal: integer;
integer: INT;
statement: pause;
pause: KW_PAUSE;

EQUALS: '=';
INT: DIGIT+;
SEMICOLON: ';';
KW_VAR: 'var';
KW_PAUSE: 'pause';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;