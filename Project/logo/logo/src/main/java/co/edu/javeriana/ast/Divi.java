package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Divi implements ASTNode {
	private ASTNode num1;
	private ASTNode num2;
	
	public Divi(ASTNode num1, ASTNode num2) {
		super();
		this.num1=num1;
		this.num2=num2;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {

		return (float)num1.execute(ordenSimbolos, pilaDatos)/(float)num2.execute(ordenSimbolos, pilaDatos);
	}

}
