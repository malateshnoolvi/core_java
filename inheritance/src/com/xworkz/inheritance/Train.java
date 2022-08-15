package com.xworkz.inheritance;

public class Train {

	public String metroName = "namma metro";
	public double metroPrice = 15.5d;
	public int metroNumber = 4578;
	public String stationName = "banashankari";
	public int noOfStations = 12;

	public Train() {

		System.out.println("constructor of train");

	}

	public void torisu() {

		System.out.println(this.metroName);
		System.out.println(this.metroPrice);
		System.out.println(this.metroNumber);
		System.out.println(this.stationName);
		System.out.println(this.noOfStations);
		System.out.println("========================");
	}

}
