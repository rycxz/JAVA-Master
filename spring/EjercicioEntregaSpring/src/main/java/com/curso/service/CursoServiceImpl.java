package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Curso;
 

@Service
public class CursoServiceImpl implements CursoService {
	List<Curso> cursos;
	Curso curso;

	public CursoServiceImpl() {
		cursos = new ArrayList<>(List.of(new Curso(1, "Java from noobie to hero", 780, 1234.5),
				new Curso(2, "Como ser feliz", 2, 0), new Curso(3, "Mejorar la comunicacion", 43, 33.5)));
	}

	/**
	 * devuelve los curos
	 */
	@Override
	public List<Curso> altaCurso(Curso c) {
		if (c != null) {
			cursos.add(c);
		}
		return cursos;
	}

	/**
	 * busca un curso con un metodo y lo elimina
	 */
	@Override
	public List<Curso> eliminarCurso(int codigo) {
		Curso c = buscarCurso(codigo);
		if (cursos.contains(c)) {
			cursos.remove(c);
		}
		return cursos;
	}

	/**
	 * actualizar un curso por su codigo
	 */
	@Override
	public void actualizarDuracion(int codigo, int duracion) {
		Curso c = buscarCurso(codigo);
		c.setDuración(duracion);

	}

	@Override
	public Curso buscarCurso(int codigo) {
		for (Curso c : cursos) {
			if (c != null && c.getCodCurso() == codigo) {
				return c;
			}
		}
		return null;
	}
/**
 * metodo en el que se crea un array de cursos y se devuelve los cuross que cumplen los requistios 
 */
	@Override
	public List<Curso> curosPorPrecio(double pracioMin, double precioMax) {
		List<Curso> cursosRango = new ArrayList<>();
		for (Curso c : cursos) {
			if (c != null && (c.getPrecio() > pracioMin && c.getPrecio() < precioMax)) {
				cursosRango.add(c);

			}
		}
		return cursosRango;
	}

}
