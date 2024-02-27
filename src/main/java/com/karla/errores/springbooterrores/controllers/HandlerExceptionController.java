package com.karla.errores.springbooterrores.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.karla.errores.springbooterrores.exceptions.UserNotFoundException;
import com.karla.errores.springbooterrores.models.Error;
@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<Error> divisionByZero(Exception ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("error de division por zero");
        error.setMesssage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.internalServerError().body(error);
    }

    @ExceptionHandler({NoHandlerFoundException.class})
    public ResponseEntity<Error> notFoundEx(NoHandlerFoundException ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Api Rest Not Found");
        error.setMesssage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler({NumberFormatException.class})
    public ResponseEntity<Error> notFoundInteger(NumberFormatException ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Casting error");
        error.setMesssage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(404).body(error);
    }


    @ExceptionHandler({NullPointerException.class, HttpMessageNotWritableException.class, UserNotFoundException.class})
    public ResponseEntity<Error> notFoundExNull(NullPointerException ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("El usuario o rol no existe");
        error.setMesssage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(404).body(error);
    }

    
}
