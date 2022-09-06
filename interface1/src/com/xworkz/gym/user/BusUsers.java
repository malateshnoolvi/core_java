package com.xworkz.gym.user;

import com.xworkz.gym.inter.BusRule;

public class BusUsers {
	
	private BusRule busRule;
	
	public BusUsers( BusRule busRule) {
		this.busRule=busRule;
		System.out.println("constructor of bususers");
	}
	public boolean checkRule() {
		boolean seatForAgedPerson = this.busRule.seatForAgedPerson();
		boolean seatForLadies = this.busRule.seatForLadies();
		boolean ticketTaken = this.busRule.ticketTaken();
		if(seatForAgedPerson &&  seatForLadies && ticketTaken) {
			System.out.println("bus rules are followed");
		}
		else {
			System.err.println("bus rules are  not followed");
		}
		return true;
	}
	public boolean busMaintainance() {
		System.out.println("bus maintainance is good");
		return true;
	}
}
