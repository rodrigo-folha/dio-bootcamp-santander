package main.java.map.pesquisa.questao02.app;

import main.java.map.pesquisa.questao02.modelo.ContagemPalavras;

public class Principal {
	public static void main(String[] args) {
		ContagemPalavras contagemPalavras = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
		contagemPalavras.adicionarPalavra("Java", 2);
		contagemPalavras.adicionarPalavra("Python", 8);
		contagemPalavras.adicionarPalavra("JavaScript", 1);
		contagemPalavras.adicionarPalavra("C#", 6);

	    // Exibe a contagem total de linguagens
		contagemPalavras.exibirContagemPalavras();

	    // Encontra e exibe a linguagem mais frequente
		System.out.println("A palavra mais frequente e: " + contagemPalavras.encontrarPalavraMaisFrequente());
//	    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
	}
}
