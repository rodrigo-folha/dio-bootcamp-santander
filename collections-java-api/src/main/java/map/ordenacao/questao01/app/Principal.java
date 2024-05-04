package main.java.map.ordenacao.questao01.app;

import java.time.LocalDate;
import java.time.Month;

import main.java.map.ordenacao.questao01.modelo.AgendaEventos;

public class Principal {

	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Confer�ncia de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programa��o", "Aula pr�tica de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lan�amento de Software", "Demonstra��o da nova vers�o");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inova��o", "Competi��o de solu��es criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 12), "Dia das m�es", "Eventos de Dia das m�es");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Semin�rio de Intelig�ncia Artificial", "Discuss�o sobre IA avan�ada");
	    
	    agendaEventos.exibirAgenda();
	    
	    agendaEventos.obterProximoEvento();
	}
}
