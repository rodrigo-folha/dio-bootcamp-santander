package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.
 */

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6 , 8);
		
		Consumer<Integer> imprimirNumeroPar = n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		};
		
		System.out.println("Forma 1");
		numeros.stream().forEach(imprimirNumeroPar);
		System.out.println("Forma 1.1");
		numeros.forEach(imprimirNumeroPar);
		
		System.out.println("Forma 2");
		numeros.forEach(n-> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});
		
		System.out.println("Forma 3");
		numeros.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
	}
}
