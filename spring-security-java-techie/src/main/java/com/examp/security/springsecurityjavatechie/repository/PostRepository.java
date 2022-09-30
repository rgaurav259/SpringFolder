package com.examp.security.springsecurityjavatechie.repository;

import com.examp.security.springsecurityjavatechie.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
