grammar Duro;

program: rootExpression*;
rootExpression: expression; // Always pop
topExpressions: topExpression*; // Pop all except last
topExpression: expression;
expression: 
    variableAssignment | variableDeclaration | returnExpr | messageExchange;
variableAssignment: 
    id
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
messageExchange: atom message* (indexAssign | slotAssignment)?;
variableDeclaration: VAR id (ASSIGN expression)?;
returnExpr: RETURN expression;
atom: selfMessageExchange | access | grouping | literal | parArg;
selfMessageExchange: multiArgMessage;
access: id;
grouping: PAR_OP topExpressions PAR_CL;
message: nonBinaryMessage | binaryMessage;
nonBinaryMessage: DOT multiArgMessage | slotAccess | indexAccess;
multiArgMessage: ID_UNCAP multiArgMessageArgs (ID_CAP multiArgMessageArgs)*;
multiArgMessageArgs:
    multiArgMessageArg (COMMA multiArgMessageArg)*;
multiArgMessageArg: PAR_OP (expression (COMMA expression)*)? PAR_CL | literal;
slotAccess: DOT selector;
indexAccess: SQ_OP expression SQ_CL;
binaryMessage: BIN_OP binaryMessageOperand;
binaryMessageOperand: atom nonBinaryMessage* indexAssign?;
indexAssign: SQ_OP expression SQ_CL ASSIGN expression;
slotAssignment: 
    DOT id
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
literal: integer | dict | closure | pseudoVar;
integer: INT;
dict: HASH SQ_OP dictEntry* SQ_CL;
dictEntry: selector
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
closure: BRA_OP behaviorParams topExpressions BAR_CL;
behaviorParams: (PIPE id+ PIPE)?;
pseudoVar: PSEUDO_VAR;
parArg: COLON id;
id: ID_CAP | ID_UNCAP;
selector: id | binaryOperator | indexOperator;
binaryOperator: BIN_OP;
indexOperator: SQ_OP SQ_CL;

RETURN: 'return';
VAR: 'var';
PSEUDO_VAR: 'this' | 'null' | 'true' | 'false' | 'frame';
INT: DIGIT+;

fragment DIGIT: ('0'..'9');
fragment LETTER_LOWER: [a-z];
fragment LETTER_UPPER: [A-Z];
fragment LETTER: (LETTER_LOWER|LETTER_UPPER);
ID_CAP: LETTER_UPPER (LETTER | DIGIT | '_')*;
ID_UNCAP: LETTER_LOWER (LETTER | DIGIT | '_')*;

PARAGRAPH: '§';
PIPE: '|';
HASH: '#';
DOT: '.';
COMMA: ',';
COLON: ':';

PAR_OP: '(';
PAR_CL: ')';
SQ_OP: '[';
SQ_CL: ']';
BRA_OP: '{';
BAR_CL: '}';

BIN_OP: '+'|'-'|'*'|'/'|'%'|'=='|'>'|'>='|'<'|'<=';

ASSIGN: '=';
ASSIGN_PROTO: '^=';
ASSIGN_QUOTED: '=>';

WS: [ \t\u000C\r\n]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;