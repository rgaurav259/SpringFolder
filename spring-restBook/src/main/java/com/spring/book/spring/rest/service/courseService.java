package com.spring.book.spring.rest.service;

import com.spring.book.spring.rest.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface courseService {

    public List<Course> getCourses();
}
