/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

 */
package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 0, i, par = 0, impar = 0;

		for (i = 0; i <= 10; i++) {

			System.out.println("Insira um n�mero: ");
			n = entrada.nextInt();

			if (n % 2 == 0) {

				par++;

			} else {
				impar++;
			}

		}

		System.out.println("Os valores pares s�o: " + par);
		System.out.println("Os valores impares s�o: " + impar);
		
		

	}

}
