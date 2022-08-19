package com.xworkz.market.inheritancetypecasting;

public class SuperMarket extends Market {

	public String SuperMarketName;
	public int noOfWorkers;
	public String ownerName;

	public SuperMarket(String SuperMarketName, int noOfWorkers,String ownerName) {
		super("Janata market", 25, false);
		this.SuperMarketName=SuperMarketName;
		this.noOfWorkers=noOfWorkers;
		this.ownerName=ownerName;
		System.out.println("constructor of SuperMarket");
	}

	    public void display() {
		System.out.println(super.marketName);
		System.out.println(super.itemsAvialable);
		System.out.println(super.maintanance);
		System.out.println(this.SuperMarketName);
		System.out.println(this.ownerName);
		System.out.println(this.noOfWorkers);

	}
}
