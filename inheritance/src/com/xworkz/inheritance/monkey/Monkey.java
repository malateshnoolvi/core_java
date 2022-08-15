package com.xworkz.inheritance.monkey;

public class Monkey {

	public double manHeight=5.7;
	public String skinColor="light brown";
	public double weight=58;
	public int noOfHands=2;
	public String gender="male";
	
	
	public Monkey() {
		System.out.println("constructor of monkey");
	}
	public void torisu() {
		System.out.println(this.manHeight);
		System.out.println(this.skinColor);
		System.out.println(this.weight);
		System.out.println(this.noOfHands);
		System.out.println(this.gender);
		System.out.println("=======================");
		}
	}
