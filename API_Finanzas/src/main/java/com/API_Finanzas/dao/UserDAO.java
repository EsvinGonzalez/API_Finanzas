package com.API_Finanzas.dao;

import com.API_Finanzas.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {
}
