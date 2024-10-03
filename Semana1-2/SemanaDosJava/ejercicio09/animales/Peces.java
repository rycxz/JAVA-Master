package animales;

public class Peces extends Animales implements Mascotas {
	private String nombrePez;

	public Peces(int numeroPatas, String tipoAnimal, String nombrePez) {
		super(numeroPatas, tipoAnimal);
		this.nombrePez = nombrePez;
	}

	@Override
	public void jugar() {
		 System.out.println("estoy nadando");
		System.out.println();
		
	}

	@Override
	public void nombrarMascota(String nombre) {
		this.nombrePez = nombre;
		System.out.println("Has nombrado a tu mascota ahora se llama" + this.nombrePez);
		
	}

	@Override
	public void alimentar() {
		System.out.println("Le has dado de comer a " + this.nombrePez);
		
	}

	@Override
	public String tipoDeAnimal(String tipoAnimal) {
		// TODO Auto-generated method stub
		return super.tipoDeAnimal(tipoAnimal);
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Los peces comen  plancton");
		
	}

	@Override
	public void andar() {
		System.out.println("En realidad no ando, nado");
		
	}
	
	
	
}
