package main.java.map.ordenacao.questao02.app;

import main.java.map.ordenacao.questao02.modelo.LivrariaOnline;
import main.java.map.ordenacao.questao02.modelo.Livro;

public class Principal {
	
	public static void main(String[] args) {
		LivrariaOnline livraria = new LivrariaOnline();
		
		livraria.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
	    livraria.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
	    livraria.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
	    livraria.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
	    livraria.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
	    livraria.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
	    
	    Livro livroMaisBarato = livraria.exibirLivroMaisBarato();
	    Livro livroMaisCaro = livraria.exibirLivroMaisCaro();
	    
	    System.out.println("Livro mais barato: " + livroMaisBarato);
	    System.out.println("Livro mais caro: " + livroMaisCaro);
	    
	    System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
	    System.out.println(livraria.exibirLivrosOrdenadosPorAutor());
	}

}
