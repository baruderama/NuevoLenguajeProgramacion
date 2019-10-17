package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public interface ASTNode {
	public Object execute(Stack<Map<String, Object > > ordenSimbolos, Niveles pilaDatos);
}
