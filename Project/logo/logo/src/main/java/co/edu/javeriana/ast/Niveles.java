package co.edu.javeriana.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import co.edu.javeriana.logo.Turtle;

public class Niveles {
	
	private Stack<Map<String, Object> > precedenciaSimbolos;
	private Map< String, Funcion> nivelFuncion;
	private Turtle turtle;
	
	public Niveles(Turtle turtle) {
		super();
		this.nivelFuncion = new HashMap<String, Funcion>();
		this.precedenciaSimbolos= new Stack<Map<String, Object> > ();
		this.precedenciaSimbolos.add(new HashMap<String, Object>());
		this.turtle =turtle;
		//subirNivel();
	}
	public Object execFuncion(String nombre,List<ASTNode> parametros){
		return this.nivelFuncion.get(nombre).execFuncion(this,this.precedenciaSimbolos,parametros);
	}
	
	public void agregarFuncion(Funcion nuevaFuncion) {
		this.nivelFuncion.put(nuevaFuncion.getNombre(), nuevaFuncion);
	}
	public Map<String, Funcion> getNivelFuncion() {
		return nivelFuncion;
	}
	public void setNivelFuncion(Map<String, Funcion> nivelFuncion) {
		this.nivelFuncion = nivelFuncion;
	}
	public Stack<Map<String, Object>> getPrecedenciaSimbolos() {
		return precedenciaSimbolos;
	}
	public void setPrecedenciaSimbolos(Stack<Map<String, Object>> precedenciaSimbolos) {
		this.precedenciaSimbolos = precedenciaSimbolos;
	}
	public Turtle getTurtle() {
		return turtle;
	}
	public void setTurtle(Turtle turtle) {
		this.turtle = turtle;
	}
	
}
