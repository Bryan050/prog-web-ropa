package com.ropa.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ropa.backend.models.entities.Administrador;
                                                 // El modelo-entidad al que se quiere vincular las gestión
												// El tipo de dato del atributo que representa la PK del modelo-entidad
public interface IAdministrador extends CrudRepository<Administrador, Integer> {
    // Interfaces = También es conocido como el Data Access Object - DAO 
	//Sirve para interactuar con la Base de Datos para realizar las gestiones CRUD de los modelos
}
