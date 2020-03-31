package com.proyecto.fabrica;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FabricaApplication {

	@RequestMapping("/listar")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}