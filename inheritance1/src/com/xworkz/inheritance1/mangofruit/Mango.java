package com.xworkz.inheritance1.mangofruit;

public class Mango extends Fruit {

	public String color;
	public boolean sweet;
	public String shape;

	public Mango(String color, boolean sweet, String shape) {
		super("mango", "sweet", "summerseason");
		System.out.println("constructor of mango");
		this.color = color;
		this.sweet = sweet;
		this.shape = shape;
	}

	public void torisu() {
		System.out.println(this.color);
		System.out.println(this.sweet);
		System.out.println(this.shape);
		System.out.println(super.fruitName);
		System.out.println(super.taste);
		System.out.println(super.season);
		System.out.println("===============");
	}

}
