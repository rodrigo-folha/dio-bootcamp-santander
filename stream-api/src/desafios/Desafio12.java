/*
 * Desafio 12 - Encontre o produto de todos os números da lista:
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio12 {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		BinaryOperator<Integer> produto = (n1, n2) -> n1 * n2;
		
		Integer resultado = numeros.stream()
				.reduce(1, produto);
		
		System.out.println("O produto dos numeros da lista é igual a: " + resultado);
		
	}

}
