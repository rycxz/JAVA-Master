package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;


/**
 * 
 * @author Ricardo
 *
 */

public interface FormacionService {
	List<Formacion> nuevaFormacion(Formacion formacion);
	List<Formacion> devolverFormaciones();
 
}
