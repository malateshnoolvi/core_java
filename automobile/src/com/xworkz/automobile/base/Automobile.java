package com.xworkz.automobile.base;

public class Automobile {

	public String type;
	public String brand;

	protected Automobile() {
		System.out.println("default constructor of Automobile");
	}

	public double sellAccessories(String name) {
		if (name == "break cable") {
			System.out.println("break price is");
			return 200;
		}
		if (name == "head light") {
			System.out.println("break price is");
			return 445;
		}
		System.out.println("no items");
		return 0.0;

	}

	protected void torisu() {
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
