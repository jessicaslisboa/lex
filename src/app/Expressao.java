package app;

public class Expressao {
	
	private String exp;
	private int index;
	private Alfabeto alfabeto;
	
	public Expressao(String exp, Alfabeto alfabeto){
		this.exp = exp;
		this.alfabeto = alfabeto;
		this.index = 0;
	}
	
	public String trim(String expressao){
		String trimed = ""; 
		for (int i = 0; i < expressao.length(); i++){
			if (!Character.isWhitespace(expressao.charAt(i))){
				trimed = trimed + expressao.charAt(i);
			}			
		}
		return trimed;
	}
	
	public boolean ehTerminal(String supostoTerminal){
		return this.alfabeto.ehTerminal(supostoTerminal);
	}
	

	public String getTokenCorrente() {
		if (index < getSizeExp()){
			return this.exp.substring(index, index + 1);
		}
		else{
			return "" ;
		}
	}
	
	public int getSizeExp(){
		return this.exp.length();
	}
	
	//Ajusta index para proximo token
	public void updateIndex(){
		this.index += 1;
	}
	
	public void casamento(String tokensEsperados){
		String corrente = getTokenCorrente();
		for (int i = 0; i < tokensEsperados.length(); i++){
			if (corrente.equals(tokensEsperados.substring(i,i+1))){
				updateIndex();
			}
		}
	}
	
}
