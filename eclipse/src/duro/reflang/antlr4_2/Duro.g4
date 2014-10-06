grammar Duro;

program: (ws expression)* ws;
expression: 
    assignment | 
    variableDeclaration | 
    selfMultiArgMessageNoPar |
    interfaceId |
    messageExchange;
assignment: 
    id ws
    (
        (op=(ASSIGN | ASSIGN_PROTO) ws expression)
        |
        op=ASSIGN_QUOTED ws behaviorParams ws expression
    );
interfaceId: DOLLAR ws id() ws expression;

messageExchange: receiver ws messageChain?;
messageChain:
    (DOT ws multiArgMessageWithPar | indexAccess) (ws messageChain)? |
    DOT ws multiArgMessageNoPar |
    slotAccess messageChain? |
    slotAssignment | 
    indexAssignment |
    binaryMessage (ws binaryMessage)*
    ;
                
receiver:
    selfMultiArgMessageWithPar | access | grouping | literal | parArg;
selfMultiArgMessageNoPar: multiArgMessageNoPar;
selfMultiArgMessageWithPar: multiArgMessageWithPar;

variableDeclaration: VAR ws id (ws ASSIGN ws expression)?;
access: id;
accessUnCap: ID_UNCAP;
grouping: PAR_OP ws (expression ws)+ PAR_CL;

// Difference between root msg and chained msg
// root: must have () to indicate argless-ness
multiArgMessageNoPar:
    // New line between id and args fails test?
    ID_UNCAP multiArgMessageArgsNoPar ws (ID_CAP multiArgMessageArgsNoPar)*;
multiArgMessageArgsNoPar:
    (multiArgMessageArgNoPar (ws COMMA ws multiArgMessageArgNoPar)*)?;
multiArgMessageArgNoPar: 
    singleArgMessageNoPar |
    multiArgMessageArgNoParReceiver ws multiArgMessageArgNoParChain?;
multiArgMessageArgNoParReceiver: 
    accessUnCap | grouping | literal | parArg;
multiArgMessageArgNoParChain:
    (DOT ws singleArgMessageNoPar | slotAccess | indexAccess) (ws multiArgMessageArgNoParChain)? |
    slotAssignment | 
    indexAssignment |
    binaryMessage+
    ;

singleArgMessageNoPar: ID_UNCAP multiArgMessageArgNoPar?;

multiArgMessageWithPar: 
    ID_UNCAP ws multiArgMessageArgsWithPar (ID_CAP ws multiArgMessageArgsWithPar)*;
multiArgMessageArgsWithPar: PAR_OP ws (multiArgMessageArgsWithParArg (ws COMMA ws multiArgMessageArgsWithParArg)*)? ws PAR_CL;
multiArgMessageArgsWithParArg: 
    assignment | 
    variableDeclaration |
    interfaceId |
    messageExchange;

slotAccess: AT ws selector;
indexAccess: SQ_OP ws expression ws SQ_CL;
binaryMessage: BIN_OP ws binaryMessageOperand;
binaryMessageOperand: receiver (ws binaryMessageOperandChain)?;
binaryMessageOperandChain:
    (DOT ws multiArgMessageWithPar | slotAccess | indexAccess) (ws binaryMessageOperandChain)? |
    slotAssignment | 
    indexAssignment
    ;
indexAssignment: SQ_OP ws expression ws SQ_CL ws ASSIGN ws expression;
slotAssignment: 
    AT ws selector ws
    (
        (op=(ASSIGN | ASSIGN_PROTO) ws expression)
        |
        op=ASSIGN_QUOTED ws behaviorParams ws expression
    );
literal: integer | string | dict | closure | pseudoVar;
integer: INT;
string: STRING;
dict: HASH ws SQ_OP (ws dictEntry)* ws SQ_CL;
dictEntry: selector ws
    (
        (op=(ASSIGN | ASSIGN_PROTO) ws expression)
        |
        op=ASSIGN_QUOTED ws behaviorParams ws expression
    );
closure: BRA_OP ws behaviorParams (ws expression*) ws BAR_CL;
behaviorParams: (PIPE (ws id)+ ws PIPE)?;
pseudoVar: PSEUDO_VAR;
parArg: COLON ws id;
id: ID_CAP | ID_UNCAP;
selector: id | binaryOperator | indexOperator;
binaryOperator: BIN_OP;
indexOperator: SQ_OP ws SQ_CL;
ws: WS_NL*;

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
AT: '@';
DOT: '.';
COMMA: ',';
COLON: ':';
DOLLAR: '$';

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

//WS_NOT_NL: [ \t\u000C];
//WS: [ \t\u000C\r\n];

//WS: [ \t\u000C\r\n]+ -> skip;
WS_NL: '\r\n';
WS_NOT_NL: [ \t\u000C]+ -> skip;
//SINGLELINE_COMMENT: '//' ~('\r' | '\n')*;
//MULTI_LINE_COMMENT: '/*' .*? '*/';
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;

STRING: '"' (EscapeSequence | ~[\\"])* '"';
fragment HexDigit: [0-9a-fA-F];
fragment EscapeSequence: '\\' [btnfr"'\\] | UnicodeEscape | OctalEscape;
fragment OctalEscape: '\\' [0-3] [0-7] [0-7] | '\\' [0-7] [0-7] | '\\' [0-7];
fragment UnicodeEscape: '\\' 'u' HexDigit HexDigit HexDigit HexDigit;