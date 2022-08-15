package com.xworkz.inheritance.alchohol;

public class Alchohol {
	
	public String beerName="Tuborg";
	public String flavour="lemon";
	public double price=165;
	public double alchoholContent=38.5;
	public boolean tasty=true;
	
	public Alchohol() {
     System.out.println("costructor of alchohol");
	}

	public void torisu() {
		System.out.println(this.beerName);
		System.out.println(this.flavour);
		System.out.println(this.price);
		System.out.println(this.alchoholContent);
		System.out.println(this.tasty);
		System.out.println("=====================");
	}
}
