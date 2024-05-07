/*
 * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio11 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Function<Integer, Integer> quadradoDosNumeros = n1 -> n1*n1;
		
		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
		
		Integer somaDosQuadrados = numeros.stream().map(quadradoDosNumeros).reduce(0, soma);
		
		System.out.println("A soma dos quadrados de todos os numeros da lista é igual a: " + somaDosQuadrados);
		
		
	}

}
