package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Diferencia implements ASTNode {

	private ASTNode elemento1;
	private ASTNode elemento2;
	
	public Diferencia (ASTNode elemento1, ASTNode elemento2) {
		super();
		this.elemento1=elemento1;
		this.elemento2=elemento2;
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		return Float.valueOf((float)this.elemento1.execute(ordenSimbolos, pilaDatos) - (float)elemento2.execute(ordenSimbolos, pilaDatos));
	}


}
