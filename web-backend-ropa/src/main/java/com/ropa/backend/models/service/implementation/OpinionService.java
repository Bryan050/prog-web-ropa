package com.ropa.backend.models.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ropa.backend.models.entities.Opinion;
import com.ropa.backend.models.repositories.IOpinion;
import com.ropa.backend.models.service.interfaces.IOpinionService;

public class OpinionService implements IOpinionService {

	@Autowired
	IOpinion repository;
	
	@Override
	public void save(Opinion opinion) {
		repository.save(opinion);
	}

	@Override
	public Optional<Opinion> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Opinion> findAll() {
		return (List<Opinion>) repository.findAll();
	}
	
}
