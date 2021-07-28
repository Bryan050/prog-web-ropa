package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Categoria;

public interface ICategoriaService {
	
	// Define las operaciones que se van ha realizar en la clase para realizar la gestión
	
	public void save(Categoria categoria); //Guarda -> Create / Update
	public Optional<Categoria> findById(Integer id); // Consutar -> Retrieve
	public void delete(Integer id); //Borrar -> Delete
	public List<Categoria> findAll(); //Consultar en conjunto -> List
	
}
