package com.jobportal.jobportal.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.jobportal.jobportal.response.ApiResponse;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Resource Not Found
    @ExceptionHandler(ResourceNotFoundException.class)
    public ApiResponse<String> handleResourceNotFound(
            ResourceNotFoundException ex) {

        return new ApiResponse<>(
                "error",
                ex.getMessage(),
                null
        );
    }

    // Validation Error
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse<Map<String, String>> handleValidation(
            MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(
                        error.getField(),
                        error.getDefaultMessage()
                )
        );

        return new ApiResponse<>(
                "error",
                "Validation failed",
                errors
        );
    }

    // General Exception
    @ExceptionHandler(Exception.class)
    public ApiResponse<String> handleGeneralException(
            Exception ex) {

        return new ApiResponse<>(
                "error",
                "Something went wrong",
                null
        );
    }
}