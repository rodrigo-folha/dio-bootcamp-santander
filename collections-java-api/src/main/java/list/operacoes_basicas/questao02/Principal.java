package main.java.list.operacoes_basicas.questao02;

public class Principal {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Caderno", 19.90, 2);
		carrinho.adicionarItem("Lapis", 1.90, 1);
		carrinho.adicionarItem("Grafite Pentel", 29.90, 1);
		carrinho.adicionarItem("Caneta", 2.49, 5);
		carrinho.exibirItens();
		System.out.println("Preço Total: " + carrinho.calcularValorTotal());
		
		carrinho.removerItem("Grafite Pentel");
		
		carrinho.exibirItens();
		
		System.out.println("Preço Total: " + carrinho.calcularValorTotal());
	}
}
