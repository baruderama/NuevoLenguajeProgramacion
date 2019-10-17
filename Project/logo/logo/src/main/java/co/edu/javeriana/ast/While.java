package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class While implements ASTNode {
	private ASTNode condicion;
	private ParteInterna code;
	
	public While(ASTNode condicion, ParteInterna code) {
		super();
		this.condicion = condicion;
		this.code = code;
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {

		while((boolean)this.condicion.execute(ordenSimbolos, null)) {
			if(this.code!=null)
			{
				this.code.execute(ordenSimbolos, pilaDatos);
			}
		}
		return null;
	}

}
