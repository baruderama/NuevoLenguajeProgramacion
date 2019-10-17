package co.edu.javeriana.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ParteInterna implements ASTNode {
	
	private List<ASTNode> parteInterna;
	
	public ParteInterna() {
		super();
		this.parteInterna= new ArrayList<ASTNode>();
	}
	
	public ParteInterna(List<ASTNode> partInterna) {
		super();
		this.parteInterna=partInterna;
	}
	
	public List<ASTNode> getParteInterna() {
		return parteInterna;
	}

	public void setParteInterna(List<ASTNode> parteInterna) {
		this.parteInterna = parteInterna;
	}
	
	public void agregar(ASTNode parte) {
		this.parteInterna.add(parte);
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {

		Object aux=null;
		if(this.parteInterna!=null) {
			ordenSimbolos.push(new HashMap<String, Object> ());
			for(ASTNode aux2: this.parteInterna)
			{
				aux=aux2.execute(ordenSimbolos, pilaDatos);
			}
			ordenSimbolos.pop();
		}
		return aux;
	}

}
