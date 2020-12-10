package br.com.desafios.estagio.array;

public class ArrayDuplica extends Array {

	public ArrayDuplica(int tamanho) {
		super(tamanho);
	}
	
	@Override
	public void addElemento(String aux) {
		
		if ( getCount() >= getTamArray()) {
			aumentaArray(getTamArray()*2);
			System.out.println("\n Array preenchido - O Tamanho foi Duplicado! Novo valor: "+ getTamArray());
		}
		super.addElemento(aux);
	}
	
}
