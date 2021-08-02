/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package exercicios07_06;

import java.util.Scanner;

public class exercicio3matriz {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			double [] [] matriz = new double [3] [3];
			double maior=0.0;
			
		
			
			for(int l = 0; l < matriz.length; l++) { // percorre a linha
				for(int c = 0; c < matriz[l].length; c++) {
					System.out.println("Insira um número: ");
					matriz[l][c]=entrada.nextDouble();
					if(matriz [l][c] >10){
						maior++;
					
						
					}
					
					
				}
			
		}
			
			 System.out.println("Sua matriz possui o total de:" +maior +" valores maior que 10");

}
}

