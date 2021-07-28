package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Detalle;

public interface IDetalleService {
	
	public void save(Detalle detalle);
	public Optional<Detalle> findById(Integer id);
	public void delete(Integer id);
	public List<Detalle> findAll();
}
