package br.com.rbs.codingdojo.fizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de teste unit�rio para {@link FizzBuzz}.
 * N�meros divis�veis por 3 deve aparecer como 'Fizz' ao inv�s do n�mero;
 * N�meros divis�veis por 5 devem aparecer como 'Buzz' ao inv�s do n�mero;
 * N�meros divis�veis por 3 e 5 devem aparecer como 'FizzBuzz' ao inv�s do n�mero'.
 * Quaisquer outros n�meros devem aparecer eles mesmos.
 * @author HelMedeiros and AndreTrevisani
 */
public class FizzBuzzTest {

	@Test
	public void deveRetornarFizzQuandoReceber3() {
		assertEquals("Fizz", FizzBuzz.metodoSolucao(3));
	}
	
	@Test 
	public void deveRetornarFizzQuandoReceberMultiploDe3() {
		for(int i = 3; i <= 12; i+= 3)
			assertEquals("Fizz", FizzBuzz.metodoSolucao(i));
	}
	
	@Test
	public void deveRetornarBuzzQuandoReceber5() {
		assertEquals("Buzz", FizzBuzz.metodoSolucao(5));
	}

	@Test
	public void deveRetornarBuzzQuandoReceberMultiploDe5() {
		for(int i = 5; i <= 10; i+= 5)
			assertEquals("Buzz", FizzBuzz.metodoSolucao(5));
	}
	
	@Test
	public void deveRetornarFizzBuzzQuandoReceberMultiploDe3E5() {
		for(int i = 15; i <= 45; i+= 3*5)
			assertEquals("FizzBuzz", FizzBuzz.metodoSolucao(i));
	}

}
