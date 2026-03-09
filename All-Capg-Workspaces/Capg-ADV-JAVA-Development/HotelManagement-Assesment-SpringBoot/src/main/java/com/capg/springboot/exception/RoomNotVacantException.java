package com.capg.springboot.exception;

public class RoomNotVacantException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RoomNotVacantException(String message) {
		super(message);
	}
	
	public RoomNotVacantException(String message, Throwable cause) {
		super(message, cause);
	}
}
