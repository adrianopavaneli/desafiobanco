package br.com.dio.desafioBanco.application;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafioBanco.models.Cliente;
import br.com.dio.desafioBanco.models.Conta;
import br.com.dio.desafioBanco.models.Corrente;
import br.com.dio.desafioBanco.models.Poupanca;

public class Banco {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		Cliente cli1 = new Cliente("Adriano Pavaneli", "454645646", "adriano@gmail.com", "179948144884");
		clientes.add(cli1);
		Cliente cli2 = new Cliente("Reginaldo Faria", "3432432", "reginaldo@gmail.com", "179948144884");
		clientes.add(cli2);
			
		
		
		Conta cc1 = new Corrente(cli1);
		Conta cc2 = new Poupanca(cli1);
		cc1.deposita(500);
		cc2.deposita(300);
		cc1.transfere(400, cc2);
		cc1.imprimeExtrato();
		cc2.imprimeExtrato();
	
		
		System.out.println("***** Lista de Clientes *****");
		for (Cliente cl : clientes) {
			System.out.println(cl.getNome());
			
		}
	}

}
