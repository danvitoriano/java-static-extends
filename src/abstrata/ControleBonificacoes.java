package abstrata;


// POLIMORFISMO
public class ControleBonificacoes {
	private int totalBonificacoes = 0;
	
	public void registra(Funcionario f) {
		totalBonificacoes += f.getBonificacao();
	}
	
	public int getTotalBonificacoes() {
		return totalBonificacoes;
	}
}
