package co.edu.javeriana.metodos;

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
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		
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
	
	
}
