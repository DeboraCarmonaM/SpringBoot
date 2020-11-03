package org.generation.blogPessoal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity //mostra que é uma entidade do jpa 
@Table(name = "postagem") //mostra que é uma tabela

public class Postagem {
	
	@Id //mostra que é uma id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //cria a primary key
	private long id;
	
	@NotNull //mostra que o título não pode ser nulo
	@Size(min = 5, max = 100) //define o tamanho mínimo e máximo do título
	private String titulo;
	
	@NotNull //mostra que o texto não pode ser nulo
	@Size(min = 10, max = 500) //define o tamanho mínimo e máximo do texto
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //mostra que estamos trabalhando com tempo
	private Date data = new java.sql.Date(System.currentTimeMillis()); //data-segundo-milésimo
	
	//construtores 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
