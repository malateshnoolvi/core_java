package com.xworkz.cricket;

public class CricketArt {

	public static void main(String[] args) {

		System.out.println("<=============Criket============>");
		
		Cricket cricket = new Cricket();
		cricket.setCountry("India");
		System.out.println(cricket.country);
		cricket.setCaptain("MS Dhoni");
		System.out.println(cricket.captain);
		cricket.setGender('M');
		System.out.println(cricket.gender);
		boolean mat=cricket.entertainment();
		System.out.println(mat);
		double prize=cricket.presentation();
		System.out.println(prize);

		System.out.println("<========OneDayCricket==========>");
		
		OneDayCricket crt = new OneDayCricket();
		crt.setBestBatsman("Rohit Sharma");
		System.out.println(crt.bestBatsman);
		crt.setBestBowler("Bhuvaneshwar");
		System.out.println(crt.bestBowler);
		double prize1 = crt.presentation();
		System.out.println(prize1);
		String name=crt.manOfSeries();
		System.out.println(name);
		boolean match = crt.entertainment();
		System.out.println(match);
		
		System.out.println("<===========TestCricket==========>");
		
		TestCricket tc = new TestCricket();
		tc.setGroundType("Cricket Stadium");
		System.out.println(tc.groundType);
		double prize2 = tc.presentation();
		System.out.println(prize2);

		System.out.println("<===========T20Cricket===========>");
		
		T20Cricket tcrt = new T20Cricket();
		String man = tcrt.manOfMatch();
		System.out.println(man);
		boolean match3 = tcrt.entertainment();
		System.out.println(match3);

		System.out.println("<=================================>");

	}

}
