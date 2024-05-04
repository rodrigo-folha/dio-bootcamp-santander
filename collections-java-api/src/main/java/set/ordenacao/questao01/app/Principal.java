package main.java.set.ordenacao.questao01.app;

import main.java.set.ordenacao.questao01.modelo.CadastroProdutos;

public class Principal {
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    // Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

	    // Exibindo todos os produtos no cadastro
	    System.out.println(cadastroProdutos.exibirProdutos());

	    // Exibindo produtos ordenados por nome
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());

	    // Exibindo produtos ordenados por preço
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
}
