package app;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Principal {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca();
		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();
		
	}

}
