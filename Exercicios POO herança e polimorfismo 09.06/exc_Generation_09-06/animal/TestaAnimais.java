package heranca.animal;

public class TestaAnimais {

	public static void main(String[] args) {

		cachorro cachorro1 = new cachorro();
		cavalo cavalo1 = new cavalo();
		bichopreguica preguica1 = new bichopreguica();

		cachorro1.setNome("bethoven");
		cachorro1.setIdade(5);
		cachorro1.setRa�a("SRD");
		cachorro1.setDono("Bruna");
		cachorro1.setCorPelagem("preto");

		cavalo1.setNome("cleitinho");
		cavalo1.setIdade(5);
		cavalo1.setCorPelagem("marrom");
		cavalo1.setDono("Odair");
		cavalo1.setRa�a("puro sangue ingl�s");

		preguica1.setNome("preguicinha");
		preguica1.setHabitat("Am�rica do sul");
		preguica1.setIdade(20);
		preguica1.setEspecie("Bradypus variegatus");

		System.out.println("====Dados do cachorro====");
		System.out.println("Seu nome �: " + cachorro1.getNome());
		System.out.println("Sua ra�a �: " + cachorro1.getRa�a());
		System.out.println("Seu dono �: " + cachorro1.getDono());
		System.out.println("A cor da pelagem �: " + cachorro1.getCorPelagem());
		System.out.println("Sua idade �: " + cachorro1.getIdade());
		

		System.out.println("=====Dados do cavalo====");
		System.out.println("Seu nome �: " + cavalo1.getNome());
		System.out.println("Sua ra�a �: " + cavalo1.getRa�a());
		System.out.println("Seu dono �: " + cavalo1.getDono());
		System.out.println("A cor da pelagem �: " + cavalo1.getCorPelagem());
		System.out.println("Sua idade �: " + cavalo1.getIdade());
		

		System.out.println("====Dados do bicho pregui�a====");
		System.out.println("Seu nome �: " + preguica1.getNome());
		System.out.println("Seu habitat �: " + preguica1.getHabitat());
		System.out.println("Sua idade �: " + preguica1.getIdade());
		System.out.println("Sua especie �: " + preguica1.getEspecie());
		
		

	}
}
