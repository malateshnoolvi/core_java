package com.xworkz.automobile.base;

public class HondaAutomobile extends Automobile {

	public double openTime;
	public double closeTime;

	public HondaAutomobile() {
		System.out.println("default constructor of HondaAutomobile");
	}

	public HondaAutomobile(double openTime, double closeTime) {
		this.openTime = openTime;
		this.closeTime = closeTime;
		System.out.println("double,double type constructor");
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println("opening time is" + " " + this.openTime);
		System.out.println("closing time is" + " " + this.closeTime);
	}
}
