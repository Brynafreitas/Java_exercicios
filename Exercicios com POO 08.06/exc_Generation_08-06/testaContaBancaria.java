package exerciciospoo_08_06;

import java.util.Scanner;

public class testaContaBancaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ContaBancaria cliente = new ContaBancaria();

		System.out.println("Escreva seu nome: ");
		cliente.setNomeCliente(entrada.nextLine());

		System.out.println("Informe o n�mero da sua ag�ncia: ");
		cliente.setAgencia(entrada.next());

		cliente.setSaldo(200.45);
		cliente.setDeposito(300);

		cliente.pagamentos();
		cliente.depositos();
		cliente.transacoes();
		cliente.credito();
		cliente.emprestimo();

		System.out.println("Seja bem vindo: " + cliente.getNomeCliente());
		System.out.println("Seu saldo era de:R$ " + cliente.getSaldo());
		System.out.println("Voc� recebeu um dep�sito no valor de:R$ " + cliente.getDeposito());
		System.out.println("Seu saldo atual � de: ");

		double soma = cliente.getSaldo() + cliente.getDeposito();

		System.out.println("R$" + soma);
		
		cliente.getAgencia();
		
		entrada.close();

	}
}