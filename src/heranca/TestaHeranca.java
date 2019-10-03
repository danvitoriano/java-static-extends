package heranca;

public class TestaHeranca {

	public static void main(String[] args) {
		Motorista m1 = new Motorista();
		m1.iniciarFuncionario(123, "Danilo");
		m1.iniciarHabilitacao(999);
		
//		m1.imprimirHabilitacao();
		
		// SEGUNDA PARTE
		
		Motorista f1 = new Motorista();
		f1.iniciarFuncionario(456, "Maria");
//		f1.imprimirFuncionario();
		Funcionario f2 = (Funcionario) f1;
		f2.imprimirFuncionario();
		
		Funcionario[] arrF = new Motorista[3];
		arrF[0] = m1;
//		arrF[1] = new Motorista();
		arrF[1] = f1;
//		arrF[2] = new Funcionario();
		
		System.out.println(arrF[0].nome);
		System.out.println(arrF[1].nome);
//		System.out.println(arrF[2].nome);
		
		// TERCEIRA PARTE
		
		arrF[1].nome = "Lucas";
//		arrF[2].nome = "Tais";
		
		System.out.println(arrF[1].nome);
//		System.out.println(arrF[2].nome);
		
	}

}
