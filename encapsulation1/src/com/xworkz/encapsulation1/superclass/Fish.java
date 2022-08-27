package com.xworkz.encapsulation1.superclass;

public class Fish {

	private String breed;
	private String type;

	public Fish() {
		System.out.println("default constructor of fish");
	}

	public Fish(String breed, String type) {
		super();
		this.breed = breed;
		this.type = type;
		System.out.println("string,string type constructor");
	}

	@Override
	public String toString() {
		return "breed is" + this.breed + " " + "type is" + this.type;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj !=null) {
			System.out.println();
			if (obj instanceof Fish) {
				System.out.println("check");
				Fish convert = (Fish) obj;
				String converted = convert.breed;
				String converted1 = convert.type;

				if (this.breed.equals(converted) && this.type.equals(converted1)) {
					
					System.out.println("fish equals fish2");
					return true;
				}
				else {
					System.err.println("fish not equals fish2");
				}
			}

		}
		return super.equals(obj);
	}
}
