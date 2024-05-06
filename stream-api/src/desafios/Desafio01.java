package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 * Desafio 1 - Mostre a lista na ordem numérica:
 * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */

public class Desafio01 {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// Forma 1
		System.out.println("Forma 1");
		numeros.stream()
			.sorted()
			.forEach(System.out::println);
		
		Consumer<Integer> imprimir = p -> System.out.print(p + " ");

		// Forma 2 Usando Comparator
		System.out.println("Forma 2");
		Comparator<Integer> ordenarPorOrdemCrescente = (p1, p2) -> Integer.compare(p1, p2);
		
		numeros.stream()
			.sorted(ordenarPorOrdemCrescente)
			.forEach(imprimir);
		
		
		// Forma 3
		System.out.println("\nForma 3");
		numeros.stream()
			.sorted((p1, p2) -> Integer.compare(p1, p2))
			.forEach(p -> System.out.print(p + " "));;
	}
}
