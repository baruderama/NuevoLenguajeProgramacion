package co.edu.javeriana.metodos;

public class Sumando implements ASTNode {

	private ASTNode elemento1;
	private ASTNode elemento2;
	
	public Sumando (ASTNode elemento1, ASTNode elemento2) {
		super();
		this.elemento1=elemento1;
		this.elemento2=elemento2;
	}
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		try {
			return (float) this.elemento1.execute(nivelLets, nivelFuncion) + (float) this.elemento2.execute(nivelLets, nivelFuncion);
		}
		catch (Exception e) {
			return this.elemento1.execute(nivelLets, nivelFuncion).toString() + this.elemento2.execute(nivelLets, nivelFuncion).toString();
		}
	}

}
