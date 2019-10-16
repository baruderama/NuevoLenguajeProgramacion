package co.edu.javeriana.metodos;

public class SubirNivel implements ASTNode{

	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		// TODO Auto-generated method stub
		nivelLets.subirNivel();
		return null;
	}

}
