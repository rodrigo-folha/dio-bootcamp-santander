package app;

import equipamento.Iphone;

public class Principal {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// Utilizando as funcoes de Reprodutor Musical
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		// Utilizando as funcoes de Aparelho Telefonico
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		// Utilizando as funcoes de Navegador na Internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
