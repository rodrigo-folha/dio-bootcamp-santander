package main.java.map.operacoes_basicas.questao02.app;

import main.java.map.operacoes_basicas.questao02.modelo.Dicionario;

public class Principal {
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Palavra 1", "definicao da palavra 1");
		dicionario.adicionarPalavra("Palavra 2", "definicao da palavra 2");
		dicionario.adicionarPalavra("Palavra 3", "definicao da palavra 3");
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Palavra 1");
		dicionario.exibirPalavras();
	}

}
