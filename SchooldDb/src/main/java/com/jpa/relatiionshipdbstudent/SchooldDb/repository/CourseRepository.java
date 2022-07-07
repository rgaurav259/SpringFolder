package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
