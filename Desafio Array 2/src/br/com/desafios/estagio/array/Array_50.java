package br.com.desafios.estagio.array;

public class Array_50 extends Array {

	public Array_50(int tamanho) {
		super(tamanho);
	}

	@Override
	public void addElemento(String aux) {

		if ( getCount() >= getTamArray()) {
			aumentaArray( getTamArray() + (getTamArray()/2));
			System.out.println("\n Array preenchido - O Tamanho foi aumentado em 50%! Novo valor: "+ getTamArray());
		}
		super.addElemento(aux);
	}
}
