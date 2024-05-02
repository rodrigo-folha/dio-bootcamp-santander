package main.java.list.pesquisa.questao02.modelo;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;

	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public Integer calcularSoma() {
		int total = 0;
		if (!listaNumeros.isEmpty()) {
			for (Integer numero: listaNumeros) {
				total += numero;
			}
		}
		return total;
	}
	
	public Integer encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		for (Integer numero: listaNumeros) {
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		return maiorNumero;
	}
	
	public Integer encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		for (Integer numero: listaNumeros) {
			if (numero < menorNumero) {
				menorNumero = numero;
			}
		}
		return menorNumero;
	}
	
	public List<Integer> exibirNumeros() {
		return listaNumeros;
	}
	
}
