package exercicios07_06;

public class exerciciovetor1 {

	public static void main(String[] args) {

		int soma = 0, i;
		int[] vetorA = new int[6];

		vetorA[0] = 1;
		vetorA[1] = 0;
		vetorA[2] = 5;
		vetorA[3] = -2;
		vetorA[4] = -5;
		vetorA[5] = 7;

		soma = vetorA[0] + vetorA[1] + vetorA[5];

		System.out.println("A soma do vetor [0] + [1] + [5] é igual: " + soma);
		
		for(i=0; i<6; i++) {
			
			System.out.println("O valor do vetor " +i+ " é: " + vetorA[i]);
			
		}

		
		vetorA[4]=100;
		
		System.out.println("O valor do vetor 4 agora é: "+vetorA[4]);
	}

}
