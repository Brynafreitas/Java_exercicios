package lacosrepetitivos04_06;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		
		
			Scanner entrada = new Scanner(System.in);
			
		  int idade, sexo, humor=0, pessoasCalmas=0, Mnervosas=0, Hagressivos=0, outrosCalmos=0, maior40=0, menor18=0, contador=0;
					
		   while(contador<2) {
			    System.out.println("Digite sua idade: ");
			    idade=entrada.nextInt();
			    
			    System.out.println("Com qual sexo voc� se identifica? 1-feminino / 2-masculino /3-outros");
			    sexo=entrada.nextInt();
			    
			    System.out.println("Com qual humor voc� se identifica? 1-calma / 2-nervosa / 3-agressiva");
			    humor=entrada.nextInt();
			    
			    
			    if(humor == 1) {
			    	pessoasCalmas++;
			    }
			    if(sexo == 1 && humor==2) {
			    	Mnervosas++;
			    }
			    if(sexo == 2 && humor == 3) {
			    	Hagressivos++;
			    	
			    }
			    if(sexo == 3 && humor==1) {
			    	outrosCalmos++;
			    }
			    
			    if(idade>40 && humor ==2) {
			    	maior40++;
			    }
			    if(idade<18 && humor==1) {
			    	menor18++;
			    }
			   contador++; 		
		   }
		   
		   System.out.println("O n�mero de pessoas calmas �: " +pessoasCalmas);
		   System.out.println("O n�mero de mulheres nervosas �: " +Mnervosas);
		   System.out.println("O n�mero de outros calmos �: " +outrosCalmos);
		   System.out.println("O n�mero de homens agressisos �: "+Hagressivos);
		   System.out.println("O n�mero de pessoas nervosas maior de 40 anos �: "+maior40);
		   System.out.println("O n�mero de pessoas calmas menor de 18 �: " +menor18);
			
	}

}
