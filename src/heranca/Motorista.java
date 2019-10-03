package heranca;

public class Motorista extends Funcionario {
	int habilitacao;
	
//	QUARTA PARTE - CONSTRUTORES NÃO HERDAM
//	SUPER
	
//	Motorista(String xNome){
//		super(xNome);
//	}
//	
//	Motorista(){
//		super();
//	}
	
	void iniciarHabilitacao(int xHabilitacao) {
		habilitacao = xHabilitacao;
	}
	
//	SEGUNDA PARTE - SOBREESCRITA DE MÉTODO
	
//	@Override
	void imprimirFuncionario() {
		System.out.println("ola bebe");
		System.out.println("numero: " + numero);
		System.out.println("nome: " + nome);
	}
	
	// POLIMORFISMO
//	int getBonificacao() {
//		return 40;
//	}
	
	void imprimirHabilitacao() {
//		imprimirFuncionario(); // 
//		super.imprimirFuncionario();
		System.out.println("nome: "+nome);
		System.out.println("numero: "+numero);
		System.out.println("habilitacao: "+habilitacao);
	}
	
}
