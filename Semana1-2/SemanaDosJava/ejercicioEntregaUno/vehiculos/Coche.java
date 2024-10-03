package vehiculos;

 
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Coche extends Vehiculo {

	private String tipoCombustible;

	public Coche(String marca, String color, String tipoCombustible, String matricula, int vidaUtil) {
		super(marca, color);
		// TODO Auto-generated constructor stub
		this.tipoCombustible = tipoCombustible;
		super.matricula = matricula;
		super.vidaUtil = vidaUtil;

	}

	LocalDateTime incioMarcha;
	LocalDateTime finalMarcha;

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	@Override
	public String toString() {
		return "Coche [tipoCombustible=" + tipoCombustible + ", incioMarcha=" + incioMarcha + ", finalMarcha="
				+ finalMarcha + ", toString()=" + super.toString() + "]";
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override

	public LocalDateTime conducir() {
		incioMarcha = LocalDateTime.now();
		System.out.println("Estas en marcha");
		return incioMarcha;

	}
	int metrosAvanzados =   (int) (Math.random() * 9999);
	@Override
	public int avanzar(int metrosAvanzados) {
		   
		System.out.println("El coche a avanzado  " + metrosAvanzados + " metros .");

		return metrosAvanzados;

	}
	int  metros =   (int) (Math.random() * 30);
	@Override
	public int retroceder(int metros) {
		   
		  
		 
		 
		System.out.println("El coche a retrocedido  " + metros + " metros .");

		return metros;

	}

	@Override
	public LocalDateTime parar() {
		// TODO Auto-generated method stub
		finalMarcha = LocalDateTime.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(),
				LocalDateTime.now().getDayOfMonth() + 1, LocalDateTime.now().getHour() + (int) (Math.random() * 11),
				LocalDateTime.now().getMinute(), LocalDateTime.now().getSecond());
		System.out.println("Marcha Finalizada");
		return finalMarcha;

	}

	@Override
	public void calcularVelocidad( ) {
		long tiempoDeRecorrido = tiempoMoviemiento();
		int metrosRealizados = avanzar(metrosAvanzados) - retroceder(metros);
		System.out.println("Tu velcidad media es " + metrosRealizados / tiempoDeRecorrido);

	}

	public long tiempoMoviemiento() {

		long mintuosTranscurridos = ChronoUnit.HOURS.between(conducir(), parar());
		System.out.println(
				"el coche " + matricula + " ha realizado el recorrido en  " + mintuosTranscurridos + " minutos");

		return mintuosTranscurridos;

	}

}
