package com.xworkz.primeminister.primeministerservice;

import com.xworkz.primeminister.exception.InvalidPrimeMinisterException;

public interface PrimeMinisterService {

	boolean validateAndSave(String name) throws InvalidPrimeMinisterException;
}
