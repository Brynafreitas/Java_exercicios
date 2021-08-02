/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

 */
package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 0, i, par = 0, impar = 0;

		for (i = 0; i <= 10; i++) {

			System.out.println("Insira um número: ");
			n = entrada.nextInt();

			if (n % 2 == 0) {

				par++;

			} else {
				impar++;
			}

		}

		System.out.println("Os valores pares são: " + par);
		System.out.println("Os valores impares são: " + impar);
		
		

	}

}
