package com.xworkz.inheritance.plane;

public class Plane {

	public String typeOfTrasportation = "Airway";
	public String fuelType = "diesel";
	public int noOfPassengers = 10;
	public int noOfWings = 3;
	public double price = 655646;

	public Plane() {
		System.out.println("constructor of palne");
	}

	public void torisu() {
		System.out.println(this.typeOfTrasportation);
		System.out.println(this.fuelType);
		System.out.println(this.noOfPassengers);
		System.out.println(this.noOfWings);
		System.out.println(this.price);
		System.out.println("=======================");
	}
}
