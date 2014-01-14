package app;

import java.util.ArrayList;

public class Alfabeto {
	
	public static final char CADEIA_VAZIA = 'E';
	
	private ArrayList<String> terminais;
	private ArrayList<String> operadores;
	
	public Alfabeto(ArrayList<String> terminais, ArrayList<String> operadores){
		this.terminais = terminais;
		this.operadores = operadores;
	}
	
	//Faz a verificação se o char está contido no array de terminais
	public boolean ehTerminal(String supostoTerminal){
		for (String s:terminais){
			if (s.equals(supostoTerminal))
				return true;
		}
		return false;
	}

	public ArrayList<String> getTerminais() {
		return terminais;
	}

	public void setTerminais(ArrayList<String> terminais) {
		this.terminais = terminais;
	}
	
}
