/*
 * Desafio 4 - Remova todos os valores ímpares:
 * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio04 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> filtrarImpares = n1 -> n1 % 2 == 1;
		
		List<Integer> numerosImpares = numeros.stream().filter(filtrarImpares).toList();
		
		numerosImpares.forEach(System.out::println);
		
	}

}
