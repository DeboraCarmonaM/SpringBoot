package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividade2")
public class Atividade2Controller {
	
	@GetMapping
	public String objetivos() {
		return "Objetivos da semana: /n"
				+ "Aprofundar meus conhecimentos em MySql \n"
				+ "Fazer meus primeiros programas ultilizando Spring-Boot";
		
	}

}
