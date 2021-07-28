package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.MetodoPago;
import com.ropa.backend.models.repositories.IMetodoPago;
import com.ropa.backend.models.service.interfaces.IMetodoPagoService;

public class MetodoPagoService implements IMetodoPagoService {

	@Autowired
	IMetodoPago repository;
	
	@Override
	public void save(MetodoPago metodoPago) {
		repository.save(metodoPago);
		
	}

	@Override
	public Optional<MetodoPago> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<MetodoPago> findAll() {
		return (List<MetodoPago>) repository.findAll();
	}
	
}
