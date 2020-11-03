package org.generation.blogPessoal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository< Postagem, Long> { // T = tipo de entidade (model) -- ID = tipo de id 
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);	
}
