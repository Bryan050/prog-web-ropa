package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ropa.backend.models.entities.Administrador;
import com.ropa.backend.models.repositories.IAdministrador;
import com.ropa.backend.models.service.interfaces.IAdministradorService;

@Service
public class AdministradorService implements IAdministradorService {

	//Sirve para implementar los métodos de gestión, inyectando el DAO
	
	@Autowired
	IAdministrador repository;
	
	@Override
	public void save(Administrador administrador) {
		repository.save(administrador);	//Implementar los datos de la gestión	
	}

	@Override
	public Optional<Administrador> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Administrador> findAll() {
		return (List<Administrador>) repository.findAll();
	}
	
}
