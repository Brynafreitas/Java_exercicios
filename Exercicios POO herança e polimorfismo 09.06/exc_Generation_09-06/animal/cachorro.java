package heranca.animal;

import heranca.animal01.animal;

public class cachorro  extends animal{
	

	private String dono;
	private String ra�a;
	private String corPelagem;
	



	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}


	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}


	public String getCorPelagem() {
		return corPelagem;
	}


	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}


	public void correr() {
		System.out.println("correndo...");
		
	}
	
	public void somAnimal() {
		System.out.println("auau..auau..");
		
	}

}
