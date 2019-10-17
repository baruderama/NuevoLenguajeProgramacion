package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class InversoAditivo implements ASTNode {
	private ASTNode contenido;
	
	public InversoAditivo(ASTNode contenido) {
		super();
		this.contenido = contenido;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		if(contenido.execute(ordenSimbolos, pilaDatos) instanceof Float)
			return -(float)contenido.execute(ordenSimbolos, pilaDatos);
		else
			return -(float)contenido.execute(ordenSimbolos, pilaDatos);
	}

}
