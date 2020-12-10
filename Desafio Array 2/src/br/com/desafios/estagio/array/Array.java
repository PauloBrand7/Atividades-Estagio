package br.com.desafios.estagio.array;

public abstract class Array {

	private int tamArray;
	private String[] elemento ;
	private int count;
	
	//Construtor
	
	public Array(int tamanho) {
		this.tamArray = tamanho;
		this.elemento = new String[tamArray];
		this.count= 0;
	}
	
	//Metodos
	
	public void addElemento(String aux) {
		this.elemento[count] = aux;
		count++;
	}
	
	public void aumentaArray(int tamanho) {
		String[] arrayAux = new String[tamanho];
		
		for(int i = 0; i < elemento.length; i++) {
			arrayAux[i] = elemento[i];
		}
		
		this.tamArray = tamanho;
		this.elemento = new String[tamArray];
		
		for(int i = 0; i < elemento.length; i++) {
			elemento[i] = arrayAux[i];
		}
		
	}
	
	//Getters
	
	public void getArray() {
		for(int i = 0; i < count; i++) {			
			System.out.println(elemento[i]);
		}		
	}

	public int getTamArray() {
		return this.tamArray;
	}

	public int getCount() {
		return count;
	}
	
}
