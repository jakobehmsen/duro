grammar Duro;

program: expression*;
expression: 
    assignment | 
    variableDeclaration | 
    multiArgMessageNoPar |
    messageExchange;
assignment: 
    id
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );

messageExchange: receiver messageChain?;
messageChain:
    DOT multiArgMessageNoPar |
    (DOT multiArgMessageWithPar | slotAccess | indexAccess) messageChain? |
    slotAssignment | 
    indexAssign |
    binaryMessage+
    ;
                
receiver:
    multiArgMessageWithPar | access | grouping | literal | parArg;

variableDeclaration: VAR id (ASSIGN expression)?;
access: id;
grouping: PAR_OP expression+ PAR_CL;

multiArgMessageNoPar: 
    ID_UNCAP multiArgMessageArgsNoPar (ID_CAP multiArgMessageArgsNoPar)*;
multiArgMessageArgsNoPar:
    multiArgMessageArgNoPar (COMMA multiArgMessageArgNoPar)*;
multiArgMessageArgNoPar: receiver multiArgMessageArgNoParChain?;
multiArgMessageArgNoParChain:
    (DOT multiArgMessageWithPar | slotAccess | indexAccess) multiArgMessageArgNoParChain? |
    slotAssignment | 
    indexAssign |
    binaryMessage+
    ;

multiArgMessageWithPar: 
    ID_UNCAP multiArgMessageArgsWithPar (ID_CAP multiArgMessageArgsWithPar)*;
multiArgMessageArgsWithPar:
    multiArgMessageArgWithPar (COMMA multiArgMessageArgWithPar)*;
multiArgMessageArgWithPar: PAR_OP (expression (COMMA expression)*)? PAR_CL;

slotAccess: DOT selector;
indexAccess: SQ_OP expression SQ_CL;
binaryMessage: BIN_OP binaryMessageOperand;
binaryMessageOperand: receiver binaryMessageOperandChain?;
binaryMessageOperandChain:
    (DOT multiArgMessageWithPar | slotAccess | indexAccess)  binaryMessageOperandChain? |
    slotAssignment | 
    indexAssign
    ;
indexAssign: SQ_OP expression SQ_CL ASSIGN expression;
slotAssignment: 
    DOT id
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
literal: integer | string | dict | closure | pseudoVar;
integer: INT;
string: STRING;
dict: HASH SQ_OP dictEntry* SQ_CL;
dictEntry: selector
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
closure: BRA_OP behaviorParams expression* BAR_CL;
behaviorParams: (PIPE id+ PIPE)?;
pseudoVar: PSEUDO_VAR;
parArg: COLON id;
id: ID_CAP | ID_UNCAP;
selector: id | binaryOperator | indexOperator;
binaryOperator: BIN_OP;
indexOperator: SQ_OP SQ_CL;

VAR: 'var';
PSEUDO_VAR: 'this' | 'null' | 'true' | 'false' | 'frame';
INT: DIGIT+;

fragment DIGIT: ('0'..'9');
fragment LETTER_LOWER: [a-z];
fragment LETTER_UPPER: [A-Z];
fragment LETTER: (LETTER_LOWER|LETTER_UPPER);
ID_CAP: LETTER_UPPER (LETTER | DIGIT | '_')*;
ID_UNCAP: LETTER_LOWER (LETTER | DIGIT | '_')*;

PARAGRAPH: '�';
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

STRING: '"' (EscapeSequence | ~[\\"])* '"';
fragment HexDigit: [0-9a-fA-F];
fragment EscapeSequence: '\\' [btnfr"'\\] | UnicodeEscape | OctalEscape;
fragment OctalEscape: '\\' [0-3] [0-7] [0-7] | '\\' [0-7] [0-7] | '\\' [0-7];
fragment UnicodeEscape: '\\' 'u' HexDigit HexDigit HexDigit HexDigit;