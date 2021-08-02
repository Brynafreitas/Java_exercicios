package exercicios10_06;

public class cachorro extends Animal implements InterfaceAnimal{

	@Override
	public void som() {
		System.out.println("au....au...au..");
		
	}

	@Override
	public void correr() {
		System.out.println("cachorro correndo...");
		
	}
	
	

}
