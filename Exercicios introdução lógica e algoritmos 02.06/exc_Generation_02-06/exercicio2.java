package exerciciosjava1;

import java.util.Scanner;

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

 */
public class exercicio2 {
		
	    public static void main(String[] args) {
			
	    	Scanner entrada = new Scanner (System.in);
	    	int anos, meses, dias;
	    	
	    	System.out.println("Quantos dias de vida você tem?");
	    	dias = entrada.nextInt();
	    	
	    		anos= dias/365;
	    	    meses = dias/30;
	    	    
	    	    System.out.println("A quantidade de anos que você já viveu é:" + anos);
			    System.out.println("A quantidade de meses que você já viveu é:" + meses);
		}
}
