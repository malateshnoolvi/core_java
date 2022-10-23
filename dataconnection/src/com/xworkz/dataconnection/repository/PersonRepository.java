package com.xworkz.dataconnection.repository;

import com.xworkz.dataconnection.dto.PersonDTO;

public interface PersonRepository {
	
	boolean save(PersonDTO dto);
	
	void displayAll();
	
	void displayAllAgeGreaterThenOrderByName(int age);
	
	void displayAllByGenderDescOrderByName(String gdr);
	
	void displayAllBySalaryGreaterThanOrderByDesc(double slry);
	
void displatCount();
	
	void displaySumOfSalary();

}
