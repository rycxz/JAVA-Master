package com.curso.incio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = "com.curso.controller ")
public class Ejemplo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo3Application.class, args);
	}

}
