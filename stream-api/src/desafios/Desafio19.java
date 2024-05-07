/*
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio19 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> filtro = n -> n % 3 == 0 || n % 5 == 0;
		
		List<Integer> numerosFiltrados = numeros.stream().filter(filtro).toList();
		
		System.out.println("Os números que são divisiveis por 3 ou por 5 são: " + numerosFiltrados);
		
		
	}
}
