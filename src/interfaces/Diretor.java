package interfaces;

//implementa interface autenticavel
public class Diretor extends Funcionario implements Autenticavel {
	
	// add atributo de senha
	private String senha = "123";

	@Override
	public int getBonificacao() {
		return 60;
	}

	// implementa metodo da interface
	@Override
	public boolean autentica(String senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}

}
