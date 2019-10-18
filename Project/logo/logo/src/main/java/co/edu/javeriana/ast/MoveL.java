package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class MoveL implements ASTNode {
private ASTNode expresion;
	
	public MoveL(ASTNode expresion)
	{
		super();
		this.expresion = expresion;
	}
	
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		try {
			System.out.println((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			pilaDatos.getTurtle().left((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			
		} catch (Exception e) {
			System.out.println("Error en forward" + e);
			
			// TODO: handle exception
		}
		return null;
	}

}
