package co.edu.javeriana.metodos;

import co.edu.javeriana.logo.Turtle;

public class MoveBc implements ASTNode{

	
	private String number;
	private Turtle turtle;
	
	public MoveBc(String number, Turtle turtle)
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
			this.turtle.backwards(Float.parseFloat(number));
		}
		else
		{
			this.turtle.backwards((float) nivelLets.getLet(this.number));
		}
		return null;
	}
	

}
