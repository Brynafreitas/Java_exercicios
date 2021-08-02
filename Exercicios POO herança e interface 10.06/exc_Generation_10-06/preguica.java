package exercicios10_06;

public class preguica extends Animal implements InterfaceAnimal{

	@Override
	public void som() {
		System.out.println("zzzzzzzzz...");
	}

	@Override
	public void correr() {
		System.out.println("rastejando..");
	}

}
