package com.xworkz.inter.rules;

public class ITRuleFollower implements HRRules, ManagerRules, SecurityRules {

	@Override
	public boolean swipeCard() {
		System.out.println("security rules-swipecard checked by security");
		return false;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("security rules-parking approval");
		return false;
	}

	@Override
	public boolean informLeave() {
		System.out.println("manager rules-to inform before take leave");
		return false;
	}

	@Override
	public boolean wfh() {
		System.out.println("manager rules-whether work form home");
		return false;
	}

	@Override
	public boolean applyLeaves() {
		System.out.println("HR rules-take the permission for leaves");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("HR rules-harrasment is not good");
		return false;
	}

}
