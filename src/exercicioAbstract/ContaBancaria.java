package exercicioAbstract;

public abstract class ContaBancaria {

	// atributos
	private String titular;
	protected double saldo;

	// adiciona getTipo
	public abstract String getTipo();

	// métodos
	public void saque(double valor){
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	// getters / setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo(){
		return saldo;
	}

}
