package com.xworkz.inter;

import com.xworkz.inter.rules.HRRules;
import com.xworkz.inter.rules.ITRuleFollower;
import com.xworkz.inter.rules.ManagerRules;
import com.xworkz.inter.rules.SecurityRules;

public class RulesArt {

	public static void main(String[] args) {

		ITRuleFollower itRuleFollower = new ITRuleFollower();
		itRuleFollower.applyLeaves();
		itRuleFollower.harrasment();
		itRuleFollower.informLeave();
		itRuleFollower.parkingApproval();
		itRuleFollower.swipeCard();
		itRuleFollower.wfh();

		System.out.println("=======================");

		HRRules hrRules = new ITRuleFollower();
		hrRules.applyLeaves();
		hrRules.harrasment();

		System.out.println("=======================");

		SecurityRules securityRules = new ITRuleFollower();
		securityRules.swipeCard();
		securityRules.parkingApproval();

		System.out.println("=======================");

		ManagerRules managerRules = new ITRuleFollower();
		managerRules.informLeave();
		managerRules.wfh();

		System.out.println("=======================");
		
		//Object object = new ITRuleFollower();
		//Object object2 = new Object();

		
		
		
	}

}
