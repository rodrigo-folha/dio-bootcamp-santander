package main.java.set.pesquisa.questao02.app;

import main.java.set.pesquisa.questao02.modelo.ListaTarefa;

public class Principal {
	public static void main(String[] args) {
		ListaTarefa conjuntoTarefas = new ListaTarefa();
		
		System.out.println("Listando tarefas...");
		conjuntoTarefas.adicionarTarefa("Lavar as loucas");
		conjuntoTarefas.adicionarTarefa("Varrer a casa");
		conjuntoTarefas.adicionarTarefa("Encher o filtro");
		conjuntoTarefas.adicionarTarefa("Capinar o lote");
		
		conjuntoTarefas.exibirTarefas();
		System.out.println("Quantidade de Tarefas: " + conjuntoTarefas.contarTarefas());
		
		System.out.println("------------------------------------");
		System.out.println("Marcando tarefas como concluidas...");
		conjuntoTarefas.marcarTarefaConcluida("Lavar as loucas");
		conjuntoTarefas.marcarTarefaConcluida("Varrer a casa");
		conjuntoTarefas.exibirTarefas();
		
		System.out.println("------------------------------------");
		System.out.println("Marcando tarefas como pendentes...");
		conjuntoTarefas.marcarTarefaPendente("Dividir o mar ao meio");
		conjuntoTarefas.marcarTarefaPendente("Lavar as loucas");
		conjuntoTarefas.exibirTarefas();
		
		System.out.println("Lista das tarefas concluidas: ");
		System.out.println(conjuntoTarefas.obterTarefasConcluidas());
		System.out.println("Lista das tarefas pendentes: ");
		System.out.println(conjuntoTarefas.obterTarefasPendentes());
	
		System.out.println("------------------------------------");
		System.out.println("Removendo a tarefa capinar o lote");
		conjuntoTarefas.removerTarefa("Capinar o lote");
		conjuntoTarefas.exibirTarefas();
		
		System.out.println("Limpando a lista!");
		conjuntoTarefas.limparListaTarefas();
		conjuntoTarefas.exibirTarefas();
		System.out.println("Quantidade de Tarefas: " + conjuntoTarefas.contarTarefas());
		
	}
}
