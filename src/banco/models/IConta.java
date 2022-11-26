package banco.models;

public interface IConta {
	
	void saque(double valor);
	void deposita(double valor);
	void transfere(double valor, Conta contaDestino);
	void imprimeExtrato();

}
