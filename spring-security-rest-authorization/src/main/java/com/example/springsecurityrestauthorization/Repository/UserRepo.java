package com.example.springsecurityrestauthorization.Repository;

import com.example.springsecurityrestauthorization.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
