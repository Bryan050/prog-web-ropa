package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Cliente;
import com.ropa.backend.models.repositories.ICliente;
import com.ropa.backend.models.service.interfaces.IClienteService;

public class ClienteService implements IClienteService {

	@Autowired
	ICliente repository;
	
	@Override
	public void save(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) repository.findAll();
	}
	
}
