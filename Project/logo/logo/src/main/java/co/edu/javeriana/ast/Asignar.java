package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Asignar implements ASTNode {
	private String nombre;
	private ASTNode contenido;
	
	public Asignar(String nombre, ASTNode contenido) {
		super();
		this.nombre=nombre;
		this.contenido=contenido;
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {

		Object resultado= this.contenido.execute(ordenSimbolos, pilaDatos);
		for (int index=ordenSimbolos.size()-1 ; index>=0; index--) {
			
			if(ordenSimbolos.get(index).containsKey(this.nombre)) {
				ordenSimbolos.get(index).put(this.nombre, resultado);
				//System.out.println(" asignada ");
				return null;
			}
		}
		System.err.println("ERROR!: variable no declarada <"+this.nombre+">.");
		System.exit(0);
		return null;
	}

}
