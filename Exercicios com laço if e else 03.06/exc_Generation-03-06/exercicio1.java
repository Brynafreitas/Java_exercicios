/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.

 */
package Aula02;

import java.util.Scanner;

public class exercicio1 {
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, maior=0;
		
		System.out.println("Entre com 1° valor: ");
		n1= entrada.nextInt();
		
		System.out.println("Entre com o 2° valor: ");
		n2= entrada.nextInt();
		
		System.out.println("Entre com o 3° valor: ");
		n3= entrada.nextInt();
		
		if(n1>n2 && n1>n3) {
			maior=n1;
		} 
		else if(n2>n1 && n2>n3) {
			 maior=n2;
		}
		else if(n3>n1 && n3>n2) {
			maior=n3;
		}
		  System.out.println("O maior valor é: "+maior);
		
	

		} 

} 
