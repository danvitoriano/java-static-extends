package abstrata;

public class TestaHeranca {

	public static void main(String[] args) {
//		Motorista m1 = new Motorista();
//		m1.iniciarFuncionario(123, "Danilo");
//		m1.iniciarHabilitacao(999);
		
//		m1.imprimirHabilitacao();
		
		// SEGUNDA PARTE
		// HERANÇCA
//		Motorista f1 = new Motorista();
//		f1.iniciarFuncionario(456, "Maria");
////		f1.imprimirFuncionario();
//		Funcionario f2 = (Funcionario) f1;
//		f2.imprimirFuncionario();
		
//		Funcionario[] arrF = new Motorista[3];
//		arrF[0] = m1;
//		arrF[1] = new Motorista();
//		arrF[1] = f1;
//		arrF[2] = new Funcionario();
		
//		System.out.println(arrF[0].nome);
//		System.out.println(arrF[1].nome);
//		System.out.println(arrF[2].nome);
		
		// TERCEIRA PARTE
		// ARRAY
//		arrF[1].nome = "Lucas";
//		arrF[2].nome = "Tais";
		
//		System.out.println(arrF[1].nome);
//		System.out.println(arrF[2].nome);
		
		
		// POLIMORFISMO
//		Funcionario func = new Funcionario();
//		func.iniciarFuncionario(123, "Danilo");
//		func.imprimirFuncionario();
//		
//		Motorista moto = new Motorista();
//		moto.iniciarFuncionario(456, "Moto");
//		func = moto;
//		
//		moto.imprimirFuncionario();
//		
//		System.out.println(func);
//		System.out.println(moto);
		
		// POLIMORFISMO
		
		ControleBonificacoes cb = new ControleBonificacoes();
		
		Motorista m1 = new Motorista();
		cb.registra(m1);
		
		Diretor d1 = new Diretor();
		cb.registra(d1);
		
		Gerente g1 = new Gerente();
		cb.registra(g1);
		
		
		System.out.println(cb.getTotalBonificacoes());
		
	}

}
