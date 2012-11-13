package br.com.rbs.dojo.amarelo;

import java.util.HashMap;
import java.util.Map;

public class Rover {
	
	public static Map<Character,String> dicionario = new HashMap<Character, String>();
		
	public static String criptografa(String string) {
		String retorno = "";
		char last = ' ';
		dicionario.put('s', "7777");
		dicionario.put('e', "33");
		dicionario.put('m', "6");
		dicionario.put('p', "7");
		dicionario.put('r', "777");
		dicionario.put('a', "2");
		dicionario.put(' ', "0");
		dicionario.put('c', "222");
		dicionario.put('o', "666");
		dicionario.put('d', "3");
		dicionario.put('j', "5");
		dicionario.put('u', "88");
		dicionario.put('z', "9999");
		dicionario.put('l', "555");
		
		
		for(int i = 0; i < string.length(); i++){
			if (retorno.length() > 1) {
				last = retorno.charAt(retorno.length() - 1);
				if(dicionario.get(string.charAt(i)).charAt(0) == last) {
					retorno += "_";
				}						
			}
			retorno += dicionario.get(string.charAt(i));
		}
		
		return retorno;
	}

}
