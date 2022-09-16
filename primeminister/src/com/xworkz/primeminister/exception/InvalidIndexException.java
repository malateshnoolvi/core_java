package com.xworkz.primeminister.exception;

public class InvalidIndexException extends RuntimeException {

	public InvalidIndexException(String msg) {
		super(msg);
		System.out.println("constructor of invalidindexexception");
	}

}
