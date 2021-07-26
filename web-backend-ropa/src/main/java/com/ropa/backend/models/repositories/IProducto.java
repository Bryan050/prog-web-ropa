package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Producto;

public interface IProducto extends CrudRepository<Producto, Integer> {

}
