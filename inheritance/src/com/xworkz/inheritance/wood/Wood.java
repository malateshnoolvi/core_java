package com.xworkz.inheritance.wood;

public class Wood {

	public String batType = "cricket bat";
	public double batPrice = 800;
	public String batColor = "cream";
	public String batCompany = "puma";
	public float batSize = 3.2f;

	public Wood() {
		System.out.println("constructor of wood");
	}

	public void torisu() {
		System.out.println(this.batType);
		System.out.println(this.batPrice);
		System.out.println(this.batColor);
		System.out.println(this.batCompany);
		System.out.println(this.batSize);
		System.out.println("====================");
	}

}
