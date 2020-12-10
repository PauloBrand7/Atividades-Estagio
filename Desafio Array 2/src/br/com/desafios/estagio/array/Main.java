package br.com.desafios.estagio.array;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1 - Implementar um tipo de array que, ao chegar ao seu limite, duplique o tamanho.");
		
		Array arrayDuplica = new ArrayDuplica(2);
		
		arrayDuplica.addElemento("um");
		arrayDuplica.addElemento("dois");
		arrayDuplica.getArray();
		
		arrayDuplica.addElemento("tres");
		arrayDuplica.addElemento("quatro");
		arrayDuplica.getArray();

		arrayDuplica.addElemento("cinco");
		arrayDuplica.addElemento("seis");
		arrayDuplica.getArray();
		
		System.out.println("\n \n--------------------------------\n \n");
		System.out.println("2 - Implementar um tipo de array que, ao chegar ao seu limite, aumente em 50% o tamanho.");
		
		Array arrayCinquenta = new Array_50(2);
		
		arrayCinquenta.addElemento("um");
		arrayCinquenta.addElemento("dois");
		arrayCinquenta.getArray();
		
		arrayCinquenta.addElemento("tres");
		arrayCinquenta.getArray();
		
		arrayCinquenta.addElemento("quatro");
		arrayCinquenta.getArray();

		arrayCinquenta.addElemento("cinco");
		arrayCinquenta.addElemento("seis");
		arrayCinquenta.getArray();
		
	}

}
