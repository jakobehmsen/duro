grammar Duro;

program: expression*;
expression: 
    (
        assignment | 
        variableDeclaration | 
        selfMultiArgMessageNoPar |
        interfaceId |
        messageExchange
    )
    expressionChain*
    expressionEnd?
    ;
assignment: 
    id
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
interfaceId: DOLLAR id() expression;

messageExchange: receiver messageChain* messageEnd?;
messageChain: DOT unaryMessage | indexAccess | slotAccess
    /*(DOT unaryMessage | indexAccess | slotAccess) messageChain? |
    DOT multiArgMessageNoPar |
    slotAssignment | 
    indexAssignment |
    binaryMessage+*/
    ;
messageEnd: 
    DOT multiArgMessageNoPar | slotAssignment | 
    indexAssignment | binaryMessage+;

expressionChain: 
    SEMI_COLON (unaryMessage | indexAccess | slotAccess)
    /*(
        (unaryMessage | indexAccess | slotAccess) messageChain? |
        multiArgMessageNoPar |
        slotAssignment | 
        indexAssignment |
        binaryMessage+
    )*/
    ;

expressionEnd: 
    SEMI_COLON
    (
        multiArgMessageNoPar | slotAssignment | indexAssignment | binaryMessage+
    );
                
receiver: atom;
selfMultiArgMessageNoPar: multiArgMessageNoPar;

variableDeclaration: VAR id (ASSIGN expression)?;
access: id;
grouping: PAR_OP (expression)+ PAR_CL;

multiArgMessageNoPar: multiArgMessageNoParHead multiArgMessageNoParTail*;
multiArgMessageNoParHead: 
    ID_UNCAP modifier=(COLON|SINGLE_QUOTE) multiArgMessageArgsNoPar;
multiArgMessageNoParTail:
    ID_CAP modifier=(COLON|SINGLE_QUOTE) multiArgMessageArgsNoPar;
multiArgMessageArgsNoPar:
    (multiArgMessageArgNoPar (COMMA multiArgMessageArgNoPar)*)?;
multiArgMessageArgNoPar: 
    selfSingleArgMessageNoPar |
    (
        multiArgMessageArgNoParReceiver 
        multiArgMessageArgNoParChain*
        multiArgMessageArgNoParEnd?
    );
multiArgMessageArgNoParReceiver: atom;
multiArgMessageArgNoParChain: DOT unaryMessage | slotAccess | indexAccess
    /*(DOT unaryMessage | slotAccess | indexAccess) multiArgMessageArgNoParChain? |
    DOT singleArgMessageNoPar |
    slotAssignment | 
    indexAssignment |
    binaryMessage+*/
    ;
multiArgMessageArgNoParEnd:
    DOT singleArgMessageNoPar | slotAssignment | 
    indexAssignment | binaryMessage+
    ;
atom: access | grouping | literal | pseudoVar | parArg;

selfSingleArgMessageNoPar: singleArgMessageNoPar;
singleArgMessageNoPar: 
    ID_UNCAP modifier=(COLON|SINGLE_QUOTE) multiArgMessageArgNoPar;

unaryMessage: ID_UNCAP;

slotAccess: AT selector;
indexAccess: SQ_OP expression SQ_CL;
binaryMessage: BIN_OP binaryMessageOperand;
binaryMessageOperand: 
    receiver binaryMessageOperandChain* binaryMessageOperandEnd?;
binaryMessageOperandChain:
    DOT unaryMessage | slotAccess | indexAccess
    /*(slotAccess | indexAccess) binaryMessageOperandChain? |
    slotAssignment | 
    indexAssignment*/
    ;
binaryMessageOperandEnd: slotAssignment | indexAssignment;
indexAssignment: SQ_OP expression SQ_CL ASSIGN expression;
slotAssignment: 
    AT selector
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
literal: integer | string | dict | closure | array;
integer: INT;
string: STRING;
dict: HASH SQ_OP (dictEntry)* SQ_CL;
dictEntry: selector
    (
        (op=(ASSIGN | ASSIGN_PROTO) expression)
        |
        op=ASSIGN_QUOTED behaviorParams expression
    );
closure: BRA_OP behaviorParams (expression*) BAR_CL;
behaviorParams: (PIPE (id)+ PIPE)?;
array: HASH PAR_OP expression* PAR_CL;
pseudoVar: PSEUDO_VAR;
parArg: BACK_SLASH id;
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

PARAGRAPH: '§';
PIPE: '|';
HASH: '#';
AT: '@';
DOT: '.';
SINGLE_QUOTE: '\'';
COMMA: ',';
COLON: ':';
SEMI_COLON: ';';
BACK_SLASH: '\\';
DOLLAR: '$';

PAR_OP: '(';
PAR_CL: ')';
SQ_OP: '[';
SQ_CL: ']';
BRA_OP: '{';
BAR_CL: '}';

BIN_OP: '+'|'-'|'*'|'/'|'%'|'=='|'!='|'>'|'>='|'<'|'<=';

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