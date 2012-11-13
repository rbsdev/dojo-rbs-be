package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoverNumerica {
	public static Map<String, String> alfabeto = new HashMap<String, String>();
	
	public RoverNumerica() {
		
	}
	
	
	public static Object criptografa(String string) {
		alfabeto.put("S", "7777");
		alfabeto.put(" ", "0");
			
		
		
		
		string = alfabeto.get(string);
		
		
		return string;
		
	}

}
