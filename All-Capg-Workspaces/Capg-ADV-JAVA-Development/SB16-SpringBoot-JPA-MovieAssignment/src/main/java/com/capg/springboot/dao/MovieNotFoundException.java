package com.capg.springboot.dao;

public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException(String message) {
		super(message);
	}
	
	public MovieNotFoundException(String message,Throwable e) {
		super(message,e);
	}
}
