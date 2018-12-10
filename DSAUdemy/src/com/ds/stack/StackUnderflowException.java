package com.ds.stack;

public class StackUnderflowException extends RuntimeException {

	private static final long serialVersionUID = -8080885339171367827L;

	public StackUnderflowException() {
	}
	
	public StackUnderflowException(String message) {
		super(message);
	}

}