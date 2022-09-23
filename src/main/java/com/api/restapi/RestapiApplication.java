package com.api.restapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.restapi.model.Categoria;
import com.api.restapi.model.Livros;
import com.api.restapi.repositorio.RepositorioCategoria;
import com.api.restapi.repositorio.RepositorioLivros;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner{

	@Autowired
	private RepositorioCategoria repositorioCategoria;
	@Autowired
	private RepositorioLivros repositorioLivros;
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria = new Categoria(null, "Informatica", "Livro de TI");
		Livros    livros    = new Livros(null, "CleanCode","Robert Martins", "Lorem ipson", categoria);
		categoria.getLvros().addAll(Arrays.asList(livros));
		this.repositorioCategoria.saveAll(Arrays.asList(categoria));
		this.repositorioLivros.saveAll(Arrays.asList(livros));
	}

}
