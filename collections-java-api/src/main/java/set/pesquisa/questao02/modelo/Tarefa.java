package main.java.set.pesquisa.questao02.modelo;

public class Tarefa {
	private String descricao;
	private boolean concluida;

	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "Tarefa: " + descricao + ", Concluida: " + (concluida == true ? "Sim" : "Não");
	}

	
}
