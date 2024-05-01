package equipamento.aparalho_telefonico;

public class Celular implements AparelhoTelefonico {

	public void ligar() {
		System.out.println("Ligando...");
	}

	public void atender() {
		System.out.println("Atendendo...");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
