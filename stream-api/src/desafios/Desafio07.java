/*
 * Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Comparator<Integer> ordenarCrescente = (n1, n2) -> n1.compareTo(n2);
		
		List<Integer> numerosOrdenados = numeros.stream()
				.sorted(ordenarCrescente)
				.toList();

		System.out.println(numerosOrdenados);
		
		int segundoMaiorNumero = numerosOrdenados.get(numeros.size() - 2);
		System.out.println("O segundo maior numero da lista e: " + segundoMaiorNumero);
		
		
	}

}
