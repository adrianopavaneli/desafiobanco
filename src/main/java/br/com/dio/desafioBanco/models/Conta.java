package br.com.dio.desafioBanco.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
	
	private static final int AGENCIA = 001;
	private static int sequencial = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA;
		this.conta = sequencial++;
		this.cliente = cliente;
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
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Seu saldo é de: %.2f", this.saldo));
		System.out.println();
	}
	
	
}
