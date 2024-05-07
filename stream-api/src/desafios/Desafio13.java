/*
 * Desafio 13 - Filtrar os números que estão dentro de um intervalo:
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio13 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> intervalo = n1 -> n1 > 5 && n1 < 10;
		
		List<Integer> numerosIntervalados = numeros.stream().filter(intervalo).toList();
		
		System.out.println("Os numeros que estão entre os intervalos 5 e 10 são: " + numerosIntervalados);
		
	}
}
