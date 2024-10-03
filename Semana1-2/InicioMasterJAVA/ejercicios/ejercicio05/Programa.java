package ejercicio05;

public class Programa {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta("Pablo Picasoo");
		miCuenta.setCantidad(3423.4);
		System.out.println(miCuenta);
		miCuenta.ingresar(400);
		System.out.println(miCuenta);
		miCuenta.retirar(4000);
	}
}
