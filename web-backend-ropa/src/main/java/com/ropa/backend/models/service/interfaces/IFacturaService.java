package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Factura;

public interface IFacturaService {
	public void save(Factura facturaServicio);
	public Optional<Factura> findById(Integer id);
	public void delete(Integer id);
	public List<Factura> findAll();
}
