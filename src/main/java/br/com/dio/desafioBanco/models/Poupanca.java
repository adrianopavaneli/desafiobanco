package br.com.dio.desafioBanco.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Poupanca extends Conta{
	
	
	private double taxa;


	
	public Poupanca(Cliente cliente) {
		super(cliente);
		this.taxa = 0.5;
	}

	

	

	@Override
	public void imprimeExtrato() {
		System.out.println("***** Extrato da Poupança *****");
		super.imprimirInfoExtrato();
		
	}
	

	

}
