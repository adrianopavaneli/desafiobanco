package banco.models;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA = 001;
	private static int sequencial = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	public Conta() {
		this.agencia = Conta.AGENCIA;
		this.conta = sequencial++;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void transfere(double valor, Conta contaDestino) {
		this.saque(valor);
		contaDestino.deposita(valor);
	}
	
	protected void imprimirInfoExtrato() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Seu saldo é de: %2d", this.saldo));
	}
	
	
}
