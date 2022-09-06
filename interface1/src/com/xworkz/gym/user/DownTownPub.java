package com.xworkz.gym.user;

import com.xworkz.gym.inter.PubRule;

public class DownTownPub {

	private PubRule pubRule;

	public DownTownPub(PubRule pubRule) {
		this.pubRule = pubRule;
		System.out.println("constructor of downtownrule");
	}

	public boolean checkRules() {
		boolean dressCodeFollowed = this.pubRule.dressCodeFollowed();
		int age = this.pubRule.age();
		boolean validProof = this.pubRule.validProof();
		if (dressCodeFollowed == true && age > 21 && validProof == true) {
			System.out.println("pub rules are followed");
		} 
		else {
			System.err.println("pub rules are not followed");
		}
		return true;
	}

}
