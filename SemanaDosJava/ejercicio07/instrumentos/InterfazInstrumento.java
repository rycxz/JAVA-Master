package instrumentos;

public interface InterfazInstrumento {
	
	 public static  void  tocar(String nombre ) {
		 System.out.println("Tocando el instrumento " + nombre);
	 };
	 public static  void  afinar(String nombre) {
		 System.out.println("Afinando el instrumento " + nombre);
	 };

}
