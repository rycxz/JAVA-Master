package instrumentos;

public class GuitarraElectrica  extends Guitarra{
	private double  potencia;

	 

	public GuitarraElectrica(String nombre, String tipo, int numeroCuerdas, double potencia) {
		super(nombre, tipo, numeroCuerdas);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	 

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return    "tocando la guitarra eléctrica";
	}

	@Override
	public String toString() {
		return "Guitarra [potencia=" + potencia + ", toString()=" + super.toString() + "]";
	}
	
	
	
	 

}
