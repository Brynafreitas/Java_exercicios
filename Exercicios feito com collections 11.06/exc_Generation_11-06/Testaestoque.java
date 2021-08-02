package collections_11_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Testaestoque {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcao;

		ArrayList<estoque> produtos = new ArrayList<>();

		do {

			System.out.println("Com qual opção você deseja prosseguir? \nDigite 1- Para adicionar produtos" +"\n"
					+ "2-Para remover produto  \n3-Para listar os produtos  \n4-Para encerrar o programa.");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("Quantos produtos você deseja adicionar?");
				int nProdutos = entrada.nextInt();

				for (int i = 0; i < nProdutos; i++) {
					System.out.println("Qual produto?");
					String produto = entrada.nextLine();
					entrada.nextLine();
					System.out.println("Qual a marca do produto?");
					String marcaProd = entrada.nextLine();
					System.out.println("Informe o código de barras do produto?");
					int codBarras = entrada.nextInt();
					System.out.println("Qual valor do produto? R$:");
					double valorProd = entrada.nextDouble();

					produtos.add(new estoque(produto, marcaProd, codBarras, valorProd));

				}

			}

			if (opcao == 2) {
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(i + "Posição dos produtos" + produtos.get(i));
				}

				System.out.println("Insira a posição do produto que você deseja excluir");
				int excluir = entrada.nextInt();
				produtos.remove(excluir);

			}

			if (opcao == 3) {
				for (estoque prod : produtos) {
					System.out.println(produtos);
					System.out.println("O produto é: " + prod.getProduto());
					System.out.println("A marca do produto é: " + prod.getMarcaProd());
					System.out.println("O codigo de barras é: " + prod.getCodBarras());
					System.out.println("O valor do produto é: " + "R$" + prod.getValorProd());
				}
			}

		}
		while (opcao != 4);
		System.out.println("Seu programa foi encerrado.");

	}

}
