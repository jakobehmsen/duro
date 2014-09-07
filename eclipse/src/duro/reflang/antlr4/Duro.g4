grammar Duro;

program: programElements;
programElements: (((topExpression | delimitedStatement) SEMICOLON | undelimitedStatement))*;
topExpression: expression;
expression: binaryExpressionCandidate;
binaryExpressionCandidate: binaryExpression | binaryExpressionOperand;
binaryExpression: lhs=binaryExpressionOperand BIN_OP rhs=expression;
binaryExpressionOperand: variableAssignment | lookup | thisMessageExchange | literal;
variableAssignment: ID EQUALS expression;
lookup: ID;
thisMessageExchange: messageExchange;
messageExchange: ID OPEN_PAR expression (COMMA expression)* CLOSE_PAR;
literal: integer;
integer: INT;
delimitedStatement: returnStatement | pause | variableStatement | returnStatement;
undelimitedStatement: functionDefinition | primitiveBody;
pause: KW_PAUSE;
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID EQUALS expression;
variableDeclaration: KW_VAR ID;
functionDefinition: KW_FUNCTION ID OPEN_PAR functionParameters CLOSE_PAR OPEN_BRA functionBody CLOSE_BRA;
functionParameters: (ID (COMMA ID)*)?;
functionBody: programElements;
primitiveBody: HASH OPEN_BRA primitiveCall* CLOSE_BRA;
primitiveCall: ID primitiveOperand*;
primitiveOperand: (COLON literal);
returnStatement: KW_RETURN expression?;

BIN_OP: '+'|'-'|'*'|'/';
HASH: '#';
OPEN_BRA: '{';
CLOSE_BRA: '}';
OPEN_PAR: '(';
CLOSE_PAR: ')';
EQUALS: '=';
INT: DIGIT+;
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
KW_VAR: 'var';
KW_PAUSE: 'pause';
KW_FUNCTION: 'function';
KW_RETURN: 'return';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;