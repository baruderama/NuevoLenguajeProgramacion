package co.edu.javeriana.metodos;

public class DeclararLet implements ASTNode {
	
	private String let;
	public DeclararLet(String let) {
		super();
		this.let = let;
	}
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		nivelLets.crear(let, new Object());
		return null;
	}

}
