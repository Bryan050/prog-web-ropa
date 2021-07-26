package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Cliente;

public interface ICliente extends CrudRepository<Cliente,Integer>{

}
