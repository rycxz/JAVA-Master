package com.curso.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludorControler {
	@GetMapping(value="saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return  "hello form sping boot";
		
	}
	@GetMapping(value="saludo/{x}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar(@PathVariable("x") String a ) {
		return  "hello form sping boot"+a;
		
	}
	@GetMapping(value="saludo/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar(@PathVariable("x") String a,@PathVariable("y") String b  ) {
		return  "hello form sping boot"+a + "  " + b;
		
	}
	
	@GetMapping(value="saludo2", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar2( @RequestParam("x") String a,@RequestParam("y") String b  ) {
		return  "hello form sping boot"+a + "  " + b;
		
	}
	

}
