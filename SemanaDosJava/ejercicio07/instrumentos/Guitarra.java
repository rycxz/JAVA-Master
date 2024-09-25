package instrumentos;

public class Guitarra extends Instrumento{
	
	private int numeroCuerdas;

	public Guitarra(String nombre, String tipo, int numeroCuerdas) {
		super(nombre, tipo);
		this.numeroCuerdas = numeroCuerdas;
	}

	 

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return   "tocando la guitarra eléctrica"; 
	}

	@Override
	public String afinar() {
		// TODO Auto-generated method stub
		return super.afinar();
	}

	@Override
	public String toString() {
		return "Guitarra [numeroCuerdas=" + numeroCuerdas + ", toString()=" + super.toString() + "]";
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}
	
	
	

}
