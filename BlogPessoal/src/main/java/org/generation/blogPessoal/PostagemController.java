package org.generation.blogPessoal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa que se trata de um controller
@RequestMapping("/postagens") //informa por qual uri será acessada
@CrossOrigin("*") //aceita requisições de qualquer origem

public class PostagemController {
	
	@Autowired //usar o spring para instanciar uma interface
	private PostagemRepository repositoty;//injetar classe de repositório dentro do controller
	
	@GetMapping //sempre uma requisição externa do tipo Get, irá disparar esse método
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repositoty.findAll()); 
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){ //path diz que o valor que entrará dentro da variável id vai vir como uma variável do caminho da uri  
		return repositoty.findById(id) //findById devolve um objt do tipo postagem ou um notfound caso o objt não exista ou tenha um erro na requisição 
				.map(resp -> ResponseEntity.ok(resp)).
				orElse(ResponseEntity.notFound().build());
		
	}
	
	@GetMapping("/titulo/{titulo}") //precisamos fazer desta forma para diferenciar do get acima
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repositoty.findAllByTituloContainingIgnoreCase(titulo));
		
	
	}
}
