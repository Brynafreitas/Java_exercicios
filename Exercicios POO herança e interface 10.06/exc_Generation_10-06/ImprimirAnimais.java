package exercicios10_06;

public class ImprimirAnimais {
	
	public static void main(String[] args) {
		
		cachorro cachorro1 =  new cachorro();
		cavalo cavalo1 = new cavalo();
		preguica preguica1 = new preguica ();
		
		cachorro1.setNome("doroteia");
		cachorro1.setIdade(4);
		
		
		cavalo1.setIdade(10);
		cavalo1.setNome("cleiton");
		
		
		preguica1.setIdade(20);
		preguica1.setNome("Zoobomafoo");
		
		
		
		System.out.println("====Dados do cachorro====");
		System.out.println("Idade do cachorro: "+cachorro1.getIdade());
		System.out.println("Nome do cachorro: "+cachorro1.getNome());
		cachorro1.som();
		
		System.out.println("====Dados do cavalo====");
		System.out.println("Idade do cavalo: "+cavalo1.getIdade());
		System.out.println("Nome do cavalo: "+cavalo1.getNome());
		cavalo1.som();
		
		System.out.println("====Dados do bicho de preguiça====");
		System.out.println("Idade do bicho preguiça: "+preguica1.getIdade());
		System.out.println("Nome do bicho preguiça: "+preguica1.getNome());
		preguica1.som();
	
	
		
	}

}
