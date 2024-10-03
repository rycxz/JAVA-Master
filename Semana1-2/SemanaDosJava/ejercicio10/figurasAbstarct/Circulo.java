package figurasAbstarct;

public class Circulo  extends FigurasGeometricas{
	private double radio;
	private final static double PI = 3.14;
	@Override
	public double calcuarPerimetro() {
		
		return (radio*2*PI);
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.pow(radio, 2)*PI);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public static double getPi() {
		return PI;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	
	
	

}
