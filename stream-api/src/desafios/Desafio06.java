/*
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */

package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio06 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> filtroMaiorQueDez = n -> n > 10;
		
		System.out.println("Tem algum numero maior que 10 na lista? " + (numeros.stream().anyMatch(filtroMaiorQueDez) ? "Sim" : "Não"));
		
		// Imprimindo os numeros maiores que 10, caso haja.
		numeros.stream().filter(filtroMaiorQueDez).forEach(System.out::println);
		
	}
	
}
