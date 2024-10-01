package vehiculos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Conducible {
	
	 	//Metodos Obligatorios
	public LocalDateTime  conducir();
	public int avanzar( int metrosAvanzados);
	public int retroceder(int metrosRetocedidos);
	public LocalDateTime parar();
	
	//Metodos Adicionales
	
	 
	 public void calcularVelocidad(  );
	 public long tiempoMoviemiento();
 
	 
	 
	
	
}