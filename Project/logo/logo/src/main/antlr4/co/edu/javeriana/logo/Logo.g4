grammar Logo;


@parser::members {

private Turtle turtle;

public LogoParser(TokenStream input, Turtle turtle) {
    this(input);
    this.turtle = turtle;
}

}

program: sentence*;

sentence: function | var_decl | cicle | conditional | read | print 
			operation| dec_method |exec_method | assign ; 

function: move_fw | move_bk | rotl | rotr | scol;

move_fw: MOVE_FORW NUM
{turtle.forward(Float.parseFloat($NUM.text));};

move_bk: MOVE_BACK NUM
{turtle.backwards(Float.parseFloat($NUM.text));};

/* Declarations---------------*/


expresion 
	returns [ASTNode value]:
 	ID {$value = symbolTable.get($ID.text);} 
 	| NUM {$value = new Constant(Float.parseFloat($NUM.text));} 
 	| STRING {$value = new Constant($STRING.text);} 
 	| BOOL {$value = new Constant(Boolean.parseBoolean($BOOL.text));};

assign returns [ASTNode value]:
 ID ASSIGN expresion 
 {
	$value= new VarAssign($ID.text, $expresion.value);
};

var_decl returns [ASTNode value]:
VAR ID 
{
	$value= new VarDecl($ID.text);
}
|
VAR ID ASSIGN expresion
{
	$value = new VarDeclAssign($ID.text, $expresion.value);
};

/* Conditionals ------------*/

conditionals: GT | LT | GEQT | LEQT | EQ | DIF;//comparative expresions

ht_condition:  ID ;

condition:	( NEG? ( ID |( NUM conditionals (NUM | ID ) ) ) ) ( conditionals (ht_condition | NUM ) )*;

compound_condition: condition (  op_logic condition )*;
	
code: sentence*;

conditional: IF compound_condition  THEN code ((ELSE code END_IF)| END_IF);

/* Cicles */

cicle: WHILE compound_condition DO code END_WHILE;

/* Printing and input */

read returns [ASTNode value]: 
READ ID 
{
	$value= new Read($ID.text);
};

print 
returns[ASTNode value] :
 PRINTLN expresion
{
	$value = new Println($expresion.value);
};

/* Aritmetic expresions */
inverse_ad: MINUS (ID|NUM);

operator: PLUS | MINUS | MULT | DIV | inverse_ad;

operation: (ID | NUM) operator (ID | NUM) (operator (ID | NUM))*;

/* Logic expresions */

op_logic: OR | AND;

neg_expresion: NEG ID ;

/* Functions */

dec_method: DEF ID OPEN_PARENT (ID (COMMA ID)*)* CLOSE_PARENT DPOINT code END_DEF;

/* Exec function */

exec_method: ID OPEN_PARENT (expresion (COMMA expresion)* )* CLOSE_PARENT;

rotl: ROT_L NUM
{turtle.left(Float.parseFloat($NUM.text));};
rotr: ROT_R NUM
{turtle.right(Float.parseFloat($NUM.text));};
r: NUM;
g: NUM;
b: NUM;
a: NUM;
scol: SET_COLOR r COMMA g COMMA b COMMA a
{
	//System.out.println($r.text+"|"+$g.text+"|"+$b.text+"|"+$a.text+"|");
	turtle.color(Float.parseFloat(r,g,b,a);
};

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
END_WHILE: 'end_while';
DO: 'do';
IF:'if';
THEN:'then';
END_IF:'end_if';
ELSE:'else';
END_ELSE: 'end_else';


DEF:'def';
END_DEF:'end_def';


MOVE_FORW: 'move_forw';
MOVE_BACK: 'move_back';
ROT_L: 'rot_l';
ROT_R: 'rot_r';
SET_COLOR: 'set_color';

NUM: [0-9]+('.'[0-9]*)?;
ID: [a-zA-Z_][0-9A-Za-z_]*;
BOOL: 'true'|'false';
STRING:'"' ( '\\"' | . )*? '"';


WS
:
	[ \t\r\n]+ -> skip
;

/*
	
 */


