package heranca.animal;

import heranca.animal01.animal;

public class bichopreguica extends animal {

	private String habitat;
	private String especie;

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void subirArvore() {
		System.out.println("subindo as árvores");

	}
	public void somAnimal() {
		System.out.println("zzzzzz");
	}

}
