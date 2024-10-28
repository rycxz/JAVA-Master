package com.curso.controller;

import org.springframework.stereotype.Controller;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@Controller
public class IndexController {

	@GetMapping(value="/")
	public String index() {
		return "index";

	}

	@GetMapping(value="pag2")
	public String mostrarPaginaDos() {
		return "paginaDos";

	}
}
