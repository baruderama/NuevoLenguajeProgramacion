package co.edu.javeriana.ast;

import java.util.Map;
import java.util.Stack;

public class Igual implements ASTNode {

	private ASTNode elemento1;
	private ASTNode elemento2;
	
	public Igual (ASTNode elemento1, ASTNode elemento2) {
		super();
		this.elemento1=elemento1;
		this.elemento2=elemento2;
	}
//	@Override
//	public Object execute(Lets nivelLets, Niveles nivelFuncion) {
//		if((float) elemento1.execute(nivelLets, nivelFuncion) == (float)elemento2.execute(nivelLets, nivelFuncion)) {
//			return true;
//		}
//		return false;
//	}
//

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		return null;
	}

}
