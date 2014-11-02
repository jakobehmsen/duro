/*
Initial "pDuro":

No closures due to a focus on strict non-sharing processes; may be added later, though likely not runtime-wise.
No dicts due to a focus on strict non-sharing processes; can potentially be implemented.
Argument modifier ' indicates something else than closures but something similar to closure; what exactly? (or at least more specifically)

Special forms for mutable built-in types can only be applied when receiver is of this type, i.e. such usage most be associated to the respective prototypical process for such types.
E.g. array, proto array process, and special array forms arrayLength, arrayGet, and arraySet:

// The below is okay:
Array = #(
	// Within this scope, the receiver is always an array
	var env = receive
	
	if' env.message.id == "[]" && env.message.argumentCount == 1, (
		var index = env.message.getArgument: 0
		var item = arrayGet: this, index
		env.reply: item
	)
	
	if' env.message.id == "[]" && env.message.argumentCount == 2, (
		var index = env.message.getArgument: 0
		var item = env.message.getArgument: 1
		arraySet: this, index, item
		env.reply: null
	)
)

var array = #[1 2 3 4 5]
arrayGet: array, 1 // This results in an error because the current receiver isn't an array

Tuples instead of arrays
*/

grammar Duro;

program: expression*;
expression: expressionReceiver expressionChain*;
expressionReceiver:
    assignment | variableDeclaration | selfMultiKeyMessage |
    interfaceId | messageExchange;
assignment: id assignmentOperator expression;
assignmentOperator: op=(ASSIGN | ASSIGN_PROTO | ASSIGN_QUOTED) behaviorParams;
interfaceId: DOLLAR id expression;
messageExchange: receiver messageChain* messageEnd?;
messageChain: DOT unaryMessage | indexAccess | slotAccess;
messageEnd: 
    DOT multiKeyMessage | slotAssignment | indexAssignment | binaryMessageChain;
binaryMessageChain: binaryMessage+;
expressionChain: 
    SEMI_COLON 
    (
        multiKeyMessage | unaryMessage | 
        indexAssignment | indexAccess | 
        slotAssignment | slotAccess |
        binaryMessageChain
    );
receiver: atom;
selfMultiKeyMessage: multiKeyMessage;
variableDeclaration: VAR id (ASSIGN expression)?;
access: id;
grouping: PAR_OP (expression)+ PAR_CL;
multiKeyMessage: multiKeyMessageHead multiKeyMessageTail*;
multiKeyMessageHead: ID_UNCAP multiKeyMessageModifier multiKeyMessageArgs;
multiKeyMessageTail: ID_CAP multiKeyMessageModifier multiKeyMessageArgs;
multiKeyMessageModifier: (modifier=COLON|modifier=SINGLE_QUOTE behaviorParams);
multiKeyMessageArgs: (multiKeyMessageArg (COMMA multiKeyMessageArg)*)?;
multiKeyMessageArg: 
    selfSingleKeyMessage |
    multiKeyMessageArgReceiver multiKeyMessageArgChain* multiKeyMessageArgEnd?;
multiKeyMessageArgReceiver: atom;
multiKeyMessageArgChain: DOT unaryMessage | slotAccess | indexAccess;
multiKeyMessageArgEnd:
    DOT singleKeyMessage | slotAssignment | indexAssignment | binaryMessageChain;
atom: access | grouping | literal | pseudoVar | parArg;
selfSingleKeyMessage: singleKeyMessage;
singleKeyMessage: ID_UNCAP multiKeyMessageModifier multiKeyMessageArg;
unaryMessage: ID_UNCAP;
slotAccess: AT selector;
indexAccess: SQ_OP expression SQ_CL;
binaryMessage: BIN_OP binaryMessageArg;
binaryMessageArg: receiver binaryMessageArgChain* binaryMessageArgEnd?;
binaryMessageArgChain: DOT unaryMessage | slotAccess | indexAccess;
binaryMessageArgEnd: slotAssignment | indexAssignment;
indexAssignment: SQ_OP expression SQ_CL ASSIGN expression;
slotAssignment: AT selector assignmentOperator expression;
literal: integer | string | tuple | spawn;
integer: INT;
string: STRING;
behaviorParams: (PIPE (id)+ PIPE)?;
tuple: HASH SQ_OP expression* SQ_CL;
spawn: HASH explicitPrototype=expression? PAR_OP expression* PAR_CL;
pseudoVar: PSEUDO_VAR;
parArg: BACK_SLASH id;
id: ID_CAP | ID_UNCAP;
selector: id | binaryOperator | indexOperator;
binaryOperator: BIN_OP;
indexOperator: SQ_OP SQ_CL;

VAR: 'var';
PSEUDO_VAR: 'this' | 'null' | 'true' | 'false' | 'frame' /*"here", instead of "frame"?*/;
INT: DIGIT+;
fragment DIGIT: ('0'..'9');
fragment LETTER_LOWER: [a-z];
fragment LETTER_UPPER: [A-Z];
fragment LETTER: (LETTER_LOWER|LETTER_UPPER);
ID_CAP: LETTER_UPPER (LETTER | DIGIT | '_')*;
ID_UNCAP: LETTER_LOWER (LETTER | DIGIT | '_')*;
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
BRA_CL: '}';
BIN_OP: '+'|'-'|'*'|'/'|'%'|'=='|'!='|'>'|'>='|'<'|'<='|'&&'|'||';
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