package com.example.basicRestApi.basicrestapi.Service;

import com.example.basicRestApi.basicrestapi.Repository.DepartmentRepository;
import com.example.basicRestApi.basicrestapi.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {

        Department department =Department.builder()
                .departmentName("MCA")
                .departmentAddress("NOIDA")
                .departmentCode("MCA-101")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("MCA")).thenReturn(department);
    }


    @Test
    @DisplayName("Get Data based on valid department name")
    //@Disabled
    public void whenValidDepartmentName_thenDepartmentShouldFound(){

        String departmentName ="MCA";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName,found.getDepartmentName());

    }
}