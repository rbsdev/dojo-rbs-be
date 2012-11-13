package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Teste {
		
	@Test
	public void deveRetornar7777QuandoPassarS() {
		assertEquals("7777", RoverNumerica.criptografa("S"));
	}
	
	@Test
	public void deveRetornarZeroQuandoPassarEspaco() {
		assertEquals("0", RoverNumerica.criptografa(" "));
	}
	@Test
	public void deveretornar7777quandoPassars(){
		assertEquals("7777",RoverNumerica.criptografa("s"));
	}

}
