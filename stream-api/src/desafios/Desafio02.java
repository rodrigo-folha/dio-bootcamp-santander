/*
 * Desafio 2 - Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */
package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio02 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Consumer<Integer> imprimirPares = n1 -> {
			if (n1 % 2 == 0) {
				System.out.println(n1);
			}
		};
		numeros.stream().forEach(imprimirPares);
		
		BinaryOperator<Integer> soma = (n1, n2) ->  n1 + n2;
		// Filtro booleano
		Predicate<Integer> filtrarPares = n1 -> n1 % 2 == 0;
		
		
		// Forma 1
		int somaDosPares = numeros.stream().filter(filtrarPares).reduce(0, soma);
		System.out.println("A soma dos pares é: " + somaDosPares);
		
		// Forma 2
		somaDosPares = numeros.stream()
				.filter(n1 -> n1 % 2 == 0)
				.reduce(0,soma);
		System.out.println("A soma dos pares é: " + somaDosPares);
	}
}
