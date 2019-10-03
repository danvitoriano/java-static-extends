package abstrata;

public abstract class Funcionario {
	protected int numero;
	protected String nome;
	
	Funcionario(){
//		System.out.println("oi");
	}
	
	Funcionario(String xNome){
		nome = xNome;
	}
	
	void iniciarFuncionario(int xNumero, String xNome) {
		numero = xNumero;
		nome = xNome;
	}
	
	// METODOS ABSTRATOS
	public abstract int getBonificacao();
	
	
	void imprimirFuncionario() {
		System.out.println("numero: " + numero);
		System.out.println("nome: " + nome);
	}
	
}
