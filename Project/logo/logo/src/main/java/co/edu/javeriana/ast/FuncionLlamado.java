package co.edu.javeriana.ast;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FuncionLlamado implements ASTNode{
	
	private String funcionNombre;
	private List<ASTNode> inputParameters;
	
	public FuncionLlamado(String funcionNombre,List<ASTNode> inputParameters){
		super();
		this.funcionNombre= funcionNombre;
		this.inputParameters= inputParameters;
		
	}

	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		// TODO Auto-generated method stub
		
		return pilaDatos.execFuncion(this.funcionNombre, this.inputParameters);
	}
	

}
