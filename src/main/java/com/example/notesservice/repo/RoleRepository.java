package com.example.notesservice.repo;

import com.example.notesservice.domain.AppUserRole;
import com.example.notesservice.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(String name);
}
