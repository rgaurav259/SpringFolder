package com.example.springsecurityrestauthorization.Repository;

import com.example.springsecurityrestauthorization.Domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
