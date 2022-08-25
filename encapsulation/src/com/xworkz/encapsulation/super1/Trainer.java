package com.xworkz.encapsulation.super1;

public class Trainer {

	protected String name;
	protected int exp;
	protected String specialization;

	protected Trainer() {
		System.out.println("default constructor of Trainer");
	}


	protected Trainer(String name, int exp, String specialization) {
		this.name = name;
		this.exp = exp;
		this.specialization = specialization;
	}

	protected void training() {
		System.out.println("good trained by Trainer");
	}

	protected void conductInterview() {
		System.out.println("conducting the interviews by Trainer");
	}

	protected void coding() {
		System.out.println("writing the codes ");
	}

	public String getName() {
		System.out.println("Trainer name is");
		return "OmkarSir";
	}

	public int getExp() {
		System.out.println("No of experience");
		return 8;
	}

	public String getSpecialization() {
		System.out.println("specialization in");
		return "Java";
	}

}
