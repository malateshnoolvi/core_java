package com.xworkz.inheritance1.earthplanet;

public class EarthPlanet extends Planet {

	public int earthPopulationInB;
	public boolean airInEarth;
	public boolean waterInEarth;

	public EarthPlanet(int earthPopulationInB, boolean airInEarth, boolean waterInEarth) {
		super("earth", 7319, "ovalShape");
		System.out.println("constructor of earthplanet");
		this.earthPopulationInB = earthPopulationInB;
		this.airInEarth = airInEarth;
		this.waterInEarth = waterInEarth;
		super.planetName = planetName;
		super.planetRadius = planetRadius;
		super.shapeOfPlanet = shapeOfPlanet;
	}

	public void torisu() {
		System.out.println(this.airInEarth);
		System.out.println(this.earthPopulationInB);
		System.out.println(this.waterInEarth);
		System.out.println(super.planetName);
		System.out.println(super.planetRadius);
		System.out.println(super.shapeOfPlanet);

		System.out.println("=======================");
	}
}
