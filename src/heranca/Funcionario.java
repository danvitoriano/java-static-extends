package heranca;

public class Funcionario {
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
	
	int getBonificacao() {
		return 10;
	}
	
	void imprimirFuncionario() {
		System.out.println("numero: " + numero);
		System.out.println("nome: " + nome);
	}
	
}
