package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Formal implements ASTNode {
	
	private String let;
	
	public Formal (String let) {
		super();
		this.let=let;
		 
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		for (int index=ordenSimbolos.size() -1; index>=0; index--)
		{
			if(ordenSimbolos.get(index).containsKey(this.let))
			{
				return ordenSimbolos.get(index).get(this.let); 
			}
		}
		System.err.println("ERROR!: variable no declarada <"+this.let+">");
		System.exit(0);
		return null;
	}
}
