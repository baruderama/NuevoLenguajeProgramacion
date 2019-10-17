package co.edu.javeriana.ast;

import java.util.List;
import java.util.Map;
import java.util.Stack;



public class Cuerpo implements ASTNode{
	
	List<ASTNode> body;
    public Cuerpo( List<ASTNode> body ) {
        super();

        this.body = body;
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Object execute(Lets nivelLets, Niveles nivelFuncion) {
//		// TODO Auto-generated method stub
//		
//		for(ASTNode n: body){
//			n.execute(nivelLets, nivelFuncion);
//		}
//		return null;
//	}

}
