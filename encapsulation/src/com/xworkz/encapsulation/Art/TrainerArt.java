package com.xworkz.encapsulation.Art;

import com.xworkz.encapsulation.sub.OmkarSir;
import com.xworkz.encapsulation.super1.Trainer;

public class TrainerArt {

	public static void main(String[] args) {

		// Trainer trainer=new Trainer(); --------------->(protected)

		OmkarSir omkarSir = new OmkarSir();
		omkarSir.training();
		omkarSir.conductInterview();
		omkarSir.coding();
		System.out.println(omkarSir.getName());
		System.out.println(omkarSir.getExp());
		System.out.println(omkarSir.getSpecialization());
		
		System.out.println("==============================");
		
		Trainer trainer=new OmkarSir();
		 System.out.println(trainer.getName());
		 System.out.println(trainer.getExp());
		 System.out.println(trainer.getSpecialization());
	}

}
