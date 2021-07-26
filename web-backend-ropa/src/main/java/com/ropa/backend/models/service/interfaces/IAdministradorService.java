package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Administrador;

public interface IAdministradorService {
	
	//La interface del servicio, sirve para definir el conjunto de métpdps que
	//se van a implementar para la Gestión del modelo-entidad
	
	public void save(Administrador administrador); //Guarda -> Create
	public Optional<Administrador> findById(Integer id);
	public void delete(Integer id);
	public List<Administrador> findAll();
}
