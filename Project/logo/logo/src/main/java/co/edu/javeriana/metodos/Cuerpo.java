package co.edu.javeriana.metodos;

import java.util.List;



public class Cuerpo implements ASTNode{
	
	List<ASTNode> body;
    public Cuerpo( List<ASTNode> body ) {
        super();

        this.body = body;
	}

	@Override
	public Object execute(Lets nivelLets, Funciones nivelFuncion) {
		// TODO Auto-generated method stub
		
		for(ASTNode n: body){
			n.execute(nivelLets, nivelFuncion);
		}
		return null;
	}

}
