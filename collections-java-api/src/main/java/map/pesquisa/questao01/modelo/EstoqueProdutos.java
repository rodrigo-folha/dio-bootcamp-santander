package main.java.map.pesquisa.questao01.modelo;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutos;
	
	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<Long, Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public double calcularValorTotalEstoque() {
		double total = 0;
		if (!estoqueProdutos.isEmpty()) {
			for (Produto p: estoqueProdutos.values()) {
				total += (p.getPreco() * p.getQuantidade());
			}
		}
		return total;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double precoMaisCaro = Double.MIN_VALUE;
		for (Produto p: estoqueProdutos.values()) {
			if (p.getPreco() > precoMaisCaro) {
				precoMaisCaro = p.getPreco();
				produtoMaisCaro = p;
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double precoMaisBarato = Double.MAX_VALUE;
		for (Produto p: estoqueProdutos.values()) {
			if (p.getPreco() < precoMaisBarato) {
				precoMaisBarato = p.getPreco();
				produtoMaisBarato = p;
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaisValioso = null;
		if (!estoqueProdutos.isEmpty()) {
			double totalPorProduto = 0;
			double produtoMaior = Double.MIN_VALUE;
			for (Produto p: estoqueProdutos.values()) {
				totalPorProduto += (p.getPreco() * p.getQuantidade());
				if (totalPorProduto > produtoMaior) {
					produtoMaior = totalPorProduto;
					produtoMaisValioso = p;
				}
				totalPorProduto = 0;
			}
		}
		return produtoMaisValioso;
	}
	
}
