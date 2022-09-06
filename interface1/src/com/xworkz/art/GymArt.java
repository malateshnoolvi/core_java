package com.xworkz.art;

import com.xworkz.gym.follower.PrajwalRules;
import com.xworkz.gym.inter.Gymrules;
import com.xworkz.gym.user.StaffRules;

public class GymArt {

	public static void main(String[] args) {
		
		Gymrules gymrules=new PrajwalRules();
		
		StaffRules staffRules=new StaffRules(gymrules);
		staffRules.checkTheRules();
		staffRules.maintainance();
	}

}
