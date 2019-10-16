package co.edu.javeriana.metodos;

public class If  implements ASTNode {

	private ASTNode condicion;
	private ASTNode cuerpo;
	private ASTNode elseC;
	public If(ASTNode condicion,ASTNode cuerpo,ASTNode elseC) {
		super();
		this.condicion=condicion;
		this.cuerpo=cuerpo;
		this.elseC= elseC;
	}
	public If(ASTNode condicion, ASTNode cuerpo) {
		this.condicion=condicion;
		this.cuerpo=cuerpo;
		this.elseC= null;
	}
	
	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		if((boolean)this.condicion.execute(nivelLets, nivelFuncion)) {
			this.cuerpo.execute(nivelLets, nivelFuncion);
		} else if (this.elseC!= null) {
			this.elseC.execute(nivelLets, nivelFuncion);
		}
		return null;
	}
}
