package main.java.list.ordenacao.questao2.app;

import main.java.list.ordenacao.questao2.modelo.OrdenacaoNumeros;

public class Principal {
	public static void main(String[] args) {
		OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
		listaNumeros.adicionarNumero(1);
		listaNumeros.adicionarNumero(5);
		listaNumeros.adicionarNumero(4);
		listaNumeros.adicionarNumero(3);
		listaNumeros.adicionarNumero(6);
		listaNumeros.adicionarNumero(2);
		
		System.out.println(listaNumeros.ordenarAscendente());
		System.out.println(listaNumeros.ordenarDescendente());
	}
}
