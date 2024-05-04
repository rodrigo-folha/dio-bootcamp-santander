package main.java.map.pesquisa.questao01.app;

import main.java.map.pesquisa.questao01.modelo.EstoqueProdutos;
import main.java.map.pesquisa.questao01.modelo.Produto;

public class Principal {
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
	    
	    estoque.exibirProdutos();
	    
	    System.out.println("O valor total em estoque é de R$ " + estoque.calcularValorTotalEstoque());
	    
	    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    
	    System.out.println("O produto mais caro é: " + produtoMaisCaro);
	    System.out.println("O produto mais barato é: " + produtoMaisBarato);
	    
	    Produto produtoMaisValioso = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("O produto com maior quantidadeem valor no estoque: " + produtoMaisValioso);
	    
	}
}
