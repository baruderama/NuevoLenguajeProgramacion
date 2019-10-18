package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

import co.edu.javeriana.logo.Turtle;

public class MoveFw implements ASTNode {
	
	private ASTNode expresion;
	
	public MoveFw(ASTNode expresion)
	{
		super();
		this.expresion = expresion;
	}
	
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		try {
			System.out.println((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			pilaDatos.getTurtle().forward((float)(this.expresion.execute(ordenSimbolos, pilaDatos)));
			
		} catch (Exception e) {
			System.out.println("Error en forward" + e);
			
			// TODO: handle exception
		}
		return null;
	}
	
	/*
	@Override
	public Object execute(Lets nivelLets, Niveles nivelFuncion) {
		
		if(isFloat(this.number))
		{
			this.turtle.forward(Float.parseFloat(number));
		}
		else
		{
			this.turtle.forward((float) nivelLets.getLet(this.number));
		}
		return null;
	}
	*/
	
}
