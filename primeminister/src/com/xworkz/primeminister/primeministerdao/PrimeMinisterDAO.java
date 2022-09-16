package com.xworkz.primeminister.primeministerdao;

import com.xworkz.primeminister.exception.InvalidIndexException;

public interface PrimeMinisterDAO {
	
	boolean save(String name) throws InvalidIndexException;
	
	boolean checkName(String name);

}
