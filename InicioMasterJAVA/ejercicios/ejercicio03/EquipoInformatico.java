package ejercicio03;

public abstract class    EquipoInformatico {
	/*La información que hay que guardar de cualquier producto es un código de 
	producto único para la tienda, el modelo, el precio y la cantidad que tienen 
	actualmente para vender.*/
	private String codigoProducto;
	private String Modelo;
	private double precio;
	private int cantidadDisponible;
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	@Override
	public String toString() {
		return "EquioInformatico [codigoProducto=" + codigoProducto + ", Modelo=" + Modelo + ", precio=" + precio
				+ ", cantidadDisponible=" + cantidadDisponible + "]";
	}
	public EquipoInformatico(String codigoProducto, String modelo, double precio, int cantidadDisponible) {
		super();
		this.codigoProducto = codigoProducto;
		Modelo = modelo;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	
	
	
}
