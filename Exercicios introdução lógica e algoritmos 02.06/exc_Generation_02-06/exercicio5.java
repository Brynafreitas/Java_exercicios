package exerciciosjava1;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double n1, n2, n3;
		double p1, p2, p3, media;
		
		System.out.println("Insira a primeira nota: ");
		n1 = entrada.nextInt();
		
		System.out.println("Insira o peso da primeira nota: ");
		p1 = entrada.nextInt();
		
		System.out.println("Insira a segunda nota: ");
		n2 = entrada.nextInt();
		
		System.out.println("Insira o peso da segunda nota: ");
		p2 = entrada.nextInt();
		
		System.out.println("Insira a terceira nota: ");
		n3 = entrada.nextInt();
		
		System.out.println("Insira o peso da terceira nota: ");
		p3 = entrada.nextInt();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média do aluno é: " +media);
		
		
	}

}
