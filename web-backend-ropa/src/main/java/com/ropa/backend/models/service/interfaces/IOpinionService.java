package com.ropa.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.ropa.backend.models.entities.Opinion;

public interface IOpinionService {
	public void save(Opinion opinion);
	public Optional<Opinion> findById(Integer id);
	public void delete(Integer id);
	public List<Opinion> findAll();
}
