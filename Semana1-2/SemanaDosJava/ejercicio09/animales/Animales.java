package animales;

public abstract class Animales {
	protected int numeroPatas;
	protected String tipoAnimal;

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return "Animales [numeroPatas=" + numeroPatas + ", tipoAnimal=" + tipoAnimal + "]";
	}

	public Animales(int numeroPatas, String tipoAnimal) {
		super();
		this.numeroPatas = numeroPatas;
		this.tipoAnimal = tipoAnimal;
	}

	public String tipoDeAnimal(String tipoAnimal) {
		return "el tipo de animal es " + tipoAnimal;
	}
	public abstract void comer();
	public abstract void andar();

}
