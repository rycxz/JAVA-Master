package vehiculos;

public interface Conducible {
	
	 	//Metodos Obligatorios
	public void conducir();
	public void avanzar();
	public void retroceder();
	public void parar();
	
	//Metodos Adicionales
	
	 
	 public void calcularVelocidad(double espacioRecorido,double tiempoRecorrido);
	 public void arrancar();
	 
	 
	
	
}