package co.edu.javeriana.metodos;

public class Formal implements ASTNode {
	
	private String let;
	
	public Formal (String let) {
		super();
		this.let=let;
		 
	}

	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		
		// TODO Auto-generated method stub
		return nivelLets.getLet(this.let);
	}

}
