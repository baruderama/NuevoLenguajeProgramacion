package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class MoveR implements ASTNode{
private ASTNode expresion;
	
	public MoveR(ASTNode expresion)
	{
		super();
		this.expresion = expresion;
	}
	
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		try {
			System.out.println((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			pilaDatos.getTurtle().right((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			
		} catch (Exception e) {
			System.out.println("Error en forward" + e);
			
			// TODO: handle exception
		}
		return null;
	}

}
