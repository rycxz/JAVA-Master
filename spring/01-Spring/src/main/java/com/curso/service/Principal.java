package com.curso.service;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		
		contexto.register(SpringConfiguration.class;
		contexto.refresh();
		
		Servicio serv = contexto.getBean(Servicio.class);
	}

}
