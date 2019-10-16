package co.edu.javeriana.metodos;

public class Divi implements ASTNode {
	private ASTNode num1;
	private ASTNode num2;
	
	public Divi(ASTNode num1, ASTNode num2) {
		super();
		this.num1=num1;
		this.num2=num2;
	}
	
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		// TODO Auto-generated method stub
		return (int)num1.execute(nivelLets, nivelFuncion)/(int)num2.execute(nivelLets,nivelFuncion);
	}
	
	

}
