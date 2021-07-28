package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Categoria;
import com.ropa.backend.models.repositories.ICategoria;
import com.ropa.backend.models.service.interfaces.ICategoriaService;

public class CategoriaService implements ICategoriaService {

	@Autowired
	ICategoria repository;
	
	@Override
	public void save(Categoria categoria) {
		repository.save(categoria);
	}

	@Override
	public Optional<Categoria> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}

	@Override
	public List<Categoria> findAll() {
		return (List<Categoria>) repository.findAll();
	}

}
