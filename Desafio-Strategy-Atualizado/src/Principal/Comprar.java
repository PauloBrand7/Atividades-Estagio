package Principal;

import java.util.Scanner;

import Pagamentos.Pagamento;
import Pagamentos.PagamentoCartao;
import Pagamentos.PagamentoInternetBanking;

public class Comprar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Pedido pedido = new Pedido();

		System.out.println("COMPRAS DE ELETRONICOS");
		System.out.println("Escolha os itens que deseja comprar:");

		Produto p1 = new Produto("TV", "Samsung", 2500);
		Produto p2 = new Produto("Notebook", "Dell", 2000);
		Produto p3 = new Produto("Celular", "Apple", 4500);

		int op = 0;
		String ver = "s";

		do {
			System.out.print("N° do Produto -->");
			op = input.nextInt();

			if (op == 1) {
				pedido.setTotal(p1.preco);
				System.out.println("Item adicionado ao carrinho! \n Deseja adicionar mais itens? S/N");
				System.out.print("-->");
				ver = input.next();
			}
			if (op == 2) {
				pedido.setTotal(p2.preco);
				System.out.println("Item adicionado ao carrinho! \n Deseja adicionar mais itens? S/N");
				System.out.print("-->");
				ver = input.next();
			}
			if (op == 3) {
				pedido.setTotal(p3.preco);
				System.out.println("Item adicionado ao carrinho! \n Deseja adicionar mais itens? S/N");
				System.out.print("-->");
				ver = input.next();

			} else if (op >= 4) {
				System.out.println("Opção Invalida");
			}

		} while (!ver.equals("n"));

		System.out.println("O total do seu pedido é de " + pedido.getTotal());
		System.out.println("Qual a forma de pagamento?");
		System.out.println("|1| - Cartão de Credito");
		System.out.println("|2| - Internet Banking");
		System.out.print("-->");
		op = input.nextInt();

		Pagamento pagamento = null;

		if (op == 1) {
										// N° cartão - CVV - CPF - Limite
			pagamento = new PagamentoCartao("4444", "123", "222.222", 3000);

		}
		if (op == 2) {
													// Login - Senha - CPF - Saldo
			pagamento = new PagamentoInternetBanking("paulo.brand", "1234", "222.222", 5000);
		}

		pagamento.validaPagamento(pedido.getTotal());

		input.close();
	}

}
