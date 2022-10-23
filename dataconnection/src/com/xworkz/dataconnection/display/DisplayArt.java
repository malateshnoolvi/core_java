package com.xworkz.dataconnection.display;

import com.xworkz.dataconnection.serviceimpl.PersonServiceImpl;

public class DisplayArt {

	public static void main(String[] args) {
		PersonServiceImpl serviceImpl = new PersonServiceImpl();
		serviceImpl.displayAll();
		System.out.println("<================================================>");
		serviceImpl.displayAllAgeGreaterThenOrderByName(25);
		System.out.println("<================================================>");
		serviceImpl.displayAllByGenderDescOrderByName("male");
		System.out.println("<================================================>");
		serviceImpl.displayAllBySalaryGreaterThanOrderByDesc(25000);
		System.out.println("<================================================>");
		serviceImpl.displatCount();
		System.out.println("<================================================>");
		serviceImpl.displaySumOfSalary();
	}

}
