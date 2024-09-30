package principal;

import java.util.ArrayList;
import java.util.List;

import animales.Animales;
import animales.Arania;
import animales.Gato;
import animales.Peces;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Animales> animalesVarios = new ArrayList<>();
	
	//dada de alta de animales
	
	Gato miGato= new Gato(4,"Felino","Michi");
	animalesVarios.add(miGato);
	Arania miAraña= new Arania(8,"aracnido");
	animalesVarios.add(miAraña);
	Peces miPez= new Peces(0,"pescado","rodolfo");
	animalesVarios.add(miPez);
	
	//metodos gato
	miGato.nombrarMascota("pisi");
	miGato.alimentar();
	miGato.andar();
	miGato.comer();
	miGato.alimentar();
	miGato.jugar();
	System.out.println(".............................................................");
	miPez.nombrarMascota("ivan");
	miPez.alimentar();
	miPez.andar();
	miPez.comer();
	miPez.alimentar();
	miPez.jugar();
	System.out.println(".............................................................");
	   
	miAraña.andar();
	miAraña.comer();
	;
	System.out.println(".............................................................");


	}

}
