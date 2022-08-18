package com.xworkz.inheritance1.pipeplastic;

public class Plastic {

	public boolean strength;
	public String color;
	public double rate;
	
	public Plastic( boolean strength,String color,double rate) {
		System.out.println("costructor of plastic");
		this.strength=strength;
		this.color=color;
		this.rate=rate;
	}

}
