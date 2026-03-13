package com.capg.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.capg.springboot.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleBookNotFoundException(
			BookNotFoundException ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				ex.getMessage(),
				request.getDescription(false),
				HttpStatus.NOT_FOUND.value()
		);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorResponse> handleServiceException(
			ServiceException ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				ex.getMessage(),
				request.getDescription(false),
				HttpStatus.INTERNAL_SERVER_ERROR.value()
		);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGlobalException(
			Exception ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				"An unexpected error occurred: " + ex.getMessage(),
				request.getDescription(false),
				HttpStatus.INTERNAL_SERVER_ERROR.value()
		);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
