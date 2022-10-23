package com.xworkz.dataconnection.service;

import com.xworkz.dataconnection.dto.PersonDTO;

public interface PersonService {

	boolean validAndSave(PersonDTO dto);
	
	void displayAll();
	
	void displayAllAgeGreaterThenOrderByName(int age);
	
	void displayAllByGenderDescOrderByName(String gdr);
	
	void displayAllBySalaryGreaterThanOrderByDesc(double slry);
	
	void displatCount();
	
	void displaySumOfSalary();
}
