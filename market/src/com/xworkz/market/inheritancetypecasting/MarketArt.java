package com.xworkz.market.inheritancetypecasting;
public class MarketArt {
	

	public static void main(String[] main) {
		
	    Market market1=new Market("Janata market", 25, false);
	    Market market2=new SuperMarket("major market",45,"Ganesh");
	    Market market3=new OnlineSuperMarket("Meshoo","Mobilecover",200);
	    market1.display();
	    System.out.println("===============================");
	    
	    
	    SuperMarket sm=new SuperMarket("major market",45,"Ganesh");
	    SuperMarket sm1=new OnlineSuperMarket("Meshoo","Mobilecover",200);
	    sm.display();
	    System.out.println("================================");
	   
	    
	    OnlineSuperMarket osm=new OnlineSuperMarket("Meshoo","Mobilecover",200);
	    osm.display();
	    System.out.println("=================================");
	    
	    if(market2 instanceof SuperMarket) {
		SuperMarket converted=(SuperMarket)market2;
		converted.display();
		System.out.println("ref of supermarket");
		}
		else {
			System.out.println("not ref of supermarket");
		}
	    System.out.println("===================================");
	    
	    if(market3 instanceof OnlineSuperMarket) {
	    	OnlineSuperMarket converted=(OnlineSuperMarket)market3;
	    	converted.display();
	    	System.out.println("ref of onlinesupermarket");
	    }
	    else {
	    	System.out.println("not ref of onlinesupermarket");
	    }
	    System.out.println("====================================");
	    
	    if(market1 instanceof OnlineSuperMarket) {
	    	OnlineSuperMarket converted=(OnlineSuperMarket)market1;
	        converted.display();
	        System.out.println("ref of OnlineSuperMarket");
	    }
	    else {
	    	System.out.println("not ref of OnlineSuperMarket");
	    }
	        
	    
	    
	    
	    
	    
	    
	}

}
