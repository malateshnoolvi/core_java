package com.xworkz.cricket;

public class Cricket {

	public String country;
	public String captain;
	public char gender;

	public void setCountry(String country) {
		this.country = country;
		System.out.println("country name");
	}

	public void setCaptain(String captain) {
		this.captain = captain;
		System.out.println("captain name");
	}

	public void setGender(char gender) {
		this.gender = gender;
		System.out.println("type of gender");
	}

	public boolean entertainment() {
		System.out.println("entertainment in Cricket");
		return true;
	}

	public double presentation() {
		System.out.println("presentation in Cricket");
		return 150000;
	}

}
