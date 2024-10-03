package animales;

public class Arania extends Animales   {

	public Arania(int numeroPatas, String tipoAnimal) {
		super(numeroPatas, tipoAnimal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("Las arañas comen mosquitos");
		
	}

	@Override
	public void andar() {
		System.out.println("corro con "+this.numeroPatas+"patas");
		
	}
		
}
