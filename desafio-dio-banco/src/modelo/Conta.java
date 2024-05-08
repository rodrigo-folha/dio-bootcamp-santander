package modelo;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor ) {
			saldo -= valor;		
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);			
		} else {
			System.out.println("Saldo insuficiente");
		}
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
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

	@Override
	public String toString() {
		return cliente + ", Agencia: " + agencia + ", Numero: " + numero + ", Saldo: " + saldo;
	}

}
