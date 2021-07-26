package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.MetodoPago;

public interface IMetodoPago extends CrudRepository<MetodoPago, Integer> {
	
}
