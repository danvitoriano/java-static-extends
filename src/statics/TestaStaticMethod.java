package statics;

public class TestaStaticMethod {
	public static void main(String[] args) {
		Processador p1 = new Processador();
		p1.modelo = "i7";
		p1.velocidade = "2.5GHz";
		
		Processador p2 = new Processador();
		p2.modelo = "i5";
		p2.velocidade = "2.0GHz";
		
		Processador.marca = "Intel";
		
		p1.imprimir();
		p2.imprimir();
		
		p1.marca = "AMD";
		
		p1.imprimir();
		p2.imprimir();
		
		Processador.trocarMarca();
		
		p1.imprimir();
		p2.imprimir();
		
	}
}
