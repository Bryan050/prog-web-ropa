package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Producto;
import com.ropa.backend.models.repositories.IProducto;
import com.ropa.backend.models.service.interfaces.IProductoService;

public class ProductoService implements IProductoService {

	@Autowired
	IProducto repository;
	
	@Override
	public void save(Producto producto) {
		repository.save(producto);
		
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) repository.findAll();
	}
	
}
