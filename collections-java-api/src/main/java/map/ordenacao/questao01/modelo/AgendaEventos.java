package main.java.map.ordenacao.questao01.modelo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventos;
	
	public AgendaEventos() {
		this.eventos = new HashMap<LocalDate, Evento>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventos.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
		for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();				
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
				break;
			}
		}
	}
}
