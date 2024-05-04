package main.java.map.operacoes_basicas.questao02.modelo;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario;
	
	public Dicionario() {
		this.dicionario = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String palavraPesquisada = null;
		if (!dicionario.isEmpty()) {
			palavraPesquisada = dicionario.get(palavra);
		}
		return palavraPesquisada;
	}
	
	
}
