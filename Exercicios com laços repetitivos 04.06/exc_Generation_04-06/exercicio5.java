/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 0, soma = 0;

		System.out.println("Insira um n�mero:");

		do {

			n = entrada.nextInt();
			soma += n;
		}

		while (n != 0);

		System.out.println(" A soma total �: " + soma);

		entrada.close();
	}

}
