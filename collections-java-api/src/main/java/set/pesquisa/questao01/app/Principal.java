package main.java.set.pesquisa.questao01.app;

import main.java.set.pesquisa.questao01.modelo.AgendaContatos;
import main.java.set.pesquisa.questao01.modelo.Contato;

public class Principal {
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

	    // Exibindo os contatos no conjunto (deve estar vazio)
	    agendaContatos.exibirContatos();

	    // Adicionando contatos � agenda
	    agendaContatos.adicionarContato("Jo�o", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Carolina", 55555555);

	    // Exibindo os contatos na agenda
	    agendaContatos.exibirContatos();

	    // Pesquisando contatos pelo nome
	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

	    // Atualizando o n�mero de um contato
	    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);

	    // Exibindo os contatos atualizados na agenda
	    System.out.println("Contatos na agenda ap�s atualiza��o:");
	    agendaContatos.exibirContatos();
	}

}
