package main.java.list.ordenacao.questao01.app;

import java.util.Collections;

import main.java.list.ordenacao.questao01.modelo.OrdenacaoPessoas;

public class Principal {
	public static void main(String[] args) {
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		listaPessoas.adicionarPessoa("Fulano", 20, 1.82);
		listaPessoas.adicionarPessoa("Ciclano", 15, 1.75);
		listaPessoas.adicionarPessoa("Beltrano", 17, 1.73);
		listaPessoas.adicionarPessoa("Jose", 45, 1.70);
		listaPessoas.adicionarPessoa("Maria", 57, 1.72);
		
		System.out.println("Ordenando por altura");
		System.out.println(listaPessoas.ordenarPorAltura());
		
		System.out.println("Ordenando por idade");
		System.out.println(listaPessoas.ordenarPorIdade());
		
		
	}

}
