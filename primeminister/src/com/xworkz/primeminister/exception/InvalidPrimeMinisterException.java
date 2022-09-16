package com.xworkz.primeminister.exception;

public class InvalidPrimeMinisterException extends Exception {

	public InvalidPrimeMinisterException(String msg) {
		super(msg);
		System.out.println("constructor of invalidpmexception");
	}

}
