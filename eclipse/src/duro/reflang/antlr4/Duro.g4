grammar Duro;

program: programElements;
programElements: programElement*;
programElement: 
    (topExpression | delimitedStatement) SEMICOLON | undelimitedStatement;
topExpression: expression;
expression: variableAssignment | binaryExpressionLogicalOr;

binaryExpressionLogicalOr: 
    binaryExpressionLogicalAnd binaryExpressionLogicalOrApplication*;
binaryExpressionLogicalOrApplication: DOUBLE_PIPE binaryExpressionLogicalAnd;

binaryExpressionLogicalAnd: 
    binaryExpressionEquality binaryExpressionLogicalAndApplication*;
binaryExpressionLogicalAndApplication: 
    DOUBLE_AMP binaryExpressionEquality;

binaryExpressionEquality:
    binaryExpressionArithmetic1 binaryExpressionEqualityApplication*;
binaryExpressionEqualityApplication: 
    DOUBLE_EQUALS binaryExpressionArithmetic1;

binaryExpressionArithmetic1: 
    binaryExpressionArithmetic2 binaryExpressionArithmetic1Application*;
binaryExpressionArithmetic1Application: BIN_OP1 binaryExpressionArithmetic2;

binaryExpressionArithmetic2: 
    binaryExpressionArithmetic2Operand binaryExpressionArithmetic2Application*;
binaryExpressionArithmetic2Application: 
    BIN_OP2 binaryExpressionArithmetic2Operand;

binaryExpressionArithmetic2Operand: 
    (lookup | thisMessageExchange | literal | self) 
    operationChain* operationEnd?;

variableAssignment: ID EQUALS expression;
lookup: ID;
thisMessageExchange: messageExchange;
messageExchange: ID OPEN_PAR (expression (COMMA expression)*)? CLOSE_PAR;
literal: integer | bool | string | dictProcess | functionLiteral;
integer: INT;
bool: KW_TRUE | KW_FALSE;
string: STRING_LITERAL;
dictProcess: OPEN_BRA (dictProcessEntry (COMMA dictProcessEntry)*)? CLOSE_BRA;
dictProcessEntry: ID COLON expression;
functionLiteral: 
    KW_FUNCTION OPEN_PAR functionParameters CLOSE_PAR 
    OPEN_BRA functionBody CLOSE_BRA;
self: KW_THIS;
operationChain: memberAccess | computedMemberAccess | explicitMessageExchange;
memberAccess: DOT ID;
computedMemberAccess: OPEN_SQ expression CLOSE_SQ;
explicitMessageExchange: DOT messageExchange;

operationEnd: memberAssignment | computedMemberAssignment;
memberAssignment: DOT ID EQUALS expression;
computedMemberAssignment: OPEN_SQ expression CLOSE_SQ EQUALS expression;

delimitedStatement: pause | variableStatement | returnStatement;
pause: KW_PAUSE;
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID EQUALS expression;
variableDeclaration: KW_VAR ID;
returnStatement: KW_RETURN expression?;
undelimitedStatement: 
    functionDefinition | primitiveBody | ifStatement | 
    whileStatement | forStatement;
functionDefinition: 
    KW_FUNCTION ID OPEN_PAR functionParameters CLOSE_PAR 
    OPEN_BRA functionBody CLOSE_BRA;
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
whileStatement: 
    KW_WHILE OPEN_PAR whileStatementCondition CLOSE_PAR whileStatementBody;
whileStatementCondition: expression;
whileStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;
forStatement: KW_FOR OPEN_PAR KW_VAR? ID KW_IN expression CLOSE_PAR forStatementBody;
forStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;

// STRING_LITERAL deprived and adjusted from:
// https://github.com/antlr/grammars-v4/blob/master/ecmascript/ECMAScript.g4
STRING_LITERAL
 : '"' DOUBLE_STRING_CHARACTER* '"'
 | '\'' SINGLE_STRING_CHARACTER* '\''
 ;

fragment DOUBLE_STRING_CHARACTER
 : ~["\\\r\n]
 | '\\' ESCAPE_SEQUENCE
 | LINE_CONTINUATION
 ;

fragment SINGLE_STRING_CHARACTER
 : ~['\\\r\n]
 | '\\' ESCAPE_SEQUENCE
 | LINE_CONTINUATION
 ;

fragment ESCAPE_SEQUENCE
 : CHARACTER_ESCAPE_SEQUENCE
 | '0' // no digit ahead! TODO
 | HEX_ESCAPE_SEQUENCE
 | UNICODE_ESCAPE_SEQUENCE
 ;

fragment CHARACTER_ESCAPE_SEQUENCE
 : SINGLE_ESCAPE_CHARACTER
 | NON_ESCAPE_CHARACTER
 ;

fragment HEX_ESCAPE_SEQUENCE: 'x' HEX_DIGIT HEX_DIGIT;
fragment UNICODE_ESCAPE_SEQUENCE: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
fragment SINGLE_ESCAPE_CHARACTER: ['"\\bfnrtv];
fragment NON_ESCAPE_CHARACTER: ~['"\\bfnrtv0-9xu\r\n];

fragment ESCAPE_CHARACTER
 : SINGLE_ESCAPE_CHARACTER
 | DIGIT
 | [xu]
 ;

fragment LINE_CONTINUATION: '\\' LINE_TERMINATOR_SEQUENCE;
fragment LINE_TERMINATOR_SEQUENCE: '\r\n' | LINE_TERMINATOR;
fragment HEX_DIGIT: [0-9a-fA-F];
LINE_TERMINATOR: [\r\n\u2028\u2029] -> channel(HIDDEN);

DOUBLE_AMP: '&&';
DOUBLE_PIPE: '||';
BIN_OP1: '+'|'-';
BIN_OP2: '*'|'/';
HASH: '#';
OPEN_SQ: '[';
CLOSE_SQ: ']';
OPEN_BRA: '{';
CLOSE_BRA: '}';
OPEN_PAR: '(';
CLOSE_PAR: ')';
EQUALS: '=';
DOUBLE_EQUALS: '==';
INT: DIGIT+;
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
KW_VAR: 'var';
KW_PAUSE: 'pause';
KW_FUNCTION: 'function';
KW_RETURN: 'return';
KW_TRUE: 'true';
KW_FALSE: 'false';
KW_IF: 'if';
KW_ELSE: 'else';
KW_THIS: 'this';
KW_WHILE: 'while';
KW_FOR: 'for';
KW_IN: 'in';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;