package main.java.set.ordenacao.questao01.modelo;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private long cod;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(long cod, String nome, double preco, int quantidade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.nome);
	}

	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Codigo: " + cod + ", Nome: " + nome + ", Preco: " + preco + ", Quantidade: " + quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

}

class ProdutoPorPreco implements Comparator<Produto> {
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}

}
