package main.java.list.ordenacao.questao01.modelo;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private Integer idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa p) {
		return idade.compareTo(p.idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
	}

}

class CompararAltura implements Comparator<Pessoa> {
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}

}
