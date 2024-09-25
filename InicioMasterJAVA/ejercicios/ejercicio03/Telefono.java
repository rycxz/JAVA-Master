package ejercicio03;

public class Telefono extends EquipoInformatico {
	 

	private String operadorComercializa;

	public String getOperadorComercializa() {
		return operadorComercializa;
	}

	public void setOperadorComercializa(String operadorComercializa) {
		this.operadorComercializa = operadorComercializa;
	}

	public Telefono(String codigoProducto, String modelo, double precio, int cantidadDisponible,
			String operadorComercializa) {
		super(codigoProducto, modelo, precio, cantidadDisponible);
		this.operadorComercializa = operadorComercializa;
	}

	@Override
	public String toString() {
		return "Telefono [operadorComercializa=" + operadorComercializa + ", toString()=" + super.toString() + "]";
	}
	
}
