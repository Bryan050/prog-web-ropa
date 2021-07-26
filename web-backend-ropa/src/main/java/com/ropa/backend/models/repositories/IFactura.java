package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Factura;

public interface IFactura extends CrudRepository<Factura, Integer> {

}
