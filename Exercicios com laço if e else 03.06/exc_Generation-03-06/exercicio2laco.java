package Aula02;

import java.util.Scanner;

public class exercicio2laco {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Entre com o 1� n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		n2= entrada.nextInt();
		
		System.out.println("Entre com o 3� n�mero: ");
		n3 = entrada.nextInt();
		
		System.out.println("A ordem crescente �: ");
		
		if(n1<n2 && n1<n3){
			System.out.println(n1+"\n"+n2+"\n"+n3);
			}
		else if(n2<n1 && n2<n3) {
			System.out.println(n2+"\n"+n1+"\n"+n3);
		}
		else if(n3<n2 && n3<n1) {
			System.out.println(n3+"\n"+n2+"\n"+n1);
		}
		
		
		

		
	}

}
