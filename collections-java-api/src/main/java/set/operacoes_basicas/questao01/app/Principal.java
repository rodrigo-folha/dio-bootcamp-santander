package main.java.set.operacoes_basicas.questao01.app;

import main.java.set.operacoes_basicas.questao01.modelo.ConjuntoConvidados;

public class Principal {
	public static void main(String[] args) {
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados!");
		
		convidados.adicionarConvidado("Convidado 1", 1234);
		convidados.adicionarConvidado("Convidado 2", 1235);
		convidados.adicionarConvidado("Convidado 3", 1235);
		convidados.adicionarConvidado("Convidado 4", 1236);
		
		//O Uso do HashCode e Equals usando como parametro o codigoConvite nao deixou criar outro convidado com o mesmo codigoConvite
		
		System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados!");
		convidados.exibirConvidados();
		
		convidados.removerConvidadoPorCodigoConvite(1235);
		System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set de convidados!");
		convidados.exibirConvidados();
		
	}

}
