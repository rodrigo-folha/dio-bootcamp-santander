package main.java.set.pesquisa.questao01.modelo;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatosSet;
	
	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		for(Contato c: contatosSet) {
			System.out.println(c);
		}
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<Contato>();
		for (Contato c: contatosSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato novoContato = null;
		for(Contato c: contatosSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				novoContato = c;
			}
		}
		return novoContato;
	}
	
}
