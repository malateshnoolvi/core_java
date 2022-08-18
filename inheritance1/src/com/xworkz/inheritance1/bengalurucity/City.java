package com.xworkz.inheritance1.bengalurucity;

public class City {
	public City() {
		
	}

	public String cityName;
	public double area;
	public int population;

	public City(String cityName, double area, int population) {
		System.out.println("constructor of city");

		this.cityName = cityName;
		this.area = area;
		this.population = population;

	}

}
