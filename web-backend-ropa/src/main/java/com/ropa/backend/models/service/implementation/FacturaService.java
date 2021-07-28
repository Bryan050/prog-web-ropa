package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Factura;
import com.ropa.backend.models.repositories.IFactura;
import com.ropa.backend.models.service.interfaces.IFacturaService;

public class FacturaService implements IFacturaService {

	@Autowired
	IFactura repository;
	
	@Override
	public void save(Factura factura) {
		repository.save(factura);
	}

	@Override
	public Optional<Factura> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Factura> findAll() {
		return (List<Factura>) repository.findAll();
	}
	
}
