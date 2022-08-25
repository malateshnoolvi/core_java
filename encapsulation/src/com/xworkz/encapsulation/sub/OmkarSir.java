package com.xworkz.encapsulation.sub;

import com.xworkz.encapsulation.super1.Trainer;

public class OmkarSir extends Trainer {

	public OmkarSir() {
		System.out.println("default constructor of omkarsir");
	}

	public OmkarSir(String name, int exp, String specialization) {
		super(name, exp, specialization);
		
	}

	@Override
	public void training() {
		System.out.println("omkarsir is good trainer");
		super.training();
	}

	@Override
	public void conductInterview() {
		System.out.println("omkarsir is pushing to the interviews");
		super.conductInterview();
	}

	@Override
	public void coding() {
		System.out.println(" omkarsir is practices all the codings");
		super.coding();
	}


}
