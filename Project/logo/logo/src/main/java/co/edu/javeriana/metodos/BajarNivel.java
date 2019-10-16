package co.edu.javeriana.metodos;

public class BajarNivel implements ASTNode{

	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		// TODO Auto-generated method stub
		nivelLets.bajarNivel();
		return null;
	}

}
