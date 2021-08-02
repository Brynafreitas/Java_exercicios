package Aula02;

import java.util.Scanner;

public class exercicio2laco {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Entre com o 1° número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Entre com o 2° número: ");
		n2= entrada.nextInt();
		
		System.out.println("Entre com o 3° número: ");
		n3 = entrada.nextInt();
		
		System.out.println("A ordem crescente é: ");
		
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
