package com.xworkz.gym.follower;

import com.xworkz.gym.inter.Gymrules;

public class PrajwalRules implements Gymrules {

	@Override
	public boolean wearShoes() {
		System.out.println("running wearshoes");
		return true;
	}

	@Override
	public boolean unisex() {
		System.out.println("running unisex");
		return true;
	}

	@Override
	public double monthlyFees() {
		System.out.println("running monthlyfees");
		return 500;
	}

}
