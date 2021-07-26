package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Categoria;

public interface ICategoria extends CrudRepository<Categoria, Integer> {

}
