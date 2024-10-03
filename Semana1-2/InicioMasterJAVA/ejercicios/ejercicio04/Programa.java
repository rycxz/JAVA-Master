package ejercicio04;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	Libro libroNumeroUno= new Libro();
	libroNumeroUno.setIsbn("DSDFSDFK743");
	libroNumeroUno.setAutor("Lorenzo Matias");
	libroNumeroUno.setNumeroPaginas(342);
	libroNumeroUno.setTitulo("El Caballero");
	
	//dada de alta del segundo libro
	
	Libro libroNumeroDos= new Libro();
	libroNumeroDos.setIsbn("ETTWRE3");
	libroNumeroDos.setAutor("Juan Pepe");
	libroNumeroDos.setNumeroPaginas(234);
	libroNumeroDos.setTitulo("El rosario");
	
	//la salida por pantalla con menu
	int numeroEleccion = 0;
	do {
		System.out.println("Digame el menu de su eleccion");
		System.out.println("1-Mostrar el libro uno");
		System.out.println("2-Mostrar el libro dos");
		System.out.println("3-Salir");
		numeroEleccion=entrada.nextInt();
		switch(numeroEleccion) {
		case 1:
			System.out.println("tu libro es: " + libroNumeroUno);
			if(libroNumeroUno.compareTo(libroNumeroDos) == 1) {
				System.out.println("El libro numero uno tiene mas paginas con "+libroNumeroUno.getNumeroPaginas());
			};
			break;
		case 2:
			System.out.println("tu libro es: " + libroNumeroDos);
			if(libroNumeroUno.compareTo(libroNumeroDos) == 0) {
			System.out.println("El libro numero dos tiene mas paginas con "+libroNumeroDos.getNumeroPaginas());
			}
			break;
		case 3:
			System.out.println("Has salido!");
			break;
			default:
				System.out.println("Opcion no valida!");
		}
	}
	while(numeroEleccion!=3);
	entrada.close();
	}

}
