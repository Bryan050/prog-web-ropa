package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Detalle;
import com.ropa.backend.models.repositories.IDetalle;
import com.ropa.backend.models.service.interfaces.IDetalleService;

public class DetalleService implements IDetalleService {

	@Autowired
	IDetalle repository;
	
	@Override
	public void save(Detalle detalle) {
		repository.save(detalle);
		
	}

	@Override
	public Optional<Detalle> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Detalle> findAll() {
		return (List<Detalle>) repository.findAll();
	}
	
}
