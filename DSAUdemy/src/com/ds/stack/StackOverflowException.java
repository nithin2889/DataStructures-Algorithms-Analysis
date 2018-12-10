package com.ds.stack;

public class StackOverflowException extends RuntimeException {

	private static final long serialVersionUID = -8080885339171367827L;

	public StackOverflowException() {
	}
	
	public StackOverflowException(String message) {
		super(message);
	}

}