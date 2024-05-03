package main.java.set.operacoes_basicas.questao02.modelo;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> conjuntoPalavras;
	
	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		conjuntoPalavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		for (String p: conjuntoPalavras) {
			if (p.equalsIgnoreCase(palavra)) {
				conjuntoPalavras.remove(palavra);
				break;
			}
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		return conjuntoPalavras.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		for (String p: conjuntoPalavras) {
			System.out.println(p);
		}
	}
	
}
