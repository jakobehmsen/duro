grammar Duro;

program: programElements;
programElements: programElement*;
programElement: 
    delimitedProgramElement SEMICOLON | undelimitedStatement;
delimitedProgramElement: topExpression | delimitedStatement;
topExpression: expression;
expression: variableAssignment | binaryExpressionLogicalOr;

/*
binaryExpression: 
    expression op=(GREATER_THAN | GREATER_THAN_OR_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS) expression
    | expression EQUALS expression
    ;
*/

binaryExpressionLogicalOr: 
    binaryExpressionLogicalAnd binaryExpressionLogicalOrApplication*;
binaryExpressionLogicalOrApplication: DOUBLE_PIPE binaryExpressionLogicalAnd;

binaryExpressionLogicalAnd: 
    binaryExpressionEquality binaryExpressionLogicalAndApplication*;
binaryExpressionLogicalAndApplication: 
    DOUBLE_AMP binaryExpressionEquality;

binaryExpressionEquality:
    binaryExpressionGreaterLess binaryExpressionEqualityApplication*;
binaryExpressionEqualityApplication:  
    op=(EQUALS | NOT_EQUALS) binaryExpressionGreaterLess;

binaryExpressionGreaterLess:
    binaryExpressionArithmetic1 binaryExpressionGreaterLessApplication*;
binaryExpressionGreaterLessApplication: 
    op=(GREATER_THAN | GREATER_THAN_OR_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS) 
    binaryExpressionArithmetic1;

binaryExpressionArithmetic1: 
    binaryExpressionArithmetic2 binaryExpressionArithmetic1Application*;
binaryExpressionArithmetic1Application: BIN_OP1 binaryExpressionArithmetic2;

binaryExpressionArithmetic2: 
    unaryExpressionNot binaryExpressionArithmetic2Application*;
binaryExpressionArithmetic2Application: 
    BIN_OP2 unaryExpressionNot;

unaryExpressionNot: 
    unaryExpressionNotApplication | unaryExpressionPostIncDec;
unaryExpressionNotApplication: NOT unaryExpressionPostIncDec;

unaryExpressionPostIncDec: 
    unaryExpressionPostIncDecApplication | unaryExpressionPostIncDecOperand;
unaryExpressionPostIncDecApplication: 
    (
        unaryExpressionPostIncDecApplicationVariable 
        | unaryExpressionPostIncDecApplicationMemberAccess
        | unaryExpressionPostIncDecApplicationComputedMemberAccess
    ) 
    op=(DOUBLE_PLUS | DOUBLE_MINUS);
unaryExpressionPostIncDecApplicationVariable: ID;
unaryExpressionPostIncDecApplicationMemberAccess:
    unaryExpressionPostIncDecOperand DOT ID;
unaryExpressionPostIncDecApplicationComputedMemberAccess:
    unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver 
    OPEN_SQ expression CLOSE_SQ;
unaryExpressionPostIncDecApplicationComputedMemberAccessReceiver:
    unaryExpressionPostIncDecOperand;

unaryExpressionPostIncDecOperand: 
    (grouping | lookup | thisMessageExchange | literal | self | nil)
    operationChain* operationEnd?;

grouping: OPEN_PAR expression CLOSE_PAR;
// TODO: Multiple assignments should be possible
variableAssignment: 
    ID 
    op=(ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | ASSIGN_DIV | ASSIGN)
    expression;
lookup: ID;
thisMessageExchange: messageExchange;
messageExchange: ID OPEN_PAR (expression (COMMA expression)*)? CLOSE_PAR;
literal: integer | bool | string | dictProcess | functionLiteral | array;
integer: INT;
bool: KW_TRUE | KW_FALSE;
string: STRING_LITERAL;
dictProcess: OPEN_BRA (dictProcessEntry (COMMA dictProcessEntry)*)? CLOSE_BRA;
dictProcessEntry: ID COLON expression;
functionLiteral: 
    KW_FUNCTION OPEN_PAR functionParameters CLOSE_PAR 
    OPEN_BRA functionBody CLOSE_BRA;
array: OPEN_SQ (arrayOperand (COMMA arrayOperand)*)? CLOSE_SQ;
arrayOperand: expression;
self: KW_THIS;
nil: KW_NULL;
operationChain: explicitMessageExchange | memberAccess | computedMemberAccess;
explicitMessageExchange: DOT messageExchange;
memberAccess: DOT ID;
computedMemberAccess: OPEN_SQ expression CLOSE_SQ;

// TODO: Multiple assignments and declarations should be possible and should be
// possible to mix and match
operationEnd: memberAssignment | computedMemberAssignment;
memberAssignment: 
    DOT ID 
    op=(ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | ASSIGN_DIV | ASSIGN) 
    memberAssignmentValue;
memberAssignmentValue: expression;
computedMemberAssignment: 
    OPEN_SQ computedMemberAssignmentKey CLOSE_SQ 
    op=(ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | ASSIGN_DIV | ASSIGN)
    computedMemberAssignmentValue;
computedMemberAssignmentKey: expression;
computedMemberAssignmentValue: expression;

delimitedStatement: pause | variableStatement | returnStatement;
pause: KW_PAUSE;
// TODO: Multiple assignments and declarations should be possible and should be
// possible to mix and match
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID (COMMA ID)* ASSIGN expression;
variableDeclaration: KW_VAR ID;
returnStatement: KW_RETURN (expression (COMMA expression)*)?;
undelimitedStatement: 
    functionDefinition | primitiveBody | ifStatement | 
    whileStatement | forStatement | forInStatement;
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
forStatement: 
    KW_FOR OPEN_PAR 
        forStatementInitialization SEMICOLON
        forStatementCondition SEMICOLON
        forStatementUpdate
    CLOSE_PAR 
    OPEN_BRA
        forStatementBody
    CLOSE_BRA
    ;
forStatementInitialization: delimitedProgramElement?;
forStatementCondition: expression?;
forStatementUpdate: delimitedProgramElement?;
forStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;

forInStatement: KW_FOR OPEN_PAR KW_VAR? ID KW_IN expression CLOSE_PAR forInStatementBody;
forInStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;

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
DOUBLE_PLUS: '++';
DOUBLE_MINUS: '--';
BIN_OP1: '+'|'-';
BIN_OP2: '*'|'/';
HASH: '#';
OPEN_SQ: '[';
CLOSE_SQ: ']';
OPEN_BRA: '{';
CLOSE_BRA: '}';
OPEN_PAR: '(';
CLOSE_PAR: ')';
ASSIGN_ADD: '+=';
ASSIGN_SUB: '-=';
ASSIGN_MULT: '*=';
ASSIGN_DIV: '/=';
EQUALS: '==';
NOT_EQUALS: '!=';
ASSIGN: '=';
NOT: '!';

LESS_THAN: '<';
LESS_THAN_OR_EQUALS: '<=';
GREATER_THAN: '>';
GREATER_THAN_OR_EQUALS: '>=';

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
KW_NULL: 'null';
KW_WHILE: 'while';
KW_FOR: 'for';
KW_IN: 'in';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;