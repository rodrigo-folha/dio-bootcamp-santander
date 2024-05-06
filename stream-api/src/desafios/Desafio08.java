/*
 * Desafio 8 - Somar os dígitos de todos os números da lista: 
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio08 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Function<Integer, Integer> qtdeDigitos = n1 -> String.valueOf(n1).length();
		
		BinaryOperator<Integer> soma = (n1, n2) -> (n1 + n2);
				
		int somatoria = numeros.stream()
				.map(qtdeDigitos)
				.reduce(0, soma);
		
		System.out.println("A somatoria dos digitos é: " + somatoria);
		
		
		
	}
}
