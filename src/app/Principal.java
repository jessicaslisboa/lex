package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	
	public void execute(String exp, String palavra){
		
	}
	
	//ler entrada
	public void entrada(){
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(in);
		
		
		ArrayList<String> palavras = new ArrayList<>();
		try {
			String exp =  entrada.readLine();
			while (true){
				String aux = entrada.readLine();
				if (aux.equals("")){
					break;
				}else{
					palavras.add(aux);
				}
			}
			for (String p: palavras){
				execute(exp, p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Principal pp = new Principal();
		//String exp = "a+b";
		//String cadeia = "a";
		//pp.execute(exp, cadeia);
		pp.entrada();
	}
}
