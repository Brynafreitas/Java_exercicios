package exercicios07_06;

import java.util.Scanner;

public class exercicio04matriz {

	public static void main(String[] args) {

		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int user = 0;
		double constante;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira os n�meros da primeira matriz 2x2");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz1[l][c] = entrada.nextDouble();
			}

		}

		System.out.println("Insira os n�meros da segunda matriz 2x2");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz2[l][c] = entrada.nextDouble();
			}

		}

		System.out.println("Escolha uma das op��es: 1-Para somar as duas matrizes, 2-Para subtrair as matrizes"
				+ " 3-Para adicionar uma constante as duas matrizes e 4-Para imprimir as matrizes ");

		user = entrada.nextInt();

		if (user == 1) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];

				}

			}

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println("O resultado da soma da matriz 1 com a 2 �:" + matriz3[l][c]);
				}
			}

		}

	       if (user == 2) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
				}
			}

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println("O resultado da subtra��o da matriz 1 com a 2 �: " + matriz3[l][c]);
				}
			}

		}

		 if (user == 3) {
			System.out.println("Digite uma constante: ");
			constante = entrada.nextDouble();

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matriz1[l][c] += constante;
					matriz2[l][c] += constante;
					
					System.out.println("A soma da matriz 1 com constante �: "+matriz1[l][c]);
					System.out.println("A soma da matriz 2 com constante �: "+matriz2[l][c]);

				}
			}
		}

		 if (user == 4) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					System.out.println("A matriz 1 �: " + matriz1[l][c]);

				}
			}

			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {

					System.out.println("A matriz 2 �: " + matriz2[l][c]);
				}

			}

		}

	}
}
