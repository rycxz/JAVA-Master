package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.ProudctosDto;
import com.curso.model.Pedidos;
@Service
public class FormacionServiceImpl implements FormacionService {
	@Autowired
	RestTemplate template;
	
	private static final String URL = "http://localhost:8080/cursos";
	@Override
	public List<Pedidos> getFormaciones() {
		List<ProudctosDto> cursos = Arrays.asList(template.getForObject(URL, ProudctosDto[].class));
		List<Pedidos> formaciones = new ArrayList<Pedidos>();

		for (ProudctosDto curso : cursos) {
			int asignaturas = curso.getDuracion() >= 50 ? 10 : 5;
			formaciones.add(new Pedidos(curso.getNombre(), asignaturas, curso.getPrecio()));
		}

		return formaciones;
	}

	@Override
	public void altaFormacion(Pedidos formacion) {

		List <ProudctosDto> cursos = Arrays.asList(template.getForObject(URL, ProudctosDto[].class));
		ProudctosDto cursoInsertar = new ProudctosDto(formacion.getNombre(), formacion.getAsignaturas() * 10, formacion.getPrecio());
		boolean existeCurso = false;
		
		for (ProudctosDto curso:cursos) {
			if(curso.getNombre().equalsIgnoreCase(formacion.getNombre())) {
				existeCurso = true;
			}
		}
		if (!existeCurso) {
			template.postForLocation(URL, cursoInsertar);
		}
	}
}
