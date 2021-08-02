/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package Aula02;

import java.util.Scanner;

public class exercicio4laco {
		
	 public static void main(String[] args) {
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 double n=0.0;
		 
		 System.out.println("Digite um número: ");
		 n = entrada.nextInt();
		 
		 if(n %2 == 0) {
			 n= Math.sqrt(n);
					
					 System.out.println("Seu número é par e sua raiz quadrada é: "+n);
			 
		 } 
		 else {
			 System.out.println("Seu número é impar: "+n);
			 
			 	n= Math.pow(n, 2);
			 	 System.out.println("Seu número é impar e o seu resultado ao quadrado é: "+n);
		 }
		 
		 
		 
			
		}
   
	 
   }
