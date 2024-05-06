package com.API_Finanzas.dao;

import com.API_Finanzas.entities.Movement;
import org.springframework.data.repository.CrudRepository;

public interface MovementDAO extends CrudRepository<Movement, Long> {
}
