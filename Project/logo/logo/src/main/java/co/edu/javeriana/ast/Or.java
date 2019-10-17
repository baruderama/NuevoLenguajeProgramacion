package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Or implements ASTNode {

	private ASTNode element1;
	private ASTNode element2;
	
	
	public Or(ASTNode element1, ASTNode element2) {
		super();
		this.element1 = element1;
		this.element2 = element2;
	}


	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		return (boolean)element1.execute(ordenSimbolos, pilaDatos) || (boolean)element2.execute(ordenSimbolos, pilaDatos);
	}

}
