package com.curso.entrega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages  = {"com.curso.controller" , " com.curso.service"})
public class EjercicioEntregaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioEntregaSpringApplication.class, args);
	}

}
