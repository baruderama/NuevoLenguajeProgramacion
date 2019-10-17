package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Real implements ASTNode{
	
	private Object valor;
	
	public Real (Object valor) {
		super();
		this.valor = valor;
		
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		return this.valor;
	}
}
