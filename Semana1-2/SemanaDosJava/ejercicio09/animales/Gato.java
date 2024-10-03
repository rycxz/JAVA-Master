package animales;

public class Gato extends Animales implements Mascotas{
	private String nombreGatete;

	 

	public Gato(int numeroPatas, String tipoAnimal, String nombreGatete) {
		super(numeroPatas, tipoAnimal);
		this.nombreGatete = nombreGatete;
	}

	
	
	@Override
	public String tipoDeAnimal(String tipoAnimal) {
		// TODO Auto-generated method stub
		return super.tipoDeAnimal(tipoAnimal);
	}
	



	@Override
	public String toString() {
		return "Gato [nombreGatete=" + nombreGatete + ", toString()=" + super.toString() + "]";
	}



	public String getNombreGatete() {
		return nombreGatete;
	}



	public void setNombreGatete(String nombreGatete) {
		this.nombreGatete = nombreGatete;
	}



	@Override
	public void jugar() {
		 System.out.println(" A"+  this.nombreGatete   + " le gusta jugar con pelotas");
		
	}

	@Override
	public void nombrarMascota(String nombre) {
		this.nombreGatete = nombre;
		System.out.println("Has nombrado a tu mascota ahora se llama" + this.nombreGatete);
		
	}

	@Override
	public void alimentar() {
		System.out.println("Le has dado de comer a " + this.nombreGatete);
		
	}



	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer peces y arañas");
		
	}



	@Override
	public void andar() {
		System.out.println("corro muy rapido con mis " + this.numeroPatas + " patas");
		
	}

}
