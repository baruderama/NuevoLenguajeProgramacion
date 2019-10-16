package co.edu.javeriana.metodos;

public class Diferencia implements ASTNode {

	private ASTNode elemento1;
	private ASTNode elemento2;
	private boolean negacion;
	public Diferencia (ASTNode elemento) {
		super();
		this.elemento1=elemento;
	}
	public Diferencia (ASTNode elemento1, ASTNode elemento2) {
		super();
		this.elemento1=elemento1;
		this.elemento2=elemento2;
		this.negacion= true;
	}
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		if(this.negacion) {
			return (float)this.elemento1.execute(nivelLets, nivelFuncion) - (float)this.elemento2.execute(nivelLets, nivelFuncion);
		}
		return (float)this.elemento1.execute(nivelLets, nivelFuncion)*-1;
	}


}
