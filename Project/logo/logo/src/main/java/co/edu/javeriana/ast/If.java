package co.edu.javeriana.ast;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class If  implements ASTNode {

	private ASTNode condicion;
	private List<ASTNode> cuerpo;
	private List<ASTNode> elseC;
	
	public If(ASTNode condicion, ParteInterna cuerpo, ParteInterna elseC) {
		super();
		this.condicion = condicion;
		this.cuerpo = cuerpo.getParteInterna();
		this.elseC = elseC.getParteInterna();
	}
	
	public If(ASTNode condicion, ParteInterna cuerpo) {
		super();
		this.condicion = condicion;
		this.cuerpo = cuerpo.getParteInterna();
		this.elseC = null;
	}
	@Override
	public Object execute(Stack<Map<String, Object>> ordenSimbolos, Niveles pilaDatos) {
		if((boolean) condicion.execute(ordenSimbolos,pilaDatos)) {
			for(ASTNode n : cuerpo){
				n.execute(ordenSimbolos, pilaDatos);
			}
		} else if(!elseC.isEmpty()) {
			for(ASTNode n: elseC) {
				n.execute(ordenSimbolos,pilaDatos);
			}
		}
		return null;
	}
	
//	@Override
//	public Object execute(Lets nivelLets, Niveles nivelFuncion) {
//		if((boolean)this.condicion.execute(nivelLets, nivelFuncion)) {
//			this.cuerpo.execute(nivelLets, nivelFuncion);
//		} else if (this.elseC!= null) {
//			this.elseC.execute(nivelLets, nivelFuncion);
//		}
//		return null;
//	}
}
