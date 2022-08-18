package com.xworkz.inheritance1.mangofruit;

public class MangoArt {

	public static void main(String[] args) {

		Mango mango = new Mango("yellow", true, "parabolic");
		mango.torisu();

		Fruit fruit = new Mango("yellow", true, "parabolic");
		Mango convert = (Mango) fruit;
		convert.fruitName = "orange";
		convert.taste = "sour";
		convert.season = "winterseason";
		convert.torisu();

	}

}
