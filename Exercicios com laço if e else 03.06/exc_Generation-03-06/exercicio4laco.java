/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package Aula02;

import java.util.Scanner;

public class exercicio4laco {
		
	 public static void main(String[] args) {
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 double n=0.0;
		 
		 System.out.println("Digite um n�mero: ");
		 n = entrada.nextInt();
		 
		 if(n %2 == 0) {
			 n= Math.sqrt(n);
					
					 System.out.println("Seu n�mero � par e sua raiz quadrada �: "+n);
			 
		 } 
		 else {
			 System.out.println("Seu n�mero � impar: "+n);
			 
			 	n= Math.pow(n, 2);
			 	 System.out.println("Seu n�mero � impar e o seu resultado ao quadrado �: "+n);
		 }
		 
		 
		 
			
		}
   
	 
   }
