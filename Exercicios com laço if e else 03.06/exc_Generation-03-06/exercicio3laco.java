/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto

 */
package Aula02;

import java.util.Scanner;

public class exercicio3laco {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int idade=0;
			
			System.out.println("Escreva sua idade: ");
			idade = entrada.nextInt();
			
			if (idade <=10 && idade <=14) {
				System.out.println("Sua categoria é infatil. ");
				
			}
			else if(idade >=15 && idade <=17) {
				System.out.println("Sua categoria é juvenil.");
				
			}
			else {
				System.out.println("Sua categoria é adulto. ");
			}
			
			
			
			
		}

}
