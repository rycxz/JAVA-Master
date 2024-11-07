package com.curso.service;

import java.util.List;

import com.curso.model.Pedidos;

public interface FormacionService {
	public List<Pedidos> getFormaciones();
	public void altaFormacion(Pedidos formacion);
	
}
