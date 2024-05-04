package main.java.map.operacoes_basicas.questao01.app;

import main.java.map.operacoes_basicas.questao01.modelo.AgendaContatos;

public class Principal {
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
	    agendaContatos.adicionarContato("João", 5665);
	    agendaContatos.adicionarContato("Carlos", 1111111);
	    agendaContatos.adicionarContato("Ana", 654987);
	    agendaContatos.adicionarContato("Maria", 1111111);
	    agendaContatos.adicionarContato("Camila", 44444);
	    
	    agendaContatos.exibirContatos();
	    
	    agendaContatos.removerContato("Camila");
	    agendaContatos.exibirContatos();
	    
	    System.out.println(agendaContatos.pesquisarPorNome("João"));
	    System.out.println(agendaContatos.pesquisarPorNome("Paula"));
	}

}
