package com.xworkz.inheritance1.earthplanet;

public class Planet {

	public String planetName;
	public int planetRadius;
	public String shapeOfPlanet;

	public Planet(String planetName, int planetRadius, String shapeOfPlanet) {
		System.out.println("constructor of planet");

		this.planetName = planetName;
		this.planetRadius = planetRadius;
		this.shapeOfPlanet = shapeOfPlanet;

	}

}
