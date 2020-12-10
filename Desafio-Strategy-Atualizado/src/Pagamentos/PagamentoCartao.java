package Pagamentos;

import java.util.Scanner;

public class PagamentoCartao implements Pagamento {

	private String numero;
	private String cvv;
	private String cpf;
	private double limite;

	// construtor

	public PagamentoCartao(String numero, String cvv, String cpf, double limite) {
		this.numero = numero;
		this.cvv = cvv;
		this.cpf = cpf;
		this.limite = limite;
	}

	// metodos

	@Override
	public void validaPagamento(double valorCompra) {
		Scanner input = new Scanner(System.in);

			System.out.println("Digite seu numero do cartão:");
			System.out.print("-->");
			String numeroTemp = input.nextLine();
	
			System.out.println("Digite o CVV: ");
			System.out.print("-->");
			String cvvTemp = input.nextLine();
	
			System.out.println("Digite seu cpf: ");
			System.out.print("-->");
			String cpfTemp = input.nextLine();

		//valida os dados digitados
		if (this.numero.equals(numeroTemp) && this.cvv.equals(cvvTemp) && this.cpf.equals(cpfTemp)) {
			
			//valida o limite disponivel com o valor total da compra
			if (valorCompra <= this.limite) {
				System.out.println("Pagamento aprovado com sucesso!!");
			} else {
				System.out.println("Pagamento recusado! Limite Insuficiente");
			}
		
		} else {
			
			System.out.println("Dados incorretos!");
		}

		input.close();
	}

}
