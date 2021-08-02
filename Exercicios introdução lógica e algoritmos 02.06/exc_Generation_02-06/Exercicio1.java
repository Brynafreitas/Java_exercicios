package exerciciosjava1;

import java.util.Scanner;

/*
 * 1- Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
 */
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, idade;

		System.out.println("Digite sua idade:");
		anos = entrada.nextInt();

		System.out.println("Digite quantos meses se passou desde do seu aniversário:");
		meses = entrada.nextInt();

		System.out.println("Digite o dia de hoje:");
		dias = entrada.nextInt();

		idade = ((anos * 365) + (meses * 30) + dias);

		System.out.println("Sua idade em dias é: " + idade);

	}
}
