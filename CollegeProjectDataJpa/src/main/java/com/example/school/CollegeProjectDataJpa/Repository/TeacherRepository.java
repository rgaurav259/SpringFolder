package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
