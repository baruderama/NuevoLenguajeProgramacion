package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Neg implements ASTNode {
	private ASTNode element;
	
	public Neg(ASTNode element) {
		super();
		this.element = element;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		
		return !(boolean) element.execute(ordenSimbolos, pilaDatos);
	}

}
