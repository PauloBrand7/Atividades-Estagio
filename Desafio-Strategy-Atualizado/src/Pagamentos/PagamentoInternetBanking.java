package Pagamentos;

import java.util.Scanner;

public class PagamentoInternetBanking implements Pagamento {

	private String login;
	private String senha;
	private String cpf;
	private double saldo;

	// construtor

	public PagamentoInternetBanking(String login, String senha, String cpf, double saldo) {
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	// metodos

	@Override
	public void validaPagamento(double valorCompra) {
		Scanner input = new Scanner(System.in);

			System.out.println("Digite seu usuario de login:");
			System.out.print("-->");
			String loginTemp = input.nextLine();
	
			System.out.println("Digite sua senha: ");
			System.out.print("-->");
			String senhaTemp = input.nextLine();
	
			System.out.println("Digite seu cpf: ");
			System.out.print("-->");
			String cpfTemp = input.nextLine();

		//Valida os dados digitados
		if (this.login.equals(loginTemp) && this.senha.equals(senhaTemp) && this.cpf.equals(cpfTemp)) {
			
			//valida o saldo da conta disponivel com o valor total da compra
			if (valorCompra <= this.saldo) {
				System.out.println("Pagamento aprovado com sucesso!!");
			} else {
				System.out.println("Pagamento recusado! Saldo Insuficiente ");
			}
		
		} else {
			System.out.println("Dados incorretos! ");
		}

		input.close();
	}

}
