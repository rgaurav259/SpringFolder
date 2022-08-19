package com.example.validationhibernatejavatechie.repository;

import com.example.validationhibernatejavatechie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int id);

    User findByName(String name);
}
