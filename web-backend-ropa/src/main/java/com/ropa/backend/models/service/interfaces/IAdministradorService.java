package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Administrador;

public interface IAdministradorService {
	
	//La interface del servicio, sirve para definir el conjunto de métodos que
	//se van a implementar para la Gestión del modelo-entidad
	
	public void save(Administrador administrador); //Guarda -> Create
	public Optional<Administrador> findById(Integer id); // Consutar -> Retrieve
	public void delete(Integer id); //Borrar -> Delete
	public List<Administrador> findAll(); //Consultar en conjunto -> List
}
