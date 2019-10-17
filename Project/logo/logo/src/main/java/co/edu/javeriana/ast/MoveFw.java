package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

import co.edu.javeriana.logo.Turtle;

public class MoveFw implements ASTNode {
	private String number;
	private Turtle turtle;
	
	public MoveFw(String number, Turtle turtle)
	{
		super();
		this.number=number;
		this.turtle=turtle;
	}
	public boolean isFloat(String number) {
		
		try {
			Float.parseFloat(number);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
		
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
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
