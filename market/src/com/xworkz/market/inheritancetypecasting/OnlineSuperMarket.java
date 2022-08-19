package com.xworkz.market.inheritancetypecasting;

public class OnlineSuperMarket extends SuperMarket {

	public String onlineMarketName;
	public String itemName;
	public int itemPrice;
	
	public OnlineSuperMarket(String onlineMarketName,String itemName,int itemPrice) {
	 super("major market",45,"Ganesh");
	      this.onlineMarketName=onlineMarketName;
	      this.itemName=itemName;
	      this.itemPrice=itemPrice;
	
	  	 System.out.println("constructor of OnlineSuperMarket");
	}
	public void display() {
		System.out.println(super.marketName);
		System.out.println(super.itemsAvialable);
		System.out.println(super.maintanance);
		System.out.println(super.SuperMarketName);
		System.out.println(super.ownerName);
		System.out.println(super.noOfWorkers);
		System.out.println(this.onlineMarketName);
		System.out.println(this.itemName);
		System.out.println(this.itemPrice);
	}
}
