package com.xworkz.automobile.art;

import com.xworkz.automobile.base.Automobile;
import com.xworkz.automobile.sub.HondaAutomobile;
import com.xworkz.automobile.sub1.TataAutomobile;

public class AutomobileArt {

	public static void main(String[] args) {
		
		Automobile automobile=new HondaAutomobile(9.35,7.25);
		automobile.sellAccessories("break cable");
        automobile.setType("two wheeler");
        automobile.setBrand("Hero");
        automobile.torisu();
        
        System.out.println("<==================================>");
        
        HondaAutomobile honda=new HondaAutomobile(9.30,6.30);
        honda.setType("Four wheeler");
        honda.setBrand("Honda");
        honda.torisu();
        
        System.out.println("<==================================>");
         
        TataAutomobile tata=new TataAutomobile();
        tata.setType("Four wheeler");
        tata.setBrand("Tata");
        tata.torisu();
        
        System.out.println("<==================================>");
	}

}
