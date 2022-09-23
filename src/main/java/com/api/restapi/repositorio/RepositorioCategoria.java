package com.api.restapi.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restapi.model.Categoria;
@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria,Integer> {

    
}
