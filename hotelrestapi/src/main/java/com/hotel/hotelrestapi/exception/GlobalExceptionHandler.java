package com.hotel.hotelrestapi.exception;

import com.hotel.hotelrestapi.models.ApiErrors;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("Method not supported....");
        ApiErrors errors= new ApiErrors(message,details,status, LocalDateTime.now());

        return ResponseEntity.status(status).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("Medi Type .. not supported....");
        ApiErrors errors= new ApiErrors(message,details,status, LocalDateTime.now());

        return ResponseEntity.status(status).body(errors);
        }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("path variable is missing....");
        details.add(ex.getMessage());
        ApiErrors errors= new ApiErrors(message,details,status, LocalDateTime.now());

        return ResponseEntity.status(status).body(errors);

    }


    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("mismath of type .. !!...");
        ApiErrors errors= new ApiErrors(message,details,status, LocalDateTime.now());

        return ResponseEntity.status(status).body(errors);

    }


    // now our custom exception.....................................

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<Object> handleHotelNotFound(HotelNotFoundException ex){

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("Hotel Not Found .. !!...");
        ApiErrors errors= new ApiErrors(message,details,HttpStatus.BAD_REQUEST, LocalDateTime.now());

        return ResponseEntity.badRequest().body(errors);

    }



    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<Object> handleHotelNotFound(IdNotFoundException ex){

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("invalid id .. !!...");
        ApiErrors errors= new ApiErrors(message,details,HttpStatus.NOT_FOUND, LocalDateTime.now());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);

    }


//if we have our own exception handler method we must annotated with @ExceptionHandler but
    //override exception we do not need to annotated


    //one more exception for all typessssss

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleForAll(Exception ex){

        String message = ex.getMessage();
        List<String> details = new ArrayList<>();
        details.add("All types exception ..this is biforcely");
        details.add(ex.getMessage());
        ApiErrors errors= new ApiErrors(message,details,HttpStatus.NOT_FOUND, LocalDateTime.now());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);

    }

}
