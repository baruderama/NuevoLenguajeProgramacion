package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Eq implements ASTNode {
	private ASTNode element1;
	private ASTNode element2;
	
	
	public Eq(ASTNode element1, ASTNode element2) {
		super();
		this.element1 = element1;
		this.element2 = element2;
	}


	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		if(element1.execute(ordenSimbolos,pilaDatos) instanceof Boolean && element2.execute(ordenSimbolos,pilaDatos) instanceof Boolean)
			return (boolean)element1.execute(ordenSimbolos,pilaDatos) == (boolean)element2.execute(ordenSimbolos,pilaDatos);
		else if(element1.execute(ordenSimbolos,pilaDatos) instanceof Float && element2.execute(ordenSimbolos,pilaDatos) instanceof Double)
			return (float)element1.execute(ordenSimbolos,pilaDatos) == (float)(element2.execute(ordenSimbolos,pilaDatos));
		else
			return element1.execute(ordenSimbolos,pilaDatos).equals(element2.execute(ordenSimbolos,pilaDatos));
	}

}
