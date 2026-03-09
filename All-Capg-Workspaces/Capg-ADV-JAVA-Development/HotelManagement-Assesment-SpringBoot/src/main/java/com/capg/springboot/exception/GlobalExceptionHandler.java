package com.capg.springboot.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.capg.springboot.service.impl.ResousrseNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RoomNotVacantException.class)
	public ResponseEntity<Map<String, Object>> handleRoomNotVacantException(
			RoomNotVacantException ex, WebRequest request) {
		
		Map<String, Object> errorDetails = new HashMap<>();
		errorDetails.put("timestamp", LocalDateTime.now());
		errorDetails.put("status", HttpStatus.CONFLICT.value());
		errorDetails.put("error", "Conflict");
		errorDetails.put("message", ex.getMessage());
		errorDetails.put("path", request.getDescription(false).replace("uri=", ""));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(ResousrseNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotFoundException(
			ResousrseNotFoundException ex, WebRequest request) {
		
		Map<String, Object> errorDetails = new HashMap<>();
		errorDetails.put("timestamp", LocalDateTime.now());
		errorDetails.put("status", HttpStatus.NOT_FOUND.value());
		errorDetails.put("error", "Not Found");
		errorDetails.put("message", ex.getMessage());
		errorDetails.put("path", request.getDescription(false).replace("uri=", ""));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, Object>> handleGlobalException(
			Exception ex, WebRequest request) {
		
		Map<String, Object> errorDetails = new HashMap<>();
		errorDetails.put("timestamp", LocalDateTime.now());
		errorDetails.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorDetails.put("error", "Internal Server Error");
		errorDetails.put("message", ex.getMessage());
		errorDetails.put("path", request.getDescription(false).replace("uri=", ""));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
