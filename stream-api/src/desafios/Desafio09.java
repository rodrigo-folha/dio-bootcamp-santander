/*
 * Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio09 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> repetidos = n1 -> numeros.indexOf(n1) != numeros.lastIndexOf(n1);
		
		List<Integer> numerosRepetidos = numeros.stream()
				.filter(repetidos)
				.distinct()
				.toList();
		
		System.out.println("Os numeros repetidos são: " + numerosRepetidos);
	}
}
