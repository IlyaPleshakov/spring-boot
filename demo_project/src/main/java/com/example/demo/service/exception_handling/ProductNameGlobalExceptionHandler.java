package com.example.demo.service.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductNameGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ProductNameIncorrect> handleException(NoSuchProductNameException exception){
        ProductNameIncorrect productNameIncorrect=new ProductNameIncorrect();
        productNameIncorrect.setInfo(exception.getMessage());
        return new ResponseEntity<>(productNameIncorrect, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<ProductNameIncorrect> handleException(Exception exception){
        ProductNameIncorrect productNameIncorrect=new ProductNameIncorrect();
        productNameIncorrect.setInfo(exception.getMessage());
        return new ResponseEntity<>(productNameIncorrect, HttpStatus.NOT_FOUND);

    }
}
