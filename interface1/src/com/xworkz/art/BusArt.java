package com.xworkz.art;

import com.xworkz.gym.follower.CustumerBusRule;
import com.xworkz.gym.inter.BusRule;
import com.xworkz.gym.user.BusUsers;

public class BusArt {

	public static void main(String[] args) {
		
		BusRule busRule = new CustumerBusRule();
		
		BusUsers  busUsers = new BusUsers(busRule);
		busUsers.checkRule();
		busUsers.busMaintainance();
	}
}
