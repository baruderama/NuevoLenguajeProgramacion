package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

import co.edu.javeriana.logo.Turtle;

public class MoveBc implements ASTNode{

	
private ASTNode expresion;
	
	public MoveBc(ASTNode expresion)
	{
		super();
		this.expresion = expresion;
	}
	
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		try {
			System.out.println((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			pilaDatos.getTurtle().backwards((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			
		} catch (Exception e) {
			System.out.println("Error en forward" + e);
			
			// TODO: handle exception
		}
		return null;
	}
//	@Override
//	public Object execute(Lets nivelLets, Niveles nivelFuncion) {
//		
//		if(isFloat(this.number))
//		{
//			this.turtle.backwards(Float.parseFloat(number));
//		}
//		else
//		{
//			this.turtle.backwards((float) nivelLets.getLet(this.number));
//		}
//		return null;
//	}
	

}
