grammar Duro;

program: programElements;
programElements: programElement*;
programElement: (topExpression | delimitedStatement) SEMICOLON | undelimitedStatement;
topExpression: expression;
expression: binaryExpression1;

binaryExpression1: binaryExpression2 binaryExpression1Application*;
binaryExpression1Application: BIN_OP1 binaryExpression2;

binaryExpression2: binaryExpression2Operand binaryExpression2Application*;
binaryExpression2Application: BIN_OP2 binaryExpression2Operand;
binaryExpression2Operand: variableAssignment | lookup | thisMessageExchange | literal;

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
ifStatementOnTrue: OPEN_BRA programElements CLOSE_BRA | programElement;
elseStatement: (KW_ELSE ifStatementOnFalse)?;
ifStatementOnFalse: (OPEN_BRA programElements CLOSE_BRA) | programElement;

BIN_OP1: '+'|'-';
BIN_OP2: '*'|'/';
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