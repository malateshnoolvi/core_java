package com.xworkz.gym.follower;

import com.xworkz.gym.inter.BusRule;

public class CustumerBusRule implements BusRule {

	@Override
	public boolean seatForAgedPerson() {
		System.out.println("this seat is reserved for aged person");
		return false;
	}

	@Override
	public boolean seatForLadies() {
		System.out.println("this seat is reserved for ladies");
		return true;
	}

	@Override
	public boolean ticketTaken() {
		System.out.println("ticket taken by person");
		return true;
	}

}
