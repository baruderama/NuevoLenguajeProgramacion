package co.edu.javeriana.metodos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Funciones {
	private List<Map< String, Object> > nivelFuncion;
	public Funciones () {
		this.nivelFuncion = new ArrayList<>();
		subirNivel();
	}
	public void subirNivel() {
		Map< String, Object > sNivel = new HashMap<String, Object>();
		this.nivelFuncion.add(sNivel);
	}
	public void bajarNivel() {
		this.nivelFuncion.remove(this.nivelFuncion.size()-1);
	}
	public void setFunc(String nombre, Object objeto) {
		this.nivelFuncion.get(this.nivelFuncion.size()-1).put(nombre, objeto);
	}
	public Object getFunc(String nombre, Object objeto) {
		Object func=null;
		boolean ban= true;
		for (int i=this.nivelFuncion.size() -1; i>=0&& ban; i--) {
			if (this.nivelFuncion.get(i).containsKey(nombre)) {
				func = this.nivelFuncion.get(i).get(nombre);
				ban=false;
			}
		}
		return func;
	}
}
