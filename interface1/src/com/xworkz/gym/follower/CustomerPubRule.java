package com.xworkz.gym.follower;

import com.xworkz.gym.inter.PubRule;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodeFollowed() {
		System.out.println("dresscode followed by person");
		return true;
	}

	@Override
	public int age() {
		System.out.println("age of the person");
		return 25;
	}

	@Override
	public boolean validProof() {
		System.out.println("valid proof of the persons");
		return true;
	}

}
