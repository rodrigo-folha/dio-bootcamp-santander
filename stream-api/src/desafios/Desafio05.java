/*
 * Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio05 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(numeros);
		
		Consumer<Integer> imprimirMaioresQueCinco = n -> {
			if (n > 5) {
				System.out.print(n + " ");
			}
		};
		System.out.println("Imprimindo todos os números maiores que 5: ");
		numeros.stream().forEach(imprimirMaioresQueCinco);
		System.out.println();
		
		Predicate<Integer> filtroMaiorQueCinco = n -> n > 5;
		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
		
		int resultado = numeros.stream()
				.filter(filtroMaiorQueCinco)
				.reduce(0,soma);
		
		System.out.println("A somatória dos numeros maiores que 5 é: " + resultado);
		
		List<Integer> maioresQueCinco = numeros.stream().filter(filtroMaiorQueCinco).map(n -> n).toList();
		int somatoria = maioresQueCinco.stream().reduce(0, soma);
		
		double media = somatoria / maioresQueCinco.size();
		
		System.out.println("A média dos números maiores que cinco é igual a: " + media);
		
	}
}
