package ejercicio06;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = this.capacidadMaxima;
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		if (capacidadMaxima < cantidadActual) {
			this.capacidadMaxima = cantidadActual;
			this.cantidadActual = cantidadActual;
		} else {
			this.capacidadMaxima = capacidadMaxima;
			this.cantidadActual = cantidadActual;
		}

	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}

	public void servirTaza(int cantidad) {
		if (cantidad > this.cantidadActual) {
			cantidad = this.cantidadActual;
			System.out.println("Su taza esta servida con " + this.cantidadActual + " de cafe");
			this.cantidadActual=0;
		} else {
			this.cantidadActual = this.cantidadActual - cantidad;
			System.out.println("Su taza esta servida con " + cantidad + " de cafe");
		}
	}

	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	public void agregarCafe(int cantidad) {
		this.cantidadActual = this.cantidadActual + cantidad;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	

}
