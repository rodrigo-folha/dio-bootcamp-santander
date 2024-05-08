package app;

import java.util.ArrayList;
import java.util.List;

import modelo.Banco;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Principal {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("João");
		Cliente c2 = new Cliente("Maria");

		Banco banco1 = new Banco();
		banco1.adicionarCliente(c1);
		banco1.adicionarCliente(c2);

		List<Conta> contasCorrentes = new ArrayList<>();
		contasCorrentes.add(new ContaCorrente(c1));
		contasCorrentes.add(new ContaCorrente(c2));

		List<Conta> contasPoupancas = new ArrayList<>();
		contasPoupancas.add(new ContaPoupanca(c1));
		contasPoupancas.add(new ContaPoupanca(c2));

		contasCorrentes.get(0).depositar(150);
		contasCorrentes.get(1).depositar(200);
		contasCorrentes.get(0).transferir(500, contasCorrentes.get(1));
		contasCorrentes.get(1).transferir(50, contasPoupancas.get(0));

		contasCorrentes.stream().forEach(n -> n.imprimirExtrato());
		contasPoupancas.stream().forEach(n -> n.imprimirExtrato());

	}

}
