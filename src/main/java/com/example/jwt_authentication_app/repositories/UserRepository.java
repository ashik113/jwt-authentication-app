package com.example.jwt_authentication_app.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.jwt_authentication_app.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
