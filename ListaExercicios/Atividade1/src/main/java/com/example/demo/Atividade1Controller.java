package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class Atividade1Controller {
	
	@GetMapping
	public String habilidades() {
		return "Habilidades e mentalidades para a atividade 1: /n"
				+ "Orientação ao detalhe \n"
				+ "Persistência \n"
				+ "Responsabilidade pessoal";
	}
}
