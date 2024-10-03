package principal;

import impresora.Factura;
import impresora.Pagina;

public class GestionDeImpresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pagina miPagina = new Pagina(34, 3445);
		miPagina.informeCorto();
		miPagina.informeLargo();
		System.out.println(miPagina);
		System.out.println("----------------------------------");
		System.out.println();
		Factura miFactura = new Factura(233442, 444);
		miFactura.informeCorto();
		miFactura.informeLargo();
		System.out.println(miFactura);
		System.out.println("----------------------------------");
		System.out.println();
		

	}

}
