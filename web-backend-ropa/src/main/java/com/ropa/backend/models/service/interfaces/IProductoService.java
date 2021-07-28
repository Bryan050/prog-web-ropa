package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Producto;

public interface IProductoService {
	public void save(Producto producto);
	public Optional<Producto> findById(Integer id);
	public void delete(Integer id);
	public List<Producto> findAll();
}
