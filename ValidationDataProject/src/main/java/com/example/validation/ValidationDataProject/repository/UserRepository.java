package com.example.validation.ValidationDataProject.repository;

import com.example.validation.ValidationDataProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


   public User findByUserId(int id);
}
