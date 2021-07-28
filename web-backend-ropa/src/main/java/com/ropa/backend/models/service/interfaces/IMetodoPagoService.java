package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.MetodoPago;

public interface IMetodoPagoService {
	public void save(MetodoPago metodoPago);
	public Optional<MetodoPago> findById(Integer id);
	public void delete(Integer id);
	public List<MetodoPago> findAll();
}
