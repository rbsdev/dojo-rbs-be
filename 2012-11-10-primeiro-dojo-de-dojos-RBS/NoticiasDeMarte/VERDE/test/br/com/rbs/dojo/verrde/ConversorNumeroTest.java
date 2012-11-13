package br.com.rbs.dojo.verrde;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorNumeroTest {

	@Test
	public void converteSem7777() {
		assertEquals("7777", ConversorNumero.converte("s"));
	}
	
	@Test
	public void converteMensagemSempEmNumeros() {
		assertEquals("77773367", ConversorNumero.converte("semp"));
	}

	@Test
	public void converteMensagemSemprEmNumeros() {
		assertEquals("77773367_777", ConversorNumero.converte("sempr"));
	}
	
	/*@Test 
	public void testaCharToArray(){
		assertEquals("", )
	}*/
}
