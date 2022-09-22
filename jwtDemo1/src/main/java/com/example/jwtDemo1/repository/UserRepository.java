package com.example.jwtDemo1.repository;

import com.example.jwtDemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    User findByUserName(String username);
}
