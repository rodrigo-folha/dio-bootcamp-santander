/*
 * Desafio 14 - Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Desafio14 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> numeroPrimo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
		};
		
		numeros.stream().filter(numeroPrimo).forEach(System.out::println);
		
		List<Integer> numerosPrimos = numeros.stream().filter(numeroPrimo).sorted().toList();
		
		int maiorPrimo = numerosPrimos.get(numerosPrimos.size() - 1);
		System.out.println("O maior numero primo da lista é: " + maiorPrimo);
		
	}
}
