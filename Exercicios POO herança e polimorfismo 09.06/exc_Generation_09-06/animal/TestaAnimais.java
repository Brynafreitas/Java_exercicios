package heranca.animal;

public class TestaAnimais {

	public static void main(String[] args) {

		cachorro cachorro1 = new cachorro();
		cavalo cavalo1 = new cavalo();
		bichopreguica preguica1 = new bichopreguica();

		cachorro1.setNome("bethoven");
		cachorro1.setIdade(5);
		cachorro1.setRaça("SRD");
		cachorro1.setDono("Bruna");
		cachorro1.setCorPelagem("preto");

		cavalo1.setNome("cleitinho");
		cavalo1.setIdade(5);
		cavalo1.setCorPelagem("marrom");
		cavalo1.setDono("Odair");
		cavalo1.setRaça("puro sangue inglês");

		preguica1.setNome("preguicinha");
		preguica1.setHabitat("América do sul");
		preguica1.setIdade(20);
		preguica1.setEspecie("Bradypus variegatus");

		System.out.println("====Dados do cachorro====");
		System.out.println("Seu nome é: " + cachorro1.getNome());
		System.out.println("Sua raça é: " + cachorro1.getRaça());
		System.out.println("Seu dono é: " + cachorro1.getDono());
		System.out.println("A cor da pelagem é: " + cachorro1.getCorPelagem());
		System.out.println("Sua idade é: " + cachorro1.getIdade());
		

		System.out.println("=====Dados do cavalo====");
		System.out.println("Seu nome é: " + cavalo1.getNome());
		System.out.println("Sua raça é: " + cavalo1.getRaça());
		System.out.println("Seu dono é: " + cavalo1.getDono());
		System.out.println("A cor da pelagem é: " + cavalo1.getCorPelagem());
		System.out.println("Sua idade é: " + cavalo1.getIdade());
		

		System.out.println("====Dados do bicho preguiça====");
		System.out.println("Seu nome é: " + preguica1.getNome());
		System.out.println("Seu habitat é: " + preguica1.getHabitat());
		System.out.println("Sua idade é: " + preguica1.getIdade());
		System.out.println("Sua especie é: " + preguica1.getEspecie());
		
		

	}
}
