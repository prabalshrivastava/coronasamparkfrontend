package com.hackathon.coronasampark.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Optional;

@ControllerAdvice(basePackages = "com.hackathon.coronasampark")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private ResponseEntity<?> error(Exception exception, MultiValueMap headers, HttpStatus status) {
    final String message =
            Optional.of(exception.getMessage()).orElse(exception.getClass().getSimpleName());
    return new ResponseEntity<>(exception, headers, status);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleAllExceptions(final Exception exception) {
    final String message =
            Optional.of(exception.getMessage()).orElse(exception.getClass().getSimpleName());
    MultiValueMap headers = null;
    HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    return error(exception, headers, status);
  }
}
