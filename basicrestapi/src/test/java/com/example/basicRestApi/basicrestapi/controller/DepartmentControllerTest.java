package com.example.basicRestApi.basicrestapi.controller;

import com.example.basicRestApi.basicrestapi.Service.DepartmentService;
import com.example.basicRestApi.basicrestapi.entity.Department;
import com.example.basicRestApi.basicrestapi.error.DepartmentNotFoundException;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@AutoConfigureMockMvc
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService; //controller layer call service layer so

    private Department department; //department object

    @BeforeEach
    void setUp() {

        department=Department.builder()
                .departmentAddress("NOIDA")
                .departmentCode("MCA-101")
                .departmentName("MCA")

                .departmentId(3L).build();

    }

    @Test
    void saveDepartment() throws Exception {
       Department inputdepartment=Department.builder()
               .departmentAddress("NOIDA")
                .departmentCode("MCA-101")
                .departmentName("MCA")
                .build();

        Mockito.when(departmentService.saveDepartment(inputdepartment))
                .thenReturn(department);
        mockMvc.perform(post("/saveDepartments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"departmentName\":\"MCA\",\n" +
                        "\t\"departmentAddress\":\"NOIDA\",\n" +
                        "\t\"departmentCode\":\"MCA-101\"\n" + "}"))
                .andExpect(status().isOk());

    }

    @Test
    void fetchDepartmentById() throws Exception {
        Mockito.when(departmentService.fetchDepartmentById(3L))
                .thenReturn(department);

        mockMvc.perform(get("/departments/3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));


    }
}