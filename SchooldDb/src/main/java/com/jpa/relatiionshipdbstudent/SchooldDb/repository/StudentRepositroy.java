package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositroy extends JpaRepository<Student,Long> {
}
