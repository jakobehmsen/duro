grammar Duro;

program: programElements;
programElements: ((topExpression | statement) SEMICOLON)*;
topExpression: expression;
expression: variableAssignment | lookup | thisMessageExchange | literal;
variableAssignment: ID EQUALS expression;
lookup: ID;
thisMessageExchange: messageExchange;
messageExchange: ID OPEN_PAR expression (COMMA expression)* CLOSE_PAR;
literal: integer;
integer: INT;
statement: pause | variableStatement;
pause: KW_PAUSE;
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID EQUALS expression;
variableDeclaration: KW_VAR ID;

OPEN_PAR: '(';
CLOSE_PAR: ')';
EQUALS: '=';
INT: DIGIT+;
SEMICOLON: ';';
COMMA: ',';
KW_VAR: 'var';
KW_PAUSE: 'pause';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;