package exerciciospoo_08_06;

import java.util.Scanner;

public class TestaFuncionario {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			Funcionario func1 = new Funcionario();
			
			System.out.println("Infome seu nome: ");
			func1.setNome(entrada.nextLine());
			
			
			System.out.println("Informe sua matricula: ");
			func1.setMatricula(entrada.next());
		
			System.out.println("Informe nome da sua empresa: ");
			func1.setEmpresa(entrada.next());
		
			
			func1.bateCartao(); 

			func1.exerceFuncao(); 

			func1.almoca();
			
            func1.exerceFuncao2();

		    func1.batecartao2(); 
			
		    func1.setEscala("5x2");
		    func1.setTl("Vanessa");
		    func1.setHorario("08:00-17:00 e seu almoço: 12:00-13:00");
		    func1.setSalario(1500.00);
		    
		    
		    System.out.println("Bem-vindo(a) " + func1.getNome());
		    System.out.println("Sua escala é " + func1.getEscala());
		    System.out.println("Sua supervisora é "+ func1.getTl());
		    System.out.println("Seu horário é "+func1.getHorario());
		    System.out.println("Seu salário é de R$"+ func1.getSalario());
		
		    
		   func1.getEmpresa();
		   
		    entrada.close();
		
		}

}
