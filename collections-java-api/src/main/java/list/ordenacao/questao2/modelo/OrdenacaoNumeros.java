package main.java.list.ordenacao.questao2.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> listaNumeros;

	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}

	public List<Integer> ordenarAscendente() {
		List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
		Collections.sort(listaAscendente);
		return listaAscendente;
	}

	public List<Integer> ordenarDescendente() {
		List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
		listaDescendente.sort(Collections.reverseOrder());
		return listaDescendente;
	}

}
