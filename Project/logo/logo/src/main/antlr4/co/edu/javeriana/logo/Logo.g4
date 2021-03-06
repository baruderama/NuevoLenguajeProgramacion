grammar Logo;

@parser::header {
	import co.edu.javeriana.ast.*;
	import java.util.Map;
	import java.util.HashMap;
	import co.edu.javeriana.logo.*;
}
@parser::members {

private Turtle turtle;

public LogoParser(TokenStream input, Turtle turtle) {
    this(input);
    this.turtle = turtle;
}

}

program: 
	{
		List<ASTNode> code = new ArrayList<ASTNode>();
		Niveles niveles = new Niveles(turtle);
	}
	(
		s1=sentence 
		{
			//System.out.println("add " +$s1.value);
			code.add($s1.value);
		}
	)*
	{
		for(ASTNode aux:code)
		aux.execute(niveles.getPrecedenciaSimbolos(),niveles);
	}
	;

sentence 
returns [ASTNode value]
:
//	 function 
//	 | 
	
	 var_decl 
	 {
	 	$value =$var_decl.value;
	 }
	 | 
	 cicle 
	 {
	 	$value= $cicle.value;
	 }
	 | 
	 conditional 
	 {
	 	$value = $conditional.value;
	 }
	 | 
	 read 
	 {
	 	$value = $read.value;
	 }
	 | 
	 print 
	 {
	 	$value = $print.value;
	 }
	 | 
	 dec_method 
	 {
	 	$value = $dec_method.value;
	 }
	 |
	 exec_method 
	 {
	 	$value = $exec_method.value;
	 }
	 | 
	 assign 
	 {
	 	$value = $assign.value;
	 }
	 |
	 move_fw
	 {
	 	$value = $move_fw.value;
	 }
	 |
	 move_bk
	 {
	 	$value = $move_bk.value;
	 }
	 |
	 rotl 
	 {
	 	$value = $rotl.value;
	 }
	 |
	 rotr 
	 {
	 	$value =$rotr.value;
	 }
	 |
	 scol
	 {
	 	$value = $scol.value;
	 }
	 ; 





//function returns [ASTNode value]:
// 	 move_fw 
// 	 {
// 	 	$value =$move_fw.value;
// 	 } 
// 	 | 
// 	 move_bk 
// 	 {
// 	 	$value = $move_bk.value;
// 	 }
// 	 | 
// 	 rotl 
// 	 {
// 	 	$value = $rotl.value; 
// 	 }
// 	 | 
// 	 rotr 
// 	 {
// 	 	$value = $rotr.value;
// 	 }
// 	 | 
// 	 scol
// 	 {
// 	 	$value = $scol.value;
// 	 }
// 	 ;
 	 
 	 
 	 
 	 
 	 
 	 
//--------------------------TORTUGA---------
rotl
returns [ASTNode value]
: ROT_L 
(
	e1=sumaResta
	{
		$value = new MoveL($sumaResta.value);
	}
	);

rotr
returns [ASTNode value]
: ROT_R 
(
	e1=sumaResta
	{
		$value = new MoveR($sumaResta.value);
	}
	);


move_fw 
returns [ASTNode value]
:
 MOVE_FORW 
 (
	e1=sumaResta
	{
		$value = new MoveFw($sumaResta.value);
	}
	);
	


move_bk 
returns [ASTNode value]
:
MOVE_BACK 
(
	e1=sumaResta
	{
		$value = new MoveBc($sumaResta.value);
	}
	);



//
//r
//[ASTNode value]
//: 
//e1=sumaResta
//{
//	$value=$e1.value;
//};
//g
//[ASTNode value]
//: 
//e1=sumaResta
//{
//	$value=$e1.value;
//};
//b
//[ASTNode value]
//: 
//e1=sumaResta
//{
//	$value=$e1.value;
//};
//a
//[ASTNode value]
//: e1=sumaResta
//{
//	$value=$e1.value;
//};

scol
 returns [ASTNode value]
: 
SET_COLOR e1=sumaResta COMMA e2=sumaResta COMMA e3=sumaResta COMMA e4=sumaResta
{
	$value = new SetColor($e1.value,$e2.value,$e3.value,$e4.value );
}
;
//---------------------------------------------

//---------------------------EXPRESION--------

expresion 
	returns [ASTNode value]
	:
 	ID 
 	{$value = new Formal($ID.text);
 		//System.out.println(" haha3 "+ $value );
 	} 
 	| 
 	NUM 
 	{
 		//System.out.println(" haha4 "+ $NUM.text );
 		$value = new Real(Float.parseFloat($NUM.text));
 		//System.out.println(" despues "+ $value );
 		
 	} 
 	| 
 	STRING 
 	{$value = new Real($STRING.text);
 		//System.out.println(" haha5 "+ $value );
 	} 
 	| 
 	BOOL 
 	{$value = new Real(Boolean.parseBoolean($BOOL.text));
 		//System.out.println(" haha6 "+ $value );
 	}
 	|
 	OPEN_PARENT condition {$value = $condition.value;}CLOSE_PARENT
 	;
 //------------------------------------------
 
 
 
 
 	
//--------------------VARIABLES------------
assign 
returns [ASTNode value]
	:
 	ID ASSIGN sumaResta 
 	{
	$value= new Asignar($ID.text, $sumaResta.value);
	}
	;

var_decl 
returns [ASTNode value]
:
VAR(
	(ID 
{
	$value= new DeclararLet($ID.text,new Real(0));
	
}
	)
	| (ID ASSIGN sumaResta
{
	$value = new DecAsignarLet($ID.text,$sumaResta.value);
}
	)
)
;

//-------------------------------------------------






/* Conditionals ------------*/



 		//comparative expresions
 		




	
	
	
	
	
	
//------CONDICIONNNN-----------------------------
condition 
returns [ASTNode value]
:

	(e1=sumaResta
	{$value=$e1.value;}
	( 
		  (AND e2=sumaResta
			{$value= new And($value,$e2.value);}
		)
		| (OR e2=sumaResta
			{$value= new Or ($value,$e2.value);}
		)
		| (EQ e2=sumaResta
			{$value= new Eq ($value,$e2.value);}
		)
		| (DIF e2=sumaResta
			{$value= new Diferente ($value,$e2.value);}
		)
		| (GT e2=sumaResta
			{$value= new Mayor ($value,$e2.value);}
		)
		| (GEQT e2=sumaResta
			{$value= new MayorIgual ($value,$e2.value);}
		)
		| (LT e2=sumaResta
			{$value= new Menor ($value,$e2.value);}
		)
		| (LEQT e2=sumaResta
			{$value= new MenorIgual ($value,$e2.value);}
		)
	)*)
	|
	NEG e2=sumaResta
	{$value= new Neg ($e2.value);}
	;
//---------------------------------------------------------------	
	
	
	
	
	
	
//----------------------SUMA-RESTA------------------------
sumaResta 
returns [ASTNode value]
:
e1= multDivi 
{
	$value= $e1.value;
	//System.out.println(" sum "+ $e1.value );
	
}
(
	(PLUS e2=multDivi	
		{
			$value= new Sumando($value, $e2.value);
		}
	)
	|
	(MINUS e2=multDivi
		{
			$value= new Diferencia($value, $e2.value);
		}
	)
	
)*
;
//--------------------------------------------------------
	




//---------------------MULT-DIVI--------------------------
multDivi 
returns [ASTNode value]
:
	
 	e1= addInverse 
 	{$value=$e1.value;
 		//System.out.println(" mult "+ $e1.value );
 	}
 	
 	(
	 	
	 	(MULT e2=addInverse
	 		{
	 			$value= new Multi($value,$e2.value);
	 		}
	 	)
		| (DIV e2= addInverse
	 		{
	 			$value= new Divi($value,$e2.value);
	 		}
	 	)
 	)*
 	;
//--------------------------------------------------------
	




//--------------------ADD-INVERSE------------------------

addInverse
returns [ASTNode value]
:
(MINUS e1=expresion
	{
		$value= new InversoAditivo($e1.value);
	}
)
| 
(e1=expresion)
	{
		//System.out.println(" addIn "+ $e1.value );
		$value= $e1.value;
	}

;

//------------------------------------------------------
	
	
	
	
	

		
		




//-----------------------IF-ELSE----------------------------	
//conditioOneIf 
//returns [ASTNode value]
//:
//THEN
//{
//	List<ASTNode> lista = new ArrayList<ASTNode>();
//	
//}
//END_IF
//;
conditional 
returns [ASTNode value]
://TODO
	IF condition 
//	{
//		List<ASTNode> body= new ArrayLis<>();
//		List<ASTNode> elsebody= new ArrayLis<>();
//	}
	THEN
	(
		(code = parteInterna)
			//{body.add($e1.value);}
			{$value= new If($condition.value, $code.value);}
		
	)
//	(code=conditioOneIf
//	{
//		
//	}
//	//(code = parteInterna)
	(
		ELSE
//		(e2 =parteInterna
//			//{elsebody.add($e2.value)}
//		)*
		(elseC= parteInterna)
		{$value= new If($condition.value, $code.value, $elseC.value);}
	)?
	END_IF
//	{
//		$value= new If($condition.value, body, elsebody);
//	}	
	;
	
	
//--------------------------------------------------------








//-------------------WHILE-DO--------------------------
cicle 
returns [ASTNode value]
 : 
WHILE condition DO
parteInterna

END_WHILE
{
	$value= new While($condition.value, $parteInterna.value);
}
;
//------------------------------------------------







//-----------------------LEER-IMPRIMIR-------------
read 
returns [ASTNode value]
: 
READ ID
{
	$value= new Read($ID.text);
}
;

print 
returns[ASTNode value] 
:
 PRINTLN  ( e1=sumaResta 
	{
		
		//System.out.println(" print "+ $e1.value );
		$value=new Println($e1.value);
	}
 )+
;
//-------------------------------------------------











/* Logic expresions 

op_logic: OR | AND;

//neg_expresion: NEG ID ;
* 
*/

//--------------------------------FUNCIONES-DECLARACIÓN----------

dec_method returns [ASTNode value]
:
 DEF ID OPEN_PARENT meterFuncion CLOSE_PARENT 
 DPOINT
  parteInterna
  END_DEF
  {
  	$value =new Funcion($ID.text,$meterFuncion.parameters,$parteInterna.value);
  }
  |
  DEF ID OPEN_PARENT CLOSE_PARENT 
 DPOINT
  parteInterna
  END_DEF
  {
  	$value =new Funcion($ID.text,$parteInterna.value);
  }
  ;

//----------------------------FUNCIONES-LLAMADO----------------
meterFuncion returns [List<String> parameters]
:
{
	$parameters=new ArrayList<String>();
}
	n1=meter{$parameters.add($n1.var_name);}
	(COMMA n2=meter{$parameters.add($n2.var_name);})*;

meter returns [String var_name]: ID{$var_name=$ID.text;};

exec_method returns [ASTNode value]
:
{
	List<ASTNode> expresiones = new ArrayList<ASTNode>();
}
 ID OPEN_PARENT (p1=sumaResta {expresiones.add($p1.value);}
 	(COMMA p2=sumaResta {expresiones.add($p2.value);})*
 )* CLOSE_PARENT
 {
 	$value = new FuncionLlamado($ID.text,expresiones);
 }
;
//---------------------------------------------------
//----------------------------PARTE-INTERNA---------------
parteInterna 
returns [ParteInterna value]
:
{
	$value=new ParteInterna();
}

(
	
	p1=sentence{$value.agregar($p1.value);
		//System.out.println(" gg "+ $p1.value);
	}
)*
;
//--------------------------------------------------------


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


