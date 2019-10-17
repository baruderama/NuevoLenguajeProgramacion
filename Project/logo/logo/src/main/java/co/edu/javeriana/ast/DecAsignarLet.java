package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class DecAsignarLet implements ASTNode {
	private String nombre;
	private ASTNode contenido;
	
	public DecAsignarLet(String nombre, ASTNode contenido) {
		super();
		this.nombre=nombre;
		this.contenido=contenido;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		//System.out.println("entra");
		if(ordenSimbolos.peek().containsKey(this.nombre)) {
			System.err.println("ERROR!: variable declarada antes <"+this.nombre+">.");
			System.exit(0);
		}
		
			ordenSimbolos.peek().put(this.nombre, this.contenido.execute(ordenSimbolos, pilaDatos));
			this.contenido.execute(ordenSimbolos, pilaDatos);
		
//		
//		new DeclararLet(this.nombre, new Real(0));
//		new Asignar(this.nombre, this.contenido);
		return null;
	}

}
