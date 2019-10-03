package exercicioInterface;

public class ContaPoupanca extends ContaBancaria {

	public String getTipo() {
		return "Conta Poupança";
	}
	
	public void saque(double valor){
		saldo -= valor;
	}

}
