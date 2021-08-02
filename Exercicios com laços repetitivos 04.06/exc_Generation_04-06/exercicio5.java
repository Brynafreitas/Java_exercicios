/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */

package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 0, soma = 0;

		System.out.println("Insira um número:");

		do {

			n = entrada.nextInt();
			soma += n;
		}

		while (n != 0);

		System.out.println(" A soma total é: " + soma);

		entrada.close();
	}

}
