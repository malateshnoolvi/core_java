package com.xworkz.inheritance.rubber;

public class Rubber {
	
	public String ballShape="circle";
	public int ballPrice=90;
	public String madeUp="rubber";
	public String ballType="lather";
	public String ballColor="yellow";
	
	public Rubber() {
	System.out.println("costructor of rubber");
	}

	public void torisu() {
		System.out.println(this.ballShape);
		System.out.println(this.ballPrice);
		System.out.println(this.madeUp);
		System.out.println(this.ballType);
		System.out.println(this.ballColor);
		System.out.println("======================");
	}
}
;