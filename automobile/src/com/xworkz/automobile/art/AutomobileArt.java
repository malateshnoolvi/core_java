package com.xworkz.automobile.art;

import com.xworkz.automobile.base.Automobile;
import com.xworkz.automobile.base.HondaAutomobile;
import com.xworkz.automobile.sub.TataAutomobile;

public class AutomobileArt {

	public static void main(String[] args) {

		//Automobile auto=new AutomobileArt();----------------(protected)
		
		Automobile automobile = new HondaAutomobile(9.15, 6.15);
		double am = automobile.sellAccessories("break cable");
		System.out.println(am);
		automobile.setType("two wheeler");
		automobile.setBrand("Hero");
		//automobile.torisu();--------------------------------(protected)

		System.out.println("<==================================>");

		HondaAutomobile honda = new HondaAutomobile(9.35, 6.35);
		honda.setType("Four wheeler");
		honda.setBrand("Honda");
		honda.torisu();

		System.out.println("<==================================>");

		TataAutomobile tata = new TataAutomobile();
		tata.setType("Four wheeler");
		tata.setBrand("Tata");
		tata.torisu();

		System.out.println("<==================================>");
	}

}
