grammar Logo;

@parser::header {
	
}
@parser::members {

private Turtle turtle;

public LogoParser(TokenStream input, Turtle turtle) {
    this(input);
    this.turtle = turtle;
}

}
/*
program: {
		List<ASTNode> code = new ArrayList<ASTNode>();
		lets = new Lets();
		funciones= new Funciones();
	}
	(
		sentence {
			code.add($sentence.value);
		}
	)*
	{
		for(ASTNode aux:code) {
			aux.execute(lets, funciones);
		}	
	};
/* 
sentence returns [ASTNode value]:
	 function 
	 | 
	 var_decl {
	 	$value =$var_decl.value;
	 }
	 | 
	 cicle {
	 	$value= $cicle.value;
	 }
	 | 
	 conditional {
	 	$value = conditional.value;
	 }
	 | 
	 read {
	 	$value = $read.value;
	 }
	 | 
	 print {
	 	$value = $print.value;
	 }
	 |
	 operation {
	 	$value = operation.value;
	 }
	 | 
	 dec_method {
	 	$value = $dec_method.value;
	 }
	 |
	 exec_method {
	 	$value = $exec_method.value;
	 }
	 | 
	 assign {
	 	$value = $assign.value;
	 }
	 ; 

function returns [ASTNode value]:
 	 move_fw {
 	 	$value =$move_fw.value;
 	 } 
 	 | 
 	 move_bk {
 	 	$value = $move_bk.value;
 	 }
 	 | 
 	 rotl {
 	 	$value = $rotl.value; 
 	 }
 	 | 
 	 rotr {
 	 	$value = $rotr.value;
 	 }
 	 | 
 	 scol{
 	 	$value = $scol.value;
 	 };
/*
move_fw returns [ASTNode value]:
 MOVE_FORW (
	NUM {
		$value = new MoveFw($NUM.text, turtle);
	}
	|
	ID {
		
		$value= new MoveFw($ID.text,turtle);
	}
);
/* 
{
	turtle.forward(Float.parseFloat($NUM.text));
};


move_bk returns [ASTNode value]:
MOVE_BACK (
	NUM {
		$value= new MoveBc($NUM.text, turtle);
	
	}
	|
	ID {
		$value= new MoveBc($ID.text, turtle);
		
	}
	);

/* Declarations---------------*/

expresion 
	returns [ASTNode value]:
 	ID {$value = new Formal($ID.text);} 
 	| NUM {$value = new Real(Float.parseFloat($NUM.text));} 
 	| STRING {$value = new Real($STRING.text);} 
 	| BOOL {$value = new Real(Boolean.parseBoolean($BOOL.text));};
/*
assign returns [ASTNode value]:
 ID ASSIGN expresion 
 {
	$value= new Asignar($ID.text, $expresion.value);
};

var_decl returns [ASTNode value]:
VAR ID 
{
	$value= new DeclararLet($ID.text);
}
|
VAR ID ASSIGN expresion
{
	$value = new DecAsignarLet($ID.text, $expresion.value);
};

/* Conditionals ------------*/


conditionalsAritmetic returns [ASTNode value]:
				e1=multDivi {$value=$e1.value;}
	(
		(GT 	e2=multDivi{$value= new Mayor($value,$e2.value);}) 
	|	(LT 	e2=multDivi{$value= new Menor($value,$e2.value);}) 	
 	| 	(GEQT 	e2=multDivi{$value= new MayorIgual($value,$e2.value);})
 	| 	(LEQT 	e2=multDivi{$value= new MenorIgual($value,$e2.value);})
 	| 	(EQ 	e2=multDivi{$value= new Igual($value,$e2.value);})
 	| 	(DIF 	e2=multDivi{$value= new Diferente($value,$e2.value);})
 	|	(PLUS 	e2=multDivi{$value= new Sumando($value, $e2.value);})*
 	|   (MINUS  e2=multDivi {$value= new Diferencia($e2.value);})*
 	)
 	|
 		MINUS  e1=multDivi {$value= new Diferencia($e1.value);}
 	;
 		//comparative expresions
 		
multDivi returns [ASTNode value]:
 	e1= expresion{$value=$e1.value}
 	((MULT e2=expresion{$value= new Multi($value,$e2.value);})*
 	|(DIV e2= expresion{$value= new Divi($value,$e2.value);})*);

ht_condition:  ID ;
/*

neg_expresion returns [ASTNOde value]:
	e1= conditionalsAritmetic {$value =$e1.value;}
	|NEG e1=conditionalsAritmetic{$value= new Neg ($e1.value);}
	;
condition returns [ASTNode value]:

	neg_expresion {$value=$neg_expresion.value;}
	(
		(AND e2=neg_expresion{$value= new And($value,$e2.value);})
		|(OR e2=neg_expresion{$value= new Or ($value,$e2.value);})
	)*;
	
bloque returns [ASTNode value]:

	{
		List<ASTNode> lista = new ArrayList<ASTNode>();
		lista.add(new SubirNivel());
	}
	(s1=sentence{lista.add($s1.value);})*
	{
		lista.add(new BajarNivel() );
		$value = new Cuerpo(lista);
	}
		;
	
conditional returns [ASTNode value]://TODO
	IF condition THEN
	(
	code= bloque
	{$value = new If($condition.value, $code.value);}
	|
	code=bloque
	ELSE elseC=bloque
	{$value= new If($condition.value, $code.value, $elseC.value);}	
	)
	END_IF	
	;


/* 
condition:	( NEG? ( ID |( NUM conditionals (NUM | ID ) ) ) ) ( conditionals (ht_condition | NUM ) )*;

compound_condition: condition (  op_logic condition )*;
	
code: sentence*;

conditional: IF compound_condition  THEN code ((ELSE code END_IF)| END_IF);

*/
/* Cicles */
/*
cicle: WHILE condition DO bloque END_WHILE;

/* Printing and input */
/*
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

/* Logic expresions 

op_logic: OR | AND;

//neg_expresion: NEG ID ;

/* Functions

dec_method: DEF ID OPEN_PARENT (ID (COMMA ID)*)* CLOSE_PARENT DPOINT bloque END_DEF;

/* Exec function 

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
*/
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


