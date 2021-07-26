package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Opinion;

public interface IOpinion extends CrudRepository<Opinion, Integer> {

}
