package com.xworkz.inheritance1.mangofruit;

public class Fruit {

	public String fruitName;
	public String taste;
	public String season;

	public Fruit(String fruitName, String taste, String season) {
		System.out.println("costructor of fruit");
		this.fruitName = fruitName;
		this.taste = taste;
		this.season = season;
	}
}
