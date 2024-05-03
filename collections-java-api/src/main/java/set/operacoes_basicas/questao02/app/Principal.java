package main.java.set.operacoes_basicas.questao02.app;

import main.java.set.operacoes_basicas.questao02.modelo.ConjuntoPalavrasUnicas;

public class Principal {
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
		
	    // Adicionando linguagens �nicas ao conjunto
	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    // Exibindo as linguagens �nicas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem do conjunto
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem inexistente
	    conjuntoLinguagens.removerPalavra("Swift");

	    // Verificando se uma linguagem est� no conjunto
	    System.out.println("A linguagem 'Java' est� no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("A linguagem 'Python' est� no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

	    // Exibindo as linguagens �nicas atualizadas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	}
}
