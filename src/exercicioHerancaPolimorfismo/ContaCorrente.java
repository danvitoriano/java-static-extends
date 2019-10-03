package exercicioHerancaPolimorfismo;

public class ContaCorrente extends ContaBancaria {

	public String getTipo() {
		return super.getTipo() + " Corrente";
	}
	
	public void saque(double valor){
		saldo -= valor + (valor * 0.01);
	}

}
