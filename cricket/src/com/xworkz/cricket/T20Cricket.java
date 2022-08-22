package com.xworkz.cricket;

public class T20Cricket extends Cricket {

	public String manOfMatch() {
		System.out.println("man of the match in T20Cricket");
		return "Virat kohli";
	}

	@Override
	public boolean entertainment() {
		System.out.println("is there entertainment in T20Cricket");
		return true;
	}

}
