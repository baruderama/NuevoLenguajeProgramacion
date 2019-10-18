package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class SetColor implements ASTNode {

	
private ASTNode expresion;
private ASTNode expresion1;
private ASTNode expresion2;
private ASTNode expresion3;

	
	
	
	public SetColor(ASTNode expresion, ASTNode expresion1, ASTNode expresion2, ASTNode expresion3) {
	super();
	this.expresion = expresion;
	this.expresion1 = expresion1;
	this.expresion2 = expresion2;
	this.expresion3 = expresion3;
}




	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		try {
			//System.out.println((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			pilaDatos.getTurtle().color(
					((float)(this.expresion.execute(ordenSimbolos, pilaDatos))),
					((float)(this.expresion1.execute(ordenSimbolos, pilaDatos))),
					((float)(this.expresion2.execute(ordenSimbolos, pilaDatos))),
					((float)(this.expresion3.execute(ordenSimbolos, pilaDatos))));

			
		} catch (Exception e) {
			System.out.println("Error en forward" + e);
			
			// TODO: handle exception
		}
		return null;
	}

}
