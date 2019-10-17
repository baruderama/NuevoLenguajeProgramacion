package co.edu.javeriana.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lets {
	private List<Map<String, Object > > nivelLets;
	private Object retorno;
	
	public Lets() {
		this.nivelLets = new ArrayList<>();
		this.retorno = null;
		subirNivel();
	}
	public void subirNivel() {
		Map<String, Object> sNivel = new HashMap<String, Object> ();
		this.nivelLets.add(sNivel);
	}
	public void bajarNivel() {
		nivelLets.remove(nivelLets.size()-1);
	}
	
	public Object getRetorno() {
		return retorno;
	}
	
	public void setRetorno(Object obj) {
		this.retorno = obj;
	}
	
	public void crear(String nombre, Object obj) {
		nivelLets.get(nivelLets.size()-1).put(nombre, obj);
	}
	
	public void setLet(String nombre,Object objeto) {
		boolean ban = true;
		for (int i = nivelLets.size() - 1; i>=0 && ban; i--)
		{
			if( this.nivelLets.get(i).containsKey(nombre))
			{
				this.nivelLets.get(i).put(nombre, objeto);
				ban=false;
			}
		}
	}
	
	public Object getLet(String nombre) {
		Object let = null;
		boolean ban=true;
		for (int i = nivelLets.size() - 1; i>=0 && ban; i--)
		{
			if( this.nivelLets.get(i).containsKey(nombre))
			{
				let = this.nivelLets.get(i).get(nombre);
				ban=false;
			}
		}
		return let;
	}
	
	public void imprimir() {	
		for( int pos = this.nivelLets.size() -1 ; pos >= 0 ; pos --)
		{
			System.out.println(this.nivelLets.get(pos));
		}
	}
	
}
