package com.example.notesservice.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<CustomErrorModel> handleNotFoundException(ChangeSetPersister.NotFoundException ex) {
        CustomErrorModel errorResponse = new CustomErrorModel("Resource not found");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
