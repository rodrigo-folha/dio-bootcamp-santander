package main.java.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
	public static void main(String[] args) {
		//Exemplo sem Generics
		Map mapaSemGenerics = new HashMap<>();
		mapaSemGenerics.put("chave 1", 10);
		mapaSemGenerics.put("chave 2", "valor");
		
		//Exemplo com Generics
		Map<String, Integer> mapaGenerics = new HashMap<>();
		mapaGenerics.put("chave 1", 10);
		mapaGenerics.put("chave 2", 20);
		
		//Iterando sobre o mapa com Generics
		for (Map.Entry<String, Integer> elemento: mapaGenerics.entrySet()) {
			String chave = elemento.getKey();
			int valor = elemento.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
		
		//Iterando sobre o mapa sem Generics
		for (Object obj: mapaSemGenerics.entrySet()) {
			Map.Entry elemento = (Map.Entry) obj;
			String chave = (String) elemento.getKey();
			Object valor = elemento.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
	}
}
