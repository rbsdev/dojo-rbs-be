package br.com.rbs.dojo.verrde;

import java.util.HashMap;
import java.util.Map;

public class ConversorNumero {

	public static String converte(String string) {
	    Map<Character, String> tn = new HashMap<Character , String>();
	    tn.put('s', "7777");
	    tn.put('e', "33");
		tn.put('m', "6");
		tn.put('p', "7");
		tn.put('r', "777");
		String retorno = "";
		String ultimoNumero = "";
		
		for (char caracter : string.toCharArray()) {
			if(!ultimoNumero.equals("") && tn.get(caracter).substring(0,1).equals(ultimoNumero.substring(0,1))){
				retorno += "_";
			}
			retorno += tn.get(caracter);
			ultimoNumero = tn.get(caracter);
		}
		
		return retorno;
	}
	
	

}
