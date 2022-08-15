package com.xworkz.inheritance.cycle;

public class Cycle {
	
	public String bikeName = "Hero";
	public int bikePrice = 98575;
	public String bikeColor = "black";
	public boolean digitalDisplay = false;
	public String bikeNumber = "KA25M3568";

	public Cycle() {
		System.out.println("constructor of cycle");
	}

	public void torisu() {

		System.out.println(this.bikeName);
		System.out.println(this.bikePrice);
		System.out.println(this.bikeColor);
		System.out.println(this.digitalDisplay);
		System.out.println(this.bikeNumber);
		System.out.println("==========================");
	}


}
