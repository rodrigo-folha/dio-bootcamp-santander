package equipamento.reprodutor_musical;

public class Ipod implements ReprodutorMusical{
	
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
