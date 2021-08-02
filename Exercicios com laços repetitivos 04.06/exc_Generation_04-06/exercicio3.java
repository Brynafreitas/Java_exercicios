/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio3 {
	
	  public static void main(String[] args) {
		 
		  
		  Scanner entrada = new Scanner(System.in);
		  int idade=0, menor21=0, maior50=0;
		  
       		  
		  while(idade != -99) {
			  System.out.println("Insira sua idade: ");
			  idade = entrada.nextInt();
					  
			  
			  if(idade < 21 && idade>=0){
				  menor21++;
				  
				  
			  }
			  else if(idade>50) {
				 maior50++;
			  }
			   
			   
			   
			}
		  
		   System.out.println("O total de pessoas com menos de 21 anos é: "+menor21);
		   System.out.println("O total de pessoas maior de 50 é: "+maior50);
		   
		   entrada.close();
		
	}
	
         
}
