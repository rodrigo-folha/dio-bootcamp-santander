package main.java.list.pesquisa.questao01.modelo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listaLivros;
	
	public CatalogoLivros() {
		this.listaLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaPorAutor = new ArrayList<>();
		if (!listaLivros.isEmpty()) {
			for (Livro livro: listaLivros) {
				if (autor.equalsIgnoreCase(livro.getAutor())) {
					listaPorAutor.add(livro);
				}
			}
		}
		return listaPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> listaPorIntervaloAnos = new ArrayList<>();
		if (!listaLivros.isEmpty()) {
			for (Livro livro: listaLivros) {
				if (anoInicial <= livro.getAnoPublicacao() && anoFinal >= livro.getAnoPublicacao()) {
					listaPorIntervaloAnos.add(livro);
				}
			}
		}
		return listaPorIntervaloAnos;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!listaLivros.isEmpty()) {
			for (Livro livro: listaLivros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}			
		}
		return livroPorTitulo;
	}

}
