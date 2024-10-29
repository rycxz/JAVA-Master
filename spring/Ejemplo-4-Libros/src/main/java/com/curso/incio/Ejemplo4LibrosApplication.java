package com.curso.incio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages  = {"com.curso.controller" , " com.curso.service"})
/**
 * 
 * @author Ricardo
 *
 */
public class Ejemplo4LibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo4LibrosApplication.class, args);
	}

}
