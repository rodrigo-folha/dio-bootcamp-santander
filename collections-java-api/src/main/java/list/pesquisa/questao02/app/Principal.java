package main.java.list.pesquisa.questao02.app;

import main.java.list.pesquisa.questao02.modelo.SomaNumeros;

public class Principal {
	public static void main(String[] args) {
		SomaNumeros listaNumeros = new SomaNumeros();
		listaNumeros.adicionarNumero(3);
		listaNumeros.adicionarNumero(2);
		listaNumeros.adicionarNumero(1);
		listaNumeros.adicionarNumero(6);
		listaNumeros.adicionarNumero(5);
		listaNumeros.adicionarNumero(4);
		
		System.out.println(listaNumeros.calcularSoma());
		System.out.println(listaNumeros.encontrarMaiorNumero());
		System.out.println(listaNumeros.encontrarMenorNumero());
		System.out.println(listaNumeros.exibirNumeros());
	}

}
