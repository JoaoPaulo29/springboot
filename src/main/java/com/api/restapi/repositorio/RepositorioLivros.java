package com.api.restapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restapi.model.Livros;
@Repository
public interface RepositorioLivros extends JpaRepository<Livros,Integer> {
    
}
