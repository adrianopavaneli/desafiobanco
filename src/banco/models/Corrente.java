package banco.models;

public class Corrente extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("***** Extrato da Conta Corrente *****");
		super.imprimirInfoExtrato();
		
	}
	
	

	

	

}
