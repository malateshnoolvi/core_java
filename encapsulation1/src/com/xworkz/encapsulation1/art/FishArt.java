package com.xworkz.encapsulation1.art;

import com.xworkz.encapsulation1.superclass.Fish;

public class FishArt {

	public static void main(String[] args) {

		Fish fish = new Fish("Tiger bomb", "fresh water");
		Fish fish2 = new Fish("Tiger bomb", "fresh water");
		boolean same = fish.equals(fish2);
		System.out.println(same);
	}

}
