/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
"

 */

package exercicios07_06;

import java.util.Scanner;

public class exerciciovetor2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int  nImpares = 0, somaPares = 0, i;

		int[] vetor = new int[6];

		System.out.println("Escreva um n�mero: ");

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
				System.out.println("Os n�meros pares digitados s�o: " + vetor[i]);
			}
		}

		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.println("Os n�meros impares digitados s�o: "+vetor[i]);
			}
			
		}
			
		
		
		System.out.println("A soma dos n�meros pares �: " + somaPares);
		System.out.println("A quantidade de n�meros impares �: " + nImpares);

	}

}
