package com.spring.security.SpringSecurityDemo.repository;

import com.spring.security.SpringSecurityDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
