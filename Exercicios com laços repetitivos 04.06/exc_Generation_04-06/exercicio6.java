/*
 * escrever um programa que receba v�rios n�meros inteiros no teclado.
 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio6 {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int n=0, soma=0, contador=0;
			double media=0.0;
			
			do {
				System.out.println("Insira um n�mero:  (digite 0 para finalizar)");
				n = entrada.nextInt();
				
				if(n %3 ==0){
					 
					soma+=n;
					contador++;
					}
				
				
			}
            
			
			while(n !=0);
			 
			media=soma/contador;
			System.out.println("A m�dia dos n�meros multiplos de 3 �: "+media);
			 
			
			entrada.close();
			
		}
		 

}
