package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.DireccionEnvio;

public interface IDireccionEnvioService {
	public void save(DireccionEnvio direccionEnvio);
	public Optional<DireccionEnvio> findById(Integer id);
	public void delete(Integer id);
	public List<DireccionEnvio> findAll();
}
