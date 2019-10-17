package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Println implements ASTNode {
	private ASTNode valor;
	
	public Println(ASTNode valor) {
		super();
		this.valor=valor;
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		System.out.println(this.valor.execute(ordenSimbolos, pilaDatos));
		return null;
	}

}
