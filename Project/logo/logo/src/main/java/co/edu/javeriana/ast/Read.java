package co.edu.javeriana.ast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;

public class Read implements ASTNode {
	private String nombre;
	
	
	public Read(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			boolean f=false;
			for(int i=ordenSimbolos.size()-1;i>=0;i--){
				if (ordenSimbolos.get(i).containsKey(this.nombre)){
					try {
						ordenSimbolos.get(i).put(this.nombre,Float.parseFloat(s));
					} catch (Exception e) {
						ordenSimbolos.get(i).put(this.nombre,s);
					}
					f=true;
				}
			}
			if(!f){
				 System.err.println("ERROR!: La variable no definida <"+this.nombre+">.");
				 System.exit(0);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
