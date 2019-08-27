grammar Logo;


@parser::members {

private Turtle turtle;

public LogoParser(TokenStream input, Turtle turtle) {
    this(input);
    this.turtle = turtle;
}

}

start
:
	'hello' 'world' 
;

VAR: 'let';
READ: 'read';
PRINTLN: 'println';

AND:'&&';
OR:'||';
NEG:'!';

MINUS:'-';
PLUS: '+';
MULT: '*';
DIV:'/';


COMMA: ',';
DPOINT: ':';

GT: '>';
LT:'<';
GEQT:'>=';
LEQT:'<=';
EQ:'==';
DIF:'<>';



ASSIGN: '=';


OPEN_PARENT: '(';
CLOSE_PARENT:')';


WHILE: 'while';
DO: 'do';
IF:'if';
THEN:'then';
END_IF:'end_if';
ELSE:'else';
END_ELSE: 'end_else';


DEF:'def';
END_DEF:'end_def';

NUM: [0-9]+('.'[0-9]*)?;
ID: [a-zA-Z_][0-9A-Za-z_]*;
BOOL: 'true'|'false';
STRING:'"' -> mode(DEFAULT_MODE);

WS
:
	[ \t\r\n]+ -> skip
;