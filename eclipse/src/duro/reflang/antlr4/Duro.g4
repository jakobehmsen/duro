grammar Duro;

program: programElements;
programElements: programElementsPart*;
programElementsPart: 
    //delimitedProgramElement SEMICOLON | undelimitedStatement;
    //delimitedProgramElement (SEMICOLON delimitedProgramElement?)* | undelimitedStatement;
    (delimitedProgramElement SEMICOLON?)+ | undelimitedStatement;
programElement: delimitedProgramElement SEMICOLON? | undelimitedStatement;
delimitedProgramElement: (topExpression | delimitedStatement);
topExpression: expression;
expression: variableAssignment | functionDefinition | conditionalExpression;

/*
binaryExpression: 
    expression op=(GREATER_THAN | GREATER_THAN_OR_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS) expression
    | expression EQUALS expression
    ;
*/

conditionalExpression: 
    conditionalExpressionCondition QUESTION_MARK conditionalExpressionTrue
    COLON conditionalExpressionFalse
    |
    binaryExpressionLogicalOr;
conditionalExpressionCondition: binaryExpressionLogicalOr;
conditionalExpressionTrue: binaryExpressionLogicalOr;
conditionalExpressionFalse: binaryExpressionLogicalOr;

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
        | unaryExpressionPostIncDecApplicationIndexAccess
    ) 
    op=(DOUBLE_PLUS | DOUBLE_MINUS);
unaryExpressionPostIncDecApplicationVariable: ID;
unaryExpressionPostIncDecApplicationMemberAccess:
    unaryExpressionPostIncDecOperand DOT ID;
unaryExpressionPostIncDecApplicationIndexAccess:
    unaryExpressionPostIncDecApplicationIndexAccessReceiver 
    OPEN_SQ expression CLOSE_SQ;
unaryExpressionPostIncDecApplicationIndexAccessReceiver:
    unaryExpressionPostIncDecOperand;

unaryExpressionPostIncDecOperand: 
    (
        grouping | thisMessageExchange | lookup | argumentParameter | 
        literal | self | nil | frame | primitive
    )
    operationChain* operationEnd?;

grouping: OPEN_PAR expression CLOSE_PAR;
// TODO: Multiple assignments should be possible
variableAssignment: 
    ID (COMMA ID)*
    op=(
        ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | ASSIGN_DIV | ASSIGN_REM | ASSIGN
    )
    expression;
lookup: ID;
argumentParameter: COLON ID;
thisMessageExchange: messageExchange;
messageExchange: messageId OPEN_PAR (expression (COMMA expression)*)? CLOSE_PAR;
messageId: (ID | operator);
operator:
    EQUALS | 
    NOT_EQUALS |
    LESS_THAN |
    LESS_THAN_OR_EQUALS |
    GREATER_THAN |
    GREATER_THAN_OR_EQUALS |
    BIN_OP1 |
    BIN_OP2
;
literal: 
    integer | bool | string | dictProcess | 
    functionLiteral | closureLiteral | array;
integer: INT;
bool: KW_TRUE | KW_FALSE;
string: STRING_LITERAL;
dictProcess: OPEN_BRA (dictProcessEntry (COMMA dictProcessEntry)*)? CLOSE_BRA;
dictProcessEntry: messageId COLON expression;
functionLiteral: 
    KW_FUNCTION OPEN_PAR functionParameters CLOSE_PAR 
    OPEN_BRA functionBody CLOSE_BRA;
closureLiteral: 
    //KW_CLOSURE OPEN_PAR functionParameters CLOSE_PAR 
    //OPEN_BRA closureBody CLOSE_BRA;
    OPEN_BRA closureParameters closureBody CLOSE_BRA;
closureParameters: (SINGLE_PIPE (ID (COMMA ID)*)? SINGLE_PIPE)?;
closureBody: programElements;
array: OPEN_SQ (arrayOperand (COMMA arrayOperand)*)? CLOSE_SQ;
arrayOperand: expression;
self: KW_THIS;
nil: KW_NULL;
frame: KW_FRAME;
primitive: 
    PARAGRAPH ID primitiveOperand2* 
    OPEN_PAR (primitiveArgument (COMMA primitiveArgument)*)? CLOSE_PAR;
primitiveArgument: expression;
primitiveOperand2: (literal | ID);
operationChain: explicitMessageExchange | memberAccess | indexAccess;
explicitMessageExchange: DOT messageExchange;
memberAccess: DOT messageId;
indexAccess: OPEN_SQ expression CLOSE_SQ;

// TODO: Multiple assignments and declarations should be possible and should be
// possible to mix and match
operationEnd: memberAssignment | indexAssignment;
memberAssignment: 
    DOT messageId 
    op=(
        ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | 
        ASSIGN_DIV | ASSIGN_REM | PROTO_ASSIGN | ASSIGN
    ) 
    memberAssignmentValue;
memberAssignmentValue: expression;
indexAssignment: 
    OPEN_SQ indexAssignmentKey CLOSE_SQ 
    op=(
        ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | 
        ASSIGN_DIV | ASSIGN_REM | PROTO_ASSIGN | ASSIGN
    )
    indexAssignmentValue;
indexAssignmentKey: expression;
indexAssignmentValue: expression;

delimitedStatement: 
    pause | variableStatement | returnStatement | 
    breakStatement | yieldStatement;
pause: KW_PAUSE;
// TODO: Multiple assignments and declarations should be possible and should be
// possible to mix and match
variableStatement: variableDeclarationAndAssignment | variableDeclaration;
variableDeclarationAndAssignment: KW_VAR ID (COMMA ID)* ASSIGN expression;
variableDeclaration: KW_VAR ID;
returnStatement: KW_RETURN (expression (COMMA expression)*)?;
breakStatement: KW_BREAK;
yieldStatement: 
    KW_YIELD yieldStatementExpression (COMMA yieldStatementExpression)*;
yieldStatementExpression: expression;
undelimitedStatement: 
    /*functionDefinition | */ifStatement | whileStatement |
    forStatement | forInStatement | interfaceId;
functionDefinition: 
    KW_FUNCTION messageId OPEN_PAR functionParameters CLOSE_PAR 
    OPEN_BRA functionBody CLOSE_BRA;
functionParameters: (ID (COMMA ID)*)?;
functionBody: programElements;
/*primitiveBody: HASH OPEN_BRA primitiveBodyPart* CLOSE_BRA;
primitiveBodyPart: primitiveCall | primitiveLabel;
primitiveCall: ID primitiveOperand* SEMICOLON;
primitiveOperand: (literal | ID);
primitiveLabel: ID COLON;*/
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
    forStatementBody
    ;
forStatementInitialization: delimitedProgramElement?;
forStatementCondition: expression?;
forStatementUpdate: delimitedProgramElement?;
forStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;

forInStatement: 
    KW_FOR OPEN_PAR forInStatementVar (COMMA forInStatementVar)* 
    KW_IN expression CLOSE_PAR forInStatementBody;
forInStatementVar: KW_VAR? ID;
forInStatementBody: OPEN_BRA programElements CLOSE_BRA | programElement;
interfaceId: DOLLAR ID interfaceIdBody;
interfaceIdBody: OPEN_BRA programElements CLOSE_BRA | programElement;

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

PARAGRAPH: '§';
DOUBLE_AMP: '&&';
DOUBLE_PIPE: '||';
NOT: '!';
DOUBLE_PLUS: '++';
DOUBLE_MINUS: '--';
SINGLE_PIPE: '|';
HASH: '#';
DOLLAR: '$';
OPEN_SQ: '[';
CLOSE_SQ: ']';
OPEN_BRA: '{';
CLOSE_BRA: '}';
OPEN_PAR: '(';
CLOSE_PAR: ')';
ASSIGN: '=';
PROTO_ASSIGN: '^=';
ASSIGN_ADD: '+=';
ASSIGN_SUB: '-=';
ASSIGN_MULT: '*=';
ASSIGN_DIV: '/=';
ASSIGN_REM: '%=';

EQUALS: '==';
NOT_EQUALS: '!=';
LESS_THAN: '<';
LESS_THAN_OR_EQUALS: '<=';
GREATER_THAN: '>';
GREATER_THAN_OR_EQUALS: '>=';
BIN_OP1: '+'|'-';
BIN_OP2: '*'|'/'|'%';

INT: DIGIT+;
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
QUESTION_MARK: '?';
DOT: '.';
KW_VAR: 'var';
KW_PAUSE: 'pause';
KW_FUNCTION: 'function';
KW_RETURN: 'return';
KW_BREAK: 'break';
KW_YIELD: 'yield';
KW_TRUE: 'true';
KW_FALSE: 'false';
KW_IF: 'if';
KW_ELSE: 'else';
KW_THIS: 'this';
KW_NULL: 'null';
KW_FRAME: 'frame';
KW_WHILE: 'while';
KW_FOR: 'for';
KW_IN: 'in';
fragment DIGIT: ('0'..'9');
fragment LETTER: ([a-z]|[A-Z]);
ID : LETTER (LETTER | DIGIT | '_')*;

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;