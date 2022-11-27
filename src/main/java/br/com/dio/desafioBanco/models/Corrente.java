package br.com.dio.desafioBanco.models;

public class Corrente extends Conta{

	public Corrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("***** Extrato da Conta Corrente *****");
		super.imprimirInfoExtrato();
		
	}
	
	

	

	

}
