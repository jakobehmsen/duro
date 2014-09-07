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
literal: integer | bool;
bool: KW_TRUE | KW_FALSE;
integer: INT;
delimitedStatement: pause | variableStatement | returnStatement;
pause: KW_PAUSE;
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID EQUALS expression;
variableDeclaration: KW_VAR ID;
returnStatement: KW_RETURN expression?;
undelimitedStatement: functionDefinition | primitiveBody | ifStatement;
functionDefinition: KW_FUNCTION ID OPEN_PAR functionParameters CLOSE_PAR OPEN_BRA functionBody CLOSE_BRA;
functionParameters: (ID (COMMA ID)*)?;
functionBody: programElements;
primitiveBody: HASH OPEN_BRA primitiveCall* CLOSE_BRA;
primitiveCall: ID primitiveOperand*;
primitiveOperand: (COLON literal);
ifStatement: 
    KW_IF OPEN_PAR ifStatementCondition CLOSE_PAR ifStatementOnTrue
    elseStatement;
ifStatementCondition: expression;
ifStatementOnTrue: OPEN_BRA programElements CLOSE_BRA;
elseStatement: (KW_ELSE ifStatementOnFalse)?;
ifStatementOnFalse: (OPEN_BRA programElements CLOSE_BRA) | ifStatement;

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
KW_TRUE: 'true';
KW_FALSE: 'false';
KW_IF: 'if';
KW_ELSE: 'else';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;