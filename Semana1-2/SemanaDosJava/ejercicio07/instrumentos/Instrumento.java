package instrumentos;

public abstract class Instrumento{
	protected String nombre;
	protected String  tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	 public   String  tocar(  ) {
		 return ("Tocando el instrumento " + nombre);
	 }
	 public   String   afinar( ) {
		 return ("Afinando el instrumento " + nombre);
	 }

	
	
	

}
