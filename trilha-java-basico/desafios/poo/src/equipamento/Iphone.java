package equipamento;

import equipamento.aparalho_telefonico.AparelhoTelefonico;
import equipamento.navegador.NavegadorInternet;
import equipamento.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
	public void ligar() {
		System.out.println("Ligando...");
	}

	public void atender() {
		System.out.println("Atendendo...");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void exibirPagina() {
		System.out.println("Exibindo pagina");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}

	public void tocar() {
		System.out.println("Tocando Musica");
	}

	public void pausar() {
		System.out.println("Pausando Musica");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
	}

}
