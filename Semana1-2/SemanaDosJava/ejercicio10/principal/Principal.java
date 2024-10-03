package principal;

import figurasAbstarct.Circulo;
import figurasAbstarct.Cuadrado;
import figurasAbstarct.Rectangulo;
import figurasAbstarct.TrianguloEquilatero;
import figurasInterfaz.CirculoInter;
import figurasInterfaz.CuadradoInter;
import figurasInterfaz.RectanguloInter;
import figurasInterfaz.TrianguloEquilateroInter;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cuadrado miCuadrado = new Cuadrado(3.53);
			Rectangulo miRectangulo = new Rectangulo(4, 05);
			Circulo miCirculo = new Circulo(5);
			TrianguloEquilatero miTrinagulo  = new TrianguloEquilatero(3, 4,3);
			System.out.println("cuadrado");
			miCuadrado.calcuarPerimetro();
			miCuadrado.calcularArea();
			System.out.println(miCuadrado);
			System.out.println("--------------------------------------------");
			System.out.println("Rectangulo");
			miRectangulo.calcuarPerimetro();
			miRectangulo.calcularArea();
			System.out.println(miRectangulo);
			System.out.println("--------------------------------------------");
			System.out.println("Circulo");
			miCirculo.calcuarPerimetro();
			miCirculo.calcularArea();
			System.out.println(miCirculo);
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("----Triangulo-----");
			miTrinagulo.calcuarPerimetro();
			miTrinagulo.calcularArea();
			System.out.println(miTrinagulo);
			System.out.println("--------------------------------------------");
			
			
			CuadradoInter miCuadradoInter = new CuadradoInter(3.53);
			RectanguloInter miRectanguloInter = new RectanguloInter(4, 05);
			CirculoInter miCirculoInter = new CirculoInter(5);
			TrianguloEquilateroInter miTrinaguloInter = new TrianguloEquilateroInter(3, 4,3);
			System.out.println();
			
			System.out.println("Interfaces");
			System.out.println("cuadrado");
			miCuadradoInter.calcuarPerimetro();
			miCuadradoInter.calcularArea();
			System.out.println(miCuadradoInter);
			System.out.println("--------------------------------------------");
			System.out.println("Rectangulo");
			miRectanguloInter.calcuarPerimetro();
			miRectanguloInter.calcularArea();
			System.out.println(miRectanguloInter);
			System.out.println("--------------------------------------------");
			System.out.println("Circulo");
			miCirculoInter.calcuarPerimetro();
			miCirculoInter.calcularArea();
			System.out.println(miCirculoInter);
			System.out.println("--------------------------------------------");
			System.out.println("----Triangulo-----");
			miTrinaguloInter.calcuarPerimetro();
			miTrinaguloInter.calcularArea();
			System.out.println(miTrinaguloInter);
			System.out.println("--------------------------------------------");
			
			
	}

}
