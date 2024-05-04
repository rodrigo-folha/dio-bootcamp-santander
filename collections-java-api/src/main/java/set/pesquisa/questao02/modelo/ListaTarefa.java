package main.java.set.pesquisa.questao02.modelo;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	private Set<Tarefa> conjuntoTarefas;

	public ListaTarefa() {
		this.conjuntoTarefas = new HashSet<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		conjuntoTarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		for (Tarefa t : conjuntoTarefas) {
			if (t.getDescricao() == descricao) {
				conjuntoTarefas.remove(t);
				break;
			}
		}
	}

	public void exibirTarefas() {
		for (Tarefa t : conjuntoTarefas) {
			System.out.println(t);
		}
	}

	public int contarTarefas() {
		return conjuntoTarefas.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : conjuntoTarefas) {
			if (t.isConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : conjuntoTarefas) {
			if (!t.isConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}

	public Tarefa marcarTarefaConcluida(String descricao) {
		Tarefa novaTarefaConcluida = null;
		for (Tarefa t : conjuntoTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				novaTarefaConcluida = new Tarefa(t.getDescricao());
				break;
			}
		}

		if (novaTarefaConcluida == null) {
			System.out.println("A tarefa " + descricao + " nao existe");
		}
		return novaTarefaConcluida;
	}

	public Tarefa marcarTarefaPendente(String descricao) {
		Tarefa novaTarefaPendente = null;
		for (Tarefa t : conjuntoTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
				novaTarefaPendente = new Tarefa(t.getDescricao());
				break;
			}
		}

		if (novaTarefaPendente == null) {
			System.out.println("A tarefa " + descricao + " nao existe");
		}

		return novaTarefaPendente;
	}

	public void limparListaTarefas() {
		conjuntoTarefas.clear();
	}

}
