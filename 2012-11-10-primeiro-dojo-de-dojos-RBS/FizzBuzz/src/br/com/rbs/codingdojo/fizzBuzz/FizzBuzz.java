package br.com.rbs.codingdojo.fizzBuzz;

/**
 * Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
 * Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
 * Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.
 * Quaisquer outros números devem aparecer eles mesmos.
 * @author HelMedeiros and AndreTrevisani
 */
public class FizzBuzz {

	public static String metodoSolucao(int numero) {
		final StringBuilder sb = new StringBuilder();
        if (numero % 3 == 0) {
            sb.append("Fizz");
            if (numero % 5 == 0) {
                sb.append("Buzz");
            }
        } else if (numero % 5 == 0) {
            sb.append("Buzz");
        } else {
            sb.append(numero);
        }
        return sb.toString();
	}

}
