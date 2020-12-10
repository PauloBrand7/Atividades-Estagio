package Principal;

public class Produto {
	String nome;
	String marca;
	double preco;
	static int numero = 1;
	
	public Produto(String nome, String marca, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	
		System.out.println("----------- Produto |"+ numero +"| ----------");
		System.out.println(nome);
		System.out.println(marca);
		System.out.println(preco);
		System.out.println("-----------------------------------------");
		
		numero++;
	}

	
}
