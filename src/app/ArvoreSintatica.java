package app;


public class ArvoreSintatica {
	
	private Alfabeto alfabeto;
	private Expressao expressao;
	
	public ArvoreSintatica(Alfabeto alfabeto, Expressao expressao){
		this.alfabeto = alfabeto;
		this.expressao = expressao;
	}
	
	//Constroi a arvore sintatica - mantantendo a ordem de precedencia dos operadores
	public No construaArvore(){
		return exp();
	}
	
	//------ Algoritmos traduzidos de "Compiladores: principios e praticas" Cap. 4 --- \\
	
	public No exp(){
		No ter = termo(); 
		String op = expressao.getTokenCorrente();
		while(op.equals("+")){
			expressao.casamento("+");
			No operador = new No(op);
			operador.setlNo(ter);
			operador.setrNo(termo());
			ter = operador;
			op = expressao.getTokenCorrente();
		}
		return ter;
	}
	
	public No termo(){
		No fa = fator();
		String op = expressao.getTokenCorrente();
		while(op.equals(".")){
			expressao.casamento(".");
			No operador = new No(op);
			operador.setlNo(fa);
			operador.setrNo(fator());
			fa = operador;
			op = expressao.getTokenCorrente();
		}
		return fa;
	}
	
	public No fator(){
		No at = atomo();
		String token = expressao.getTokenCorrente();
		if (token.equals("*")){
			expressao.casamento("*");
			No no = new No("*");
			no.setlNo(at);
			return no;
		}
		return at;
	}
	
	public No atomo(){
		String token = expressao.getTokenCorrente();
		if (token.equals("(")){
			expressao.casamento("(");
			No at = exp();
			expressao.casamento(")");
			return at;
		}else if ((token.equals(Alfabeto.CADEIA_VAZIA)) || (expressao.ehTerminal(token))){
			expressao.updateIndex();
			return new No(token);
		}else{
			return null;
		}
	}
}
