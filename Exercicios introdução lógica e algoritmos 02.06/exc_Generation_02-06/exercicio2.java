package exerciciosjava1;

import java.util.Scanner;

/*
 * 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

 */
public class exercicio2 {
		
	    public static void main(String[] args) {
			
	    	Scanner entrada = new Scanner (System.in);
	    	int anos, meses, dias;
	    	
	    	System.out.println("Quantos dias de vida voc� tem?");
	    	dias = entrada.nextInt();
	    	
	    		anos= dias/365;
	    	    meses = dias/30;
	    	    
	    	    System.out.println("A quantidade de anos que voc� j� viveu �:" + anos);
			    System.out.println("A quantidade de meses que voc� j� viveu �:" + meses);
		}
}
