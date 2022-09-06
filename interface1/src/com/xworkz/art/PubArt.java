package com.xworkz.art;

import com.xworkz.gym.follower.CustomerPubRule;
import com.xworkz.gym.inter.PubRule;
import com.xworkz.gym.user.DownTownPub;

public class PubArt {

	public static void main(String[] args) {

		PubRule pubRule = new CustomerPubRule();

		DownTownPub downTownPub = new DownTownPub(pubRule);
		downTownPub.checkRules();
	}
}
