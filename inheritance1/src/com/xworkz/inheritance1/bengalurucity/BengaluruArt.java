package com.xworkz.inheritance1.bengalurucity;

public class BengaluruArt {

	public static void main(String[] args) {

		Bengaluru bengaluru = new Bengaluru(true, "kempegowda", true);
		bengaluru.torisu();

		City city = new Bengaluru(true, "kempegowda", true);
		Bengaluru converted = (Bengaluru) city;
		converted.area = 404.5d;
		converted.cityName = "Hubli";
		converted.population = 115800;
		converted.torisu();

	}

}
