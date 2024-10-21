package com.curso.principal;


import java.util.ArrayList;

import com.curso.crud.Buscar;
import com.curso.crud.Eliminar;
import com.curso.crud.Insertar;
import com.curso.crud.Modificar;
import com.curso.crud.Mostrar;
import com.curso.crud.SalarioMedio;
import com.curso.empleado.Empleado;

public class Programa {

	public static void main(String[] args) {
		System.out.println("------------Buscar------------");
		ArrayList<Empleado> empleados1 = (ArrayList<Empleado>) Buscar.buscarEmpleadosApellido("Vega");
		empleados1.get(0).toString();
		 Empleado empleado1 = new Empleado(empleados1.get(0).getId(),empleados1.get(0).getNombre(),empleados1.get(0).getApellidoUno(),
				 empleados1.get(0).getApellidoDos(),empleados1.get(0).getFechaNacimiento()+"",empleados1.get(0).getSalario());
		System.out.println("------------Eliminar------------");
		Eliminar.eliminarEmpleado("Vega");
		System.out.println("------------Insertar------------");
		String  fecha =empleado1.getFechaNacimiento() + "";
		Insertar.insertarEmpleados(empleado1.getNombre(),empleado1.getApellidoUno(),empleado1.getApellidoDos(),
				fecha,empleado1.getSalario());
		System.out.println("------------Modificar------------");
		Modificar.modificarSalario("Vega" , 5000);
		System.out.println("------------Mostrar------------");
		ArrayList<Empleado> empleados = Mostrar.mostrarEmpleados();
		for(Empleado e : empleados) {
			System.out.println(e.toString());
		}
		System.out.println("------------SalarioMedio------------");
		SalarioMedio.mostrarSalarioMedio();
	}

}
