package heranca.animal;

public class imprimirSom {
	
		public static void main(String[] args) {
			
			testaMetodos t1 = new testaMetodos ();
			
			System.out.println("Cachorra emite som:");
			t1.somAnimal(new cachorro ());
			System.out.println("Cavalo emite som:");
			t1.somAnimal(new  cavalo());
			System.out.println("Bicho preguiça emite som:");
			t1.somAnimal(new bichopreguica());
			
			System.out.println("Cachorro corre");
			t1.correr(new cachorro ());
			System.out.println("Cavalo corre");
			t1.correr(new cavalo());
			System.out.println("Enquanto bicho preguiça escala uma árvore para dormir mais");
			t1.subirArvore(new bichopreguica());
			
		}

}
