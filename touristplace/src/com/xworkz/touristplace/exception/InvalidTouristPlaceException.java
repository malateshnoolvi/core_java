package com.xworkz.touristplace.exception;

public class InvalidTouristPlaceException extends Exception {

	public InvalidTouristPlaceException(String msg) {
		super(msg);
		System.out.println("constructor of itpe");
	}

}
