package main.java.list.operacoes_basicas;

public class Questao1 {
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("Quantidade de elementos na lista: ");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		System.out.println("Adicionando tarefas... ");
		listaTarefas.adicionarTarefa("Tarefa 1");
		listaTarefas.adicionarTarefa("Tarefa 2");
		listaTarefas.adicionarTarefa("Tarefa 3");
		listaTarefas.adicionarTarefa("Tarefa 4");
		listaTarefas.adicionarTarefa("Tarefa 4");
		
		System.out.println("Elementos da lista: ");
		listaTarefas.obterDescricoesTarefas();

		System.out.println("Quantidade de elementos na lista: ");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		System.out.println("Removendo tarefas...");
		listaTarefas.removerTarefa("Tarefa 4");
		System.out.println("Quantidade de elementos na lista: ");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());

		System.out.println("Elementos da lista: ");
		listaTarefas.obterDescricoesTarefas();
		
	}

}
