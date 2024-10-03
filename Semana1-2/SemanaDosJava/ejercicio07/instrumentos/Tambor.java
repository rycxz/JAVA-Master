package instrumentos;

public class Tambor  extends Instrumento{
	 private int tamanio;

	public Tambor(String nombre, String tipo, int tamanio) {
		super(nombre, tipo);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Tambor [tamanio=" + tamanio + ", toString()=" + super.toString() + "]";
	}
	 
	public String aporrear() {
		return ("Aporreando tambor" + this.nombre);
	}
	

}
