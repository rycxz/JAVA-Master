package principal;

import java.util.ArrayList;
import java.util.List;

import instrumentos.Flauta;
import instrumentos.Guitarra;
import instrumentos.GuitarraElectrica;
import instrumentos.Instrumento;
import instrumentos.Tambor;

public class Orquesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Instrumento> misInstrumentos = new ArrayList<>();

		Flauta miFlauta = new Flauta("Flauta de viento", "Instrumento de viento", "Flauta de Calamardo");
		miFlauta.afinar();
		miFlauta.tocar();
		misInstrumentos.add(miFlauta);
		System.out.println(miFlauta);
		System.out.println("--------------------------------------------");
		Guitarra miGuitarra = new Guitarra("Guitarra Española", "Instrumento de cuerda", 6);
		miGuitarra.afinar();
		miGuitarra.tocar();
		misInstrumentos.add(miGuitarra);
		System.out.println(miGuitarra);
		System.out.println("-----------------------------------------");
		Tambor miTambor = new Tambor("Tambor de Semana Santa", "Instrumento de percurion", 33);
		miTambor.aporrear();
		misInstrumentos.add(miTambor);
		System.out.println(miTambor);
		System.out.println("-----------------------------------------");
		GuitarraElectrica miGuitarraElectrica = new GuitarraElectrica("Guitarra de Quinn", "Guitarra con electricidad",
				6, 600);
		miGuitarraElectrica.tocar();
		misInstrumentos.add(miGuitarraElectrica);
		System.out.println(miGuitarraElectrica);
		System.out.println("-----------------------------------------");

	}

}
