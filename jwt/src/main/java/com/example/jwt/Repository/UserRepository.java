package com.example.jwt.Repository;

import com.example.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
