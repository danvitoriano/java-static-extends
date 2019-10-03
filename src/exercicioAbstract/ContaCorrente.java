package exercicioAbstract;

public class ContaCorrente extends ContaBancaria {

	public String getTipo() {
		return "Conta Corrente";
	}
	
	public void saque(double valor){
		saldo -= valor + (valor * 0.01);
	}

}
