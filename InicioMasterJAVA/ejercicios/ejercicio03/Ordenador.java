package ejercicio03;

public class Ordenador extends EquipoInformatico {  

	
  
	private String procesador;
	private int catidadMemoria;
	private int cantidadDisco;
	
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getCatidadMemoria() {
		return catidadMemoria;
	}
	public void setCatidadMemoria(int catidadMemoria) {
		this.catidadMemoria = catidadMemoria;
	}
	public int getCantidadDisco() {
		return cantidadDisco;
	}
	public void setCantidadDisco(int cantidadDisco) {
		this.cantidadDisco = cantidadDisco;
	}
	public Ordenador(String codigoProducto, String modelo, double precio, int cantidadDisponible, String procesador,
			int catidadMemoria, int cantidadDisco) {
		super(codigoProducto, modelo, precio, cantidadDisponible);
		this.procesador = procesador;
		this.catidadMemoria = catidadMemoria;
		this.cantidadDisco = cantidadDisco;
	}
	@Override
	public String toString() {
		return "Ordenador [procesador=" + procesador + ", catidadMemoria=" + catidadMemoria + ", cantidadDisco="
				+ cantidadDisco + ", toString()=" + super.toString() + "]";
	}
	
	 
	
	
	
}
