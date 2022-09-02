package com.example.school.CollegeProjectDataJpa.Repository;

import com.example.school.CollegeProjectDataJpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
