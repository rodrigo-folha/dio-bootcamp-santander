package main.java.list.operacoes_basicas.questao02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaItens;

	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> listaParaRemover = new ArrayList<>();
		for (Item item: listaItens) {
			if (nome.equalsIgnoreCase(item.getNome())) {
				listaParaRemover.add(item);
			}
		}
		
		listaItens.removeAll(listaParaRemover);		
	}
	
	public double calcularValorTotal() {
		double total = 0;
		for (Item item: listaItens) {
			total += item.getPreco() * item.getQuantidade();
		}
		
		return total;
	}
	
	public void exibirItens() {
		System.out.println("Lista: ");
		for(Item item: listaItens) {
			System.out.println(item.getQuantidade() + "x - " + item.getNome() + " - R$ " + item.getPreco());
		}
	}
	
	
	
}
