package com.gaurav.blog.repositories;

import com.gaurav.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {



}
