package com.example.basicRestApi.basicrestapi.Repository;

import com.example.basicRestApi.basicrestapi.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .departmentName("MCA")
                .departmentCode("MCA-101")
                .departmentAddress("NOIDA")
                .build();

        entityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(3L).get();
        assertEquals(department.getDepartmentName(),"MCA");

    }


}