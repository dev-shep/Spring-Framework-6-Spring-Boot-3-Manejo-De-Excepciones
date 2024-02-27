package com.karla.errores.springbooterrores.services;

import java.util.List;
import java.util.Optional;

import com.karla.errores.springbooterrores.models.domain.User;

public interface UserService {
    Optional<User> findById(Long id);
    List<User> findAll();

}
