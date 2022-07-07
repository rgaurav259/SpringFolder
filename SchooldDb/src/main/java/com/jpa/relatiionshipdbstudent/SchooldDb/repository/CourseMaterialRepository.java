package com.jpa.relatiionshipdbstudent.SchooldDb.repository;

import com.jpa.relatiionshipdbstudent.SchooldDb.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
