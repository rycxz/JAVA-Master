package ejercicio06;

public class Programa {

	public static void main(String[] args) {
		 
		Cafetera miCafetera = new Cafetera();
		System.out.println("Primero el constructor sin parametros: " + miCafetera);
		
		System.out.println();
		Cafetera miCafetera01 = new Cafetera(1200);
		System.out.println("Primero el constructor con el paramtero del cantidad: " + miCafetera01);
		System.out.println();
		Cafetera miCafetera02 = new Cafetera(1200,4000);
		System.out.println("Primero el constructor con los dos paramteros pero el actual mayor: " + miCafetera02);
		System.out.println();
		Cafetera miCafetera03 = new Cafetera(1200,400);
		System.out.println("Primero el constructor con los dos paramteros pero el actual mayor: " + miCafetera03);
		System.out.println();
		miCafetera03.llenarCafetera();
		System.out.println("llemano la cafetera numero 3 " + miCafetera03);
		System.out.println();
		miCafetera03.servirTaza(miCafetera03.getCantidadActual()+300);
		System.out.println("Servimos una taza y mostramos cuanto cafe queda " + miCafetera03);
		System.out.println();
		
		System.out.println("llenamo la cafetera");
		miCafetera03.llenarCafetera();
		System.out.println(miCafetera03);
		System.out.println();
		miCafetera03.vaciarCafetera();
		System.out.println(miCafetera03);
		System.out.println();
		miCafetera03.agregarCafe(400);
		System.out.println(miCafetera03);
		
		
		
		
		
		
		
		
		
	}

}
