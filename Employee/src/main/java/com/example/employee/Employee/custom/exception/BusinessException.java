package com.example.employee.Employee.custom.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID=1L;
    private String errorCode;
    private String errorMessage;


}
