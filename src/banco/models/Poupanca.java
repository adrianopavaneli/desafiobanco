package banco.models;

public class Poupanca extends Conta{
	
	private double taxa;


	
		
	

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("***** Extrato da Pòupança *****");
		super.imprimirInfoExtrato();
		
	}
	

	

}
