package com.aksoyakin.shoppingcart.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleAccessDemandException(AccessDeniedException ex) {
        String message = "You do not have permission to this action!";
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
