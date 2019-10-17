package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class MayorIgual implements ASTNode {

	private ASTNode element1;
	private ASTNode element2;
	
	
	public MayorIgual(ASTNode element1, ASTNode element2) {
		super();
		this.element1 = element1;
		this.element2 = element2;
	}


	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		return (float)element1.execute(ordenSimbolos,pilaDatos) >= (float)(element2.execute(ordenSimbolos,pilaDatos));
		
	}
}
