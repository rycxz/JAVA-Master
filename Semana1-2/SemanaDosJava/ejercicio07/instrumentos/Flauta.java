package instrumentos;
 

public class Flauta extends Instrumento {
	
	private String modelo;

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String tocar() {
		return super.tocar() + " soplando.";
	}

	@Override
	public String afinar() {
		return super.afinar();
	}

	@Override
	public String toString() {
		return "Flauta [modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
