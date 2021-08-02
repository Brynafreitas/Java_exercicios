/*
 * exercicio 4
 */

package exerciciosjava1;

import java.util.Scanner;

public class exercicio4 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			 int a, b, c;
			 int r = 0, s = 0, d;
			 
			 System.out.println("Escreva A:");
			 a = entrada.nextInt();
			 
			 System.out.println("Escreva B:");
			 b = entrada.nextInt();
			 
			 System.out.println("Escreva C:");
			 c = entrada.nextInt();
			 
			 r = (a + b)  * (a + b);
			 s = (b + c)  * (b + c) ;
			 d = (r + s) / 2;
			 
			 System.out.println("Escreva o resultado é: " + d);
		
		}
	
		

}
