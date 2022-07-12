package com.example.basicRestApi.basicrestapi.Repository;

import com.example.basicRestApi.basicrestapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public  Department findByDepartmentName(String departmentName);

}
