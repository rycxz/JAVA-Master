package figurasInterfaz;

public class CuadradoInter implements FigurasGeo {
	
	private final static int NUMERO_LADOS = 4;
	private double longitudLado;

	@Override
	public double calcuarPerimetro() {
			
		return this.longitudLado*NUMERO_LADOS;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(longitudLado, 2);
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	public CuadradoInter(double longitudLado) {
		super();
		this.longitudLado = longitudLado;
	}

	@Override
	public String toString() {
		return "Cuadrado [longitudLado=" + longitudLado + "]";
	}
	
	
	

}
