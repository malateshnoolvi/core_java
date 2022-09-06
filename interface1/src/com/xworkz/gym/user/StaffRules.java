package com.xworkz.gym.user;

import com.xworkz.gym.inter.Gymrules;

public class StaffRules {

	private Gymrules gymrules;

	public StaffRules(Gymrules gymrules) {
		this.gymrules = gymrules;
		System.out.println("constructor of staffrules");
	}

	public void checkTheRules() {
		boolean shoes = this.gymrules.wearShoes();
		boolean allowed = this.gymrules.unisex();
		double fees=this.gymrules.monthlyFees();
		
		if(shoes && fees>200 && allowed) {
			System.out.println("gym rules are followed");
		}
		else {
			System.err.println("gym rules are not followed");
		}
	}
		public void maintainance() {
			System.out.println("gym maintained");
		}
	}
	


