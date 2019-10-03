package statics;

public class Processador {
	
	public static String marca;
	String modelo;
	String velocidade;
	
	void imprimir() {
		System.out.println(marca + " - " 
				+ modelo + " - " 
				+ velocidade);
	}
	
	static void trocarMarca() {
		if(marca.equals("Intel"))
			marca = "AMD";
		else
			marca = "Intel";
	}

}
