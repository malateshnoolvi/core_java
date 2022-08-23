package com.xworkz.automobile.base;

public class Automobile {

	public String type;
	public String brand;

	protected Automobile() {
		System.out.println("default constructor of Automobile");
	}

	public double sellAccessories(String name) {

		return 2000;
	}

	public void torisu() {
		System.out.println("type of automobile is" + " " + this.type);
		System.out.println("brand of automobile is" + " " + this.brand);
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
