package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes;

	public Banco() {
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void imprimirClientes() {
		System.out.println("O banco 1 tem os seguintes clientes: ");
		System.out.println(clientes);
	}

}
