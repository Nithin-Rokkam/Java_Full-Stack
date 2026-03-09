package com.capg.springboot.service.impl;


public class ResousrseNotFoundException extends RuntimeException {
	public ResousrseNotFoundException(String message) {
		super(message);
	}
	
	public ResousrseNotFoundException(String message,Throwable e) {
		super(message,e);
	}

}
