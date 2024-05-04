package main.java.map.ordenacao.questao02.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
	private Map<String, Livro> livros;

	public LivrariaOnline() {
		this.livros = new HashMap<>();
	}

	public void adicionarLivro(String link, Livro livro) {
		livros.put(link, livro);
	}

	public void removerLivro(String titulo) {
		livros.remove(titulo);
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosOrdenadosPreco = new ArrayList<>(livros.entrySet());
		Collections.sort(livrosOrdenadosPreco, new ComparatorPorPreco());
		Map<String, Livro> livrosOrdenados = new LinkedHashMap<String, Livro>();
		for (Map.Entry<String, Livro> entry : livrosOrdenadosPreco) {
			livrosOrdenados.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenados;
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());
		Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
		Map<String, Livro> livrosOrdenados = new LinkedHashMap<String, Livro>();
		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
			livrosOrdenados.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenados;
	}

	public Livro exibirLivroMaisCaro() {
		double maiorPreco = Double.MIN_VALUE;
		Livro livroMaisCaro = null;
		Map<String, Livro> livrosOrdenadosPreco = new TreeMap<>(livros);
		for (Map.Entry<String, Livro> entry : livrosOrdenadosPreco.entrySet()) {
			if (entry.getValue().getPreco() > maiorPreco) {
				maiorPreco = entry.getValue().getPreco();
				livroMaisCaro = entry.getValue();
			}
		}
		return livroMaisCaro;
	}

	public Livro exibirLivroMaisBarato() {
		double menorPreco = Double.MAX_VALUE;
		Livro livroMaisBarato = null;
		Map<String, Livro> livrosOrdenadosPreco = new TreeMap<>(livros);
		for (Map.Entry<String, Livro> entry : livrosOrdenadosPreco.entrySet()) {
			if (entry.getValue().getPreco() < menorPreco) {
				menorPreco = entry.getValue().getPreco();
				livroMaisBarato = entry.getValue();
			}
		}
		return livroMaisBarato;
	}

}
