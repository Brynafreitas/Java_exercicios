/*
 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

 */

package exerciciosjava1;

import java.util.Scanner;

public class exercicio3 {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			int segundos, minutos, horas;
			
			System.out.println("Escreva quantos segundos durou seu evento: ");
			
			segundos = entrada.nextInt();
			
			minutos = segundos/60;
			horas = minutos/60;
			
			System.out.println("Os minutos de dura��o do seu evento foi de: " +minutos);
			System.out.println("As horas de dura��o do seu evento foi de: " +horas);
			
			
			
			
			
		}

}
