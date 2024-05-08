package modelo;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

}
