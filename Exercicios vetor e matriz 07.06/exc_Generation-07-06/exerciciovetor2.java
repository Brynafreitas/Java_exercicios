/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
"

 */

package exercicios07_06;

import java.util.Scanner;

public class exerciciovetor2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int  nImpares = 0, somaPares = 0, i;

		int[] vetor = new int[6];

		System.out.println("Escreva um número: ");

		for (i = 0; i < 6; i++) {
			vetor[i] = entrada.nextInt();

			if (vetor[i] % 2 == 0) {
				
				somaPares += vetor[i];

			} else {

				nImpares++;
				
			}
		}

		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println("Os números pares digitados são: " + vetor[i]);
			}
		}

		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.println("Os números impares digitados são: "+vetor[i]);
			}
			
		}
			
		
		
		System.out.println("A soma dos números pares é: " + somaPares);
		System.out.println("A quantidade de números impares é: " + nImpares);

	}

}
