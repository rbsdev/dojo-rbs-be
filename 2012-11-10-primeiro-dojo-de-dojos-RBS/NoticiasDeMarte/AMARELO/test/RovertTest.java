import static org.junit.Assert.*;

import org.junit.Test;

import br.com.rbs.dojo.amarelo.Rover;


public class RovertTest {

	@Test
	public void deveRetornar7777QuandoReceberS() {
		assertEquals("7777", Rover.criptografa("s"));
	}
	
	@Test
	public void deveRetornar33QuandoReceberE() {
		assertEquals("33", Rover.criptografa("e"));
	}
	
	@Test
	public void deveRetornar77773367QuandoReceberSemp() {
		assertEquals("77773367", Rover.criptografa("semp"));
	}
	
	@Test
	public void deveRetornarUnderlineQuandoReceberCaracterIguaisAoAnterior() {
		assertEquals("77773367_77733", Rover.criptografa("sempre"));
	}
	
	@Test
	public void deveRetornar77773367_7773302QuandoReceberSempre0a() {
		assertEquals("77773367_7773302", Rover.criptografa("sempre a"));
	}
	
	@Test
	public void deveRetornarFraseCriptografadaQuandoReceberString() {
		assertEquals("77773367_7773302_222337777_777766606660366656667889999_9999555337777", Rover.criptografa("sempre acesso o dojopuzzles"));
	}
	

}
