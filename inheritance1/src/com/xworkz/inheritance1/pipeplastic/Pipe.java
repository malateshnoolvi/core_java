package com.xworkz.inheritance1.pipeplastic;

public class Pipe extends Plastic {

	public int pipeLength;
	public double radius;
	public String shape;

	public Pipe(int pipeLength, double radius, String shape) {
		super(true, "black", 2500.0d);
		System.out.println("constructor of pipe");
		this.pipeLength = pipeLength;
		this.radius = radius;
		this.shape = shape;
		super.strength = strength;
		super.color = color;
		super.rate = rate;
	}

	public void torisu() {
		System.out.println(this.pipeLength);
		System.out.println(this.radius);
		System.out.println(this.shape);
		System.out.println(this.strength);
		System.out.println(this.color);
		System.out.println(this.rate);
		System.out.println("================");
	}

}
