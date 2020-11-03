package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//--> M VC---- model (tables)
//M --> VC---- view (front)
//MV --> C---- controller (cérebro, endereçamento)
// JPA é interface

//ponto no endereço do site

@RequestMapping("/hello")
@RestController //estrutura mvc/ cérebro, cabeça, controla tudo
public class ServicoController {

	@GetMapping("/get1")
	public String hello1() {
		return "Hey Get1 Hello World";
		
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Hey Get2 Hello World";

	}
	
	//injeção
		@Autowired
		private ServicoRepository repository;
		
		@GetMapping ("/servicos")
		public List<ServicoModel> pegarTodos() {		
			return repository.findAll();
		}
}