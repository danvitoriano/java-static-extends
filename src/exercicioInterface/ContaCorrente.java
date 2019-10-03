package exercicioInterface;

public class ContaCorrente extends ContaBancaria implements Tributacao {

	public String getTipo() {
		return "Conta Corrente";
	}
	
	public void saque(double valor){
		saldo -= valor + (valor * 0.01);
	}

	@Override
	public double calcularTributo() {
		return saldo * 0.03;
	}

}
