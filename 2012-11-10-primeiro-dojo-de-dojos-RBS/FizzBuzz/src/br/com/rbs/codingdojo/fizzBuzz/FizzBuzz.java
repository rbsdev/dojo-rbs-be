package br.com.rbs.codingdojo.fizzBuzz;

/**
 * N�meros divis�veis por 3 deve aparecer como 'Fizz' ao inv�s do n�mero;
 * N�meros divis�veis por 5 devem aparecer como 'Buzz' ao inv�s do n�mero;
 * N�meros divis�veis por 3 e 5 devem aparecer como 'FizzBuzz' ao inv�s do n�mero'.
 * Quaisquer outros n�meros devem aparecer eles mesmos.
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
