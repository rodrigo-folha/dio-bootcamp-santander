package main.java.list.ordenacao.questao01.app;

import java.util.Collections;

import main.java.list.ordenacao.questao01.modelo.OrdenacaoPessoas;

public class Principal {
	public static void main(String[] args) {
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		listaPessoas.adicionarPessoa("Nome 1", 20, 1.56);
		listaPessoas.adicionarPessoa("Nome 2", 30, 1.80);
		listaPessoas.adicionarPessoa("Nome 3", 25, 1.70);
		listaPessoas.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println("Ordenando por altura");
		System.out.println(listaPessoas.ordenarPorAltura());
		
		System.out.println("Ordenando por idade");
		System.out.println(listaPessoas.ordenarPorIdade());
		
		
	}

}
