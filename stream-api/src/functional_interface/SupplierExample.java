package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


/*
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo. 
 */

public class SupplierExample {
	public static void main(String[] args) {
		// Usar o Supplier com expressao lambda para fornecer uma sauda��o personalizada
		Supplier<String> saudacao = () -> "Ola, seja bem-vindo!";

		// Usar o Supplier para gerar uma lista com 5 saudacoes
		List<String> listaSaudacoes = Stream.generate(saudacao)
				.limit(5)
				.toList();
		
		// Imprimindo Saudacoes
		System.out.println("---- Primeira forma usando lambda ----");
		listaSaudacoes.forEach(p -> System.out.println(p));
		System.out.println("---- Segunda forma, usando Method Reference ----");
		listaSaudacoes.forEach(System.out::println);
	}

}
