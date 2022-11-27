package br.com.dio.desafioBanco.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Poupanca extends Conta{
	
	
	private double taxa;


	
	public Poupanca(Cliente cliente) {
		super(cliente);
		this.taxa = 0.05;
	}
	@Override
	public void deposita(double valor) {
		this.saldo += valor +(valor * this.taxa);
	}
	@Override
	public void transfere(double valor, Conta contaDestino) {
		this.saque(valor);
		this.deposita(valor);
	}

	

	@Override
	public void imprimeExtrato() {
		System.out.println("***** Extrato da Poupança *****");
		super.imprimirInfoExtrato();
		
	}
	

	

}
