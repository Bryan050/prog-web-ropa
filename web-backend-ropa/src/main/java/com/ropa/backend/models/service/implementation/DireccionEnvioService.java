package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.DireccionEnvio;
import com.ropa.backend.models.repositories.IDireccionEnvio;
import com.ropa.backend.models.service.interfaces.IDireccionEnvioService;

public class DireccionEnvioService implements IDireccionEnvioService {

	@Autowired
	IDireccionEnvio repository;
	
	@Override
	public void save(DireccionEnvio direccionEnvio) {
		repository.save(direccionEnvio);
	
	}

	@Override
	public Optional<DireccionEnvio> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<DireccionEnvio> findAll() {
		return (List<DireccionEnvio>) repository.findAll();
	}
	
}
