package co.edu.javeriana.metodos;

public class Asignar implements ASTNode {
	private String let;
	private ASTNode expresion;
	public Asignar(String let, ASTNode expresion) {
		super();
		this.let = let;
		this.expresion = expresion;
	}
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		nivelLets.setLet(this.let, this.expresion.execute(nivelLets, nivelFuncion));
		return null;
	}

}
