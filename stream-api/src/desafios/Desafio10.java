/*
 * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio10 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> multiplos = n1 -> n1 % 3 == 0 || n1 % 5 == 0;
		
		List<Integer> numerosMultiplos = numeros.stream().distinct().filter(multiplos).toList();
		
		System.out.println("Os numeros da lista multiplos de 3 ou 5 são: " + numerosMultiplos);
		
	}

}
