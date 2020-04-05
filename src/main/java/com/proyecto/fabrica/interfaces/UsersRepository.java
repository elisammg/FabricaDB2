package com.proyecto.fabrica.interfaces;

import com.proyecto.fabrica.modelo.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUsername(String username);
}
