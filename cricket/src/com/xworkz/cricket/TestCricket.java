package com.xworkz.cricket;

public class TestCricket extends Cricket {

	public String groundType;
	
	public void setGroundType(String groundType) {
		this.groundType=groundType;
		System.out.println("type of ground in TestCricket");
	}
	@Override
	public double presentation() {
		System.out.println("presentation in TestCricket");
		return 1500000;
	}
	
}
