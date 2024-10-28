package com.curso.controller;

import org.springframework.stereotype.Controller;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@Controller
public class IndexController2 {

		@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";

	}

		@RequestMapping(value="pag2", method = RequestMethod.GET)
	public String mostrarPaginaDos() {
		return "paginaDos";

	}
}
