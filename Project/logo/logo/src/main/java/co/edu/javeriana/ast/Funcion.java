package co.edu.javeriana.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Funcion implements ASTNode {
	private String nombre;
	private List<String> parametros;
	private ParteInterna partInterna;
	public Funcion(String nombre, List<String> parametros, ParteInterna partInterna) {
		super();
		this.nombre=nombre;
		this.parametros=parametros;
		this.partInterna=partInterna;
	}
	public Funcion(String nombre, ParteInterna partInterna) {
		super();
		this.nombre=nombre;
		this.partInterna=partInterna;
		this.parametros=new ArrayList<>();
	}
	
	public Object execFuncion(Niveles pilaDatos, Stack<Map<String, Object> > precedenciaSimbolos, List<ASTNode> parametros) {
		
		Map<String, Object> precedenciaS = new HashMap<String, Object>();
		for(int index=0; index<this.parametros.size(); index++) {
			precedenciaS.put(this.parametros.get(index), parametros.get(index).execute(precedenciaSimbolos, pilaDatos));
		}
		precedenciaSimbolos.push(precedenciaS);
		Object aux= this.partInterna.execute(precedenciaSimbolos, pilaDatos);
		precedenciaSimbolos.pop();
		aux=null;
		return aux;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getParametros() {
		return parametros;
	}
	public void setParametros(List<String> parametros) {
		this.parametros = parametros;
	}
	public ParteInterna getPartInterna() {
		return partInterna;
	}
	public void setPartInterna(ParteInterna partInterna) {
		this.partInterna = partInterna;
	}

	public Object execute(String nombre, Stack<Map<String, Object> > precedenciaSimbolos, Niveles pilaDatos ) {
		pilaDatos.agregarFuncion(this);
		return null;
	}
	
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		pilaDatos.agregarFuncion(this);
		return null;
	}

}
