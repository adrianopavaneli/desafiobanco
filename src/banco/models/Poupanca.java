package banco.models;

public class Poupanca extends Conta{
	
	private double taxa;

	public Poupanca(int agencia, int conta, double saldo) {
		super(agencia, conta, saldo);
		
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	

	

}
