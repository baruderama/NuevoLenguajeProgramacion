package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class DeclararLet implements ASTNode {

	private ASTNode contenido;
	private String nombre;
	public DeclararLet(String nombre, ASTNode contenido) {
		super();
		this.nombre = nombre;
		this.contenido=contenido;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {

		if(ordenSimbolos.peek().containsKey(this.nombre)) {
			System.err.println("ERROR!: variable declarada antes <"+this.nombre+">.");
			System.exit(0);
		}
		if(this.contenido instanceof Real) {
			System.out.println("declarada1");
			ordenSimbolos.peek().put(this.nombre, new Object());
		}
		else {
			ordenSimbolos.peek().put(this.nombre, this.contenido.execute(ordenSimbolos, pilaDatos));
			this.contenido.execute(ordenSimbolos, pilaDatos);
			
		}
		return null;
	}

}
