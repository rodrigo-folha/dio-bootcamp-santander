package main.java.set.ordenacao.questao01.modelo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> conjuntoProdutos;
	
	public CadastroProdutos() {
		this.conjuntoProdutos = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		conjuntoProdutos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(conjuntoProdutos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutoPorPreco());
		produtosPorPreco.addAll(conjuntoProdutos);
		return produtosPorPreco;
	}
	
	public Set<Produto> exibirProdutos() {
		return conjuntoProdutos;
	}
}
