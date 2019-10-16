package co.edu.javeriana.metodos;

public class Real implements ASTNode{
	
	private Object valor;
	
	public Real (Object valor) {
		super();
		this.valor = valor;
		
	}

	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		// TODO Auto-generated method stub
		return this.valor;
	}

}
