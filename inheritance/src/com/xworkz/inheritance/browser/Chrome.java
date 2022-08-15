package com.xworkz.inheritance.browser;

public class Chrome {
	
	public String channel="beta";
	public int yearOflaunched=2008;
	public String invitor="googlechrome";
	public String firstWeb="worldwideweb";
	public boolean secure=true;
	
	public Chrome() {
		System.out.println("costructor of chrome");
	}
	public void torisu() {
		System.out.println(this.channel);
		System.out.println(this.yearOflaunched);
		System.out.println(this.invitor);
		System.out.println(this.firstWeb);
		System.out.println(this.secure);
		System.out.println("========================");
	}

}
